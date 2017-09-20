package com.tek.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tek.spring.Dao.userDao;
import com.tek.spring.model.user;

@Service("userservice")
public class userService implements UserDetailsService{
	
	@Autowired
	private userDao usrdao;

	@Override
	public UserDetails loadUserByUsername(String Id) throws UsernameNotFoundException {
		
	     user usr =usrdao.findOne(Id);
	   
	        if(usr==null){
	            System.out.println("User not found");
	            throw new UsernameNotFoundException("Username not found");
	        }
	            return new org.springframework.security.core.userdetails.User(usr.getUsername(), usr.getPassword(), 
	                 true, true, true, true, getGrantedAuthorities(usr));
	}
	  private List<GrantedAuthority> getGrantedAuthorities(user user){
	        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	         
	       
	            authorities.add(new SimpleGrantedAuthority("ROLE_"+user.getRole()));
	
	
	        return authorities;
	    }

	  public void create(user usr)
	  {
		  usrdao.save(usr);
		  
	  }
	  
}
