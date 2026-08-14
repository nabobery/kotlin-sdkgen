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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/requested_teams/items/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/requested_teams/items/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestRe8581PullRequestRequestedTeamsItemPrivacyX3b84f7c3.Serializer::class)
public sealed class InlineWebhookPullRequestRe8581PullRequestRequestedTeamsItemPrivacyX3b84f7c3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestRe8581PullRequestRequestedTeamsItemPrivacyX3b84f7c3() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestRe8581PullRequestRequestedTeamsItemPrivacyX3b84f7c3() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestRe8581PullRequestRequestedTeamsItemPrivacyX3b84f7c3() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe8581PullRequestRequestedTeamsItemPrivacyX3b84f7c3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe8581PullRequestRequestedTeamsItemPrivacyX3b84f7c3 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe8581PullRequestRequestedTeamsItemPrivacyX3b84f7c3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe8581PullRequestRequestedTeamsItemPrivacyX3b84f7c3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe8581PullRequestRequestedTeamsItemPrivacyX3b84f7c3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe8581PullRequestRequestedTeamsItemPrivacyX3b84f7c3) {
      encoder.encodeString(value.value)
    }
  }
}
