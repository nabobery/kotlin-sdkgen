package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations~1{authorization}~1approve/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations~1{authorization}~1approve/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa.Serializer::class)
public sealed class InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa) {
      encoder.encodeString(value.value)
    }
  }
}
