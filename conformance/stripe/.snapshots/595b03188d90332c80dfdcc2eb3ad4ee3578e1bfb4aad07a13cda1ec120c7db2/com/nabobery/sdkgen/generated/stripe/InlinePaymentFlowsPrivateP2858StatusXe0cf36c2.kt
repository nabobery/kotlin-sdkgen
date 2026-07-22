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
 * Indicates whether or not the capture window is extended beyond the standard authorization.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_card_details_api_resource_ente
 * rprise_features_extended_authorization_extended_authorization/properties/status
 */
@Serializable(with = InlinePaymentFlowsPrivateP2858StatusXe0cf36c2.Serializer::class)
public sealed class InlinePaymentFlowsPrivateP2858StatusXe0cf36c2 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `disabled`.
     */
    public data object Disabled : InlinePaymentFlowsPrivateP2858StatusXe0cf36c2() {
        public override val `value`: String = "disabled"
    }

    /**
     * Documented value. Wire value: `enabled`.
     */
    public data object Enabled : InlinePaymentFlowsPrivateP2858StatusXe0cf36c2() {
        public override val `value`: String = "enabled"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentFlowsPrivateP2858StatusXe0cf36c2()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentFlowsPrivateP2858StatusXe0cf36c2 =
            when (value) {
                Disabled.value -> Disabled
                Enabled.value -> Enabled
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentFlowsPrivateP2858StatusXe0cf36c2> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsPrivateP2858StatusXe0cf36c2",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentFlowsPrivateP2858StatusXe0cf36c2 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentFlowsPrivateP2858StatusXe0cf36c2,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
