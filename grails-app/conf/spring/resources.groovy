import com.azminds.CustomTenantResolver
import com.azminds.security.UserPasswordEncoderListener
// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    customTenantResolver(CustomTenantResolver)
}
