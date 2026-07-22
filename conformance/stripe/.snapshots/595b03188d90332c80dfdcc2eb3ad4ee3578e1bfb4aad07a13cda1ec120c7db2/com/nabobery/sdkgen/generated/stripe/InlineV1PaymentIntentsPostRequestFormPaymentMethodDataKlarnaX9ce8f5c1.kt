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
 * urlencoded/schema/properties/payment_method_data/properties/klarna.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/klarna
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1(
    public val dob: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXf46ce624? = null,
) {
    public class Builder {
        public var dob: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXf46ce624? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1(
                dob = dob,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1(
                dob =
                    rawObject["dob"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXf46ce624>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaX9ce8f5c1.build(block)
