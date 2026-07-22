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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/relationship/properties/percent_ownership/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/relationship/properties/percent_ownership/anyOf/1
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe.Serializer::class)
public sealed class InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
