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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/billing_thresholds/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/billing_thresholds/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0(
    public val usageGte: Int,
) {
    public class Builder {
        private var usageGteValue: Int? = null

        public var usageGte: Int
            get() = requireNotNull(usageGteValue) { "usageGte is required" }
            set(`value`) {
                usageGteValue = value
            }

        public fun build(): InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0 {
            check(usageGteValue != null) { "usageGte is required" }
            return InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0(
                usageGte = usageGte,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0 must be a JSON object",
                    )
            val usageGte = json.decodeRequired<Int>(rawObject, "usage_gte")
            return InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0(
                usageGte = usageGte,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("usage_gte", json.encodeToJsonElement(value.usageGte))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0(
    block: InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0.Builder.() -> Unit,
): InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0 =
    InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
