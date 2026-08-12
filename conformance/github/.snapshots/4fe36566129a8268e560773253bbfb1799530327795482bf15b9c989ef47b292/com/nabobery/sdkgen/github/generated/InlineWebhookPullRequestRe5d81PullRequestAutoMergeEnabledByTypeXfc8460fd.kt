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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/auto_merge/properties/enabled_by/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/auto_merge/properties/enabled_by/properties/type
 */
@Serializable(with = InlineWebhookPullRequestRe5d81PullRequestAutoMergeEnabledByTypeXfc8460fd.Serializer::class)
public sealed class InlineWebhookPullRequestRe5d81PullRequestAutoMergeEnabledByTypeXfc8460fd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestRe5d81PullRequestAutoMergeEnabledByTypeXfc8460fd() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestRe5d81PullRequestAutoMergeEnabledByTypeXfc8460fd() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestRe5d81PullRequestAutoMergeEnabledByTypeXfc8460fd() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe5d81PullRequestAutoMergeEnabledByTypeXfc8460fd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe5d81PullRequestAutoMergeEnabledByTypeXfc8460fd = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe5d81PullRequestAutoMergeEnabledByTypeXfc8460fd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe5d81PullRequestAutoMergeEnabledByTypeXfc8460fd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe5d81PullRequestAutoMergeEnabledByTypeXfc8460fd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe5d81PullRequestAutoMergeEnabledByTypeXfc8460fd) {
      encoder.encodeString(value.value)
    }
  }
}
