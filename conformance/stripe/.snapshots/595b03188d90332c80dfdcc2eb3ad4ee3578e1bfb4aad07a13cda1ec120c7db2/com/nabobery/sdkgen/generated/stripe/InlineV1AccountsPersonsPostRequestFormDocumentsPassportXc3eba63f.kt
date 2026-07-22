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
 * ~1x-www-form-urlencoded/schema/properties/documents/properties/passport.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/documents/properties/passport
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f(
    public val files: List<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3>? = null,
) {
    public class Builder {
        public var files:
            List<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3>? = null

        public fun build(): InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f =
            InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f(
                files = files,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f must be a JSON object",
                    )
            return InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f(
                files =
                    rawObject["files"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f",
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

public fun inlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f(
    block: InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f.Builder.() -> Unit,
): InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f =
    InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f.build(block)
