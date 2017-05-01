package com.cloudskol.apiman.base;

import java.util.List;

/**
 * @author tham
 */

public class StringUtil {
    public static String normalize(List<String> values) {
        int size = values.size();

        final StringBuilder builder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            builder.append(values.get(i));

            if (i == size - 1) {
                break;
            }

            builder.append(", ");
        }

        return builder.toString();
    }
}
