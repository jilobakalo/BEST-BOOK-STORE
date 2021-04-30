package Liftoff.launchcode.onlinebookstore;

import Liftoff.launchcode.onlinebookstore.controller.AuthenticationController;
import Liftoff.launchcode.onlinebookstore.model.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthenticationFilter extends HandlerInterceptorAdapter {
    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthenticationController authenticationController;
}
