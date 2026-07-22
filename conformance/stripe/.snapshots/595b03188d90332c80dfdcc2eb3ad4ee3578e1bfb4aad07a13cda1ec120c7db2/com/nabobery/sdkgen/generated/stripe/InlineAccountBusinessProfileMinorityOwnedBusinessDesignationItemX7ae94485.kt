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
 * sdkgen://source/openapi.json#/components/schemas/account_business_profile/properties/minority_owned_business_designat
 * ion/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/account_business_profile/properties/minority_owned_business_designat
 * ion/items
 */
@Serializable(with = InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485.Serializer::class)
public sealed class InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `lgbtqi_owned_business`.
     */
    public data object LgbtqiOwnedBusiness : InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485() {
        public override val `value`: String = "lgbtqi_owned_business"
    }

    /**
     * Documented value. Wire value: `minority_owned_business`.
     */
    public data object MinorityOwnedBusiness : InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485() {
        public override val `value`: String = "minority_owned_business"
    }

    /**
     * Documented value. Wire value: `none_of_these_apply`.
     */
    public data object NoneOfTheseApply : InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485() {
        public override val `value`: String = "none_of_these_apply"
    }

    /**
     * Documented value. Wire value: `prefer_not_to_answer`.
     */
    public data object PreferNotToAnswer : InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485() {
        public override val `value`: String = "prefer_not_to_answer"
    }

    /**
     * Documented value. Wire value: `women_owned_business`.
     */
    public data object WomenOwnedBusiness : InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485() {
        public override val `value`: String = "women_owned_business"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485 =
            when (value) {
                LgbtqiOwnedBusiness.value -> LgbtqiOwnedBusiness
                MinorityOwnedBusiness.value -> MinorityOwnedBusiness
                NoneOfTheseApply.value -> NoneOfTheseApply
                PreferNotToAnswer.value -> PreferNotToAnswer
                WomenOwnedBusiness.value -> WomenOwnedBusiness
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
