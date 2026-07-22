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
 * Optional hash to set the return code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_payments~1{id}~1return/post/requestBody/co
 * ntent/application~1x-www-form-urlencoded/schema/properties/returned_details
 */
@Serializable(with = InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3.Serializer::class)
public class InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3(
    public val code: InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsCodeX3a3f53e3? = null,
) {
    public class Builder {
        public var code: InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsCodeX3a3f53e3? =
            null

        public fun build(): InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3 =
            InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3(
                code = code,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3 must be a JSON object",
                    )
            return InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3(
                code =
                    rawObject["code"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsCodeX3a3f53e3>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.code?.let { put("code", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3(
    block: InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3.Builder.() -> Unit,
): InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3 =
    InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3.build(block)
