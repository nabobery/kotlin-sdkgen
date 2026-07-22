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
 * oded/schema/properties/documents/properties/bank_account_ownership_verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/documents/properties/bank_account_ownership_verification
 */
@Serializable(with = InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28.Serializer::class)
public class InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28(
    public val files: List<String>? = null,
) {
    public class Builder {
        public var files: List<String>? = null

        public fun build(): InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28 =
            InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28(
                files = files,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28(
                files = rawObject["files"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28",
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

public fun inlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28(
    block: InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28 =
    InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28.build(block)
