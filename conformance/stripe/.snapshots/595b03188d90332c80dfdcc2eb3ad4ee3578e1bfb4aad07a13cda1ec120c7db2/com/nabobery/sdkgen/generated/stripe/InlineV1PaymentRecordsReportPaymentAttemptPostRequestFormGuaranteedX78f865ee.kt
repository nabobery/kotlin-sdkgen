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
 * Information about the payment attempt guarantee.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema/properties/guaranteed
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee.Serializer::class)
public class InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee(
    public val guaranteedAt: Int,
) {
    public class Builder {
        private var guaranteedAtValue: Int? = null

        public var guaranteedAt: Int
            get() = requireNotNull(guaranteedAtValue) { "guaranteedAt is required" }
            set(`value`) {
                guaranteedAtValue = value
            }

        public fun build(): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee {
            check(guaranteedAtValue != null) { "guaranteedAt is required" }
            return InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee(
                guaranteedAt = guaranteedAt,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee must be a JSON object",
                    )
            val guaranteedAt = json.decodeRequired<Int>(rawObject, "guaranteed_at")
            return InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee(
                guaranteedAt = guaranteedAt,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("guaranteed_at", json.encodeToJsonElement(value.guaranteedAt))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee(
    block: InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee.Builder.() -> Unit,
): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee =
    InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
