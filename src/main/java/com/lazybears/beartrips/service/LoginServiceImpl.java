package com.lazybears.beartrips.service;


import com.lazybears.beartrips.dao.UserRepo;
import com.lazybears.beartrips.model.Login;
import com.lazybears.beartrips.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;



@Service

public class LoginServiceImpl implements LoginService {

    @Autowired
    UserRepo rep;

    @Override
    public String getLogin(Login login , Model model) {

        String username=login.getUsername();
        String password=login.getPassword();


        if(rep.existsById(username))
    {
        User info= new User();
        info=rep.findById(username).orElse(new User());
        if(info.getPass().equals(password))
            return "user";
        else {

            return "login";
        }

    }
        else {
            return "login";
        }





//    @Override
//    public String getLogin(Login login, Model model) {
//        if (login.getUsername().equalsIgnoreCase("admin") && login.getPassword().equals("pass"))
//            return "user";
//        else
//            return "login";
//    }
}
}
