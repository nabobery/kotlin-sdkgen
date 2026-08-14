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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_issue/proper
 * ties/milestone/properties/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_issue/proper
 * ties/milestone/properties/creator/properties/type
 */
@Serializable(with = InlineWebhookIssuesOpenedChangesOldIssueMilestoneCreatorTypeXb173e919.Serializer::class)
public sealed class InlineWebhookIssuesOpenedChangesOldIssueMilestoneCreatorTypeXb173e919 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesOpenedChangesOldIssueMilestoneCreatorTypeXb173e919() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesOpenedChangesOldIssueMilestoneCreatorTypeXb173e919() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesOpenedChangesOldIssueMilestoneCreatorTypeXb173e919() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedChangesOldIssueMilestoneCreatorTypeXb173e919()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedChangesOldIssueMilestoneCreatorTypeXb173e919 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedChangesOldIssueMilestoneCreatorTypeXb173e919> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedChangesOldIssueMilestoneCreatorTypeXb173e919", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedChangesOldIssueMilestoneCreatorTypeXb173e919 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedChangesOldIssueMilestoneCreatorTypeXb173e919) {
      encoder.encodeString(value.value)
    }
  }
}
