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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/type
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e.Serializer::class)
public sealed class InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `financial_account`.
     */
    public data object FinancialAccount : InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e() {
        public override val `value`: String = "financial_account"
    }

    /**
     * Documented value. Wire value: `us_bank_account`.
     */
    public data object UsBankAccount : InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e() {
        public override val `value`: String = "us_bank_account"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e =
            when (value) {
                FinancialAccount.value -> FinancialAccount
                UsBankAccount.value -> UsBankAccount
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
