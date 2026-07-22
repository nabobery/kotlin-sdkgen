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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/trial_settings/anyOf/0/properties/end_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/trial_settings/anyOf/0/properties/end_behavior
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197(
    public val missingPaymentMethod: InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef,
) {
    public class Builder {
        private var missingPaymentMethodValue:
            InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef? = null

        public var missingPaymentMethod:
            InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef
            get() = requireNotNull(missingPaymentMethodValue) { "missingPaymentMethod is required" }
            set(`value`) {
                missingPaymentMethodValue = value
            }

        public fun build(): InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197 {
            check(missingPaymentMethodValue != null) { "missingPaymentMethod is required" }
            return InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197(
                missingPaymentMethod = missingPaymentMethod,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197 must be a JSON object",
                    )
            val missingPaymentMethod =
                json
                    .decodeRequired<InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef>(
                        rawObject,
                        "missing_payment_method",
                    )
            return InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197(
                missingPaymentMethod = missingPaymentMethod,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("missing_payment_method", json.encodeToJsonElement(value.missingPaymentMethod))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197(
    block: InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197 =
    InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
