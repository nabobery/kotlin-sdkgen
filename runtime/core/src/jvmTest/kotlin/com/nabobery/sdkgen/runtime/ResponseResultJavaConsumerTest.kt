package com.nabobery.sdkgen.runtime

import kotlin.test.Test
import kotlin.test.assertEquals

class ResponseResultJavaConsumerTest {
    @Test
    fun javaConsumerFixtureCanAccessRequestIdAndFindRequestId() {
        val alternative =
            ResponseAlternative(
                selector = ResponseSelector.Default,
                mediaTypes = listOf("application/json"),
                typeTag = "Success",
                mode = SdkResponseMode.BUFFERED,
                id = "200",
            )
        val matched: SdkResponseResult<String> =
            SdkResponseResult.Matched(
                alternative = alternative,
                statusCode = 200,
                headers = listOf(SdkHeader("X-Request-Id", "java-fixture-123")),
                value = "ok",
            )

        val requestIdFromJava = ResponseResultJavaConsumerFixture.getRequestId(matched)
        assertEquals("java-fixture-123", requestIdFromJava)

        val customRequestIdFromJava =
            ResponseResultJavaConsumerFixture.findRequestId(
                matched,
                listOf("X-Request-Id"),
            )
        assertEquals("java-fixture-123", customRequestIdFromJava)

        val stripeRequestIdFromJava =
            ResponseResultJavaConsumerFixture.findRequestId(
                matched,
                listOf("Stripe-Request-Id", "X-Request-Id"),
            )
        assertEquals("java-fixture-123", stripeRequestIdFromJava)

        val stripeOnly: SdkResponseResult<String> =
            SdkResponseResult.Matched(
                alternative = alternative,
                statusCode = 200,
                headers = listOf(SdkHeader("Stripe-Request-Id", "stripe-1234")),
                value = "ok",
            )
        val stripeOnlyFromJava =
            ResponseResultJavaConsumerFixture.findRequestId(
                stripeOnly,
                listOf("Stripe-Request-Id", "X-Request-Id"),
            )
        assertEquals("stripe-1234", stripeOnlyFromJava)
    }
}
