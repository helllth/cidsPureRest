/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cids.trigger.builtin;

import lombok.extern.slf4j.Slf4j;

import org.openide.util.lookup.ServiceProvider;

import de.cismet.cids.server.rest.domain.types.User;

import de.cismet.cids.trigger.CidsTrigger;
import de.cismet.cids.trigger.CidsTriggerKey;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  $Revision$, $Date$
 */
@ServiceProvider(service = CidsTrigger.class)
@Slf4j
public class LogTriggerTest implements CidsTrigger {

    //~ Methods ----------------------------------------------------------------

    @Override
    public void beforeInsert(final String jsonObject, final User user) {
        log.info("beforeInsert", jsonObject, user);
    }

    @Override
    public void afterInsert(final String jsonObject, final User user) {
        log.info("afterInsert", jsonObject, user);
    }

    @Override
    public void beforeUpdate(final String jsonObject, final User user) {
        log.info("beforeUpdate", jsonObject, user);
    }

    @Override
    public void afterUpdate(final String jsonObject, final User user) {
        log.info("afterUpdate", jsonObject, user);
    }

    @Override
    public void beforeDelete(final String domain, final String classKey, final String objectId, final User user) {
        log.info("beforeDelete", domain, classKey, objectId, user);
    }

    @Override
    public void afterDelete(final String domain, final String classKey, final String objectId, final User user) {
        log.info("afterDelete", domain, classKey, objectId, user);
    }

    @Override
    public CidsTriggerKey getTriggerKey() {
        return CidsTriggerKey.FORALL;
    }

    /**
     * DOCUMENT ME!
     *
     * @param   o  DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @Override
    public int compareTo(final CidsTrigger o) {
        return 0;
    }
}
