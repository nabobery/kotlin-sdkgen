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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1received_credits/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/initiating_payment_method_details/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1received_credits/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/initiating_payment_method_details/properties/type
 */
@Serializable(with = InlineV1TestHelpersTreasured25PostRequestFormTypeXebb68e0d.Serializer::class)
public sealed class InlineV1TestHelpersTreasured25PostRequestFormTypeXebb68e0d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `us_bank_account`.
     */
    public data object UsBankAccount : InlineV1TestHelpersTreasured25PostRequestFormTypeXebb68e0d() {
        public override val `value`: String = "us_bank_account"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TestHelpersTreasured25PostRequestFormTypeXebb68e0d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TestHelpersTreasured25PostRequestFormTypeXebb68e0d =
            when (value) {
                UsBankAccount.value -> UsBankAccount
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TestHelpersTreasured25PostRequestFormTypeXebb68e0d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasured25PostRequestFormTypeXebb68e0d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasured25PostRequestFormTypeXebb68e0d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersTreasured25PostRequestFormTypeXebb68e0d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
