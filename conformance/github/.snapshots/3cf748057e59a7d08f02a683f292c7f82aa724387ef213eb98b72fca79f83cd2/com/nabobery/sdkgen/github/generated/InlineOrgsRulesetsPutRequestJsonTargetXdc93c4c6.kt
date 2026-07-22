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
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1rulesets~1{ruleset_id}/put/requestBody/content/application~1json/s
 * chema/properties/target
 */
@Serializable(with = InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6.Serializer::class)
public sealed class InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6() {
    public override val `value`: String = "branch"
  }

  /**
   * Documented value. Wire value: `tag`.
   */
  public data object Tag : InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6() {
    public override val `value`: String = "tag"
  }

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6() {
    public override val `value`: String = "push"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6() {
    public override val `value`: String = "repository"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6 = when (value) {
      Branch.value -> Branch
      Tag.value -> Tag
      Push.value -> Push
      Repository.value -> Repository
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6) {
      encoder.encodeString(value.value)
    }
  }
}
