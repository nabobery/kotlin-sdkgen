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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/klarna/properties/on_demand.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/klarna/properties/on_demand
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e(
    public val averageAmount: Int? = null,
    public val maximumAmount: Int? = null,
    public val minimumAmount: Int? = null,
    public val purchaseInterval: InlineV1SetupIntentsConfirmPostRequestFormPurchaseIntervalX02765da5? = null,
    public val purchaseIntervalCount: Int? = null,
) {
    public class Builder {
        public var averageAmount: Int? = null

        public var maximumAmount: Int? = null

        public var minimumAmount: Int? = null

        public var purchaseInterval:
            InlineV1SetupIntentsConfirmPostRequestFormPurchaseIntervalX02765da5? = null

        public var purchaseIntervalCount: Int? = null

        public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e =
            InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e(
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
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e must be a JSON object",
                    )
            return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e(
                averageAmount = rawObject["average_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                maximumAmount = rawObject["maximum_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                minimumAmount = rawObject["minimum_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                purchaseInterval =
                    rawObject["purchase_interval"]?.let {
                        json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPurchaseIntervalX02765da5>(
                            it,
                        )
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
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e",
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

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e(
    block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e.Builder.() -> Unit,
): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e =
    InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e.build(block)
