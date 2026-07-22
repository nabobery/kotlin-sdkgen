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
 * Information about the payment attempt failure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/failed
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037.Serializer::class)
public class InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037(
    public val failedAt: Int,
) {
    public class Builder {
        private var failedAtValue: Int? = null

        public var failedAt: Int
            get() = requireNotNull(failedAtValue) { "failedAt is required" }
            set(`value`) {
                failedAtValue = value
            }

        public fun build(): InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037 {
            check(failedAtValue != null) { "failedAt is required" }
            return InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037(
                failedAt = failedAt,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037 must be a JSON object",
                    )
            val failedAt = json.decodeRequired<Int>(rawObject, "failed_at")
            return InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037(
                failedAt = failedAt,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("failed_at", json.encodeToJsonElement(value.failedAt))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037(
    block: InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037.Builder.() -> Unit,
): InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037 =
    InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
