package com.wonni.boardback.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.wonni.boardback.dto.request.auth.SignUpRequestDto;
import com.wonni.boardback.dto.response.ResponseDto;
import com.wonni.boardback.dto.response.auth.SignUpResponseDto;
import com.wonni.boardback.entity.UserEntity;
import com.wonni.boardback.repository.UserRepository;
import com.wonni.boardback.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImplement implements AuthService{

    // 필드를 통한 의존성 주입 (외부에서 주입 - userRepository 가 비어있는 상태가 발생함 , 이걸 해결하려고 final 로 만듦)
    //                        그럼 @RequiredArgsConstructor 가 final 로 지정되어 있는 필드에 대해 생성자를 알아서 만듦) 
    //  @Autowired  스프링이 빈으로 등록된 컴포너트를 알아서 빈으로 만들어줌
    private final UserRepository userRepository;

    // 생성자를 통한 의존성 주입 (스프링에서 권장하고 있음 - userRepository 가 비어있지 않는 경우)
    // @Autowired
    // public AuthServiceImplement(UserRepository userRepository){
    //     this.userRepository = userRepository;
    // }
    
    // Setter 를 통한 의존성 주입
    // @Autowired
    // public void setUserRepository(UserRepository userRepository){
    //     this.userRepository = userRepository;
    // }

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto) {

        try {

            String email = dto.getEmail();
            boolean existedEmail = userRepository.existsByEmail(email);
            if (existedEmail) return SignUpResponseDto.duplicateEmail();

            String nickname = dto.getNickname();
            boolean existedNickname = userRepository.existsByNickname(nickname);
            if (existedNickname) return SignUpResponseDto.duplicateNickname();

            String telNumver = dto.getTelNumber();
            boolean existedTelNumber = userRepository.existsByTelNumber(telNumver);
            if (existedTelNumber) return SignUpResponseDto.duplicateTelNumber();

            // pw 암호화
            String password = dto.getPassword();
            String encodedPassword = passwordEncoder.encode(password);
            dto.setPassword(encodedPassword);

            UserEntity userEntity = new UserEntity(dto);
            userRepository.save(userEntity);

        } catch (Exception exception){
            exception.printStackTrace();
            return ResponseDto.databaseError();
        }

        return SignUpResponseDto.success();
    }
    
}
