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
 * urlencoded/schema/properties/payment_method_data/properties/p24.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/p24
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95(
    public val bank: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24BankX3bd57e38? = null,
) {
    public class Builder {
        public var bank: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24BankX3bd57e38? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95(
                bank = bank,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95(
                bank =
                    rawObject["bank"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24BankX3bd57e38>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95",
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xe85c7e95.build(block)
