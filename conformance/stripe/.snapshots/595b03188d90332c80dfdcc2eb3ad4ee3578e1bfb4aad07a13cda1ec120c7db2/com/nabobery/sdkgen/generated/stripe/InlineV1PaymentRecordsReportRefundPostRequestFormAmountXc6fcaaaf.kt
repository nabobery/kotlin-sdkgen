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
 * A positive integer in the [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal) representing how
 * much of this payment to refund. Can refund only up to the remaining, unrefunded amount of the payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_refund/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/amount
 */
@Serializable(with = InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf.Serializer::class)
public class InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf(
    public val currency: String,
    public val `value`: Int,
) {
    public class Builder {
        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        private var valueValue: Int? = null

        public var `value`: Int
            get() = requireNotNull(valueValue) { "value is required" }
            set(`value`) {
                valueValue = value
            }

        public fun build(): InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf {
            check(currencyValue != null) { "currency is required" }
            check(valueValue != null) { "value is required" }
            return InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf(
                currency = currency,
                value = value,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf must be a JSON object",
                    )
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val value = json.decodeRequired<Int>(rawObject, "value")
            return InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf(
                currency = currency,
                value = value,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("currency", value.currency)
                    put("value", json.encodeToJsonElement(value.value))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf(
    block: InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf.Builder.() -> Unit,
): InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf =
    InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
