package org.keycloak.audit.log;

import org.jboss.logging.Logger;
import org.keycloak.Config;
import org.keycloak.audit.AuditListener;
import org.keycloak.audit.AuditListenerFactory;
import org.keycloak.models.KeycloakSession;

/**
 * @author <a href="mailto:sthorger@redhat.com">Stian Thorgersen</a>
 */
public class JBossLoggingAuditListenerFactory implements AuditListenerFactory {

    public static final String ID = "jboss-logging";

    private static final Logger logger = Logger.getLogger("org.keycloak.audit");

    @Override
    public AuditListener create(KeycloakSession session) {
        return new JBossLoggingAuditListener(logger);
    }

    @Override
    public void init(Config.Scope config) {
    }

    @Override
    public void close() {
    }

    @Override
    public String getId() {
        return ID;
    }

}
