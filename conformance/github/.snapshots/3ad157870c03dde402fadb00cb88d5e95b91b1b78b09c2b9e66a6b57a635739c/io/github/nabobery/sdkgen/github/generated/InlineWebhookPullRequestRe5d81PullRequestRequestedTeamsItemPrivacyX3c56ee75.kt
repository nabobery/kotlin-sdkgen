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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/requested_teams/items/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/requested_teams/items/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestRe5d81PullRequestRequestedTeamsItemPrivacyX3c56ee75.Serializer::class)
public sealed class InlineWebhookPullRequestRe5d81PullRequestRequestedTeamsItemPrivacyX3c56ee75 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestRe5d81PullRequestRequestedTeamsItemPrivacyX3c56ee75() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestRe5d81PullRequestRequestedTeamsItemPrivacyX3c56ee75() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestRe5d81PullRequestRequestedTeamsItemPrivacyX3c56ee75() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe5d81PullRequestRequestedTeamsItemPrivacyX3c56ee75()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe5d81PullRequestRequestedTeamsItemPrivacyX3c56ee75 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe5d81PullRequestRequestedTeamsItemPrivacyX3c56ee75> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe5d81PullRequestRequestedTeamsItemPrivacyX3c56ee75", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe5d81PullRequestRequestedTeamsItemPrivacyX3c56ee75 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe5d81PullRequestRequestedTeamsItemPrivacyX3c56ee75) {
      encoder.encodeString(value.value)
    }
  }
}
