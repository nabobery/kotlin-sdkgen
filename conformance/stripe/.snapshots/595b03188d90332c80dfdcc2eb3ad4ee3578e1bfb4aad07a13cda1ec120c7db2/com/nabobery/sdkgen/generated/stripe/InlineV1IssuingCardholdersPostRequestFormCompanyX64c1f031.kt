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
 * Additional information about a `company` cardholder.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/company
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031(
    public val taxId: String? = null,
) {
    public class Builder {
        public var taxId: String? = null

        public fun build(): InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031 =
            InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031(
                taxId = taxId,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031 must be a JSON object",
                    )
            return InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031(
                taxId = rawObject["tax_id"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.taxId?.let { put("tax_id", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031(
    block: InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031.Builder.() -> Unit,
): InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031 =
    InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031.build(block)
