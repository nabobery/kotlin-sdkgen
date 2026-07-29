package com.nabobery.sdkgen.runtime;

import java.util.List;

public final class ResponseResultJavaConsumerFixture {
    private ResponseResultJavaConsumerFixture() {}

    public static String getRequestId(SdkResponseResult<?> result) {
        return result.getRequestId();
    }

    public static String findRequestId(SdkResponseResult<?> result, List<String> headerNames) {
        return result.findRequestId(headerNames);
    }
}
