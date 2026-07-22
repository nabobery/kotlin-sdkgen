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
 * Source: sdkgen://source/openapi.json#/components/schemas/file/properties/links/properties/object
 */
@Serializable(with = InlineFileLinksObjectValueXd891f6ba.Serializer::class)
public sealed class InlineFileLinksObjectValueXd891f6ba {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlineFileLinksObjectValueXd891f6ba() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineFileLinksObjectValueXd891f6ba()

    public companion object {
        public fun fromValue(`value`: String): InlineFileLinksObjectValueXd891f6ba =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineFileLinksObjectValueXd891f6ba> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineFileLinksObjectValueXd891f6ba",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineFileLinksObjectValueXd891f6ba =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineFileLinksObjectValueXd891f6ba,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
