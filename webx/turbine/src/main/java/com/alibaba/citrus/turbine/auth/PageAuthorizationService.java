package com.alibaba.citrus.turbine.auth;

/**
 * Ϊҳ����Ȩ��service��
 * 
 * @author Michael Zhou
 */
public interface PageAuthorizationService {
    boolean isAllow(String target, String userName, String[] roleNames, String... actions);
}
