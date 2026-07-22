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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax_ids/get/parameters/3/schema/properties/type.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1tax_ids/get/parameters/3/schema/properties/type
 */
@Serializable(with = InlineV1TaxIdsGetParameterTypeX71d94e6a.Serializer::class)
public sealed class InlineV1TaxIdsGetParameterTypeX71d94e6a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account`.
     */
    public data object Account : InlineV1TaxIdsGetParameterTypeX71d94e6a() {
        public override val `value`: String = "account"
    }

    /**
     * Documented value. Wire value: `application`.
     */
    public data object Application : InlineV1TaxIdsGetParameterTypeX71d94e6a() {
        public override val `value`: String = "application"
    }

    /**
     * Documented value. Wire value: `customer`.
     */
    public data object Customer : InlineV1TaxIdsGetParameterTypeX71d94e6a() {
        public override val `value`: String = "customer"
    }

    /**
     * Documented value. Wire value: `self`.
     */
    public data object Self : InlineV1TaxIdsGetParameterTypeX71d94e6a() {
        public override val `value`: String = "self"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TaxIdsGetParameterTypeX71d94e6a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TaxIdsGetParameterTypeX71d94e6a =
            when (value) {
                Account.value -> Account
                Application.value -> Application
                Customer.value -> Customer
                Self.value -> Self
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TaxIdsGetParameterTypeX71d94e6a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TaxIdsGetParameterTypeX71d94e6a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1TaxIdsGetParameterTypeX71d94e6a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxIdsGetParameterTypeX71d94e6a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
