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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/company/properties/verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/company/properties/verification
 */
@Serializable(with = InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95.Serializer::class)
public class InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95(
    public val document: InlineV1AccountsPostRequestFormCompanyVerificationDocumentX9f68bb33? = null,
) {
    public class Builder {
        public var document: InlineV1AccountsPostRequestFormCompanyVerificationDocumentX9f68bb33? = null

        public fun build(): InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95 =
            InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95(
                document = document,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95(
                document =
                    rawObject["document"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyVerificationDocumentX9f68bb33>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.document?.let { put("document", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormCompanyVerificationX2caadd95(
    block: InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95 =
    InlineV1AccountsPostRequestFormCompanyVerificationX2caadd95.build(block)
