package io.github.nabobery.sdkgen.github.generated

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
 * quested_teams/items/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/re
 * quested_teams/items/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestUnlabeledPullRequestRequestedTeamsItemPrivacyXecfd3386.Serializer::class)
public sealed class InlineWebhookPullRequestUnlabeledPullRequestRequestedTeamsItemPrivacyXecfd3386 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestUnlabeledPullRequestRequestedTeamsItemPrivacyXecfd3386() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestUnlabeledPullRequestRequestedTeamsItemPrivacyXecfd3386() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestUnlabeledPullRequestRequestedTeamsItemPrivacyXecfd3386() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnlabeledPullRequestRequestedTeamsItemPrivacyXecfd3386()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnlabeledPullRequestRequestedTeamsItemPrivacyXecfd3386 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlabeledPullRequestRequestedTeamsItemPrivacyXecfd3386> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnlabeledPullRequestRequestedTeamsItemPrivacyXecfd3386", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlabeledPullRequestRequestedTeamsItemPrivacyXecfd3386 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlabeledPullRequestRequestedTeamsItemPrivacyXecfd3386) {
      encoder.encodeString(value.value)
    }
  }
}
