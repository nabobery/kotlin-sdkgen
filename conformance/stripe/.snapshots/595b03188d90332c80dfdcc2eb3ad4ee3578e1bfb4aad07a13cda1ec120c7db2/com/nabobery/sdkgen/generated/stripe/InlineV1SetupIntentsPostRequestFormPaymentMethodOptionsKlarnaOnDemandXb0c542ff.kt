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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/klarna/properties/on_demand.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/klarna/properties/on_demand
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff(
    public val averageAmount: Int? = null,
    public val maximumAmount: Int? = null,
    public val minimumAmount: Int? = null,
    public val purchaseInterval: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611? = null,
    public val purchaseIntervalCount: Int? = null,
) {
    public class Builder {
        public var averageAmount: Int? = null

        public var maximumAmount: Int? = null

        public var minimumAmount: Int? = null

        public var purchaseInterval:
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611? = null

        public var purchaseIntervalCount: Int? = null

        public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff =
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff(
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
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff must be a JSON object",
                    )
            return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff(
                averageAmount = rawObject["average_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                maximumAmount = rawObject["maximum_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                minimumAmount = rawObject["minimum_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                purchaseInterval =
                    rawObject["purchase_interval"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611>(
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
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff",
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff(
    block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff.Builder.() -> Unit,
): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff =
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff.build(block)
