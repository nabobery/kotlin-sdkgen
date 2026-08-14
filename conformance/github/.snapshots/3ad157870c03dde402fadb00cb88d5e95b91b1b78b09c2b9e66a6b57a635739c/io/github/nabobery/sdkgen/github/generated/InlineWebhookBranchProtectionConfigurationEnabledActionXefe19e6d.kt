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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-configuration-enabled/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-configuration-enabled/properties/action
 */
@Serializable(with = InlineWebhookBranchProtectionConfigurationEnabledActionXefe19e6d.Serializer::class)
public sealed class InlineWebhookBranchProtectionConfigurationEnabledActionXefe19e6d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineWebhookBranchProtectionConfigurationEnabledActionXefe19e6d() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookBranchProtectionConfigurationEnabledActionXefe19e6d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookBranchProtectionConfigurationEnabledActionXefe19e6d = when (value) {
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookBranchProtectionConfigurationEnabledActionXefe19e6d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookBranchProtectionConfigurationEnabledActionXefe19e6d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectionConfigurationEnabledActionXefe19e6d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectionConfigurationEnabledActionXefe19e6d) {
      encoder.encodeString(value.value)
    }
  }
}
