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
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/consent_collection/properties/payment_method_reuse_agreement.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/consent_collection/properties/payment_method_reuse_agreement
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1(
    public val position: InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef,
) {
    public class Builder {
        private var positionValue:
            InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef? = null

        public var position: InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef
            get() = requireNotNull(positionValue) { "position is required" }
            set(`value`) {
                positionValue = value
            }

        public fun build(): InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1 {
            check(positionValue != null) { "position is required" }
            return InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1(
                position = position,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1 must be a JSON object",
                    )
            val position =
                json.decodeRequired<InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef>(
                    rawObject,
                    "position",
                )
            return InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1(
                position = position,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("position", json.encodeToJsonElement(value.position))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1(
    block: InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1 =
    InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
