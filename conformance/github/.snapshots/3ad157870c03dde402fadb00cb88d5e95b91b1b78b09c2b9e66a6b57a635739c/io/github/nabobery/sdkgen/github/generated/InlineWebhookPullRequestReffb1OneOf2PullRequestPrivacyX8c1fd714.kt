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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/pull_reques
 * t/properties/requested_reviewers/items/oneOf/1/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/pull_reques
 * t/properties/requested_reviewers/items/oneOf/1/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestReffb1OneOf2PullRequestPrivacyX8c1fd714.Serializer::class)
public sealed class InlineWebhookPullRequestReffb1OneOf2PullRequestPrivacyX8c1fd714 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestReffb1OneOf2PullRequestPrivacyX8c1fd714() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestReffb1OneOf2PullRequestPrivacyX8c1fd714() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestReffb1OneOf2PullRequestPrivacyX8c1fd714() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReffb1OneOf2PullRequestPrivacyX8c1fd714()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReffb1OneOf2PullRequestPrivacyX8c1fd714 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReffb1OneOf2PullRequestPrivacyX8c1fd714> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReffb1OneOf2PullRequestPrivacyX8c1fd714", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReffb1OneOf2PullRequestPrivacyX8c1fd714 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReffb1OneOf2PullRequestPrivacyX8c1fd714) {
      encoder.encodeString(value.value)
    }
  }
}
