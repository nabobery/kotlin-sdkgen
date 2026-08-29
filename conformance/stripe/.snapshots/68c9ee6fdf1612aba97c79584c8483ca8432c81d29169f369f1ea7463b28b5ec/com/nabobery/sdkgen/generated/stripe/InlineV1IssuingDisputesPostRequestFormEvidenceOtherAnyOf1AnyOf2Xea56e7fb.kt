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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/other/anyOf/0/properties/explanation/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/other/anyOf/0/properties/explanation/anyOf/1
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xea56e7fb.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xea56e7fb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xea56e7fb() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xea56e7fb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xea56e7fb = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xea56e7fb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xea56e7fb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xea56e7fb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xea56e7fb) {
      encoder.encodeString(value.value)
    }
  }
}
