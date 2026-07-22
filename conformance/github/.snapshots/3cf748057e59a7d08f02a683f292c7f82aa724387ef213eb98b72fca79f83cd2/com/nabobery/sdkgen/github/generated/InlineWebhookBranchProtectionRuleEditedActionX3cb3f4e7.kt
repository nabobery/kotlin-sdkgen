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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/action
 */
@Serializable(with = InlineWebhookBranchProtectionRuleEditedActionX3cb3f4e7.Serializer::class)
public sealed class InlineWebhookBranchProtectionRuleEditedActionX3cb3f4e7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookBranchProtectionRuleEditedActionX3cb3f4e7() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookBranchProtectionRuleEditedActionX3cb3f4e7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookBranchProtectionRuleEditedActionX3cb3f4e7 = when (value) {
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookBranchProtectionRuleEditedActionX3cb3f4e7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookBranchProtectionRuleEditedActionX3cb3f4e7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectionRuleEditedActionX3cb3f4e7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectionRuleEditedActionX3cb3f4e7) {
      encoder.encodeString(value.value)
    }
  }
}
