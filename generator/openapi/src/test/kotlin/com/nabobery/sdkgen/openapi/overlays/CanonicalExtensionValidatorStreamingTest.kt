package com.nabobery.sdkgen.openapi.overlays

import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class CanonicalExtensionValidatorStreamingTest {
    @Test
    fun `accepts a non-empty payloadProperty`() {
        CanonicalExtensionValidator().validate(document(""""payloadProperty": "data""""))
    }

    @Test
    fun `omitting payloadProperty remains valid`() {
        CanonicalExtensionValidator().validate(document(""))
    }

    @Test
    fun `rejects empty null array object and unknown neighbouring fields`() {
        listOf(
            """"payloadProperty": """"" to "payloadProperty",
            """"payloadProperty": null""" to "payloadProperty",
            """"payloadProperty": ["data"]""" to "payloadProperty",
            """"payloadProperty": {"name": "data"}""" to "payloadProperty",
            """"payloadProperty": "data", "payloadPath": "/data"""" to "payloadPath",
        ).forEach { (fragment, offendingField) ->
            val failure =
                assertFailsWith<ExtensionValidationException>(fragment) {
                    CanonicalExtensionValidator().validate(document(fragment))
                }
            assertTrue(
                "/paths/~1chat/post/x-sdkgen-streaming/$offendingField" in requireNotNull(failure.message),
                "$fragment -> ${failure.message}",
            )
        }
    }

    private fun document(streamingFragment: String) =
        DocumentCodec.parseJson(
            """
            {
              "openapi": "3.1.0",
              "info": {"title": "Streaming", "version": "1"},
              "paths": {
                "/chat": {
                  "post": {
                    "operationId": "chat",
                    "x-sdkgen-streaming": {
                      "mode": "sse",
                      "responseContentType": "text/event-stream"${if (streamingFragment.isEmpty()) "" else ", $streamingFragment"}
                    },
                    "responses": {"200": {"description": "ok"}}
                  }
                }
              }
            }
            """.trimIndent().encodeToByteArray(),
        )
}
