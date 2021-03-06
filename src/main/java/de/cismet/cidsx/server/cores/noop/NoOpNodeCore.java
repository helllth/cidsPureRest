/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cismet.cidsx.server.cores.noop;

import com.fasterxml.jackson.databind.JsonNode;

import org.openide.util.lookup.ServiceProvider;

import java.util.List;

import de.cismet.cidsx.server.api.types.User;
import de.cismet.cidsx.server.cores.CidsServerCore;
import de.cismet.cidsx.server.cores.NodeCore;
import de.cismet.cidsx.server.exceptions.NotImplementedException;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  $Revision$, $Date$
 */
@ServiceProvider(service = CidsServerCore.class)
public class NoOpNodeCore implements NodeCore {

    //~ Methods ----------------------------------------------------------------

    @Override
    public List<JsonNode> getRootNodes(final User user, final String role) {
        throw new NotImplementedException("NodeCore is not active.");
    }

    @Override
    public JsonNode getNode(final User user, final String nodeKey, final String role) {
        throw new NotImplementedException("NodeCore is not active.");
    }

    @Override
    public List<JsonNode> getChildren(final User user, final String nodeKey, final String role) {
        throw new NotImplementedException("NodeCore is not active.");
    }

    @Override
    public List<JsonNode> getChildrenByQuery(final User user, final String nodeQuery, final String role) {
        throw new NotImplementedException("NodeCore is not active.");
    }

    @Override
    public String getCoreKey() {
        return "core.noop.node";
    }

    @Override
    public byte[] getLeafIcon(final User user, final String nodeKey, final String role) {
        throw new NotImplementedException("NodeCore is not active.");
    }

    @Override
    public byte[] getOpenIcon(final User user, final String nodeKey, final String role) {
        throw new NotImplementedException("NodeCore is not active.");
    }

    @Override
    public byte[] getClosedIcon(final User user, final String nodeKey, final String role) {
        throw new NotImplementedException("NodeCore is not active.");
    }
}
