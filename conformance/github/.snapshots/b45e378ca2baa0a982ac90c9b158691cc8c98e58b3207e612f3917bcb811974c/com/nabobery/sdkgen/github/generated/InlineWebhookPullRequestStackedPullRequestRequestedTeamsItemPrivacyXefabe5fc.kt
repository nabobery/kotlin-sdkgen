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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/requ
 * ested_teams/items/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/requ
 * ested_teams/items/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestRequestedTeamsItemPrivacyXefabe5fc.Serializer::class)
public sealed class InlineWebhookPullRequestStackedPullRequestRequestedTeamsItemPrivacyXefabe5fc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestStackedPullRequestRequestedTeamsItemPrivacyXefabe5fc() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestStackedPullRequestRequestedTeamsItemPrivacyXefabe5fc() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestStackedPullRequestRequestedTeamsItemPrivacyXefabe5fc() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStackedPullRequestRequestedTeamsItemPrivacyXefabe5fc()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStackedPullRequestRequestedTeamsItemPrivacyXefabe5fc = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestRequestedTeamsItemPrivacyXefabe5fc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStackedPullRequestRequestedTeamsItemPrivacyXefabe5fc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestRequestedTeamsItemPrivacyXefabe5fc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestRequestedTeamsItemPrivacyXefabe5fc) {
      encoder.encodeString(value.value)
    }
  }
}
