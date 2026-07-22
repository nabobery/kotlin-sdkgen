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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/commit-comparison/properties/status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit-comparison/properties/status
 */
@Serializable(with = InlineCommitComparisonStatusXa3342f22.Serializer::class)
public sealed class InlineCommitComparisonStatusXa3342f22 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `diverged`.
   */
  public data object Diverged : InlineCommitComparisonStatusXa3342f22() {
    public override val `value`: String = "diverged"
  }

  /**
   * Documented value. Wire value: `ahead`.
   */
  public data object Ahead : InlineCommitComparisonStatusXa3342f22() {
    public override val `value`: String = "ahead"
  }

  /**
   * Documented value. Wire value: `behind`.
   */
  public data object Behind : InlineCommitComparisonStatusXa3342f22() {
    public override val `value`: String = "behind"
  }

  /**
   * Documented value. Wire value: `identical`.
   */
  public data object Identical : InlineCommitComparisonStatusXa3342f22() {
    public override val `value`: String = "identical"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCommitComparisonStatusXa3342f22()

  public companion object {
    public fun fromValue(`value`: String): InlineCommitComparisonStatusXa3342f22 = when (value) {
      Diverged.value -> Diverged
      Ahead.value -> Ahead
      Behind.value -> Behind
      Identical.value -> Identical
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCommitComparisonStatusXa3342f22> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCommitComparisonStatusXa3342f22", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCommitComparisonStatusXa3342f22 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCommitComparisonStatusXa3342f22) {
      encoder.encodeString(value.value)
    }
  }
}
