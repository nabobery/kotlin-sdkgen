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
 * The merge method to use.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/auto-merge/properties/merge_method
 */
@Serializable(with = InlineAutoMergeMergeMethodX22377dd2.Serializer::class)
public sealed class InlineAutoMergeMergeMethodX22377dd2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineAutoMergeMergeMethodX22377dd2() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineAutoMergeMergeMethodX22377dd2() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineAutoMergeMergeMethodX22377dd2() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAutoMergeMergeMethodX22377dd2()

  public companion object {
    public fun fromValue(`value`: String): InlineAutoMergeMergeMethodX22377dd2 = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAutoMergeMergeMethodX22377dd2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAutoMergeMergeMethodX22377dd2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAutoMergeMergeMethodX22377dd2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAutoMergeMergeMethodX22377dd2) {
      encoder.encodeString(value.value)
    }
  }
}
