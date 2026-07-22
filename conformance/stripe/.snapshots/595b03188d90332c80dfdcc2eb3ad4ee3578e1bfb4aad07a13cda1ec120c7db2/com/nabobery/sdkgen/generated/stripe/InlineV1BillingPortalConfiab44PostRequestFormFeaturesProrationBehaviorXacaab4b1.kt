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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/proration_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/proration_behavior
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1.Serializer::class)
public sealed class InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always_invoice`.
     */
    public data object AlwaysInvoice : InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1() {
        public override val `value`: String = "always_invoice"
    }

    /**
     * Documented value. Wire value: `create_prorations`.
     */
    public data object CreateProrations : InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1() {
        public override val `value`: String = "create_prorations"
    }

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1() {
        public override val `value`: String = "none"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1 =
            when (value) {
                AlwaysInvoice.value -> AlwaysInvoice
                CreateProrations.value -> CreateProrations
                None.value -> None
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
