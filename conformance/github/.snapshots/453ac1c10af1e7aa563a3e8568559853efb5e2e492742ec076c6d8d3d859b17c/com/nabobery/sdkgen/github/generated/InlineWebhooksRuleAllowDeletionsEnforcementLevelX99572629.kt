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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/allow_deletions_enforcement_level.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/allow_deletions_enforcement_level
 */
@Serializable(with = InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629.Serializer::class)
public sealed class InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629 = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629) {
      encoder.encodeString(value.value)
    }
  }
}
