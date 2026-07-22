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
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/documents/properties/passport.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/documents/properties/passport
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54.Serializer::class)
public class InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54(
    public val files: List<InlineV1TokensPostRequestFormPersonDocumentsPassportFilesItemXdefd1e42>? = null,
) {
    public class Builder {
        public var files: List<InlineV1TokensPostRequestFormPersonDocumentsPassportFilesItemXdefd1e42>? =
            null

        public fun build(): InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54 =
            InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54(
                files = files,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54 must be a JSON object",
                    )
            return InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54(
                files =
                    rawObject["files"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1TokensPostRequestFormPersonDocumentsPassportFilesItemXdefd1e42>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.files?.let { put("files", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54(
    block: InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54.Builder.() -> Unit,
): InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54 =
    InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54.build(block)
