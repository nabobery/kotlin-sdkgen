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
 * /properties/documents/properties/proof_of_registration/properties/signer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/documents/properties/proof_of_registration/properties/signer
 */
@Serializable(with = InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4.Serializer::class)
public class InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4(
    public val person: String? = null,
) {
    public class Builder {
        public var person: String? = null

        public fun build(): InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4 =
            InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4(
                person = person,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4(
                person = rawObject["person"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.person?.let { put("person", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4(
    block: InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4 =
    InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX490d97e4.build(block)
