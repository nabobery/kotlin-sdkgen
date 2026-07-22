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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/documents/properties/visa.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/documents/properties/visa
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3(
    public val files: List<InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX4bc006e9>? = null,
) {
    public class Builder {
        public var files: List<InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX4bc006e9>? =
            null

        public fun build(): InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3 =
            InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3(
                files = files,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3 must be a JSON object",
                    )
            return InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3(
                files =
                    rawObject["files"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX4bc006e9>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.files?.let { put("files", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3(
    block: InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3.Builder.() -> Unit,
): InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3 =
    InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3.build(block)
