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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/reque
 * sted_teams/items/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/reque
 * sted_teams/items/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyXb4e82e17.Serializer::class)
public sealed class InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyXb4e82e17 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyXb4e82e17() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyXb4e82e17() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyXb4e82e17() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyXb4e82e17()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyXb4e82e17 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyXb4e82e17> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyXb4e82e17", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyXb4e82e17 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyXb4e82e17) {
      encoder.encodeString(value.value)
    }
  }
}
