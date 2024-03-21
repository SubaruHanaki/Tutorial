package com.reevon.test.domain.service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.reevon.test.domain.entity.RoleEntity;
import com.reevon.test.domain.entity.UserEntity;
import com.reevon.test.domain.repository.RoleRepository;
import com.reevon.test.domain.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	UserRepository repository;
	@Autowired
	RoleRepository roleRepo;
	
	public List<UserEntity> SearchAll(){
		return repository.findAll();
	}

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// UserDetailServiceではこの指定をするとログイン時に判定してくれる
		/*
		*/
		
		Logger logger = Logger.getLogger("loadUserByUsername");
		logger.log(Level.INFO,"userrrrr"+username+repository.count());
		logger.log(Level.INFO,"user"+username+repository.findAll().getFirst());

	    UserEntity user = repository.findByUsername(username);
	     
	    if (user == null) {
	        throw new UsernameNotFoundException("Could not find user");
	    }
		logger.log(Level.INFO,user.toString());
	    
		RoleEntity role = user.getRole();
	     
		return new User(user.getUsername(),user.getPassword(),user.getAuthorities());//Collections.emptyList()
	}
	
}
