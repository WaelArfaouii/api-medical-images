package com.arfaouiKallebi.JournalWeb.services;

import com.arfaouiKallebi.JournalWeb.dto.LoginDto;
import com.arfaouiKallebi.JournalWeb.dto.RegisterDto;
import com.arfaouiKallebi.JournalWeb.model.Role;
import com.arfaouiKallebi.JournalWeb.model.User;
import org.springframework.http.ResponseEntity;


public interface IUserService {

   Role saveRole(Role role);

   User saverUser(User user);


   ResponseEntity<?> register(RegisterDto registerDto);

   String authenticate(LoginDto loginDto);
}
