package com.wonni.boardback.service;

import org.springframework.http.ResponseEntity;

import com.wonni.boardback.dto.request.auth.SignUpRequestDto;
import com.wonni.boardback.dto.response.auth.SignUpResponseDto;

public interface AuthService {
    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);
}
