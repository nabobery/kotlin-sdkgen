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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents/properties/visa.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents/properties/visa
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912(
    public val files: List<InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemXcaa8b9d0>? = null,
) {
    public class Builder {
        public var files: List<InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemXcaa8b9d0>? =
            null

        public fun build(): InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912 =
            InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912(
                files = files,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912 must be a JSON object",
                    )
            return InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912(
                files =
                    rawObject["files"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemXcaa8b9d0>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.files?.let { put("files", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912(
    block: InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912.Builder.() -> Unit,
): InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912 =
    InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912.build(block)
