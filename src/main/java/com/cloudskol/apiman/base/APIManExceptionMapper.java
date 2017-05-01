package com.cloudskol.apiman.base;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author tham
 */

@Provider
public class APIManExceptionMapper implements ExceptionMapper<APIManException> {
    @Override
    public Response toResponse(APIManException e) {
        return null;
    }
}
