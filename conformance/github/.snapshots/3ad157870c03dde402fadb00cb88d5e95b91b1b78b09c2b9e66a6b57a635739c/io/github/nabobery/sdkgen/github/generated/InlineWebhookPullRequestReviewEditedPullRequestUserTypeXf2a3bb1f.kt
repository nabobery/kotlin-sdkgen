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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewEditedPullRequestUserTypeXf2a3bb1f.Serializer::class)
public sealed class InlineWebhookPullRequestReviewEditedPullRequestUserTypeXf2a3bb1f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewEditedPullRequestUserTypeXf2a3bb1f() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewEditedPullRequestUserTypeXf2a3bb1f() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewEditedPullRequestUserTypeXf2a3bb1f() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestReviewEditedPullRequestUserTypeXf2a3bb1f() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewEditedPullRequestUserTypeXf2a3bb1f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewEditedPullRequestUserTypeXf2a3bb1f = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewEditedPullRequestUserTypeXf2a3bb1f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewEditedPullRequestUserTypeXf2a3bb1f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewEditedPullRequestUserTypeXf2a3bb1f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewEditedPullRequestUserTypeXf2a3bb1f) {
      encoder.encodeString(value.value)
    }
  }
}
