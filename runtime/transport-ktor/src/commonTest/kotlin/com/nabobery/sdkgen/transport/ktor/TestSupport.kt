package com.nabobery.sdkgen.transport.ktor

import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponseMode

internal val NO_DEADLINES = SdkDeadlines(totalMillis = null, attemptMillis = null, idleMillis = null)

internal fun testRequest(
    method: String = "GET",
    uri: String = "https://example.test/resource",
    headers: List<SdkHeader> = emptyList(),
    body: SdkRequestBody? = null,
    expectedResponseMode: SdkResponseMode = SdkResponseMode.BUFFERED,
    operationId: String = "testOp",
): SdkRequest =
    SdkRequest(
        method = method,
        uri = uri,
        headers = headers,
        body = body,
        expectedResponseMode = expectedResponseMode,
        deadlines = NO_DEADLINES,
        operationId = operationId,
    )
