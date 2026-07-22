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
import kotlin.collections.List

/**
 * Controls saved payment method settings for the session. Only available in `payment` and `subscription` mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/saved_payment_method_options
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3(
    public val allowRedisplayFilters:
        List<InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898>? = null,
    public val paymentMethodRemove: InlineV1CheckoutSessionsPostRequestFormPaymentMethodRemoveX443717a3? = null,
    public val paymentMethodSave: InlineV1CheckoutSessionsPostRequestFormPaymentMethodSaveX38f24708? = null,
) {
    public class Builder {
        public var allowRedisplayFilters:
            List<InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898>? = null

        public var paymentMethodRemove:
            InlineV1CheckoutSessionsPostRequestFormPaymentMethodRemoveX443717a3? = null

        public var paymentMethodSave: InlineV1CheckoutSessionsPostRequestFormPaymentMethodSaveX38f24708? =
            null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3 =
            InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3(
                allowRedisplayFilters = allowRedisplayFilters,
                paymentMethodRemove = paymentMethodRemove,
                paymentMethodSave = paymentMethodSave,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3 must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3(
                allowRedisplayFilters =
                    rawObject["allow_redisplay_filters"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898>>(
                                it,
                            )
                    },
                paymentMethodRemove =
                    rawObject["payment_method_remove"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodRemoveX443717a3>(
                            it,
                        )
                    },
                paymentMethodSave =
                    rawObject["payment_method_save"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodSaveX38f24708>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.allowRedisplayFilters?.let { put("allow_redisplay_filters", json.encodeToJsonElement(it)) }
                    value.paymentMethodRemove?.let { put("payment_method_remove", json.encodeToJsonElement(it)) }
                    value.paymentMethodSave?.let { put("payment_method_save", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3(
    block: InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3 =
    InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3.build(block)
