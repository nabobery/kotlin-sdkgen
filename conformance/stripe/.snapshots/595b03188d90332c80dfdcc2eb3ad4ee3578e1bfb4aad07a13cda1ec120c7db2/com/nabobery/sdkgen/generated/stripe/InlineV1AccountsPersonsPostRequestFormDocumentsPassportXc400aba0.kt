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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/passport.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/passport
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0(
    public val files: List<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd>? = null,
) {
    public class Builder {
        public var files:
            List<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd>? = null

        public fun build(): InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0 =
            InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0(
                files = files,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0 must be a JSON object",
                    )
            return InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0(
                files =
                    rawObject["files"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0",
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

public fun inlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0(
    block: InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0.Builder.() -> Unit,
): InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0 =
    InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0.build(block)
