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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_amounts/anyOf/0/items/properties/taxability_reason.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_amounts/anyOf/0/items/properties/taxability_reason
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160.Serializer::class)
public sealed class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `customer_exempt`.
     */
    public data object CustomerExempt : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "customer_exempt"
    }

    /**
     * Documented value. Wire value: `not_collecting`.
     */
    public data object NotCollecting : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "not_collecting"
    }

    /**
     * Documented value. Wire value: `not_subject_to_tax`.
     */
    public data object NotSubjectToTax : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "not_subject_to_tax"
    }

    /**
     * Documented value. Wire value: `not_supported`.
     */
    public data object NotSupported : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "not_supported"
    }

    /**
     * Documented value. Wire value: `portion_product_exempt`.
     */
    public data object PortionProductExempt : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "portion_product_exempt"
    }

    /**
     * Documented value. Wire value: `portion_reduced_rated`.
     */
    public data object PortionReducedRated : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "portion_reduced_rated"
    }

    /**
     * Documented value. Wire value: `portion_standard_rated`.
     */
    public data object PortionStandardRated : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "portion_standard_rated"
    }

    /**
     * Documented value. Wire value: `product_exempt`.
     */
    public data object ProductExempt : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "product_exempt"
    }

    /**
     * Documented value. Wire value: `product_exempt_holiday`.
     */
    public data object ProductExemptHoliday : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "product_exempt_holiday"
    }

    /**
     * Documented value. Wire value: `proportionally_rated`.
     */
    public data object ProportionallyRated : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "proportionally_rated"
    }

    /**
     * Documented value. Wire value: `reduced_rated`.
     */
    public data object ReducedRated : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "reduced_rated"
    }

    /**
     * Documented value. Wire value: `reverse_charge`.
     */
    public data object ReverseCharge : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "reverse_charge"
    }

    /**
     * Documented value. Wire value: `standard_rated`.
     */
    public data object StandardRated : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "standard_rated"
    }

    /**
     * Documented value. Wire value: `taxable_basis_reduced`.
     */
    public data object TaxableBasisReduced : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "taxable_basis_reduced"
    }

    /**
     * Documented value. Wire value: `zero_rated`.
     */
    public data object ZeroRated : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160() {
        public override val `value`: String = "zero_rated"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160 =
            when (value) {
                CustomerExempt.value -> CustomerExempt
                NotCollecting.value -> NotCollecting
                NotSubjectToTax.value -> NotSubjectToTax
                NotSupported.value -> NotSupported
                PortionProductExempt.value -> PortionProductExempt
                PortionReducedRated.value -> PortionReducedRated
                PortionStandardRated.value -> PortionStandardRated
                ProductExempt.value -> ProductExempt
                ProductExemptHoliday.value -> ProductExemptHoliday
                ProportionallyRated.value -> ProportionallyRated
                ReducedRated.value -> ReducedRated
                ReverseCharge.value -> ReverseCharge
                StandardRated.value -> StandardRated
                TaxableBasisReduced.value -> TaxableBasisReduced
                ZeroRated.value -> ZeroRated
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
