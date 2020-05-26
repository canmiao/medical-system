package com.business.shiro;

import com.business.bean.UserInfo;
import com.business.service.UserInfoService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;


/**
 * 自定义Realm用于查询用户的角色和权限信息并保存到权限管理器
 */
public class UserRealm extends AuthorizingRealm {

    @Resource
    private UserInfoService userService;

    /**
     * 执行授权逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑");

        //给资源进行授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        //获取数据库中的用户的权限
//        Subject subject = SecurityUtils.getSubject();
//        User loginUser = (User)subject.getPrincipal();
//        List<Permission> list = permissionService.findById(loginUser.getId());


        //添加资源的授权字符串
        //info.addStringPermission(dbUser.getPerms());

        return info;
    }

    /**
     * 执行认证逻辑
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑");

        //编写shiro判断逻辑，判断用户名和密码
        //1.判断用户名
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        UserInfo user = userService.findByName(token.getUsername());

        if (user == null) {
            //用户名不存在
            return null;//shiro底层会抛出UnKnowAccountException
        }
        //2.判断密码
        return new SimpleAuthenticationInfo(user, user.getPassword(), "");
    }
}
