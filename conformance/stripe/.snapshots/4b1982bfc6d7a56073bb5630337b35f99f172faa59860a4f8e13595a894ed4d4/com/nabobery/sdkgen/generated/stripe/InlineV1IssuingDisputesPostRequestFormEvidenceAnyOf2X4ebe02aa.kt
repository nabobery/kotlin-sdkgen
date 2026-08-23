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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/additional_documentation/any
 * Of/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/additional_documentation/any
 * Of/1
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa) {
      encoder.encodeString(value.value)
    }
  }
}
