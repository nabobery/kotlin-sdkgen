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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/req
 * uested_teams/items/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/req
 * uested_teams/items/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestDea21dPullRequestRequestedTeamsItemPrivacyX230c8439.Serializer::class)
public sealed class InlineWebhookPullRequestDea21dPullRequestRequestedTeamsItemPrivacyX230c8439 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestDea21dPullRequestRequestedTeamsItemPrivacyX230c8439() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestDea21dPullRequestRequestedTeamsItemPrivacyX230c8439() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestDea21dPullRequestRequestedTeamsItemPrivacyX230c8439() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDea21dPullRequestRequestedTeamsItemPrivacyX230c8439()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDea21dPullRequestRequestedTeamsItemPrivacyX230c8439 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDea21dPullRequestRequestedTeamsItemPrivacyX230c8439> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDea21dPullRequestRequestedTeamsItemPrivacyX230c8439", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDea21dPullRequestRequestedTeamsItemPrivacyX230c8439 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDea21dPullRequestRequestedTeamsItemPrivacyX230c8439) {
      encoder.encodeString(value.value)
    }
  }
}
