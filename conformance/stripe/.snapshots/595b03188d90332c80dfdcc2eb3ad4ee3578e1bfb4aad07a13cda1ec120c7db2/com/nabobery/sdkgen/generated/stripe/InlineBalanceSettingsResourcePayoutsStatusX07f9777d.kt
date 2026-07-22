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
 * Whether the funds in this account can be paid out.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_payouts/properties/status
 */
@Serializable(with = InlineBalanceSettingsResourcePayoutsStatusX07f9777d.Serializer::class)
public sealed class InlineBalanceSettingsResourcePayoutsStatusX07f9777d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `disabled`.
     */
    public data object Disabled : InlineBalanceSettingsResourcePayoutsStatusX07f9777d() {
        public override val `value`: String = "disabled"
    }

    /**
     * Documented value. Wire value: `enabled`.
     */
    public data object Enabled : InlineBalanceSettingsResourcePayoutsStatusX07f9777d() {
        public override val `value`: String = "enabled"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineBalanceSettingsResourcePayoutsStatusX07f9777d()

    public companion object {
        public fun fromValue(`value`: String): InlineBalanceSettingsResourcePayoutsStatusX07f9777d =
            when (value) {
                Disabled.value -> Disabled
                Enabled.value -> Enabled
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineBalanceSettingsResourcePayoutsStatusX07f9777d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineBalanceSettingsResourcePayoutsStatusX07f9777d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineBalanceSettingsResourcePayoutsStatusX07f9777d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBalanceSettingsResourcePayoutsStatusX07f9777d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
