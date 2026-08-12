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
 * The target of the ruleset
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset/properties/target
 */
@Serializable(with = InlineRepositoryRulesetTargetX0b0a0c68.Serializer::class)
public sealed class InlineRepositoryRulesetTargetX0b0a0c68 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineRepositoryRulesetTargetX0b0a0c68() {
    public override val `value`: String = "branch"
  }

  /**
   * Documented value. Wire value: `tag`.
   */
  public data object Tag : InlineRepositoryRulesetTargetX0b0a0c68() {
    public override val `value`: String = "tag"
  }

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineRepositoryRulesetTargetX0b0a0c68() {
    public override val `value`: String = "push"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineRepositoryRulesetTargetX0b0a0c68() {
    public override val `value`: String = "repository"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRulesetTargetX0b0a0c68()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRulesetTargetX0b0a0c68 = when (value) {
      Branch.value -> Branch
      Tag.value -> Tag
      Push.value -> Push
      Repository.value -> Repository
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRulesetTargetX0b0a0c68> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRulesetTargetX0b0a0c68", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetTargetX0b0a0c68 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetTargetX0b0a0c68) {
      encoder.encodeString(value.value)
    }
  }
}
