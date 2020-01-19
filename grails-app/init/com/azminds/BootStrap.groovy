package com.azminds

import com.azminds.security.UserService

class BootStrap {

    UserService userService

    def init = { servletContext ->
        userService.save("admin", "123456", "ROLE_ADMIN", true, false, false, false)
        userService.save("company", "123456","ROLE_COMPANY", true, false, false, false)
    }
    def destroy = {
    }
}
