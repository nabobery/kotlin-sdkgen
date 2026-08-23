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
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1merge/put/requestBody/content/app
 * lication~1json/schema/properties/merge_method
 */
@Serializable(with = InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60.Serializer::class)
public sealed class InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60 = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60) {
      encoder.encodeString(value.value)
    }
  }
}
