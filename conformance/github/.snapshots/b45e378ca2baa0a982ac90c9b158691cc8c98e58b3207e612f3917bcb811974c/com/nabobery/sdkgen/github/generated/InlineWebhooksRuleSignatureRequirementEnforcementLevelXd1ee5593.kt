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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/signature_requirement_enforcement_level.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/signature_requirement_enforcement_level
 */
@Serializable(with = InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593.Serializer::class)
public sealed class InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593 = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593) {
      encoder.encodeString(value.value)
    }
  }
}
