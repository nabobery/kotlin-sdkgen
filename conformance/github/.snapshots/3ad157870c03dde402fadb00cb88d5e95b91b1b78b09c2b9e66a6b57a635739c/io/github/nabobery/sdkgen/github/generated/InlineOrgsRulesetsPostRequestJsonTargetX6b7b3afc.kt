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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1rulesets/post/requestBody/content/application~1json/schema/propert
 * ies/target
 */
@Serializable(with = InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc.Serializer::class)
public sealed class InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc() {
    public override val `value`: String = "branch"
  }

  /**
   * Documented value. Wire value: `tag`.
   */
  public data object Tag : InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc() {
    public override val `value`: String = "tag"
  }

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc() {
    public override val `value`: String = "push"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc() {
    public override val `value`: String = "repository"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc = when (value) {
      Branch.value -> Branch
      Tag.value -> Tag
      Push.value -> Push
      Repository.value -> Repository
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc) {
      encoder.encodeString(value.value)
    }
  }
}
