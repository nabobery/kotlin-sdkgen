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
 * Whether the Feature is operational.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_aba_toggle_settings/properties/
 * status
 */
@Serializable(with = InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96.Serializer::class)
public sealed class InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96() {
        public override val `value`: String = "pending"
    }

    /**
     * Documented value. Wire value: `restricted`.
     */
    public data object Restricted : InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96() {
        public override val `value`: String = "restricted"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96()

    public companion object {
        public fun fromValue(`value`: String): InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96 =
            when (value) {
                Active.value -> Active
                Pending.value -> Pending
                Restricted.value -> Restricted
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
