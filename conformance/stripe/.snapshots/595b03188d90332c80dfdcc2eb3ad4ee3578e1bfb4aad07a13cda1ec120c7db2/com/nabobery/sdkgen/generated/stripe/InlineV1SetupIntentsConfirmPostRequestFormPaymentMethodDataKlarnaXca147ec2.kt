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
 * w-form-urlencoded/schema/properties/payment_method_data/properties/klarna.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/klarna
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2(
    public val dob: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaDobX7284049b? = null,
) {
    public class Builder {
        public var dob: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaDobX7284049b? =
            null

        public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2 =
            InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2(
                dob = dob,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2 must be a JSON object",
                    )
            return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2(
                dob =
                    rawObject["dob"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaDobX7284049b>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2",
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

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2(
    block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2.Builder.() -> Unit,
): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2 =
    InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataKlarnaXca147ec2.build(block)
