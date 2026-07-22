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
 * The type of purchase.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fleet_data/properties/purchase_type
 */
@Serializable(with = InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329.Serializer::class)
public sealed class InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fuel_and_non_fuel_purchase`.
     */
    public data object FuelAndNonFuelPurchase : InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329() {
        public override val `value`: String = "fuel_and_non_fuel_purchase"
    }

    /**
     * Documented value. Wire value: `fuel_purchase`.
     */
    public data object FuelPurchase : InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329() {
        public override val `value`: String = "fuel_purchase"
    }

    /**
     * Documented value. Wire value: `non_fuel_purchase`.
     */
    public data object NonFuelPurchase : InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329() {
        public override val `value`: String = "non_fuel_purchase"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329 =
            when (value) {
                FuelAndNonFuelPurchase.value -> FuelAndNonFuelPurchase
                FuelPurchase.value -> FuelPurchase
                NonFuelPurchase.value -> NonFuelPurchase
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
