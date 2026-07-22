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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/verification/properties/additional_document.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/verification/properties/additional_document
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964.Serializer::class)
public class InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964(
    public val back: String? = null,
    public val front: String? = null,
) {
    public class Builder {
        public var back: String? = null

        public var front: String? = null

        public fun build(): InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964 =
            InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964(
                back = back,
                front = front,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964 must be a JSON object",
                    )
            return InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964(
                back = rawObject["back"]?.let { json.decodeFromJsonElement<String>(it) },
                front = rawObject["front"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.back?.let { put("back", it) }
                    value.front?.let { put("front", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964(
    block: InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964.Builder.() -> Unit,
): InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964 =
    InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964.build(block)
