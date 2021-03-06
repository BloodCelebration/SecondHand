package com.zml.shsite.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.zml.shsite.models.Authority;
import com.zml.shsite.models.Shuser;
import com.zml.shsite.services.IUserService;
/**
 * 用户登录服务
 * 控制用户登录时的密码验证和权限授予的
 * @author zml
 *
 */
public class CustomUserDetailsServiceImpl implements UserDetailsService {
	private static Logger logger = Logger.getLogger(CustomUserDetailsServiceImpl.class);
	@Autowired
	private IUserService userService=null;
	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		Shuser shuser=userService.findByUserName(arg0);
		if(shuser==null){
			logger.info("wrong user:"+arg0);
			 throw new UsernameNotFoundException("Username not found");  
		}  return new org.springframework.security.core.userdetails.User(arg0,shuser.getPassword(),   
                true, true, true, true, getGrantedAuthorities(shuser));  
	}
	//权限在Spring Security中是以我们平常认为的角色来体现的
    private List<GrantedAuthority> getGrantedAuthorities(Shuser shuser){ 
        //实例化权限集合
    	final List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();  
    	final List<Authority> authorities=userService.findAuthoritys(shuser.getShUserId());
    	for(Authority authority:authorities){
    		grantedAuthorities.add(new SimpleGrantedAuthority(authority.getShrole().getShRoleName())); 
    	}
        System.out.print("authorities :"+authorities);  
        return grantedAuthorities;  
    }  

}
