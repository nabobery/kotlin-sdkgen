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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1debit_reversals/get/responses/200/content/application~1json/schem
 * a/properties/object
 */
@Serializable(with = InlineV1TreasuryDebitReversalsGetResponse200JsonObjectValueX2d741ed6.Serializer::class)
public sealed class InlineV1TreasuryDebitReversalsGetResponse200JsonObjectValueX2d741ed6 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlineV1TreasuryDebitReversalsGetResponse200JsonObjectValueX2d741ed6() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TreasuryDebitReversalsGetResponse200JsonObjectValueX2d741ed6()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TreasuryDebitReversalsGetResponse200JsonObjectValueX2d741ed6 =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TreasuryDebitReversalsGetResponse200JsonObjectValueX2d741ed6> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryDebitReversalsGetResponse200JsonObjectValueX2d741ed6",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TreasuryDebitReversalsGetResponse200JsonObjectValueX2d741ed6 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryDebitReversalsGetResponse200JsonObjectValueX2d741ed6,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
