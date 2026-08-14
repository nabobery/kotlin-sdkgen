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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/requested_teams/items/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/requested_teams/items/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestAu6055PullRequestRequestedTeamsItemPrivacyX4cd56173.Serializer::class)
public sealed class InlineWebhookPullRequestAu6055PullRequestRequestedTeamsItemPrivacyX4cd56173 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestAu6055PullRequestRequestedTeamsItemPrivacyX4cd56173() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestAu6055PullRequestRequestedTeamsItemPrivacyX4cd56173() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestAu6055PullRequestRequestedTeamsItemPrivacyX4cd56173() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAu6055PullRequestRequestedTeamsItemPrivacyX4cd56173()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAu6055PullRequestRequestedTeamsItemPrivacyX4cd56173 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAu6055PullRequestRequestedTeamsItemPrivacyX4cd56173> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAu6055PullRequestRequestedTeamsItemPrivacyX4cd56173", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAu6055PullRequestRequestedTeamsItemPrivacyX4cd56173 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAu6055PullRequestRequestedTeamsItemPrivacyX4cd56173) {
      encoder.encodeString(value.value)
    }
  }
}
