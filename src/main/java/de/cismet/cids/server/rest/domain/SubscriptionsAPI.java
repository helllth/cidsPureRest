/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
/*
 * To change this template, choose Tools | Templates and open the template in the editor.
 */
package de.cismet.cids.server.rest.domain;

import com.wordnik.swagger.core.Api;
import com.wordnik.swagger.core.ApiOperation;
import com.wordnik.swagger.core.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  $Revision$, $Date$
 */
@Api(
    value = "/subscriptions",
    description = "... subscriptions within the cids system.",
    listingPath = "/resources/subscriptions"
)
@Path("/subscriptions")
@Produces("application/json")
public class SubscriptionsAPI {

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @param   domain  DOCUMENT ME!
     * @param   role    DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @GET
    // @Path("/all")
    @ApiOperation(
        value = "Get all subscriptions.",
        notes = "-"
    )
    public Response getSubscriptions(
            @DefaultValue("all")
            @QueryParam("domain")
            @ApiParam(
                value = "possible values are 'all','local' or a existing [domainname]. 'all' when not submitted",
                required = false,
                defaultValue = "all"
            )
            final String domain,
            @ApiParam(
                value = "role of the user, 'default' role when not submitted",
                required = false,
                defaultValue = "default"
            )
            @DefaultValue("default")
            @QueryParam("role")
            final String role) {
        return Response.status(Status.SERVICE_UNAVAILABLE).build();
    }
}
