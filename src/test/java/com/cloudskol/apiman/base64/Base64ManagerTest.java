package com.cloudskol.apiman.base64;

import com.cloudskol.apiman.base.APIManException;
import org.junit.Test;

/**
 * @author tham
 */

public class Base64ManagerTest {
    @Test
    public void testEncode() throws APIManException {
        final String encoded = Base64Manager.getInstance().encode("Thamizharasu");
        System.out.println(encoded);

        final String decodedValue = Base64Manager.getInstance().decode(encoded);
        System.out.printf(decodedValue);
    }
}
