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
 * /properties/documents/properties/proof_of_ultimate_beneficial_ownership.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/documents/properties/proof_of_ultimate_beneficial_ownership
 */
@Serializable(with = InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4.Serializer::class)
public class InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4(
    public val files: List<String>? = null,
    public val signer: InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6SignerXd3fa4b25? = null,
) {
    public class Builder {
        public var files: List<String>? = null

        public var signer:
            InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6SignerXd3fa4b25? = null

        public fun build(): InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4 =
            InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4(
                files = files,
                signer = signer,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4(
                files = rawObject["files"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                signer =
                    rawObject["signer"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6SignerXd3fa4b25>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.files?.let { put("files", json.encodeToJsonElement(it)) }
                    value.signer?.let { put("signer", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4(
    block: InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4 =
    InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4.build(block)
