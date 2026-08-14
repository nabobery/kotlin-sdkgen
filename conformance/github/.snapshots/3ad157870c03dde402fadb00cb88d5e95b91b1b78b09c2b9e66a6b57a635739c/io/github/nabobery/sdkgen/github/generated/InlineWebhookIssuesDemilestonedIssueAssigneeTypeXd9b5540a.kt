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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/assignee/pro
 * perties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/assignee/pro
 * perties/type
 */
@Serializable(with = InlineWebhookIssuesDemilestonedIssueAssigneeTypeXd9b5540a.Serializer::class)
public sealed class InlineWebhookIssuesDemilestonedIssueAssigneeTypeXd9b5540a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesDemilestonedIssueAssigneeTypeXd9b5540a() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesDemilestonedIssueAssigneeTypeXd9b5540a() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesDemilestonedIssueAssigneeTypeXd9b5540a() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssuesDemilestonedIssueAssigneeTypeXd9b5540a() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDemilestonedIssueAssigneeTypeXd9b5540a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDemilestonedIssueAssigneeTypeXd9b5540a = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDemilestonedIssueAssigneeTypeXd9b5540a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesDemilestonedIssueAssigneeTypeXd9b5540a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDemilestonedIssueAssigneeTypeXd9b5540a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDemilestonedIssueAssigneeTypeXd9b5540a) {
      encoder.encodeString(value.value)
    }
  }
}
