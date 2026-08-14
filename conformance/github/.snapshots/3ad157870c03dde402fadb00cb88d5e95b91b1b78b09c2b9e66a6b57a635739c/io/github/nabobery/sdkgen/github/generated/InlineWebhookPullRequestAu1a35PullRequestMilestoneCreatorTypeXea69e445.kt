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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/milestone/properties/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/milestone/properties/creator/properties/type
 */
@Serializable(with = InlineWebhookPullRequestAu1a35PullRequestMilestoneCreatorTypeXea69e445.Serializer::class)
public sealed class InlineWebhookPullRequestAu1a35PullRequestMilestoneCreatorTypeXea69e445 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestAu1a35PullRequestMilestoneCreatorTypeXea69e445() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestAu1a35PullRequestMilestoneCreatorTypeXea69e445() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestAu1a35PullRequestMilestoneCreatorTypeXea69e445() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAu1a35PullRequestMilestoneCreatorTypeXea69e445()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAu1a35PullRequestMilestoneCreatorTypeXea69e445 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAu1a35PullRequestMilestoneCreatorTypeXea69e445> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAu1a35PullRequestMilestoneCreatorTypeXea69e445", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAu1a35PullRequestMilestoneCreatorTypeXea69e445 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAu1a35PullRequestMilestoneCreatorTypeXea69e445) {
      encoder.encodeString(value.value)
    }
  }
}
