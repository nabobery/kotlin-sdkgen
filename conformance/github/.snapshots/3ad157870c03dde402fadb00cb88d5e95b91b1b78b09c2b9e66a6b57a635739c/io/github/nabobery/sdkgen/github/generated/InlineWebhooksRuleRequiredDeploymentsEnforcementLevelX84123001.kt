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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/required_deployments_enforcement_level.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/required_deployments_enforcement_level
 */
@Serializable(with = InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001.Serializer::class)
public sealed class InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001 = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001) {
      encoder.encodeString(value.value)
    }
  }
}
