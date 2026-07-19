package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.KotlinxSerializationCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransport
import kotlinx.serialization.json.JsonElement
import kotlin.String

public object OpenRouterCodecs {
    public const val CHAT_REQUEST_CODEC_ID: String = "openrouter.chat-request"

    public const val JSON_ELEMENT_CODEC_ID: String = "openrouter.json-element"

    private val chatRequestCodec: MediaTypeCodec<ChatRequest> =
        KotlinxSerializationCodec(CHAT_REQUEST_CODEC_ID, ChatRequest.serializer(), SdkJson)

    private val jsonElementCodec: MediaTypeCodec<JsonElement> =
        KotlinxSerializationCodec(JSON_ELEMENT_CODEC_ID, JsonElement.serializer(), SdkJson)

    public val chatRequestCodecRegistry: MediaTypeCodecRegistry<ChatRequest> =
        MediaTypeCodecRegistry.of(chatRequestCodec)

    public val jsonElementCodecRegistry: MediaTypeCodecRegistry<JsonElement> =
        MediaTypeCodecRegistry.of(jsonElementCodec)
}

/**
 * Client for the 'sendChatCompletionRequest' operation.
 */
public class OpenRouterClient(
    transport: SdkTransport,
    private val baseUri: String,
) {
    private val executor: SdkExecutor = SdkExecutor(transport)

    /**
     * Executes 'sendChatCompletionRequest' and returns a buffered JSON response.
     *
     * @param request Request body sent to the operation.
     * @param options Execution options.
     * @return Buffered response body.
     * @throws SdkApiException When the service returns a non-success response.
     * @throws SdkSerializationException When a request or response cannot be serialized.
     * @throws SdkTransportException When transport execution fails.
     */
    public suspend fun sendChatCompletionRequest(
        request: ChatRequest,
        options: CallOptions = CallOptions(),
    ): JsonElement =
        executor.execute<ChatRequest, JsonElement>(
            SdkExecutionRequest(
                metadata,
                baseUri,
                request,
                listOf(OpenRouterCodecs.CHAT_REQUEST_CODEC_ID),
            ),
            listOf(OpenRouterCodecs.JSON_ELEMENT_CODEC_ID),
            OpenRouterCodecs.chatRequestCodecRegistry,
            OpenRouterCodecs.jsonElementCodecRegistry,
            options,
        )

    public companion object {
        public val metadata: OperationMetadata =
            OperationMetadata(
                operationId = "sendChatCompletionRequest",
                method = "POST",
                path = "/chat/completions",
                requestMediaTypes = listOf("application/json"),
                responseMediaTypes = listOf("application/json"),
                successStatusCodes = setOf(200),
                responseMode = SdkResponseMode.BUFFERED,
                deadlines = SdkDeadlines(60_000, 60_000, 30_000),
            )
    }
}
