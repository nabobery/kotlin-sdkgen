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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * requested_teams/items/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * requested_teams/items/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestSy92fbPullRequestRequestedTeamsItemPrivacyX42b5a75e.Serializer::class)
public sealed class InlineWebhookPullRequestSy92fbPullRequestRequestedTeamsItemPrivacyX42b5a75e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestSy92fbPullRequestRequestedTeamsItemPrivacyX42b5a75e() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestSy92fbPullRequestRequestedTeamsItemPrivacyX42b5a75e() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestSy92fbPullRequestRequestedTeamsItemPrivacyX42b5a75e() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestSy92fbPullRequestRequestedTeamsItemPrivacyX42b5a75e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestSy92fbPullRequestRequestedTeamsItemPrivacyX42b5a75e = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSy92fbPullRequestRequestedTeamsItemPrivacyX42b5a75e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestSy92fbPullRequestRequestedTeamsItemPrivacyX42b5a75e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSy92fbPullRequestRequestedTeamsItemPrivacyX42b5a75e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSy92fbPullRequestRequestedTeamsItemPrivacyX42b5a75e) {
      encoder.encodeString(value.value)
    }
  }
}
