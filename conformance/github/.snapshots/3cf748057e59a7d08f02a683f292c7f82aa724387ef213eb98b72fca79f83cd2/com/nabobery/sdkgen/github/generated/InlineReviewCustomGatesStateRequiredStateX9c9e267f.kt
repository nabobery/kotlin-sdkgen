package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Whether to approve or reject deployment to the specified environments.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/review-custom-gates-state-required/properties/state
 */
@Serializable(with = InlineReviewCustomGatesStateRequiredStateX9c9e267f.Serializer::class)
public sealed class InlineReviewCustomGatesStateRequiredStateX9c9e267f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approved`.
   */
  public data object Approved : InlineReviewCustomGatesStateRequiredStateX9c9e267f() {
    public override val `value`: String = "approved"
  }

  /**
   * Documented value. Wire value: `rejected`.
   */
  public data object Rejected : InlineReviewCustomGatesStateRequiredStateX9c9e267f() {
    public override val `value`: String = "rejected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReviewCustomGatesStateRequiredStateX9c9e267f()

  public companion object {
    public fun fromValue(`value`: String): InlineReviewCustomGatesStateRequiredStateX9c9e267f = when (value) {
      Approved.value -> Approved
      Rejected.value -> Rejected
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReviewCustomGatesStateRequiredStateX9c9e267f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReviewCustomGatesStateRequiredStateX9c9e267f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReviewCustomGatesStateRequiredStateX9c9e267f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReviewCustomGatesStateRequiredStateX9c9e267f) {
      encoder.encodeString(value.value)
    }
  }
}
