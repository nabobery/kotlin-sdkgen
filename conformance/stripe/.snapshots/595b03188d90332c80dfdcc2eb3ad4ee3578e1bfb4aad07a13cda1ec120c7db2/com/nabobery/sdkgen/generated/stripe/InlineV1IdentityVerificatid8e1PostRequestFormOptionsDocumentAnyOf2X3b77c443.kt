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
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/options/properties/document/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/options/properties/document/anyOf/1
 */
@Serializable(with = InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443.Serializer::class)
public sealed class InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
