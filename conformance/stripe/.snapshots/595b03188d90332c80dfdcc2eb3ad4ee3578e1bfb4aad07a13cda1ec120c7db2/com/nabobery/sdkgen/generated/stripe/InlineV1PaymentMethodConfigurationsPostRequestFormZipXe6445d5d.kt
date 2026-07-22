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
 * Zip gives your customers a way to split purchases over a series of payments. Check this
 * [page](https://docs.stripe.com/payments/zip) for more details like country availability.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/zip
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d(
    public val displayPreference: InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d =
            InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d =
    InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d.build(block)
