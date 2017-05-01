package com.cloudskol.apiman.uuid;

import com.cloudskol.apiman.base.APIManException;
import com.cloudskol.apiman.base.StringUtil;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author tham
 */

public class UUIDManager {
    private static final UUIDManager instance = new UUIDManager();
    private UUIDManager() {}

    public static final synchronized UUIDManager getInstance() {
        return instance;
    }

    public JsonObject getUuid(int count) throws APIManException {
        if (count == 0) {
            count = 1;
        }

        if (count > 20) {
            count = 20;
        }


        final JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (int i = 0; i < count; i++) {
            arrayBuilder.add(UUID.randomUUID().toString());
        }

        return Json.createObjectBuilder()
                .add("uuids", arrayBuilder)
                .build();
    }
}
