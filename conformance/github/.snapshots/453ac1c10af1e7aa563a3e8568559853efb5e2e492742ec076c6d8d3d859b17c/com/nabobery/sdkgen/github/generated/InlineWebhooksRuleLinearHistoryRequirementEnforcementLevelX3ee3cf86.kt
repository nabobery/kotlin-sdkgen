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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/linear_history_requirement_enforcement_leve
 * l.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/linear_history_requirement_enforcement_leve
 * l
 */
@Serializable(with = InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86.Serializer::class)
public sealed class InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86 = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86) {
      encoder.encodeString(value.value)
    }
  }
}
