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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/requested_teams/items/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/requested_teams/items/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestRe0d91PullRequestRequestedTeamsItemPrivacyX742e9d2b.Serializer::class)
public sealed class InlineWebhookPullRequestRe0d91PullRequestRequestedTeamsItemPrivacyX742e9d2b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestRe0d91PullRequestRequestedTeamsItemPrivacyX742e9d2b() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestRe0d91PullRequestRequestedTeamsItemPrivacyX742e9d2b() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestRe0d91PullRequestRequestedTeamsItemPrivacyX742e9d2b() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe0d91PullRequestRequestedTeamsItemPrivacyX742e9d2b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe0d91PullRequestRequestedTeamsItemPrivacyX742e9d2b = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe0d91PullRequestRequestedTeamsItemPrivacyX742e9d2b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe0d91PullRequestRequestedTeamsItemPrivacyX742e9d2b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0d91PullRequestRequestedTeamsItemPrivacyX742e9d2b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0d91PullRequestRequestedTeamsItemPrivacyX742e9d2b) {
      encoder.encodeString(value.value)
    }
  }
}
