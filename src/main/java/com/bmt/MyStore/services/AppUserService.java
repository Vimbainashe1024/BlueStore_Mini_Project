package com.bmt.MyStore.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bmt.MyStore.models.AppUser ;
import com.bmt.MyStore.repositories.AppUserRepository;

@Service
public class AppUserService implements UserDetailsService {

    @Autowired
    private AppUserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String regnumber) throws UsernameNotFoundException {
        AppUser  appUser  = repo.findByRegnumber(regnumber);
        
        if (appUser  == null) {
            // Throwing an exception if the user is not found
            throw new UsernameNotFoundException("User  not found with registration number: " + regnumber);
        }

        // Create UserDetails object if user is found
        return User.withUsername(appUser.getRegnumber())
              .password(appUser.getPassword())
                   .roles(appUser.getRole()) // Ensure this is a valid role
                   .build();
    }
}