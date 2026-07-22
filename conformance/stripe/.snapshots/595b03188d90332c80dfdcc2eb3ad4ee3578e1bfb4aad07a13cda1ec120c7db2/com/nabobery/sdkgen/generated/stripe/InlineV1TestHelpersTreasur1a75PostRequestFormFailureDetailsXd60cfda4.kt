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
 * Details about a failed InboundTransfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1inbound_transfers~1{id}~1fail/post/requestBody/cont
 * ent/application~1x-www-form-urlencoded/schema/properties/failure_details
 */
@Serializable(with = InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4.Serializer::class)
public class InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4(
    public val code: InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669? = null,
) {
    public class Builder {
        public var code: InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669? =
            null

        public fun build(): InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4 =
            InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4(
                code = code,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4 must be a JSON object",
                    )
            return InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4(
                code =
                    rawObject["code"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4",
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

public fun inlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4(
    block: InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4.Builder.() -> Unit,
): InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4 =
    InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4.build(block)
