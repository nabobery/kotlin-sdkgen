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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/allow_force_pushes_enforcement_level.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/allow_force_pushes_enforcement_level
 */
@Serializable(with = InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30.Serializer::class)
public sealed class InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30 = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30) {
      encoder.encodeString(value.value)
    }
  }
}
