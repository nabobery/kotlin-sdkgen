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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}~1detach/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}~1detach/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1PaymentMethodsDetachPostRequestFormXc63d7873.Serializer::class)
public class InlineV1PaymentMethodsDetachPostRequestFormXc63d7873(
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
) {
    public class Builder {
        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        public fun build(): InlineV1PaymentMethodsDetachPostRequestFormXc63d7873 =
            InlineV1PaymentMethodsDetachPostRequestFormXc63d7873(
                expand = expand,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsDetachPostRequestFormXc63d7873 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsDetachPostRequestFormXc63d7873> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsDetachPostRequestFormXc63d7873 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsDetachPostRequestFormXc63d7873")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodsDetachPostRequestFormXc63d7873 must be a JSON object",
                    )
            return InlineV1PaymentMethodsDetachPostRequestFormXc63d7873(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsDetachPostRequestFormXc63d7873,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsDetachPostRequestFormXc63d7873")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodsDetachPostRequestFormXc63d7873(
    block: InlineV1PaymentMethodsDetachPostRequestFormXc63d7873.Builder.() -> Unit,
): InlineV1PaymentMethodsDetachPostRequestFormXc63d7873 =
    InlineV1PaymentMethodsDetachPostRequestFormXc63d7873.build(block)
