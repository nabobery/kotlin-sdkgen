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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/properties/netw
 * ork_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/properties/netw
 * ork_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201(
    public val cartesBancaires: InlineV1PaymentIntentsPostRequestFormCartesBancairesXd9154f47? = null,
) {
    public class Builder {
        public var cartesBancaires: InlineV1PaymentIntentsPostRequestFormCartesBancairesXd9154f47? =
            null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201(
                cartesBancaires = cartesBancaires,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201(
                cartesBancaires =
                    rawObject["cartes_bancaires"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormCartesBancairesXd9154f47>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201",
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX2223f201.build(block)
