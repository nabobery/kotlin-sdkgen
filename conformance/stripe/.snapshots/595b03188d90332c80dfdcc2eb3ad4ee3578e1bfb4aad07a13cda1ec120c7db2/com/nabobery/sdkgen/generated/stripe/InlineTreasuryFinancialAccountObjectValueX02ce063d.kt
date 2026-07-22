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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.financial_account/properties/object
 */
@Serializable(with = InlineTreasuryFinancialAccountObjectValueX02ce063d.Serializer::class)
public sealed class InlineTreasuryFinancialAccountObjectValueX02ce063d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `treasury.financial_account`.
     */
    public data object TreasuryFinancialAccount : InlineTreasuryFinancialAccountObjectValueX02ce063d() {
        public override val `value`: String = "treasury.financial_account"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTreasuryFinancialAccountObjectValueX02ce063d()

    public companion object {
        public fun fromValue(`value`: String): InlineTreasuryFinancialAccountObjectValueX02ce063d =
            when (value) {
                TreasuryFinancialAccount.value -> TreasuryFinancialAccount
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTreasuryFinancialAccountObjectValueX02ce063d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountObjectValueX02ce063d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountObjectValueX02ce063d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryFinancialAccountObjectValueX02ce063d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
