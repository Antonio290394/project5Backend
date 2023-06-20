package com.caputo.prenotazioni.security.service;

import com.caputo.prenotazioni.security.payload.LoginDto;
import com.caputo.prenotazioni.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
