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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/requested_teams/items/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/requested_teams/items/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemPrivacyX1dce1baa.Serializer::class)
public sealed class InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemPrivacyX1dce1baa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemPrivacyX1dce1baa() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemPrivacyX1dce1baa() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemPrivacyX1dce1baa() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemPrivacyX1dce1baa()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemPrivacyX1dce1baa = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemPrivacyX1dce1baa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemPrivacyX1dce1baa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemPrivacyX1dce1baa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemPrivacyX1dce1baa) {
      encoder.encodeString(value.value)
    }
  }
}
