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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account/anyOf/1
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e.Serializer::class)
public sealed class InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X6e2ec21e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
