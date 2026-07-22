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
 * The person's verification status.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d(
    public val additionalDocument: InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f? = null,
    public val document: InlineV1AccountsPeoplePostRequestFormVerificationDocumentXa4cef636? = null,
) {
    public class Builder {
        public var additionalDocument:
            InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f? = null

        public var document: InlineV1AccountsPeoplePostRequestFormVerificationDocumentXa4cef636? = null

        public fun build(): InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d =
            InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d(
                additionalDocument = additionalDocument,
                document = document,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d must be a JSON object",
                    )
            return InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d(
                additionalDocument =
                    rawObject["additional_document"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f>(
                                it,
                            )
                    },
                document =
                    rawObject["document"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormVerificationDocumentXa4cef636>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.additionalDocument?.let { put("additional_document", json.encodeToJsonElement(it)) }
                    value.document?.let { put("document", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d(
    block: InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d.Builder.() -> Unit,
): InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d =
    InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d.build(block)
