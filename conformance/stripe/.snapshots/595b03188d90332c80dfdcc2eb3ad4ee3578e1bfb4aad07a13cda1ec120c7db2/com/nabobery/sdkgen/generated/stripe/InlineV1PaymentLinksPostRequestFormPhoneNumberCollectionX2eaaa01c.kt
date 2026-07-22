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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Controls phone number collection settings during checkout.
 *
 * We recommend that you review your privacy policy and check with your legal contacts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/phone_number_collection
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c(
    public val enabled: Boolean,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        public fun build(): InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c {
            check(enabledValue != null) { "enabled is required" }
            return InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c(
                enabled = enabled,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c must be a JSON object",
                    )
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c(
                enabled = enabled,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c(
    block: InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c =
    InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
