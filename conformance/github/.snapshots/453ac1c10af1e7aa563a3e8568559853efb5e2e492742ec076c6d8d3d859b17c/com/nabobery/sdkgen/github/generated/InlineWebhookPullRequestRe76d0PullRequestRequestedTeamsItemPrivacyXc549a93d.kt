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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/requested_teams/items/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/requested_teams/items/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestRe76d0PullRequestRequestedTeamsItemPrivacyXc549a93d.Serializer::class)
public sealed class InlineWebhookPullRequestRe76d0PullRequestRequestedTeamsItemPrivacyXc549a93d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestRe76d0PullRequestRequestedTeamsItemPrivacyXc549a93d() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestRe76d0PullRequestRequestedTeamsItemPrivacyXc549a93d() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestRe76d0PullRequestRequestedTeamsItemPrivacyXc549a93d() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe76d0PullRequestRequestedTeamsItemPrivacyXc549a93d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe76d0PullRequestRequestedTeamsItemPrivacyXc549a93d = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestRe76d0PullRequestRequestedTeamsItemPrivacyXc549a93d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe76d0PullRequestRequestedTeamsItemPrivacyXc549a93d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe76d0PullRequestRequestedTeamsItemPrivacyXc549a93d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe76d0PullRequestRequestedTeamsItemPrivacyXc549a93d) {
      encoder.encodeString(value.value)
    }
  }
}
