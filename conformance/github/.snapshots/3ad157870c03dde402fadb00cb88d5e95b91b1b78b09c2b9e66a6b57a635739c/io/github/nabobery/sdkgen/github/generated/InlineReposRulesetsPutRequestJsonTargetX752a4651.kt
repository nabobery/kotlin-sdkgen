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
 * The target of the ruleset
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1rulesets~1{ruleset_id}/put/requestBody/content/applicat
 * ion~1json/schema/properties/target
 */
@Serializable(with = InlineReposRulesetsPutRequestJsonTargetX752a4651.Serializer::class)
public sealed class InlineReposRulesetsPutRequestJsonTargetX752a4651 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineReposRulesetsPutRequestJsonTargetX752a4651() {
    public override val `value`: String = "branch"
  }

  /**
   * Documented value. Wire value: `tag`.
   */
  public data object Tag : InlineReposRulesetsPutRequestJsonTargetX752a4651() {
    public override val `value`: String = "tag"
  }

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineReposRulesetsPutRequestJsonTargetX752a4651() {
    public override val `value`: String = "push"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposRulesetsPutRequestJsonTargetX752a4651()

  public companion object {
    public fun fromValue(`value`: String): InlineReposRulesetsPutRequestJsonTargetX752a4651 = when (value) {
      Branch.value -> Branch
      Tag.value -> Tag
      Push.value -> Push
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposRulesetsPutRequestJsonTargetX752a4651> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposRulesetsPutRequestJsonTargetX752a4651", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposRulesetsPutRequestJsonTargetX752a4651 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposRulesetsPutRequestJsonTargetX752a4651) {
      encoder.encodeString(value.value)
    }
  }
}
