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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/assignee/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/assignee/properties/type
 */
@Serializable(with = InlineWebhooksIssueAssigneeTypeXe0b94e15.Serializer::class)
public sealed class InlineWebhooksIssueAssigneeTypeXe0b94e15 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksIssueAssigneeTypeXe0b94e15() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksIssueAssigneeTypeXe0b94e15() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksIssueAssigneeTypeXe0b94e15() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhooksIssueAssigneeTypeXe0b94e15() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssueAssigneeTypeXe0b94e15()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssueAssigneeTypeXe0b94e15 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssueAssigneeTypeXe0b94e15> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssueAssigneeTypeXe0b94e15", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssueAssigneeTypeXe0b94e15 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssueAssigneeTypeXe0b94e15) {
      encoder.encodeString(value.value)
    }
  }
}
