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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/verification/properties/additional_document.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/verification/properties/additional_document
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de(
    public val back: String? = null,
    public val front: String? = null,
) {
    public class Builder {
        public var back: String? = null

        public var front: String? = null

        public fun build(): InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de =
            InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de(
                back = back,
                front = front,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de(
                back = rawObject["back"]?.let { json.decodeFromJsonElement<String>(it) },
                front = rawObject["front"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de",
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

public fun inlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de(
    block: InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de =
    InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de.build(block)
