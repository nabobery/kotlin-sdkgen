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
 * The secret scope type.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/secret_service_resource_scope/properties/type
 */
@Serializable(with = InlineSecretServiceResourceScopeTypeX4fce8e76.Serializer::class)
public sealed class InlineSecretServiceResourceScopeTypeX4fce8e76 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account`.
     */
    public data object Account : InlineSecretServiceResourceScopeTypeX4fce8e76() {
        public override val `value`: String = "account"
    }

    /**
     * Documented value. Wire value: `user`.
     */
    public data object User : InlineSecretServiceResourceScopeTypeX4fce8e76() {
        public override val `value`: String = "user"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineSecretServiceResourceScopeTypeX4fce8e76()

    public companion object {
        public fun fromValue(`value`: String): InlineSecretServiceResourceScopeTypeX4fce8e76 =
            when (value) {
                Account.value -> Account
                User.value -> User
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineSecretServiceResourceScopeTypeX4fce8e76> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineSecretServiceResourceScopeTypeX4fce8e76",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineSecretServiceResourceScopeTypeX4fce8e76 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSecretServiceResourceScopeTypeX4fce8e76,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
