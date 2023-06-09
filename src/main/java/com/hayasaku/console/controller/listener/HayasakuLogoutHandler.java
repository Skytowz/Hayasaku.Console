package com.hayasaku.console.controller.listener;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Handler afin de gérer proprement la déconnexion d'utilisateurs {@link DisconnectSessionListener}
 * @author Lucas "Skytowz" HOTTIN
 *
 */
@Service
public class HayasakuLogoutHandler implements LogoutHandler {
	
	
	@Autowired
	private Log logger;

    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response, 
      Authentication authentication) {
    	
    }
}