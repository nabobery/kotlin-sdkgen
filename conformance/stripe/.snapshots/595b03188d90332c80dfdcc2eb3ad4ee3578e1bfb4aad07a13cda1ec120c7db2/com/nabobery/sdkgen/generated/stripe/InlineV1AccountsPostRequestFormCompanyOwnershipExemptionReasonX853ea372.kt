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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/company/properties/ownership_exemption_reason.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/company/properties/ownership_exemption_reason
 */
@Serializable(with = InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372() {
        public override val `value`: String = ""
    }

    /**
     * Documented value. Wire value: `qualified_entity_exceeds_ownership_threshold`.
     */
    public data object QualifiedEntityExceedsOwnershipThreshold : InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372() {
        public override val `value`: String = "qualified_entity_exceeds_ownership_threshold"
    }

    /**
     * Documented value. Wire value: `qualifies_as_financial_institution`.
     */
    public data object QualifiesAsFinancialInstitution : InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372() {
        public override val `value`: String = "qualifies_as_financial_institution"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372 =
            when (value) {
                Value.value -> Value
                QualifiedEntityExceedsOwnershipThreshold.value -> QualifiedEntityExceedsOwnershipThreshold
                QualifiesAsFinancialInstitution.value -> QualifiesAsFinancialInstitution
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
