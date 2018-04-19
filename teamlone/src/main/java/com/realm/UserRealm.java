package com.realm;

import org.apache.shiro.authc.AuthenticationException;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.bean.Sys_User;
import com.service.Sys_FuctionService;
import com.service.Sys_UserService;



public class UserRealm extends AuthorizingRealm{

	@Autowired
	Sys_UserService userService;
	@Autowired
	Sys_FuctionService fuctionService;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String name=(String)principals.getPrimaryPrincipal();
		Sys_User users=userService.getUserByName(name);
        System.out.println("=========================================="); 
        System.out.println("user:"+users);
		SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
		//封装角色集合
		authorizationInfo.setRoles(userService.getUserByUserName(name));
		System.out.println("==========================================================================");
		//封装角色对应的权限集合
		System.out.println("doGetAuthorizationInfo:"+fuctionService.getAllFuctionByRoleId(users.getUSER_ID()));
		authorizationInfo.setStringPermissions(fuctionService.getAllFuctionByRoleId(users.getUSER_ID()));
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String uname=(String)token.getPrincipal();
		System.out.println("uname:"+uname);
	    Sys_User user=new Sys_User();
		user.setLOGIN_NAME(uname);
		System.err.println("user.uanme:"+user.getLOGIN_NAME());
		Sys_User uSerById = userService.getUserByName(uname);
		System.out.println("uSerById:"+uSerById);
		if (uSerById==null) {
            return null;			
		}
		System.out.println(1246454);
		ByteSource slat=new ByteSource.Util().bytes(uname);
		SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(uname,uSerById.getLOGIN_PWD(),slat,getName());
		return info;
	}



}
