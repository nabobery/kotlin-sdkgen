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
 * Type of owner referenced.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_i_ds_owner/properties/type
 */
@Serializable(with = InlineTaxIDsOwnerTypeXb1bf3e21.Serializer::class)
public sealed class InlineTaxIDsOwnerTypeXb1bf3e21 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account`.
     */
    public data object Account : InlineTaxIDsOwnerTypeXb1bf3e21() {
        public override val `value`: String = "account"
    }

    /**
     * Documented value. Wire value: `application`.
     */
    public data object Application : InlineTaxIDsOwnerTypeXb1bf3e21() {
        public override val `value`: String = "application"
    }

    /**
     * Documented value. Wire value: `customer`.
     */
    public data object Customer : InlineTaxIDsOwnerTypeXb1bf3e21() {
        public override val `value`: String = "customer"
    }

    /**
     * Documented value. Wire value: `self`.
     */
    public data object Self : InlineTaxIDsOwnerTypeXb1bf3e21() {
        public override val `value`: String = "self"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxIDsOwnerTypeXb1bf3e21()

    public companion object {
        public fun fromValue(`value`: String): InlineTaxIDsOwnerTypeXb1bf3e21 =
            when (value) {
                Account.value -> Account
                Application.value -> Application
                Customer.value -> Customer
                Self.value -> Self
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxIDsOwnerTypeXb1bf3e21> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxIDsOwnerTypeXb1bf3e21",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTaxIDsOwnerTypeXb1bf3e21 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxIDsOwnerTypeXb1bf3e21,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
