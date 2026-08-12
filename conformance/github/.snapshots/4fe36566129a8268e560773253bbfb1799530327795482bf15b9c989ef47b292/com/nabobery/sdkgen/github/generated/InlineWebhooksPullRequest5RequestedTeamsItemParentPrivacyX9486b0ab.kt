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
 * parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/requested_teams/items/properties/
 * parent/properties/privacy
 */
@Serializable(with = InlineWebhooksPullRequest5RequestedTeamsItemParentPrivacyX9486b0ab.Serializer::class)
public sealed class InlineWebhooksPullRequest5RequestedTeamsItemParentPrivacyX9486b0ab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksPullRequest5RequestedTeamsItemParentPrivacyX9486b0ab() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksPullRequest5RequestedTeamsItemParentPrivacyX9486b0ab() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhooksPullRequest5RequestedTeamsItemParentPrivacyX9486b0ab() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5RequestedTeamsItemParentPrivacyX9486b0ab()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5RequestedTeamsItemParentPrivacyX9486b0ab = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5RequestedTeamsItemParentPrivacyX9486b0ab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5RequestedTeamsItemParentPrivacyX9486b0ab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5RequestedTeamsItemParentPrivacyX9486b0ab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5RequestedTeamsItemParentPrivacyX9486b0ab) {
      encoder.encodeString(value.value)
    }
  }
}
