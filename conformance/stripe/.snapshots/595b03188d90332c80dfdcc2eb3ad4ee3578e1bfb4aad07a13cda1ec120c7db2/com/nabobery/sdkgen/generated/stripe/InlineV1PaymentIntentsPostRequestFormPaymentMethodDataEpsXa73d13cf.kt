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
 * urlencoded/schema/properties/payment_method_data/properties/eps.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/eps
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf(
    public val bank: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankXa22859e0? = null,
) {
    public class Builder {
        public var bank: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankXa22859e0? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf(
                bank = bank,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf(
                bank =
                    rawObject["bank"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankXa22859e0>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf",
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsXa73d13cf.build(block)
