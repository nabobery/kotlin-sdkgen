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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/get/parameters/4/schema
 */
@Serializable(with = InlineV1AccountsExternalAccountsGetParameterX44f2e643.Serializer::class)
public sealed class InlineV1AccountsExternalAccountsGetParameterX44f2e643 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `bank_account`.
     */
    public data object BankAccount : InlineV1AccountsExternalAccountsGetParameterX44f2e643() {
        public override val `value`: String = "bank_account"
    }

    /**
     * Documented value. Wire value: `card`.
     */
    public data object Card : InlineV1AccountsExternalAccountsGetParameterX44f2e643() {
        public override val `value`: String = "card"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsExternalAccountsGetParameterX44f2e643()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AccountsExternalAccountsGetParameterX44f2e643 =
            when (value) {
                BankAccount.value -> BankAccount
                Card.value -> Card
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsExternalAccountsGetParameterX44f2e643> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsExternalAccountsGetParameterX44f2e643",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAccountsGetParameterX44f2e643 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsExternalAccountsGetParameterX44f2e643,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
