package com.infomedia.tokenbasedauthenticationrestapi.service;

import com.infomedia.tokenbasedauthenticationrestapi.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}