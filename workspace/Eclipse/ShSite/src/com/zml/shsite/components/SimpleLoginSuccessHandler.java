package com.zml.shsite.components;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.util.StringUtils;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.opensymphony.oscache.base.InitializationException;
import com.zml.shsite.models.Shuser;
import com.zml.shsite.services.IUserService;
import com.zml.shsite.services.impl.UserServiceImpl;

public class SimpleLoginSuccessHandler implements AuthenticationSuccessHandler, InitializingBean {
	private static final Logger logger = Logger.getLogger(SimpleLoginSuccessHandler.class);
	/**
	 * 采取静态方法进行用户服务组件的注入
	 */
	private static IUserService userService = null;

	private static IUserService getUserService() {
		if (userService == null) {
			WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
			userService = wac.getBean(UserServiceImpl.class);
		}
		return userService;
	}

	private String defaultTargetUrl;
	private boolean forwardToDestination = false;
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	public void setDefaultTargetUrl(String defaultTargetUrl) {
		this.defaultTargetUrl = defaultTargetUrl;
	}

	public void setForwardToDestination(boolean forwardToDestination) {
		this.forwardToDestination = forwardToDestination;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		UserDetails userDetails = getUserDetails();
		Shuser shuser = getUserService().findByUserName(userDetails.getUsername());
		request.getSession().putValue("user", shuser);
		if (forwardToDestination) {
			logger.info("Login success,Forwarding to " + this.defaultTargetUrl);
			request.getRequestDispatcher(this.defaultTargetUrl).forward(request, response);
		} else {
			logger.info("Login success,Redirecting to " + this.defaultTargetUrl);
			this.redirectStrategy.sendRedirect(request, response, this.defaultTargetUrl);
		}
	}

	private UserDetails getUserDetails() {
		Object user = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return (UserDetails) user;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if (StringUtils.isEmpty(defaultTargetUrl))
			throw new InitializationException("You must configure defaultTargetUrl");
	}
}
