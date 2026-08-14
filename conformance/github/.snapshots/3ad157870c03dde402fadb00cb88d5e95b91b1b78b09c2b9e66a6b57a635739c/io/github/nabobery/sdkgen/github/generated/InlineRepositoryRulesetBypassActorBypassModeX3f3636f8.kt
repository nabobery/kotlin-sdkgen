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
 * When the specified actor can bypass the ruleset. `pull_request` means that an actor can only bypass rules on pull
 * requests. `pull_request` is not applicable for the `DeployKey` actor type. Also, `pull_request` is only applicable to
 * branch rulesets. When `bypass_mode` is `exempt`, rules will not be run for that actor and a bypass audit entry will
 * not be created.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-bypass-actor/properties/bypass_mode
 */
@Serializable(with = InlineRepositoryRulesetBypassActorBypassModeX3f3636f8.Serializer::class)
public sealed class InlineRepositoryRulesetBypassActorBypassModeX3f3636f8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineRepositoryRulesetBypassActorBypassModeX3f3636f8() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `pull_request`.
   */
  public data object PullRequest : InlineRepositoryRulesetBypassActorBypassModeX3f3636f8() {
    public override val `value`: String = "pull_request"
  }

  /**
   * Documented value. Wire value: `exempt`.
   */
  public data object Exempt : InlineRepositoryRulesetBypassActorBypassModeX3f3636f8() {
    public override val `value`: String = "exempt"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRulesetBypassActorBypassModeX3f3636f8()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRulesetBypassActorBypassModeX3f3636f8 = when (value) {
      Always.value -> Always
      PullRequest.value -> PullRequest
      Exempt.value -> Exempt
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRulesetBypassActorBypassModeX3f3636f8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRulesetBypassActorBypassModeX3f3636f8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetBypassActorBypassModeX3f3636f8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetBypassActorBypassModeX3f3636f8) {
      encoder.encodeString(value.value)
    }
  }
}
