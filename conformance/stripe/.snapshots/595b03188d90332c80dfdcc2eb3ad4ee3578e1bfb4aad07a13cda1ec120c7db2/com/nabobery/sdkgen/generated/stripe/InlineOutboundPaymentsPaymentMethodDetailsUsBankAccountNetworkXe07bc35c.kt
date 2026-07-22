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
 * The network rails used. See the [docs](https://docs.stripe.com/treasury/money-movement/timelines) to learn more about
 * money movement timelines for each network type.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/outbound_payments_payment_method_details_us_bank_account/properties/
 * network
 */
@Serializable(with = InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c.Serializer::class)
public sealed class InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `ach`.
     */
    public data object Ach : InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c() {
        public override val `value`: String = "ach"
    }

    /**
     * Documented value. Wire value: `us_domestic_wire`.
     */
    public data object UsDomesticWire : InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c() {
        public override val `value`: String = "us_domestic_wire"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c()

    public companion object {
        public fun fromValue(`value`: String): InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c =
            when (value) {
                Ach.value -> Ach
                UsDomesticWire.value -> UsDomesticWire
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
