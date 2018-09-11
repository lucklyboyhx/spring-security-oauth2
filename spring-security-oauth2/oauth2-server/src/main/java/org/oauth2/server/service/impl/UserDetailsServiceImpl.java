package org.oauth2.server.service.impl;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsServiceImpl implements UserDetailsService{

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = new User("admin", "123", AuthorityUtils.commaSeparatedStringToAuthorityList("ADMIN"));
        return user;
    }

}
