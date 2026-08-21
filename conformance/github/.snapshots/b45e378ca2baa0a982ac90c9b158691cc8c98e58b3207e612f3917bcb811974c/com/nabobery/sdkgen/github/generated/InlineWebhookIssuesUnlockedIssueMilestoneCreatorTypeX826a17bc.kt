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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/issue/properties/milestone/proper
 * ties/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/issue/properties/milestone/proper
 * ties/creator/properties/type
 */
@Serializable(with = InlineWebhookIssuesUnlockedIssueMilestoneCreatorTypeX826a17bc.Serializer::class)
public sealed class InlineWebhookIssuesUnlockedIssueMilestoneCreatorTypeX826a17bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesUnlockedIssueMilestoneCreatorTypeX826a17bc() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesUnlockedIssueMilestoneCreatorTypeX826a17bc() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesUnlockedIssueMilestoneCreatorTypeX826a17bc() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesUnlockedIssueMilestoneCreatorTypeX826a17bc()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesUnlockedIssueMilestoneCreatorTypeX826a17bc = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesUnlockedIssueMilestoneCreatorTypeX826a17bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesUnlockedIssueMilestoneCreatorTypeX826a17bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUnlockedIssueMilestoneCreatorTypeX826a17bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUnlockedIssueMilestoneCreatorTypeX826a17bc) {
      encoder.encodeString(value.value)
    }
  }
}
