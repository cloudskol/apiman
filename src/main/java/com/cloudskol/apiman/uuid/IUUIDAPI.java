package com.cloudskol.apiman.uuid;

import com.cloudskol.apiman.base.APIManException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author tham
 */

@Path("uuid")
@Produces(MediaType.APPLICATION_JSON)
public interface IUUIDAPI {
    @GET
    Response getUuid(@QueryParam("count") int count) throws APIManException;
}
