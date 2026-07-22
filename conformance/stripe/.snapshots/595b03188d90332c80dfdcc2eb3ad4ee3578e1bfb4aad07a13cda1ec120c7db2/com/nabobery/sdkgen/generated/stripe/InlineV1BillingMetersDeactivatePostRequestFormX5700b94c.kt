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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters~1{id}~1deactivate/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters~1{id}~1deactivate/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema
 */
@Serializable(with = InlineV1BillingMetersDeactivatePostRequestFormX5700b94c.Serializer::class)
public class InlineV1BillingMetersDeactivatePostRequestFormX5700b94c(
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

        public fun build(): InlineV1BillingMetersDeactivatePostRequestFormX5700b94c =
            InlineV1BillingMetersDeactivatePostRequestFormX5700b94c(
                expand = expand,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1BillingMetersDeactivatePostRequestFormX5700b94c =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1BillingMetersDeactivatePostRequestFormX5700b94c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1BillingMetersDeactivatePostRequestFormX5700b94c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingMetersDeactivatePostRequestFormX5700b94c")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1BillingMetersDeactivatePostRequestFormX5700b94c must be a JSON object",
                    )
            return InlineV1BillingMetersDeactivatePostRequestFormX5700b94c(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingMetersDeactivatePostRequestFormX5700b94c,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingMetersDeactivatePostRequestFormX5700b94c")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1BillingMetersDeactivatePostRequestFormX5700b94c(
    block: InlineV1BillingMetersDeactivatePostRequestFormX5700b94c.Builder.() -> Unit,
): InlineV1BillingMetersDeactivatePostRequestFormX5700b94c =
    InlineV1BillingMetersDeactivatePostRequestFormX5700b94c.build(block)
