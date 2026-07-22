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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/documents/properties/company_license.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/documents/properties/company_license
 */
@Serializable(with = InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6.Serializer::class)
public class InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6(
    public val files: List<String>? = null,
) {
    public class Builder {
        public var files: List<String>? = null

        public fun build(): InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6 =
            InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6(
                files = files,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6(
                files = rawObject["files"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6",
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

public fun inlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6(
    block: InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6 =
    InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6.build(block)
