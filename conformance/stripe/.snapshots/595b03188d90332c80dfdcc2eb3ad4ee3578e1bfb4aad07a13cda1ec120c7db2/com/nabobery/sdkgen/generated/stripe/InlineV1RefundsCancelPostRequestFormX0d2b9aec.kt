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
 * sdkgen://source/openapi.json#/paths/~1v1~1refunds~1{refund}~1cancel/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1refunds~1{refund}~1cancel/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema
 */
@Serializable(with = InlineV1RefundsCancelPostRequestFormX0d2b9aec.Serializer::class)
public class InlineV1RefundsCancelPostRequestFormX0d2b9aec(
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

        public fun build(): InlineV1RefundsCancelPostRequestFormX0d2b9aec =
            InlineV1RefundsCancelPostRequestFormX0d2b9aec(
                expand = expand,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1RefundsCancelPostRequestFormX0d2b9aec =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1RefundsCancelPostRequestFormX0d2b9aec> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1RefundsCancelPostRequestFormX0d2b9aec {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1RefundsCancelPostRequestFormX0d2b9aec")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1RefundsCancelPostRequestFormX0d2b9aec must be a JSON object",
                    )
            return InlineV1RefundsCancelPostRequestFormX0d2b9aec(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1RefundsCancelPostRequestFormX0d2b9aec,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1RefundsCancelPostRequestFormX0d2b9aec")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1RefundsCancelPostRequestFormX0d2b9aec(
    block: InlineV1RefundsCancelPostRequestFormX0d2b9aec.Builder.() -> Unit,
): InlineV1RefundsCancelPostRequestFormX0d2b9aec = InlineV1RefundsCancelPostRequestFormX0d2b9aec.build(block)
