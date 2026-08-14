package io.github.nabobery.sdkgen.generated.stripe

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
 * ed/schema/properties/evidence/properties/duplicate/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/duplicate/anyOf/1
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13) {
      encoder.encodeString(value.value)
    }
  }
}
