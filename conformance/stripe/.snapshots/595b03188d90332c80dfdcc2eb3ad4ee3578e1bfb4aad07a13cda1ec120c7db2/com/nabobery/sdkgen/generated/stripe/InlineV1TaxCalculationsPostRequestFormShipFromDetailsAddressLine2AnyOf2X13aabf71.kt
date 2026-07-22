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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/line2/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/line2/anyOf/1
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71.Serializer::class)
public sealed class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
