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
 * To enable Bizum, buyers need a Spanish IBAN from a bank connected to Bizum. Within their banking app, they can enable
 * Bizum and link their mobile number to their IBAN.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/bizum
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormBizumDisplayPreferenceX93a5e28c? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormBizumDisplayPreferenceX93a5e28c? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6 =
            InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormBizumDisplayPreferenceX93a5e28c>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6 =
    InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6.build(block)
