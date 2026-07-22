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
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/acss_debit/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/acss_debit/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2.Serializer::class)
public class InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2(
    public val preference: InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitPreferenceXc5f7edef? = null,
) {
    public class Builder {
        public var preference:
            InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitPreferenceXc5f7edef? = null

        public fun build(): InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2 =
            InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2(
                preference = preference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2(
                preference =
                    rawObject["preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitPreferenceXc5f7edef>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2(
    block: InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2.Builder.() -> Unit,
): InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2 =
    InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2.build(block)
