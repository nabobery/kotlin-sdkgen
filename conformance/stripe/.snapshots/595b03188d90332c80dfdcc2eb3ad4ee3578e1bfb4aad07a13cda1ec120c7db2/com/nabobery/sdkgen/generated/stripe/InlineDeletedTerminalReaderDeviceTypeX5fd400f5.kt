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
 * Device type of the reader.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_terminal.reader/properties/device_type
 */
@Serializable(with = InlineDeletedTerminalReaderDeviceTypeX5fd400f5.Serializer::class)
public sealed class InlineDeletedTerminalReaderDeviceTypeX5fd400f5 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `bbpos_chipper2x`.
     */
    public data object BbposChipper2x : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "bbpos_chipper2x"
    }

    /**
     * Documented value. Wire value: `bbpos_wisepad3`.
     */
    public data object BbposWisepad3 : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "bbpos_wisepad3"
    }

    /**
     * Documented value. Wire value: `bbpos_wisepos_e`.
     */
    public data object BbposWiseposE : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "bbpos_wisepos_e"
    }

    /**
     * Documented value. Wire value: `mobile_phone_reader`.
     */
    public data object MobilePhoneReader : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "mobile_phone_reader"
    }

    /**
     * Documented value. Wire value: `simulated_stripe_s700`.
     */
    public data object SimulatedStripeS700 : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "simulated_stripe_s700"
    }

    /**
     * Documented value. Wire value: `simulated_stripe_s710`.
     */
    public data object SimulatedStripeS710 : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "simulated_stripe_s710"
    }

    /**
     * Documented value. Wire value: `simulated_verifone_m425`.
     */
    public data object SimulatedVerifoneM425 : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "simulated_verifone_m425"
    }

    /**
     * Documented value. Wire value: `simulated_verifone_p630`.
     */
    public data object SimulatedVerifoneP630 : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "simulated_verifone_p630"
    }

    /**
     * Documented value. Wire value: `simulated_verifone_ux700`.
     */
    public data object SimulatedVerifoneUx700 : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "simulated_verifone_ux700"
    }

    /**
     * Documented value. Wire value: `simulated_verifone_v660p`.
     */
    public data object SimulatedVerifoneV660p : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "simulated_verifone_v660p"
    }

    /**
     * Documented value. Wire value: `simulated_wisepos_e`.
     */
    public data object SimulatedWiseposE : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "simulated_wisepos_e"
    }

    /**
     * Documented value. Wire value: `stripe_m2`.
     */
    public data object StripeM2 : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "stripe_m2"
    }

    /**
     * Documented value. Wire value: `stripe_s700`.
     */
    public data object StripeS700 : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "stripe_s700"
    }

    /**
     * Documented value. Wire value: `stripe_s710`.
     */
    public data object StripeS710 : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "stripe_s710"
    }

    /**
     * Documented value. Wire value: `verifone_P400`.
     */
    public data object VerifoneP400 : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "verifone_P400"
    }

    /**
     * Documented value. Wire value: `verifone_m425`.
     */
    public data object VerifoneM425 : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "verifone_m425"
    }

    /**
     * Documented value. Wire value: `verifone_p630`.
     */
    public data object VerifoneP630 : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "verifone_p630"
    }

    /**
     * Documented value. Wire value: `verifone_ux700`.
     */
    public data object VerifoneUx700 : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "verifone_ux700"
    }

    /**
     * Documented value. Wire value: `verifone_v660p`.
     */
    public data object VerifoneV660p : InlineDeletedTerminalReaderDeviceTypeX5fd400f5() {
        public override val `value`: String = "verifone_v660p"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineDeletedTerminalReaderDeviceTypeX5fd400f5()

    public companion object {
        public fun fromValue(`value`: String): InlineDeletedTerminalReaderDeviceTypeX5fd400f5 =
            when (value) {
                BbposChipper2x.value -> BbposChipper2x
                BbposWisepad3.value -> BbposWisepad3
                BbposWiseposE.value -> BbposWiseposE
                MobilePhoneReader.value -> MobilePhoneReader
                SimulatedStripeS700.value -> SimulatedStripeS700
                SimulatedStripeS710.value -> SimulatedStripeS710
                SimulatedVerifoneM425.value -> SimulatedVerifoneM425
                SimulatedVerifoneP630.value -> SimulatedVerifoneP630
                SimulatedVerifoneUx700.value -> SimulatedVerifoneUx700
                SimulatedVerifoneV660p.value -> SimulatedVerifoneV660p
                SimulatedWiseposE.value -> SimulatedWiseposE
                StripeM2.value -> StripeM2
                StripeS700.value -> StripeS700
                StripeS710.value -> StripeS710
                VerifoneP400.value -> VerifoneP400
                VerifoneM425.value -> VerifoneM425
                VerifoneP630.value -> VerifoneP630
                VerifoneUx700.value -> VerifoneUx700
                VerifoneV660p.value -> VerifoneV660p
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineDeletedTerminalReaderDeviceTypeX5fd400f5> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineDeletedTerminalReaderDeviceTypeX5fd400f5",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineDeletedTerminalReaderDeviceTypeX5fd400f5 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineDeletedTerminalReaderDeviceTypeX5fd400f5,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
