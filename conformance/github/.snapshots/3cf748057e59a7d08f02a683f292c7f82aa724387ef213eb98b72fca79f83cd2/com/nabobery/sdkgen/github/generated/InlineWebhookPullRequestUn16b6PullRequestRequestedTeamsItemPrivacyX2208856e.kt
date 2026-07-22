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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/r
 * equested_teams/items/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/r
 * equested_teams/items/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestUn16b6PullRequestRequestedTeamsItemPrivacyX2208856e.Serializer::class)
public sealed class InlineWebhookPullRequestUn16b6PullRequestRequestedTeamsItemPrivacyX2208856e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestUn16b6PullRequestRequestedTeamsItemPrivacyX2208856e() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestUn16b6PullRequestRequestedTeamsItemPrivacyX2208856e() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestUn16b6PullRequestRequestedTeamsItemPrivacyX2208856e() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUn16b6PullRequestRequestedTeamsItemPrivacyX2208856e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUn16b6PullRequestRequestedTeamsItemPrivacyX2208856e = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestUn16b6PullRequestRequestedTeamsItemPrivacyX2208856e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUn16b6PullRequestRequestedTeamsItemPrivacyX2208856e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUn16b6PullRequestRequestedTeamsItemPrivacyX2208856e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUn16b6PullRequestRequestedTeamsItemPrivacyX2208856e) {
      encoder.encodeString(value.value)
    }
  }
}
