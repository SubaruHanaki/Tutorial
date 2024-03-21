package com.example.test.database;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	UserRepository repository;
	
	public List<UserEntity> SearchAll(){
		return repository.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		/*
		Logger logger = Logger.getLogger("loadUserByUsername");
		logger.log(Level.INFO,"userrrrr"+username+repository.count());
		logger.log(Level.INFO,"user"+username+repository.findAll().getFirst());
		*/
		

	    UserEntity user = repository.findByUsername(username);
	     
	    if (user == null) {
	        throw new UsernameNotFoundException("Could not find user");
	    }
		//logger.log(Level.INFO,user.getUsername());
	     
		return new User(user.getUsername(),user.getPassword(),Collections.emptyList());
	}
	
}
