package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/merged-upstream/properties/merge_type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/merged-upstream/properties/merge_type
 */
@Serializable(with = InlineMergedUpstreamMergeTypeX7755f7bc.Serializer::class)
public sealed class InlineMergedUpstreamMergeTypeX7755f7bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineMergedUpstreamMergeTypeX7755f7bc() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `fast-forward`.
   */
  public data object FastForward : InlineMergedUpstreamMergeTypeX7755f7bc() {
    public override val `value`: String = "fast-forward"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineMergedUpstreamMergeTypeX7755f7bc() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMergedUpstreamMergeTypeX7755f7bc()

  public companion object {
    public fun fromValue(`value`: String): InlineMergedUpstreamMergeTypeX7755f7bc = when (value) {
      Merge.value -> Merge
      FastForward.value -> FastForward
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMergedUpstreamMergeTypeX7755f7bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineMergedUpstreamMergeTypeX7755f7bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMergedUpstreamMergeTypeX7755f7bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMergedUpstreamMergeTypeX7755f7bc) {
      encoder.encodeString(value.value)
    }
  }
}
