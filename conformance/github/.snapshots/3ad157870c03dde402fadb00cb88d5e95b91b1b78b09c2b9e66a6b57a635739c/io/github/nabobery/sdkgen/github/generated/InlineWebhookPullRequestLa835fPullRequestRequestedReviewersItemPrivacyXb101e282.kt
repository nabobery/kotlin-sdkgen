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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/requ
 * ested_reviewers/items/oneOf/1/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/requ
 * ested_reviewers/items/oneOf/1/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemPrivacyXb101e282.Serializer::class)
public sealed class InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemPrivacyXb101e282 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemPrivacyXb101e282() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemPrivacyXb101e282() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemPrivacyXb101e282() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemPrivacyXb101e282()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemPrivacyXb101e282 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemPrivacyXb101e282> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemPrivacyXb101e282", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemPrivacyXb101e282 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemPrivacyXb101e282) {
      encoder.encodeString(value.value)
    }
  }
}
