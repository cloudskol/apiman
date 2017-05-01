package com.cloudskol.apiman.base64;

import com.cloudskol.apiman.base.APIManException;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Base64;

/**
 * @author tham
 */

public class Base64Manager {
    private static final Base64Manager instance = new Base64Manager();
    private Base64Manager() {}

    public static final synchronized Base64Manager getInstance() {
        return instance;
    }

    public String encode(String value) throws APIManException {

        try {
            return new String(Base64.getEncoder().encode(value.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String decode(String encoded) throws APIManException {
        return new String(Base64.getDecoder().decode(encoded));
    }
}
