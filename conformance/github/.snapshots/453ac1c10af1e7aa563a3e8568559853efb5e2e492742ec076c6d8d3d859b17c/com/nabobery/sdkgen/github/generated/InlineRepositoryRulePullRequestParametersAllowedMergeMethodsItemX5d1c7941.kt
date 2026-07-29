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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-pull-request/properties/parameters/properties/allowe
 * d_merge_methods/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-pull-request/properties/parameters/properties/allowe
 * d_merge_methods/items
 */
@Serializable(with = InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941.Serializer::class)
public sealed class InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941 = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941) {
      encoder.encodeString(value.value)
    }
  }
}
