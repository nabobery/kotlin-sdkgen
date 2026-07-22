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
import kotlin.Int
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/klarna/anyOf/0/properties/on_demand.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/klarna/anyOf/0/properties/on_demand
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7(
    public val averageAmount: Int? = null,
    public val maximumAmount: Int? = null,
    public val minimumAmount: Int? = null,
    public val purchaseInterval: InlineV1PaymentIntentsPostRequestFormPurchaseIntervalXd1c3e8fd? = null,
    public val purchaseIntervalCount: Int? = null,
) {
    public class Builder {
        public var averageAmount: Int? = null

        public var maximumAmount: Int? = null

        public var minimumAmount: Int? = null

        public var purchaseInterval: InlineV1PaymentIntentsPostRequestFormPurchaseIntervalXd1c3e8fd? =
            null

        public var purchaseIntervalCount: Int? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7(
                averageAmount = averageAmount,
                maximumAmount = maximumAmount,
                minimumAmount = minimumAmount,
                purchaseInterval = purchaseInterval,
                purchaseIntervalCount = purchaseIntervalCount,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7(
                averageAmount = rawObject["average_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                maximumAmount = rawObject["maximum_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                minimumAmount = rawObject["minimum_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                purchaseInterval =
                    rawObject["purchase_interval"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPurchaseIntervalXd1c3e8fd>(it)
                    },
                purchaseIntervalCount =
                    rawObject["purchase_interval_count"]?.let {
                        json.decodeFromJsonElement<Int>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.averageAmount?.let { put("average_amount", json.encodeToJsonElement(it)) }
                    value.maximumAmount?.let { put("maximum_amount", json.encodeToJsonElement(it)) }
                    value.minimumAmount?.let { put("minimum_amount", json.encodeToJsonElement(it)) }
                    value.purchaseInterval?.let { put("purchase_interval", json.encodeToJsonElement(it)) }
                    value.purchaseIntervalCount?.let { put("purchase_interval_count", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7.build(block)
