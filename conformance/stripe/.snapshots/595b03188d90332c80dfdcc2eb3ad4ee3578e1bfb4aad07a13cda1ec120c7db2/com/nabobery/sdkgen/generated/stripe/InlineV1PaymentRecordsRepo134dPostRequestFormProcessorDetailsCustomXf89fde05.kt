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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/processor_details/properties/custom.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/processor_details/properties/custom
 */
@Serializable(with = InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05.Serializer::class)
public class InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05(
    public val paymentReference: String,
) {
    public class Builder {
        private var paymentReferenceValue: String? = null

        public var paymentReference: String
            get() = requireNotNull(paymentReferenceValue) { "paymentReference is required" }
            set(`value`) {
                paymentReferenceValue = value
            }

        public fun build(): InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05 {
            check(paymentReferenceValue != null) { "paymentReference is required" }
            return InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05(
                paymentReference = paymentReference,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05 must be a JSON object",
                    )
            val paymentReference = json.decodeRequired<String>(rawObject, "payment_reference")
            return InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05(
                paymentReference = paymentReference,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("payment_reference", value.paymentReference)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05(
    block: InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05.Builder.() -> Unit,
): InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05 =
    InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentRecordsRepo134dPostRequestFormProcessorDetailsCustomXf89fde05 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
