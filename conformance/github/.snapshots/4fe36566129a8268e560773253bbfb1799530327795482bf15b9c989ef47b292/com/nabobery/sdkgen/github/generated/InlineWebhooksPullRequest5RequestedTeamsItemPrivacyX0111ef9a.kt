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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/requested_teams/items/properties/
 * privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/requested_teams/items/properties/
 * privacy
 */
@Serializable(with = InlineWebhooksPullRequest5RequestedTeamsItemPrivacyX0111ef9a.Serializer::class)
public sealed class InlineWebhooksPullRequest5RequestedTeamsItemPrivacyX0111ef9a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksPullRequest5RequestedTeamsItemPrivacyX0111ef9a() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksPullRequest5RequestedTeamsItemPrivacyX0111ef9a() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhooksPullRequest5RequestedTeamsItemPrivacyX0111ef9a() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5RequestedTeamsItemPrivacyX0111ef9a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5RequestedTeamsItemPrivacyX0111ef9a = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5RequestedTeamsItemPrivacyX0111ef9a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5RequestedTeamsItemPrivacyX0111ef9a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5RequestedTeamsItemPrivacyX0111ef9a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5RequestedTeamsItemPrivacyX0111ef9a) {
      encoder.encodeString(value.value)
    }
  }
}
