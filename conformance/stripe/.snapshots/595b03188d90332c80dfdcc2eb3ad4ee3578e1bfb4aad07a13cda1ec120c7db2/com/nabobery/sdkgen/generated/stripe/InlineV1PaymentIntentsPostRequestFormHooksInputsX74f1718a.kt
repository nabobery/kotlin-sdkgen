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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/hooks/properties/inputs.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/hooks/properties/inputs
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a(
    public val tax: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e? = null,
) {
    public class Builder {
        public var tax: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a =
            InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a(
                tax = tax,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a(
                tax =
                    rawObject["tax"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a(
    block: InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a =
    InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a.build(block)
