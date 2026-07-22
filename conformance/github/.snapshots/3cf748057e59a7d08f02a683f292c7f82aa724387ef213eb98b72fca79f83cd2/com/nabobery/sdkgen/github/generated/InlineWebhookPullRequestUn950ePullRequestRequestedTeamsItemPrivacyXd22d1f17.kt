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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/re
 * quested_teams/items/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/re
 * quested_teams/items/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestUn950ePullRequestRequestedTeamsItemPrivacyXd22d1f17.Serializer::class)
public sealed class InlineWebhookPullRequestUn950ePullRequestRequestedTeamsItemPrivacyXd22d1f17 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestUn950ePullRequestRequestedTeamsItemPrivacyXd22d1f17() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestUn950ePullRequestRequestedTeamsItemPrivacyXd22d1f17() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestUn950ePullRequestRequestedTeamsItemPrivacyXd22d1f17() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUn950ePullRequestRequestedTeamsItemPrivacyXd22d1f17()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUn950ePullRequestRequestedTeamsItemPrivacyXd22d1f17 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestUn950ePullRequestRequestedTeamsItemPrivacyXd22d1f17> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUn950ePullRequestRequestedTeamsItemPrivacyXd22d1f17", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUn950ePullRequestRequestedTeamsItemPrivacyXd22d1f17 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUn950ePullRequestRequestedTeamsItemPrivacyXd22d1f17) {
      encoder.encodeString(value.value)
    }
  }
}
