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
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute~1close/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute~1close/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema
 */
@Serializable(with = InlineV1ChargesDisputeClosePostRequestFormX6a182c04.Serializer::class)
public class InlineV1ChargesDisputeClosePostRequestFormX6a182c04(
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

        public fun build(): InlineV1ChargesDisputeClosePostRequestFormX6a182c04 =
            InlineV1ChargesDisputeClosePostRequestFormX6a182c04(
                expand = expand,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1ChargesDisputeClosePostRequestFormX6a182c04 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ChargesDisputeClosePostRequestFormX6a182c04> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ChargesDisputeClosePostRequestFormX6a182c04 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputeClosePostRequestFormX6a182c04")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ChargesDisputeClosePostRequestFormX6a182c04 must be a JSON object",
                    )
            return InlineV1ChargesDisputeClosePostRequestFormX6a182c04(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ChargesDisputeClosePostRequestFormX6a182c04,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesDisputeClosePostRequestFormX6a182c04")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1ChargesDisputeClosePostRequestFormX6a182c04(
    block: InlineV1ChargesDisputeClosePostRequestFormX6a182c04.Builder.() -> Unit,
): InlineV1ChargesDisputeClosePostRequestFormX6a182c04 =
    InlineV1ChargesDisputeClosePostRequestFormX6a182c04.build(block)
