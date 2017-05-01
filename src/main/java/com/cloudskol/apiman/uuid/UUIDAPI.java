package com.cloudskol.apiman.uuid;

import com.cloudskol.apiman.base.APIManException;

import javax.json.JsonObject;
import javax.ws.rs.core.Response;

/**
 * @author tham
 */

public class UUIDAPI implements IUUIDAPI {
    @Override
    public Response getUuid(int count) throws APIManException {
        final JsonObject jsonObject = UUIDManager.getInstance().getUuid(count);
        return Response.ok(jsonObject).build();
    }
}
