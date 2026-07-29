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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/requested_reviewers/items/oneOf/0
 * /properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/requested_reviewers/items/oneOf/0
 * /properties/type
 */
@Serializable(with = InlineWebhooksPullRequest5RequestedReviewersItemOneOf1TypeX2d2da02f.Serializer::class)
public sealed class InlineWebhooksPullRequest5RequestedReviewersItemOneOf1TypeX2d2da02f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksPullRequest5RequestedReviewersItemOneOf1TypeX2d2da02f() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksPullRequest5RequestedReviewersItemOneOf1TypeX2d2da02f() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksPullRequest5RequestedReviewersItemOneOf1TypeX2d2da02f() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5RequestedReviewersItemOneOf1TypeX2d2da02f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5RequestedReviewersItemOneOf1TypeX2d2da02f = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksPullRequest5RequestedReviewersItemOneOf1TypeX2d2da02f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5RequestedReviewersItemOneOf1TypeX2d2da02f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5RequestedReviewersItemOneOf1TypeX2d2da02f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5RequestedReviewersItemOneOf1TypeX2d2da02f) {
      encoder.encodeString(value.value)
    }
  }
}
