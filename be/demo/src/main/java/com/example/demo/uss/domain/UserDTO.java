package com.example.demo.uss.domain;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component @Lazy @Getter
public class UserDTO{
	private long userNum;
	private String userid;
	private String password;
	private String username;
	private String email;
	private String gender;
	private String birthday;
	private String phoneNumber;
	private String preferGenre;
	
	/*
	private Collection<? extends GrantedAuthority> authorities;
	
	public UserDTO(long userNum, String userid, String password, String username,
			String email,
			Collection<? extends GrantedAuthority> authorities) {
		this.userNum = userNum;
		this.userid = userid;
		this.password = password;
		this.username = username;
		this.email = email;
		this.authorities = authorities;
	}
	
	public static UserDTO create(User user) {
		List<GrantedAuthority> authorities = 
				user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getRoleName().name()))
				.collect(Collectors.toList());
		return new UserDTO(user.getUserNum(), user.getUserid(), user.getUsername(),
				user.getEmail(), user.getPassword(), authorities);
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDTO that = (UserDTO) o;
		return Objects.equals(userNum, that.userNum);
	}
	@Override
	public int hashCode() {
		return Objects.hash(userNum);
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
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	*/
}
