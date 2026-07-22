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
import kotlin.Unit

/**
 * Provides industry-specific information about the amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb(
    public val discountAmount: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41? = null,
    public val enforceArithmeticValidation: Boolean? = null,
    public val lineItems: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d? = null,
    public val shipping: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1? = null,
    public val tax: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c? = null,
) {
    public class Builder {
        public var discountAmount:
            InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41? = null

        public var enforceArithmeticValidation: Boolean? = null

        public var lineItems:
            InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d? = null

        public var shipping: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1? =
            null

        public var tax: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c? = null

        public fun build(): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb =
            InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb(
                discountAmount = discountAmount,
                enforceArithmeticValidation = enforceArithmeticValidation,
                lineItems = lineItems,
                shipping = shipping,
                tax = tax,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb must be a JSON object",
                    )
            return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb(
                discountAmount =
                    rawObject["discount_amount"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41>(
                                it,
                            )
                    },
                enforceArithmeticValidation =
                    rawObject["enforce_arithmetic_validation"]?.let {
                        json.decodeFromJsonElement<Boolean>(it)
                    },
                lineItems =
                    rawObject["line_items"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d>(
                                it,
                            )
                    },
                shipping =
                    rawObject["shipping"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1>(
                                it,
                            )
                    },
                tax =
                    rawObject["tax"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.discountAmount?.let { put("discount_amount", json.encodeToJsonElement(it)) }
                    value.enforceArithmeticValidation?.let {
                        put(
                            "enforce_arithmetic_validation",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
                    value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
                    value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb(
    block: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb.Builder.() -> Unit,
): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb =
    InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsX325d15cb.build(block)
