package com.wonni.boardback.service;

import org.springframework.http.ResponseEntity;

import com.wonni.boardback.dto.request.auth.SignInRequestDto;
import com.wonni.boardback.dto.request.auth.SignUpRequestDto;
import com.wonni.boardback.dto.response.auth.SignInResponseDto;
import com.wonni.boardback.dto.response.auth.SignUpResponseDto;

public interface AuthService {
    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);
    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);
    
}
