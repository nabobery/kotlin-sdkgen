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
 * Indicates whether the cardholder provided a postal code and if it matched the cardholder’s billing address.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_rejected_card/properties/addre
 * ss_postal_code_check
 */
@Serializable(with = InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff.Serializer::class)
public sealed class InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fail`.
     */
    public data object Fail : InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff() {
        public override val `value`: String = "fail"
    }

    /**
     * Documented value. Wire value: `pass`.
     */
    public data object Pass : InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff() {
        public override val `value`: String = "pass"
    }

    /**
     * Documented value. Wire value: `unavailable`.
     */
    public data object Unavailable : InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff() {
        public override val `value`: String = "unavailable"
    }

    /**
     * Documented value. Wire value: `unchecked`.
     */
    public data object Unchecked : InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff() {
        public override val `value`: String = "unchecked"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff()

    public companion object {
        public fun fromValue(`value`: String): InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff =
            when (value) {
                Fail.value -> Fail
                Pass.value -> Pass
                Unavailable.value -> Unavailable
                Unchecked.value -> Unchecked
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
