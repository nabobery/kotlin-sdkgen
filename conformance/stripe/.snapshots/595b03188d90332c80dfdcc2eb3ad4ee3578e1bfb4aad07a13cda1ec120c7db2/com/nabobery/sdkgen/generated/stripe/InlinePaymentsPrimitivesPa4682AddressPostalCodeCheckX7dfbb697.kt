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
 * If you provide a address postal code, the check result is one of `pass`, `fail`, `unavailable`, or `unchecked`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_checks/properties/address_postal_code_check
 */
@Serializable(with = InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697.Serializer::class)
public sealed class InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fail`.
     */
    public data object Fail : InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697() {
        public override val `value`: String = "fail"
    }

    /**
     * Documented value. Wire value: `pass`.
     */
    public data object Pass : InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697() {
        public override val `value`: String = "pass"
    }

    /**
     * Documented value. Wire value: `unavailable`.
     */
    public data object Unavailable : InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697() {
        public override val `value`: String = "unavailable"
    }

    /**
     * Documented value. Wire value: `unchecked`.
     */
    public data object Unchecked : InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697() {
        public override val `value`: String = "unchecked"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697 =
            when (value) {
                Fail.value -> Fail
                Pass.value -> Pass
                Unavailable.value -> Unavailable
                Unchecked.value -> Unchecked
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentsPrimitivesPa4682AddressPostalCodeCheckX7dfbb697,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
