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
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/default_allowed_updates/anyOf/0/
 * items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/default_allowed_updates/anyOf/0/
 * items
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3.Serializer::class)
public sealed class InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `price`.
     */
    public data object Price : InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3() {
        public override val `value`: String = "price"
    }

    /**
     * Documented value. Wire value: `promotion_code`.
     */
    public data object PromotionCode : InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3() {
        public override val `value`: String = "promotion_code"
    }

    /**
     * Documented value. Wire value: `quantity`.
     */
    public data object Quantity : InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3() {
        public override val `value`: String = "quantity"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3()

    public companion object {
        public fun fromValue(`value`: String): InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3 =
            when (value) {
                Price.value -> Price
                PromotionCode.value -> PromotionCode
                Quantity.value -> Quantity
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
