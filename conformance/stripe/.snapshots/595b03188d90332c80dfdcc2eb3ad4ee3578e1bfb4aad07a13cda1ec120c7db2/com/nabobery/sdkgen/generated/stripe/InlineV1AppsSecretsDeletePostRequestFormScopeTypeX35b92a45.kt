package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets~1delete/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/scope/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets~1delete/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/scope/properties/type
 */
@Serializable(with = InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45.Serializer::class)
public sealed class InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account`.
     */
    public data object Account : InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45() {
        public override val `value`: String = "account"
    }

    /**
     * Documented value. Wire value: `user`.
     */
    public data object User : InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45() {
        public override val `value`: String = "user"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45 =
            when (value) {
                Account.value -> Account
                User.value -> User
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
