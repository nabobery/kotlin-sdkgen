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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-configuration-disabled/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-configuration-disabled/properties/action
 */
@Serializable(with = InlineWebhookBranchProtectionConfigurationDisabledActionX881f19f6.Serializer::class)
public sealed class InlineWebhookBranchProtectionConfigurationDisabledActionX881f19f6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineWebhookBranchProtectionConfigurationDisabledActionX881f19f6() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookBranchProtectionConfigurationDisabledActionX881f19f6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookBranchProtectionConfigurationDisabledActionX881f19f6 = when (value) {
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookBranchProtectionConfigurationDisabledActionX881f19f6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookBranchProtectionConfigurationDisabledActionX881f19f6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectionConfigurationDisabledActionX881f19f6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectionConfigurationDisabledActionX881f19f6) {
      encoder.encodeString(value.value)
    }
  }
}
