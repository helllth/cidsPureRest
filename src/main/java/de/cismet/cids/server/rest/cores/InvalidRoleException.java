/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cids.server.rest.cores;

/**
 * DOCUMENT ME!
 *
 * @author   martin.scholl@cismet.de
 * @version  $Revision$, $Date$
 */
public final class InvalidRoleException extends RuntimeException {

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new instance of <code>InvalidRoleException</code> without detail message.
     */
    public InvalidRoleException() {
    }

    /**
     * Constructs an instance of <code>InvalidRoleException</code> with the specified detail message.
     *
     * @param  msg  the detail message.
     */
    public InvalidRoleException(final String msg) {
        super(msg);
    }

    /**
     * Constructs an instance of <code>InvalidRoleException</code> with the specified detail message and the specified
     * cause.
     *
     * @param  msg    the detail message.
     * @param  cause  the exception cause
     */
    public InvalidRoleException(final String msg, final Throwable cause) {
        super(msg, cause);
    }
}
