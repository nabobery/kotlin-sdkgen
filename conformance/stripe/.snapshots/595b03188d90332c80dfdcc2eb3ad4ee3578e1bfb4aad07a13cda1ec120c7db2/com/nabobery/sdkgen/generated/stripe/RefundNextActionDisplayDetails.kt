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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund_next_action_display_details
 */
@Serializable(with = RefundNextActionDisplayDetails.Serializer::class)
public class RefundNextActionDisplayDetails(
    public val emailSent: EmailSent,
    /**
     * The expiry timestamp.
     */
    public val expiresAt: Int,
) {
    public class Builder {
        private var emailSentValue: EmailSent? = null

        public var emailSent: EmailSent
            get() = requireNotNull(emailSentValue) { "emailSent is required" }
            set(`value`) {
                emailSentValue = value
            }

        private var expiresAtValue: Int? = null

        public var expiresAt: Int
            get() = requireNotNull(expiresAtValue) { "expiresAt is required" }
            set(`value`) {
                expiresAtValue = value
            }

        public fun build(): RefundNextActionDisplayDetails {
            check(emailSentValue != null) { "emailSent is required" }
            check(expiresAtValue != null) { "expiresAt is required" }
            return RefundNextActionDisplayDetails(
                emailSent = emailSent,
                expiresAt = expiresAt,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): RefundNextActionDisplayDetails = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<RefundNextActionDisplayDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): RefundNextActionDisplayDetails {
            val jsonDecoder = decoder.requireJsonDecoder("RefundNextActionDisplayDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("RefundNextActionDisplayDetails must be a JSON object")
            val emailSent = json.decodeRequired<EmailSent>(rawObject, "email_sent")
            val expiresAt = json.decodeRequired<Int>(rawObject, "expires_at")
            return RefundNextActionDisplayDetails(
                emailSent = emailSent,
                expiresAt = expiresAt,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: RefundNextActionDisplayDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("RefundNextActionDisplayDetails")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("email_sent", json.encodeToJsonElement(value.emailSent))
                    put("expires_at", json.encodeToJsonElement(value.expiresAt))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun refundNextActionDisplayDetails(
    block: RefundNextActionDisplayDetails.Builder.() -> Unit,
): RefundNextActionDisplayDetails = RefundNextActionDisplayDetails.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "RefundNextActionDisplayDetails is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
