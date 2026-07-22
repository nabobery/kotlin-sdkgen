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
 * The type of fuel service.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fleet_data/properties/service_type
 */
@Serializable(with = InlineIssuingAuthorizationFleetDataServiceTypeX8234a514.Serializer::class)
public sealed class InlineIssuingAuthorizationFleetDataServiceTypeX8234a514 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `full_service`.
     */
    public data object FullService : InlineIssuingAuthorizationFleetDataServiceTypeX8234a514() {
        public override val `value`: String = "full_service"
    }

    /**
     * Documented value. Wire value: `non_fuel_transaction`.
     */
    public data object NonFuelTransaction : InlineIssuingAuthorizationFleetDataServiceTypeX8234a514() {
        public override val `value`: String = "non_fuel_transaction"
    }

    /**
     * Documented value. Wire value: `self_service`.
     */
    public data object SelfService : InlineIssuingAuthorizationFleetDataServiceTypeX8234a514() {
        public override val `value`: String = "self_service"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingAuthorizationFleetDataServiceTypeX8234a514()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingAuthorizationFleetDataServiceTypeX8234a514 =
            when (value) {
                FullService.value -> FullService
                NonFuelTransaction.value -> NonFuelTransaction
                SelfService.value -> SelfService
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingAuthorizationFleetDataServiceTypeX8234a514> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationFleetDataServiceTypeX8234a514",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFleetDataServiceTypeX8234a514 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingAuthorizationFleetDataServiceTypeX8234a514,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
