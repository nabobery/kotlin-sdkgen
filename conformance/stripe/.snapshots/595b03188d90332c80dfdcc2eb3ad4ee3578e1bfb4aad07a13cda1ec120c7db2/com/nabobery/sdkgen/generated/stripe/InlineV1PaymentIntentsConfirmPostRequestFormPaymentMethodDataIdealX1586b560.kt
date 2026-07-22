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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/ideal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/ideal
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560(
    public val bank: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealBankX755fe716? = null,
) {
    public class Builder {
        public var bank:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealBankX755fe716? = null

        public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560 =
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560(
                bank = bank,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560 must be a JSON object",
                    )
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560(
                bank =
                    rawObject["bank"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealBankX755fe716>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560(
    block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560.Builder.() -> Unit,
): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560 =
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataIdealX1586b560.build(block)
