package com.demo.olms.security.config;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class MyUserDetails implements UserDetails {

	public MyUserDetails() {

	}

	private String userName;

	public MyUserDetails(String userName) {
        this.userName = userName;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
         return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public String getPassword() {
		return 	"$2a$12$1kbuIyN33Ol5SRhP/JyNaeMve3KNcvuY/ME3irupdG8nIx.tBHdAi";
	}


	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getUsername() {
		return userName;
	}

}
