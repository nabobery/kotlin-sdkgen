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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-diff/items/properties/change_type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-diff/items/properties/change_type
 */
@Serializable(with = InlineDependencyGraphDiffItemChangeTypeXf17dfac7.Serializer::class)
public sealed class InlineDependencyGraphDiffItemChangeTypeXf17dfac7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `added`.
   */
  public data object Added : InlineDependencyGraphDiffItemChangeTypeXf17dfac7() {
    public override val `value`: String = "added"
  }

  /**
   * Documented value. Wire value: `removed`.
   */
  public data object Removed : InlineDependencyGraphDiffItemChangeTypeXf17dfac7() {
    public override val `value`: String = "removed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependencyGraphDiffItemChangeTypeXf17dfac7()

  public companion object {
    public fun fromValue(`value`: String): InlineDependencyGraphDiffItemChangeTypeXf17dfac7 = when (value) {
      Added.value -> Added
      Removed.value -> Removed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependencyGraphDiffItemChangeTypeXf17dfac7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineDependencyGraphDiffItemChangeTypeXf17dfac7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependencyGraphDiffItemChangeTypeXf17dfac7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependencyGraphDiffItemChangeTypeXf17dfac7) {
      encoder.encodeString(value.value)
    }
  }
}
