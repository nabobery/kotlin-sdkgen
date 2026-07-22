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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/get/responses/200/content/application~1json/schema/proper
 * ties/object
 */
@Serializable(with = InlineV1IssuingDisputesGetResponse200JsonObjectValueX1c058fcb.Serializer::class)
public sealed class InlineV1IssuingDisputesGetResponse200JsonObjectValueX1c058fcb {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlineV1IssuingDisputesGetResponse200JsonObjectValueX1c058fcb() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingDisputesGetResponse200JsonObjectValueX1c058fcb()

    public companion object {
        public fun fromValue(`value`: String): InlineV1IssuingDisputesGetResponse200JsonObjectValueX1c058fcb =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesGetResponse200JsonObjectValueX1c058fcb> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesGetResponse200JsonObjectValueX1c058fcb",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesGetResponse200JsonObjectValueX1c058fcb =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesGetResponse200JsonObjectValueX1c058fcb,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
