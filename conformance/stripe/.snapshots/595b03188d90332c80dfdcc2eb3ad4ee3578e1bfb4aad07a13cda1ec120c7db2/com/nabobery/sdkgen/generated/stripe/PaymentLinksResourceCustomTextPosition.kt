package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class PaymentLinksResourceCustomTextPositionView(
    public val message: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_custom_text_position
 */
@Serializable(with = PaymentLinksResourceCustomTextPosition.Serializer::class)
public class PaymentLinksResourceCustomTextPosition(
    /**
     * Text can be up to 1200 characters in length.
     */
    public val message: String,
) {
    public class Builder {
        private var messageValue: String? = null

        public var message: String
            get() = requireNotNull(messageValue) { "message is required" }
            set(`value`) {
                messageValue = value
            }

        public fun build(): PaymentLinksResourceCustomTextPosition {
            check(messageValue != null) { "message is required" }
            return PaymentLinksResourceCustomTextPosition(
                message = message,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentLinksResourceCustomTextPosition =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentLinksResourceCustomTextPosition> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentLinksResourceCustomTextPosition {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceCustomTextPosition")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentLinksResourceCustomTextPosition must be a JSON object")
            val message = json.decodeRequired<String>(rawObject, "message")
            return PaymentLinksResourceCustomTextPosition(
                message = message,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentLinksResourceCustomTextPosition,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceCustomTextPosition")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("message", value.message)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentLinksResourceCustomTextPosition(
    block: PaymentLinksResourceCustomTextPosition.Builder.() -> Unit,
): PaymentLinksResourceCustomTextPosition = PaymentLinksResourceCustomTextPosition.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentLinksResourceCustomTextPosition is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
