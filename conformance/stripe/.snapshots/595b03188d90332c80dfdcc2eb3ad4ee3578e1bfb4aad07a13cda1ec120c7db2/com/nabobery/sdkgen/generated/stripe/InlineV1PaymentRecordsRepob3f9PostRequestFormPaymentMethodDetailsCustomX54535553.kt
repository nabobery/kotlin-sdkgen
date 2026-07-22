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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema/properties/payment_method_details/properties/custom.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema/properties/payment_method_details/properties/custom
 */
@Serializable(with = InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553.Serializer::class)
public class InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553(
    public val displayName: String? = null,
    public val type: String? = null,
) {
    public class Builder {
        public var displayName: String? = null

        public var type: String? = null

        public fun build(): InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553 =
            InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553(
                displayName = displayName,
                type = type,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553 must be a JSON object",
                    )
            return InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553(
                displayName = rawObject["display_name"]?.let { json.decodeFromJsonElement<String>(it) },
                type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.displayName?.let { put("display_name", it) }
                    value.type?.let { put("type", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553(
    block: InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553.Builder.() -> Unit,
): InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553 =
    InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsCustomX54535553.build(block)
