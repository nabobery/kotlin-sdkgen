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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_2/properties/milestone/properties/creator/properties/
 * type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_2/properties/milestone/properties/creator/properties/
 * type
 */
@Serializable(with = InlineWebhooksIssue2MilestoneCreatorTypeXcb657a29.Serializer::class)
public sealed class InlineWebhooksIssue2MilestoneCreatorTypeXcb657a29 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksIssue2MilestoneCreatorTypeXcb657a29() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksIssue2MilestoneCreatorTypeXcb657a29() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksIssue2MilestoneCreatorTypeXcb657a29() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssue2MilestoneCreatorTypeXcb657a29()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssue2MilestoneCreatorTypeXcb657a29 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssue2MilestoneCreatorTypeXcb657a29> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssue2MilestoneCreatorTypeXcb657a29", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssue2MilestoneCreatorTypeXcb657a29 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssue2MilestoneCreatorTypeXcb657a29) {
      encoder.encodeString(value.value)
    }
  }
}
