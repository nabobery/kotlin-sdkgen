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
 * A set of options for the session’s verification checks.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/options
 */
@Serializable(with = InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707.Serializer::class)
public class InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707(
    public val document: InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44? = null,
) {
    public class Builder {
        public var document:
            InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44? = null

        public fun build(): InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707 =
            InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707(
                document = document,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707 must be a JSON object",
                    )
            return InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707(
                document =
                    rawObject["document"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX77849d44>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.document?.let { put("document", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707(
    block: InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707.Builder.() -> Unit,
): InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707 =
    InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707.build(block)
