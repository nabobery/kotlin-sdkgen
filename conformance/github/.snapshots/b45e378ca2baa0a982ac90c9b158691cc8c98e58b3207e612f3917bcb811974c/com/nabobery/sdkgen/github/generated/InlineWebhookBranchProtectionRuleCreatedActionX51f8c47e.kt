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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-created/properties/action
 */
@Serializable(with = InlineWebhookBranchProtectionRuleCreatedActionX51f8c47e.Serializer::class)
public sealed class InlineWebhookBranchProtectionRuleCreatedActionX51f8c47e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookBranchProtectionRuleCreatedActionX51f8c47e() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookBranchProtectionRuleCreatedActionX51f8c47e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookBranchProtectionRuleCreatedActionX51f8c47e = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookBranchProtectionRuleCreatedActionX51f8c47e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookBranchProtectionRuleCreatedActionX51f8c47e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectionRuleCreatedActionX51f8c47e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectionRuleCreatedActionX51f8c47e) {
      encoder.encodeString(value.value)
    }
  }
}
