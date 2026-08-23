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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/assignee/propert
 * ies/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/assignee/propert
 * ies/type
 */
@Serializable(with = InlineWebhookIssuesReopenedIssueAssigneeTypeX578f7213.Serializer::class)
public sealed class InlineWebhookIssuesReopenedIssueAssigneeTypeX578f7213 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesReopenedIssueAssigneeTypeX578f7213() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesReopenedIssueAssigneeTypeX578f7213() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesReopenedIssueAssigneeTypeX578f7213() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesReopenedIssueAssigneeTypeX578f7213()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesReopenedIssueAssigneeTypeX578f7213 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesReopenedIssueAssigneeTypeX578f7213> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesReopenedIssueAssigneeTypeX578f7213", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesReopenedIssueAssigneeTypeX578f7213 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesReopenedIssueAssigneeTypeX578f7213) {
      encoder.encodeString(value.value)
    }
  }
}
