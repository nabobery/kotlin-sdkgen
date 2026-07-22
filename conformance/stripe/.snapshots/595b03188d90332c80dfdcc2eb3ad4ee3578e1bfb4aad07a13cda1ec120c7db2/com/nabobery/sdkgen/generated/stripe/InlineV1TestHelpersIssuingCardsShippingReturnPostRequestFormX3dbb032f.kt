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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1cards~1{card}~1shipping~1return/post/requestBody/con
 * tent/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1cards~1{card}~1shipping~1return/post/requestBody/con
 * tent/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f.Serializer::class)
public class InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f(
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

        public fun build(): InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f =
            InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f(
                expand = expand,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f must be a JSON object",
                    )
            return InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f(
    block: InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f.Builder.() -> Unit,
): InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f =
    InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f.build(block)
