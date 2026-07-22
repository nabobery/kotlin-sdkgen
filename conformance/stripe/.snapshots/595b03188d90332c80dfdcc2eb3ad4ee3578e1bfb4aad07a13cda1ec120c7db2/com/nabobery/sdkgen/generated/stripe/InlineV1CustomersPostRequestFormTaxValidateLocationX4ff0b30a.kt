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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/tax/properties/validate_location.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/tax/properties/validate_location
 */
@Serializable(with = InlineV1CustomersPostRequestFormTaxValidateLocationX4ff0b30a.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormTaxValidateLocationX4ff0b30a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `auto`.
     */
    public data object Auto : InlineV1CustomersPostRequestFormTaxValidateLocationX4ff0b30a() {
        public override val `value`: String = "auto"
    }

    /**
     * Documented value. Wire value: `deferred`.
     */
    public data object Deferred : InlineV1CustomersPostRequestFormTaxValidateLocationX4ff0b30a() {
        public override val `value`: String = "deferred"
    }

    /**
     * Documented value. Wire value: `immediately`.
     */
    public data object Immediately : InlineV1CustomersPostRequestFormTaxValidateLocationX4ff0b30a() {
        public override val `value`: String = "immediately"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersPostRequestFormTaxValidateLocationX4ff0b30a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CustomersPostRequestFormTaxValidateLocationX4ff0b30a =
            when (value) {
                Auto.value -> Auto
                Deferred.value -> Deferred
                Immediately.value -> Immediately
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersPostRequestFormTaxValidateLocationX4ff0b30a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormTaxValidateLocationX4ff0b30a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormTaxValidateLocationX4ff0b30a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersPostRequestFormTaxValidateLocationX4ff0b30a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
