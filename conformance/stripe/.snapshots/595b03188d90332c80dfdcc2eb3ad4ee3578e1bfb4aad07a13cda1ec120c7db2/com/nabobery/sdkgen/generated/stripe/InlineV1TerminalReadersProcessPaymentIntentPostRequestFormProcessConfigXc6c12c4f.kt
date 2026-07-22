package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Configuration overrides for this transaction, such as tipping and customer cancellation settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1process_payment_intent/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema/properties/process_config
 */
@Serializable(with = InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f.Serializer::class)
public class InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f(
    public val allowRedisplay: InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd? = null,
    public val enableCustomerCancellation: Boolean? = null,
    public val returnUrl: String? = null,
    public val skipTipping: Boolean? = null,
    public val tipping: InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4? = null,
) {
    public class Builder {
        public var allowRedisplay: InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd? =
            null

        public var enableCustomerCancellation: Boolean? = null

        public var returnUrl: String? = null

        public var skipTipping: Boolean? = null

        public var tipping: InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4? =
            null

        public fun build(): InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f =
            InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f(
                allowRedisplay = allowRedisplay,
                enableCustomerCancellation = enableCustomerCancellation,
                returnUrl = returnUrl,
                skipTipping = skipTipping,
                tipping = tipping,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f must be a JSON object",
                    )
            return InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f(
                allowRedisplay =
                    rawObject["allow_redisplay"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd>(
                                it,
                            )
                    },
                enableCustomerCancellation =
                    rawObject["enable_customer_cancellation"]?.let {
                        json
                            .decodeFromJsonElement<Boolean>(
                                it,
                            )
                    },
                returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
                skipTipping = rawObject["skip_tipping"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                tipping =
                    rawObject["tipping"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.allowRedisplay?.let { put("allow_redisplay", json.encodeToJsonElement(it)) }
                    value.enableCustomerCancellation?.let {
                        put(
                            "enable_customer_cancellation",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.returnUrl?.let { put("return_url", it) }
                    value.skipTipping?.let { put("skip_tipping", json.encodeToJsonElement(it)) }
                    value.tipping?.let { put("tipping", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f(
    block: InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f.Builder.() -> Unit,
): InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f =
    InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f.build(block)
