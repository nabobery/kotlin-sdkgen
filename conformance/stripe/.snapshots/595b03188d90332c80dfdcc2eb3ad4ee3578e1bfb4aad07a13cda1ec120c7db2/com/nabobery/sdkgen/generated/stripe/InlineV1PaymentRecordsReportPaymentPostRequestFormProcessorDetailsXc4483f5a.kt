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
import kotlin.String
import kotlin.Unit

/**
 * Processor information for this payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/processor_details
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a.Serializer::class)
public class InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a(
    public val type: InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsTypeX23aecdfb,
    public val custom: InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05? = null,
) {
    public class Builder {
        private var typeValue:
            InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsTypeX23aecdfb? = null

        public var type: InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsTypeX23aecdfb
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var custom: InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05? =
            null

        public fun build(): InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a {
            check(typeValue != null) { "type is required" }
            return InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a(
                type = type,
                custom = custom,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsTypeX23aecdfb>(
                    rawObject,
                    "type",
                )
            return InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a(
                type = type,
                custom =
                    rawObject["custom"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.custom?.let { put("custom", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a(
    block: InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a.Builder.() -> Unit,
): InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a =
    InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
