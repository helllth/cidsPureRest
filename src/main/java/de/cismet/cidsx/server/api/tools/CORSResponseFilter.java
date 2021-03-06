/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cidsx.server.api.tools;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;

import de.cismet.cidsx.server.data.RuntimeContainer;

/**
 * Currently this filter allows any origin for testing purposes. This has to be adapted for productional use.
 *
 * @author   martin.scholl@cismet.de
 * @version  1.0
 */
public final class CORSResponseFilter implements ContainerResponseFilter {

    //~ Methods ----------------------------------------------------------------

    @Override
    public ContainerResponse filter(final ContainerRequest cr, final ContainerResponse cr1) {
        cr1.getHttpHeaders()
                .add(
                    "Access-Control-Allow-Origin",
                    RuntimeContainer.getServer().getServerOptions().getCorsAccessControlAllowOrigin());  // NOI18N
        cr1.getHttpHeaders()
                .add(
                    "Access-Control-Allow-Methods",
                    RuntimeContainer.getServer().getServerOptions().getCorsAccessControlAllowMethods()); // NOI18N
        cr1.getHttpHeaders()
                .add(
                    "Access-Control-Allow-Headers",
                    RuntimeContainer.getServer().getServerOptions().getCorsAccessControlAllowHeaders()); // NOI18N
        return cr1;
    }
}
