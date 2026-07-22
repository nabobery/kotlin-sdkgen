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
 * roperties/account/properties/individual/properties/full_name_aliases/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/full_name_aliases/anyOf/1
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131.Serializer::class)
public sealed class InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
