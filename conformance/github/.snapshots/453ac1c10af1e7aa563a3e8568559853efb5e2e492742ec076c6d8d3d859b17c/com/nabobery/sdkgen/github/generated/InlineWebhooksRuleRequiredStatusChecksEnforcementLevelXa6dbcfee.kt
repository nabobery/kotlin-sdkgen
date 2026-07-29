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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/required_status_checks_enforcement_level.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/required_status_checks_enforcement_level
 */
@Serializable(with = InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee.Serializer::class)
public sealed class InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee) {
      encoder.encodeString(value.value)
    }
  }
}
