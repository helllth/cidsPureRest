/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cids.server.rest.cores;

import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.List;

import de.cismet.cids.server.rest.domain.types.User;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  1.0
 */
public interface EntityInfoCore {

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @param   user  DOCUMENT ME!
     * @param   role  DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    List<ObjectNode> getAllClasses(User user, String role);

    /**
     * DOCUMENT ME!
     *
     * @param   user      DOCUMENT ME!
     * @param   classKey  DOCUMENT ME!
     * @param   role      DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    ObjectNode getClass(User user, String classKey, String role);

    /**
     * DOCUMENT ME!
     *
     * @param   user          DOCUMENT ME!
     * @param   classKey      DOCUMENT ME!
     * @param   attributeKey  DOCUMENT ME!
     * @param   role          DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    ObjectNode getAttribute(User user, String classKey, String attributeKey, String role);

    /**
     * DOCUMENT ME!
     *
     * @param   user      DOCUMENT ME!
     * @param   classKey  DOCUMENT ME!
     * @param   role      DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    ObjectNode emptyInstance(User user, String classKey, String role);
}