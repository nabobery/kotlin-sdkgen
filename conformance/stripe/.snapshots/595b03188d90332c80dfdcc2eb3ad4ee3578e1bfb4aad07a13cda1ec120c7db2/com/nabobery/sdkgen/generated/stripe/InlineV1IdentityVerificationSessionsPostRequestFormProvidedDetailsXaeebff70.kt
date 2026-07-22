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
 * Details provided about the user being verified. These details may be shown to the user.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/provided_details
 */
@Serializable(with = InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70.Serializer::class)
public class InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70(
    public val email: String? = null,
    public val phone: String? = null,
) {
    public class Builder {
        public var email: String? = null

        public var phone: String? = null

        public fun build(): InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70 =
            InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70(
                email = email,
                phone = phone,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70 must be a JSON object",
                    )
            return InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70(
                email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
                phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.email?.let { put("email", it) }
                    value.phone?.let { put("phone", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70(
    block: InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70.Builder.() -> Unit,
): InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70 =
    InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70.build(block)
