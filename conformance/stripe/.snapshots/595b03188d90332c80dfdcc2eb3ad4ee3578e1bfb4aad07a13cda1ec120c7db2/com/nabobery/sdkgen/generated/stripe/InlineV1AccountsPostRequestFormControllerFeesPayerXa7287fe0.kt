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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/fees/properties/payer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/fees/properties/payer
 */
@Serializable(with = InlineV1AccountsPostRequestFormControllerFeesPayerXa7287fe0.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormControllerFeesPayerXa7287fe0 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account`.
     */
    public data object Account : InlineV1AccountsPostRequestFormControllerFeesPayerXa7287fe0() {
        public override val `value`: String = "account"
    }

    /**
     * Documented value. Wire value: `application`.
     */
    public data object Application : InlineV1AccountsPostRequestFormControllerFeesPayerXa7287fe0() {
        public override val `value`: String = "application"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPostRequestFormControllerFeesPayerXa7287fe0()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormControllerFeesPayerXa7287fe0 =
            when (value) {
                Account.value -> Account
                Application.value -> Application
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormControllerFeesPayerXa7287fe0> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormControllerFeesPayerXa7287fe0",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormControllerFeesPayerXa7287fe0 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormControllerFeesPayerXa7287fe0,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
