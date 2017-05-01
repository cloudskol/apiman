package com.cloudskol.apiman.uuid;

import com.cloudskol.apiman.base.APIManException;
import org.junit.Test;

import javax.json.JsonObject;

/**
 * @author tham
 */

public class UUIDManagerTest {
    @Test
    public void testUuid() throws APIManException {
        final JsonObject jsonObject = UUIDManager.getInstance().getUuid(2);
        System.out.println(jsonObject.toString());
    }
}
