package com.lxz.autoconfigure.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO 调用数据库查询密码
        // 密码使用BCryptPasswordEncoder生成
        return User.withUsername("admin")
                .password("$2a$10$wbq9o35sl10q1X3FsSzzaOxgwkSpY1VEsX3xueYQvZ8bs24KAx7eS")
                .roles("system")
                .build();
    }
}