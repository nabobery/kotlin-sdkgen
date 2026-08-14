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
 * uested_teams/items/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/req
 * uested_teams/items/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestDequeuedPullRequestRequestedTeamsItemPrivacyXf0d892e2.Serializer::class)
public sealed class InlineWebhookPullRequestDequeuedPullRequestRequestedTeamsItemPrivacyXf0d892e2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestDequeuedPullRequestRequestedTeamsItemPrivacyXf0d892e2() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestDequeuedPullRequestRequestedTeamsItemPrivacyXf0d892e2() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestDequeuedPullRequestRequestedTeamsItemPrivacyXf0d892e2() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDequeuedPullRequestRequestedTeamsItemPrivacyXf0d892e2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDequeuedPullRequestRequestedTeamsItemPrivacyXf0d892e2 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDequeuedPullRequestRequestedTeamsItemPrivacyXf0d892e2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDequeuedPullRequestRequestedTeamsItemPrivacyXf0d892e2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedPullRequestRequestedTeamsItemPrivacyXf0d892e2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedPullRequestRequestedTeamsItemPrivacyXf0d892e2) {
      encoder.encodeString(value.value)
    }
  }
}
