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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-protection-rule-requested/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-protection-rule-requested/properties/action
 */
@Serializable(with = InlineWebhookDeploymentProtectionRuleRequestedActionXa04b7db0.Serializer::class)
public sealed class InlineWebhookDeploymentProtectionRuleRequestedActionXa04b7db0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineWebhookDeploymentProtectionRuleRequestedActionXa04b7db0() {
    public override val `value`: String = "requested"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentProtectionRuleRequestedActionXa04b7db0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentProtectionRuleRequestedActionXa04b7db0 = when (value) {
      Requested.value -> Requested
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentProtectionRuleRequestedActionXa04b7db0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentProtectionRuleRequestedActionXa04b7db0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentProtectionRuleRequestedActionXa04b7db0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentProtectionRuleRequestedActionXa04b7db0) {
      encoder.encodeString(value.value)
    }
  }
}
