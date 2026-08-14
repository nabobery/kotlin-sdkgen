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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/required_conversation_resolution_level.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/required_conversation_resolution_level
 */
@Serializable(with = InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17.Serializer::class)
public sealed class InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17 = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17) {
      encoder.encodeString(value.value)
    }
  }
}
