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
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54(
    public val amount: Int,
    public val amountType: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAmountTypeX03683e83,
    public val interval: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardIntervalX8242e4f0,
    public val reference: String,
    public val startDate: Int,
    public val description: String? = null,
    public val endDate: Int? = null,
    public val intervalCount: Int? = null,
    public val supportedTypes:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1ItemX65e0ef03>? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var amountTypeValue:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAmountTypeX03683e83? = null

        public var amountType:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAmountTypeX03683e83
            get() = requireNotNull(amountTypeValue) { "amountType is required" }
            set(`value`) {
                amountTypeValue = value
            }

        private var intervalValue:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardIntervalX8242e4f0? = null

        public var interval:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardIntervalX8242e4f0
            get() = requireNotNull(intervalValue) { "interval is required" }
            set(`value`) {
                intervalValue = value
            }

        private var referenceValue: String? = null

        public var reference: String
            get() = requireNotNull(referenceValue) { "reference is required" }
            set(`value`) {
                referenceValue = value
            }

        private var startDateValue: Int? = null

        public var startDate: Int
            get() = requireNotNull(startDateValue) { "startDate is required" }
            set(`value`) {
                startDateValue = value
            }

        public var description: String? = null

        public var endDate: Int? = null

        public var intervalCount: Int? = null

        public var supportedTypes:
            List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1ItemX65e0ef03>? =
            null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54 {
            check(amountValue != null) { "amount is required" }
            check(amountTypeValue != null) { "amountType is required" }
            check(intervalValue != null) { "interval is required" }
            check(referenceValue != null) { "reference is required" }
            check(startDateValue != null) { "startDate is required" }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54(
                amount = amount,
                amountType = amountType,
                interval = interval,
                reference = reference,
                startDate = startDate,
                description = description,
                endDate = endDate,
                intervalCount = intervalCount,
                supportedTypes = supportedTypes,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54 must be a JSON object",
                    )
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val amountType =
                json
                    .decodeRequired<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAmountTypeX03683e83>(
                        rawObject,
                        "amount_type",
                    )
            val interval =
                json
                    .decodeRequired<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardIntervalX8242e4f0>(
                        rawObject,
                        "interval",
                    )
            val reference = json.decodeRequired<String>(rawObject, "reference")
            val startDate = json.decodeRequired<Int>(rawObject, "start_date")
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54(
                amount = amount,
                amountType = amountType,
                interval = interval,
                reference = reference,
                startDate = startDate,
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<Int>(it) },
                intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
                supportedTypes =
                    rawObject["supported_types"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1ItemX65e0ef03>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("amount_type", json.encodeToJsonElement(value.amountType))
                    put("interval", json.encodeToJsonElement(value.interval))
                    put("reference", value.reference)
                    put("start_date", json.encodeToJsonElement(value.startDate))
                    value.description?.let { put("description", it) }
                    value.endDate?.let { put("end_date", json.encodeToJsonElement(it)) }
                    value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
                    value.supportedTypes?.let { put("supported_types", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXfc27da54 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
