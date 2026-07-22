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
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_mode/properties/flexible.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_mode/properties/flexible
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e(
    public val prorationDiscounts: InlineV1SubscriptionsPostRequestFormBillingModeProrationDiscountsX320c6781? = null,
) {
    public class Builder {
        public var prorationDiscounts:
            InlineV1SubscriptionsPostRequestFormBillingModeProrationDiscountsX320c6781? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e =
            InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e(
                prorationDiscounts = prorationDiscounts,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e(
                prorationDiscounts =
                    rawObject["proration_discounts"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormBillingModeProrationDiscountsX320c6781>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.prorationDiscounts?.let { put("proration_discounts", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e(
    block: InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e =
    InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e.build(block)
