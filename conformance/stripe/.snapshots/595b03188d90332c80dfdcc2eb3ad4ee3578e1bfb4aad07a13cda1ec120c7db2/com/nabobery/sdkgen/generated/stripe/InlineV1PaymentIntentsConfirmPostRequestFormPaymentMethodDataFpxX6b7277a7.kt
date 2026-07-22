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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/fpx.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/fpx
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7(
    public val bank: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxBankX1d43c165,
) {
    public class Builder {
        private var bankValue:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxBankX1d43c165? = null

        public var bank: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxBankX1d43c165
            get() = requireNotNull(bankValue) { "bank is required" }
            set(`value`) {
                bankValue = value
            }

        public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7 {
            check(bankValue != null) { "bank is required" }
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7(
                bank = bank,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7 must be a JSON object",
                    )
            val bank =
                json.decodeRequired<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxBankX1d43c165>(
                    rawObject,
                    "bank",
                )
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7(
                bank = bank,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("bank", json.encodeToJsonElement(value.bank))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7(
    block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7.Builder.() -> Unit,
): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7 =
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFpxX6b7277a7 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
