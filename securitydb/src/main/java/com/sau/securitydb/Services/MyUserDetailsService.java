package com.sau.securitydb.Services;

import com.sau.securitydb.Model.User;
import com.sau.securitydb.Repository.UserInfo;
import com.sau.securitydb.Services.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserInfo userInfo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user = userInfo.findByUserName(username);
        System.out.println(user.toString());
        user.orElseThrow(() -> new UsernameNotFoundException(username + " not found"));

        return user.map(MyUserDetails::new).get();
    }
}
