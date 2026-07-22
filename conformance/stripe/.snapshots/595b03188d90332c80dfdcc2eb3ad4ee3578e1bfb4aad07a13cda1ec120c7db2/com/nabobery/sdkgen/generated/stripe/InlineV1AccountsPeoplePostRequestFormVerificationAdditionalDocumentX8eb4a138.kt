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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/verification/properties/additional_document.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/verification/properties/additional_document
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138(
    public val back: String? = null,
    public val front: String? = null,
) {
    public class Builder {
        public var back: String? = null

        public var front: String? = null

        public fun build(): InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138 =
            InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138(
                back = back,
                front = front,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138 must be a JSON object",
                    )
            return InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138(
                back = rawObject["back"]?.let { json.decodeFromJsonElement<String>(it) },
                front = rawObject["front"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138",
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

public fun inlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138(
    block: InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138.Builder.() -> Unit,
): InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138 =
    InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138.build(block)
