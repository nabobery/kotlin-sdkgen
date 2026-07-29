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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/req
 * uested_teams/items/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/req
 * uested_teams/items/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestEnd765PullRequestRequestedTeamsItemPrivacyXcabc2cd2.Serializer::class)
public sealed class InlineWebhookPullRequestEnd765PullRequestRequestedTeamsItemPrivacyXcabc2cd2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestEnd765PullRequestRequestedTeamsItemPrivacyXcabc2cd2() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestEnd765PullRequestRequestedTeamsItemPrivacyXcabc2cd2() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestEnd765PullRequestRequestedTeamsItemPrivacyXcabc2cd2() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestEnd765PullRequestRequestedTeamsItemPrivacyXcabc2cd2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestEnd765PullRequestRequestedTeamsItemPrivacyXcabc2cd2 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestEnd765PullRequestRequestedTeamsItemPrivacyXcabc2cd2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestEnd765PullRequestRequestedTeamsItemPrivacyXcabc2cd2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnd765PullRequestRequestedTeamsItemPrivacyXcabc2cd2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnd765PullRequestRequestedTeamsItemPrivacyXcabc2cd2) {
      encoder.encodeString(value.value)
    }
  }
}
