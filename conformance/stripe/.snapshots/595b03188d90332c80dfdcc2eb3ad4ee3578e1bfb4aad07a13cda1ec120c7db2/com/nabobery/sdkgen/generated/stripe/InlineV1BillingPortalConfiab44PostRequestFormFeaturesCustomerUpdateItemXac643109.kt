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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/customer_update/properties/allowed_updates/any
 * Of/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/customer_update/properties/allowed_updates/any
 * Of/0/items
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109.Serializer::class)
public sealed class InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `address`.
     */
    public data object Address : InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109() {
        public override val `value`: String = "address"
    }

    /**
     * Documented value. Wire value: `email`.
     */
    public data object Email : InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109() {
        public override val `value`: String = "email"
    }

    /**
     * Documented value. Wire value: `name`.
     */
    public data object Name : InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109() {
        public override val `value`: String = "name"
    }

    /**
     * Documented value. Wire value: `phone`.
     */
    public data object Phone : InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109() {
        public override val `value`: String = "phone"
    }

    /**
     * Documented value. Wire value: `shipping`.
     */
    public data object Shipping : InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109() {
        public override val `value`: String = "shipping"
    }

    /**
     * Documented value. Wire value: `tax_id`.
     */
    public data object TaxId : InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109() {
        public override val `value`: String = "tax_id"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109 =
            when (value) {
                Address.value -> Address
                Email.value -> Email
                Name.value -> Name
                Phone.value -> Phone
                Shipping.value -> Shipping
                TaxId.value -> TaxId
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
