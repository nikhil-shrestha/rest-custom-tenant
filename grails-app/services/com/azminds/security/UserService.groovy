package com.azminds.security

import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic

@CompileStatic
class UserService {
  RoleDataService roleDataService

  UserRoleDataService userRoleDataService

  UserDataService userDataService

  @Transactional
  User save(String username,
            String password,
            String authority,
            boolean enabled,
            boolean accountExpired,
            boolean accountLocked,
            boolean passwordExpired) {
    Role role = roleDataService.findByAuthority(authority)
    if (!role) {
      role = roleDataService.saveByAuthority(authority)
    }
    User user = userDataService.save(username, password, enabled, accountExpired, accountLocked, passwordExpired)
    userRoleDataService.save(user, role)
    user
  }
}

