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
 * /properties/documents/properties/proof_of_address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/documents/properties/proof_of_address
 */
@Serializable(with = InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3.Serializer::class)
public class InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3(
    public val files: List<String>? = null,
) {
    public class Builder {
        public var files: List<String>? = null

        public fun build(): InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3 =
            InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3(
                files = files,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3(
                files = rawObject["files"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3",
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

public fun inlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3(
    block: InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3 =
    InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3.build(block)
