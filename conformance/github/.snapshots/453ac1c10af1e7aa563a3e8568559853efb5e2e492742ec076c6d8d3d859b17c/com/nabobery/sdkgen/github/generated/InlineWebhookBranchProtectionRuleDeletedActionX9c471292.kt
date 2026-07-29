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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-deleted/properties/action
 */
@Serializable(with = InlineWebhookBranchProtectionRuleDeletedActionX9c471292.Serializer::class)
public sealed class InlineWebhookBranchProtectionRuleDeletedActionX9c471292 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookBranchProtectionRuleDeletedActionX9c471292() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookBranchProtectionRuleDeletedActionX9c471292()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookBranchProtectionRuleDeletedActionX9c471292 = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookBranchProtectionRuleDeletedActionX9c471292> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookBranchProtectionRuleDeletedActionX9c471292", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectionRuleDeletedActionX9c471292 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectionRuleDeletedActionX9c471292) {
      encoder.encodeString(value.value)
    }
  }
}
