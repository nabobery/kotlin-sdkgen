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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/1/properties/pull_
 * request/properties/requested_reviewers/items/oneOf/1/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/1/properties/pull_
 * request/properties/requested_reviewers/items/oneOf/1/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestReacd1OneOf2PullRequestPrivacyX9a697e4e.Serializer::class)
public sealed class InlineWebhookPullRequestReacd1OneOf2PullRequestPrivacyX9a697e4e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestReacd1OneOf2PullRequestPrivacyX9a697e4e() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestReacd1OneOf2PullRequestPrivacyX9a697e4e() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestReacd1OneOf2PullRequestPrivacyX9a697e4e() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReacd1OneOf2PullRequestPrivacyX9a697e4e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReacd1OneOf2PullRequestPrivacyX9a697e4e = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReacd1OneOf2PullRequestPrivacyX9a697e4e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReacd1OneOf2PullRequestPrivacyX9a697e4e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReacd1OneOf2PullRequestPrivacyX9a697e4e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReacd1OneOf2PullRequestPrivacyX9a697e4e) {
      encoder.encodeString(value.value)
    }
  }
}
