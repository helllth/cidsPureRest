/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cids.server.rest.resourcelistings;

import com.sun.jersey.spi.resource.Singleton;

import com.wordnik.swagger.core.Api;
import com.wordnik.swagger.jaxrs.JavaHelp;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  1.0
 */

@Path("/resources/configattributes")
@Api(
    value = "/configattributes",
    description = "Operations about pets",
    listingPath = "/resources/configattributes",
    listingClass = "de.cismet.cids.server.rest.domain.ConfigAttributesAPI"
)
@Singleton
@Produces({ "application/json", "application/xml" })
public class TheConfigAttributesResourceListing extends JavaHelp {
}
