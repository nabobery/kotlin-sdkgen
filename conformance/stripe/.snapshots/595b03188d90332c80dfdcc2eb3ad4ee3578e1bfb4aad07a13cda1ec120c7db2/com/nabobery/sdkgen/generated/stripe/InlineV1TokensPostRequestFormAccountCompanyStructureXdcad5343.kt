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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company/properties/structure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company/properties/structure
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343.Serializer::class)
public sealed class InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = ""
    }

    /**
     * Documented value. Wire value: `free_zone_establishment`.
     */
    public data object FreeZoneEstablishment : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "free_zone_establishment"
    }

    /**
     * Documented value. Wire value: `free_zone_llc`.
     */
    public data object FreeZoneLlc : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "free_zone_llc"
    }

    /**
     * Documented value. Wire value: `government_instrumentality`.
     */
    public data object GovernmentInstrumentality : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "government_instrumentality"
    }

    /**
     * Documented value. Wire value: `governmental_unit`.
     */
    public data object GovernmentalUnit : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "governmental_unit"
    }

    /**
     * Documented value. Wire value: `incorporated_non_profit`.
     */
    public data object IncorporatedNonProfit : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "incorporated_non_profit"
    }

    /**
     * Documented value. Wire value: `incorporated_partnership`.
     */
    public data object IncorporatedPartnership : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "incorporated_partnership"
    }

    /**
     * Documented value. Wire value: `limited_liability_partnership`.
     */
    public data object LimitedLiabilityPartnership : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "limited_liability_partnership"
    }

    /**
     * Documented value. Wire value: `llc`.
     */
    public data object Llc : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "llc"
    }

    /**
     * Documented value. Wire value: `multi_member_llc`.
     */
    public data object MultiMemberLlc : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "multi_member_llc"
    }

    /**
     * Documented value. Wire value: `private_company`.
     */
    public data object PrivateCompany : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "private_company"
    }

    /**
     * Documented value. Wire value: `private_corporation`.
     */
    public data object PrivateCorporation : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "private_corporation"
    }

    /**
     * Documented value. Wire value: `private_partnership`.
     */
    public data object PrivatePartnership : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "private_partnership"
    }

    /**
     * Documented value. Wire value: `public_company`.
     */
    public data object PublicCompany : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "public_company"
    }

    /**
     * Documented value. Wire value: `public_corporation`.
     */
    public data object PublicCorporation : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "public_corporation"
    }

    /**
     * Documented value. Wire value: `public_partnership`.
     */
    public data object PublicPartnership : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "public_partnership"
    }

    /**
     * Documented value. Wire value: `registered_charity`.
     */
    public data object RegisteredCharity : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "registered_charity"
    }

    /**
     * Documented value. Wire value: `single_member_llc`.
     */
    public data object SingleMemberLlc : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "single_member_llc"
    }

    /**
     * Documented value. Wire value: `sole_establishment`.
     */
    public data object SoleEstablishment : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "sole_establishment"
    }

    /**
     * Documented value. Wire value: `sole_proprietorship`.
     */
    public data object SoleProprietorship : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "sole_proprietorship"
    }

    /**
     * Documented value. Wire value: `tax_exempt_government_instrumentality`.
     */
    public data object TaxExemptGovernmentInstrumentality : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "tax_exempt_government_instrumentality"
    }

    /**
     * Documented value. Wire value: `unincorporated_association`.
     */
    public data object UnincorporatedAssociation : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "unincorporated_association"
    }

    /**
     * Documented value. Wire value: `unincorporated_non_profit`.
     */
    public data object UnincorporatedNonProfit : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "unincorporated_non_profit"
    }

    /**
     * Documented value. Wire value: `unincorporated_partnership`.
     */
    public data object UnincorporatedPartnership : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343() {
        public override val `value`: String = "unincorporated_partnership"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343 =
            when (value) {
                Value.value -> Value
                FreeZoneEstablishment.value -> FreeZoneEstablishment
                FreeZoneLlc.value -> FreeZoneLlc
                GovernmentInstrumentality.value -> GovernmentInstrumentality
                GovernmentalUnit.value -> GovernmentalUnit
                IncorporatedNonProfit.value -> IncorporatedNonProfit
                IncorporatedPartnership.value -> IncorporatedPartnership
                LimitedLiabilityPartnership.value -> LimitedLiabilityPartnership
                Llc.value -> Llc
                MultiMemberLlc.value -> MultiMemberLlc
                PrivateCompany.value -> PrivateCompany
                PrivateCorporation.value -> PrivateCorporation
                PrivatePartnership.value -> PrivatePartnership
                PublicCompany.value -> PublicCompany
                PublicCorporation.value -> PublicCorporation
                PublicPartnership.value -> PublicPartnership
                RegisteredCharity.value -> RegisteredCharity
                SingleMemberLlc.value -> SingleMemberLlc
                SoleEstablishment.value -> SoleEstablishment
                SoleProprietorship.value -> SoleProprietorship
                TaxExemptGovernmentInstrumentality.value -> TaxExemptGovernmentInstrumentality
                UnincorporatedAssociation.value -> UnincorporatedAssociation
                UnincorporatedNonProfit.value -> UnincorporatedNonProfit
                UnincorporatedPartnership.value -> UnincorporatedPartnership
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
