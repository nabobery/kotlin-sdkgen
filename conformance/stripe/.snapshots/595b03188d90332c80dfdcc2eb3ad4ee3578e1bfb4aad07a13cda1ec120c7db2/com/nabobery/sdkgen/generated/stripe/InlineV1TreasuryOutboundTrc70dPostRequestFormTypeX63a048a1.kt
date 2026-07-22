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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/destination_payment_method_data/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/destination_payment_method_data/properties/type
 */
@Serializable(with = InlineV1TreasuryOutboundTrc70dPostRequestFormTypeX63a048a1.Serializer::class)
public sealed class InlineV1TreasuryOutboundTrc70dPostRequestFormTypeX63a048a1 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `financial_account`.
     */
    public data object FinancialAccount : InlineV1TreasuryOutboundTrc70dPostRequestFormTypeX63a048a1() {
        public override val `value`: String = "financial_account"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TreasuryOutboundTrc70dPostRequestFormTypeX63a048a1()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TreasuryOutboundTrc70dPostRequestFormTypeX63a048a1 =
            when (value) {
                FinancialAccount.value -> FinancialAccount
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TreasuryOutboundTrc70dPostRequestFormTypeX63a048a1> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundTrc70dPostRequestFormTypeX63a048a1",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundTrc70dPostRequestFormTypeX63a048a1 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryOutboundTrc70dPostRequestFormTypeX63a048a1,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
