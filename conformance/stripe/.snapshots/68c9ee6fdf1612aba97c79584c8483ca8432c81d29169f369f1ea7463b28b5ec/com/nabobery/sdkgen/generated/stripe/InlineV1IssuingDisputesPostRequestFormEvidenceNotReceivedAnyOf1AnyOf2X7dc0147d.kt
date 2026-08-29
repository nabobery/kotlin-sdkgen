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
 * ed/schema/properties/evidence/properties/not_received/anyOf/0/properties/additional_documentation/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/not_received/anyOf/0/properties/additional_documentation/anyOf/1
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d) {
      encoder.encodeString(value.value)
    }
  }
}
