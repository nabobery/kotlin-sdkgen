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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * requested_teams/items/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * requested_teams/items/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestSynchronizePullRequestRequestedTeamsItemPrivacyX10f04156.Serializer::class)
public sealed class InlineWebhookPullRequestSynchronizePullRequestRequestedTeamsItemPrivacyX10f04156 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestSynchronizePullRequestRequestedTeamsItemPrivacyX10f04156() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestSynchronizePullRequestRequestedTeamsItemPrivacyX10f04156() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestSynchronizePullRequestRequestedTeamsItemPrivacyX10f04156() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestSynchronizePullRequestRequestedTeamsItemPrivacyX10f04156()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestSynchronizePullRequestRequestedTeamsItemPrivacyX10f04156 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSynchronizePullRequestRequestedTeamsItemPrivacyX10f04156> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestSynchronizePullRequestRequestedTeamsItemPrivacyX10f04156", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSynchronizePullRequestRequestedTeamsItemPrivacyX10f04156 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSynchronizePullRequestRequestedTeamsItemPrivacyX10f04156) {
      encoder.encodeString(value.value)
    }
  }
}
