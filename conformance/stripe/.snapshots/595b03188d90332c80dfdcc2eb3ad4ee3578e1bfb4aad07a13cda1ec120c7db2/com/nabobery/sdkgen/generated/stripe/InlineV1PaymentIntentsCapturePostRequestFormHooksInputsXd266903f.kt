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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks/properties/inputs.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks/properties/inputs
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f(
    public val tax: InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a? = null,
) {
    public class Builder {
        public var tax: InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a? = null

        public fun build(): InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f =
            InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f(
                tax = tax,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f must be a JSON object",
                    )
            return InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f(
                tax =
                    rawObject["tax"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f(
    block: InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f.Builder.() -> Unit,
): InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f =
    InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f.build(block)
