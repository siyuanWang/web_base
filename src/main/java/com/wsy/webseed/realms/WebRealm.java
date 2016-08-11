package com.wsy.webseed.realms;

import com.wsy.webseed.service.SysAuthService;
import com.wsy.webseed.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class WebRealm extends AuthorizingRealm {

	private static final Logger LOGGER = LoggerFactory.getLogger(WebRealm.class);

	@Autowired
	private SysAuthService menuService;
	@Autowired
	private SysUserService userService;
	
	
	public static final String USER_ROLE_IDS = "USER_ROLE_IDS";
	public static final String ANGULAR_SHIRO = "angularShiro";
	/**
	 * 为当前登录的Subject授予角色和权限
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(final PrincipalCollection principals) {

		final String currentUsername = (String) super.getAvailablePrincipal(principals);
		final SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
		if ((null != currentUsername)) {
//			List<SysMenu> list = menuService.query(currentUsername);
//			Set<String> permitions = new HashSet<String>();
//			setPermissionNames(list, permitions);
//
//			SysUser user = (SysUser) getSession(SysConstant.SESSION_USER_KEY);
//			Map<String, String> principal = new HashMap<String, String>();
//			Map<String, String> credentials = new HashMap<String, String>();
//			principal.put("login", user.getLoginName());
//			credentials.put("name", user.getName());
//			credentials.put("email", user.getEmail());
//
//			AngularShiroPojo shiroPojo = new AngularShiroPojo();
//			shiroPojo.setPrincipal(principal);
//			shiroPojo.setCredentials(credentials);
//			shiroPojo.setPermitions(permitions);
//			shiroPojo.setRoles((java.util.Set<String>)this.getSession(USER_ROLE_IDS));
			
//			setSession(ANGULAR_SHIRO, shiroPojo.toString());
//
//			for(String str: permitions) {
//				simpleAuthorInfo.addStringPermission(str);
//			}
//			if(this.getSession(USER_ROLE_IDS)!=null) {
//				simpleAuthorInfo.setRoles((java.util.Set<String>)this.getSession(USER_ROLE_IDS));
//			}
			
			return simpleAuthorInfo;
		}
		return null;
	}
	/**
	 * 按钮级控制
	 * @param list
	 * @param names
	 * @return
	 */
//	private Set<String> setPermissionNames(List<SysMenu> list, Set<String> names) {
//		for(SysMenu menu: list) {
//			if(menu.getType() == SysConstant.MENU_TYPE_MENU) {
//				String menuName = menu.getName();
//				List<SysMenu> children = menu.getChildList();
//				if(children == null)continue;
//				for(SysMenu son: children) {
//					if(son != null && son.getType() == SysConstant.MENU_TYPE_BUTTON) {
//						names.add(menuName+":"+son.getName());
//					} else {
//						setPermissionNames(children, names);
//					}
//				}
//			}
//		}
//
//		return names;
//	}
	
	/**
	 * 验证当前登录的Subject
	 *
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(final AuthenticationToken authcToken) throws AuthenticationException {
		final UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		LOGGER.debug("Try to login info {}", token.toString());
		//final SysUser user = userService.query(token.getUsername());
		//if (null != user) {
//			if (StringUtils.equals(user.getPassword(), new String(token.getPassword()))) {
//				final AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getLoginName(), user.getPassword(), getName());
//				this.setSession(SysConstant.SESSION_USER_KEY, user);
//				this.setSession(SysConstant.SESSION_LOGIN_ID_KEY, user.getLoginName());
//
//				List<SysRole> roleList = userService.queryRolesByUserId(user.getId());
//				java.util.Set<String> setStr = new HashSet<String>();
//			    for(SysRole sysRole: roleList) {
//					setStr.add(sysRole.getName());
//				}
//				this.setSession(USER_ROLE_IDS, setStr);
//
//				return authcInfo;
//			}
			//return authcInfo;
		//}
		return null;
	}

	/**
	 * 将一些数据放到ShiroSession中,以便于其它地方使用
	 *
	 * @see 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
	 */
	private void setSession(final Object key, final Object value) {
		final Subject currentUser = SecurityUtils.getSubject();
		if (null != currentUser) {
			final Session session = currentUser.getSession();
			if (null != session) {
				session.setAttribute(key, value);
				session.setTimeout(1800000);
			}
		}
	}
	
	private Object getSession(final Object key) {
		final Subject currentUser = SecurityUtils.getSubject();
		if (null != currentUser) {
			final Session session = currentUser.getSession();
			if (null != session) {
				return session.getAttribute(key);
			}
		}
		
		return null;
	}

//	public void setSysMenuService(SysAuthService menuService) {
//		this.menuService = menuService;
//	}
//
//	public static SysUser getCurUser(HttpServletRequest request) {
//		return (SysUser) request.getSession().getAttribute(SysConstant.SESSION_USER_KEY);
//	}
//	public void setSysUserService(SysUserService userService) {
//		this.userService = userService;
//	}
//	public SysAuthService getMenuService() {
//		return menuService;
//	}
//	public void setMenuService(SysAuthService menuService) {
//		this.menuService = menuService;
//	}
//	public SysUserService getUserService() {
//		return userService;
//	}
//	public void setUserService(SysUserService userService) {
//		this.userService = userService;
//	}
}
