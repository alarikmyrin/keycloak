package org.keycloak.models;

/**
 * @author <a href="mailto:mposolda@redhat.com">Marek Posolda</a>
 */
public class LDAPConstants {

    public static final String VENDOR = "vendor";
    public static final String VENDOR_RHDS = "rhds";
    public static final String VENDOR_ACTIVE_DIRECTORY = "ad";
    public static final String VENDOR_OTHER = "other";

    public static final String USERNAME_LDAP_ATTRIBUTE = "usernameLDAPAttribute";
    public static final String USER_OBJECT_CLASSES = "userObjectClasses";

    public static final String CONNECTION_URL = "connectionUrl";
    public static final String BASE_DN = "baseDn";
    public static final String USER_DN_SUFFIX = "userDnSuffix";
    public static final String BIND_DN = "bindDn";
    public static final String BIND_CREDENTIAL = "bindCredential";

    public static final String CONNECTION_POOLING = "connectionPooling";
    public static final String PAGINATION = "pagination";

    public static final String USER_ACCOUNT_CONTROLS_AFTER_PASSWORD_UPDATE = "userAccountControlsAfterPasswordUpdate";
}
