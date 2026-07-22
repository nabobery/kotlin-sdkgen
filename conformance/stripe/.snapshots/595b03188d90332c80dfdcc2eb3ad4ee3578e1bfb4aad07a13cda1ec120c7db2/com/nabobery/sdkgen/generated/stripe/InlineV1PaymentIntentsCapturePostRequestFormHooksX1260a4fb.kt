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
 * Automations to be run during the PaymentIntent lifecycle
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb(
    public val inputs: InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f? = null,
) {
    public class Builder {
        public var inputs: InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f? = null

        public fun build(): InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb =
            InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb(
                inputs = inputs,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb must be a JSON object",
                    )
            return InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb(
                inputs =
                    rawObject["inputs"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormHooksInputsXd266903f>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.inputs?.let { put("inputs", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb(
    block: InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb.Builder.() -> Unit,
): InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb =
    InlineV1PaymentIntentsCapturePostRequestFormHooksX1260a4fb.build(block)
