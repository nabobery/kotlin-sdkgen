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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1rulesets/post/requestBody/content/application~1json/sch
 * ema/properties/target
 */
@Serializable(with = InlineReposRulesetsPostRequestJsonTargetXee7878ec.Serializer::class)
public sealed class InlineReposRulesetsPostRequestJsonTargetXee7878ec {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineReposRulesetsPostRequestJsonTargetXee7878ec() {
    public override val `value`: String = "branch"
  }

  /**
   * Documented value. Wire value: `tag`.
   */
  public data object Tag : InlineReposRulesetsPostRequestJsonTargetXee7878ec() {
    public override val `value`: String = "tag"
  }

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineReposRulesetsPostRequestJsonTargetXee7878ec() {
    public override val `value`: String = "push"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposRulesetsPostRequestJsonTargetXee7878ec()

  public companion object {
    public fun fromValue(`value`: String): InlineReposRulesetsPostRequestJsonTargetXee7878ec = when (value) {
      Branch.value -> Branch
      Tag.value -> Tag
      Push.value -> Push
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposRulesetsPostRequestJsonTargetXee7878ec> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposRulesetsPostRequestJsonTargetXee7878ec", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposRulesetsPostRequestJsonTargetXee7878ec = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposRulesetsPostRequestJsonTargetXee7878ec) {
      encoder.encodeString(value.value)
    }
  }
}
