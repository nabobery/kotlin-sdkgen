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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/documents/properties/company_ministerial_decree.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/documents/properties/company_ministerial_decree
 */
@Serializable(with = InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c.Serializer::class)
public class InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c(
    public val files: List<String>? = null,
) {
    public class Builder {
        public var files: List<String>? = null

        public fun build(): InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c =
            InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c(
                files = files,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c(
                files = rawObject["files"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c",
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

public fun inlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c(
    block: InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c =
    InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c.build(block)
