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
 * sdkgen://source/openapi.json#/components/schemas/portal_customer_update/properties/allowed_updates/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_customer_update/properties/allowed_updates/items
 */
@Serializable(with = InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a.Serializer::class)
public sealed class InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `address`.
     */
    public data object Address : InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a() {
        public override val `value`: String = "address"
    }

    /**
     * Documented value. Wire value: `email`.
     */
    public data object Email : InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a() {
        public override val `value`: String = "email"
    }

    /**
     * Documented value. Wire value: `name`.
     */
    public data object Name : InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a() {
        public override val `value`: String = "name"
    }

    /**
     * Documented value. Wire value: `phone`.
     */
    public data object Phone : InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a() {
        public override val `value`: String = "phone"
    }

    /**
     * Documented value. Wire value: `shipping`.
     */
    public data object Shipping : InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a() {
        public override val `value`: String = "shipping"
    }

    /**
     * Documented value. Wire value: `tax_id`.
     */
    public data object TaxId : InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a() {
        public override val `value`: String = "tax_id"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a()

    public companion object {
        public fun fromValue(`value`: String): InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a =
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

    public object Serializer : KSerializer<InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
