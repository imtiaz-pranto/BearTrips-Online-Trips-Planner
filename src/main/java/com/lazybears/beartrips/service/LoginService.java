package com.lazybears.beartrips.service;

import com.lazybears.beartrips.model.Login;
import org.springframework.ui.Model;

public interface LoginService {
    String getLogin(Login login, Model model);
}
