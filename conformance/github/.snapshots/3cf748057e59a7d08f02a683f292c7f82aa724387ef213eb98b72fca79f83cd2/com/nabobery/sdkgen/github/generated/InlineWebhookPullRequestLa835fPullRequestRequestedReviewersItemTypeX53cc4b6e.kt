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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/requ
 * ested_reviewers/items/oneOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/requ
 * ested_reviewers/items/oneOf/0/properties/type
 */
@Serializable(with = InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemTypeX53cc4b6e.Serializer::class)
public sealed class InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemTypeX53cc4b6e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemTypeX53cc4b6e() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemTypeX53cc4b6e() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemTypeX53cc4b6e() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemTypeX53cc4b6e() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemTypeX53cc4b6e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemTypeX53cc4b6e = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemTypeX53cc4b6e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemTypeX53cc4b6e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemTypeX53cc4b6e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLa835fPullRequestRequestedReviewersItemTypeX53cc4b6e) {
      encoder.encodeString(value.value)
    }
  }
}
