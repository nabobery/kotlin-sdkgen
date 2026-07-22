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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/netwo
 * rk_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/netwo
 * rk_options
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba(
    public val cartesBancaires: InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe? = null,
) {
    public class Builder {
        public var cartesBancaires: InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe? =
            null

        public fun build(): InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba =
            InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba(
                cartesBancaires = cartesBancaires,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba must be a JSON object",
                    )
            return InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba(
                cartesBancaires =
                    rawObject["cartes_bancaires"]?.let {
                        json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormCartesBancairesX7477efbe>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.cartesBancaires?.let { put("cartes_bancaires", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba(
    block: InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba.Builder.() -> Unit,
): InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba =
    InlineV1SetupIntentsConfirmPostRequestFormNetworkOptionsX2b50fdba.build(block)
