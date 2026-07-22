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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/verification/properties/document.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/verification/properties/document
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365(
    public val back: String? = null,
    public val front: String? = null,
) {
    public class Builder {
        public var back: String? = null

        public var front: String? = null

        public fun build(): InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365 =
            InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365(
                back = back,
                front = front,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365(
                back = rawObject["back"]?.let { json.decodeFromJsonElement<String>(it) },
                front = rawObject["front"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365",
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

public fun inlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365(
    block: InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365 =
    InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365.build(block)
