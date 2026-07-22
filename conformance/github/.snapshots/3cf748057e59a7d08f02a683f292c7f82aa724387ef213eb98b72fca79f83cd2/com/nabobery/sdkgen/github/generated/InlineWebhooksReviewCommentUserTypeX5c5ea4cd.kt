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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_review_comment/properties/user/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_review_comment/properties/user/properties/type
 */
@Serializable(with = InlineWebhooksReviewCommentUserTypeX5c5ea4cd.Serializer::class)
public sealed class InlineWebhooksReviewCommentUserTypeX5c5ea4cd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksReviewCommentUserTypeX5c5ea4cd() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksReviewCommentUserTypeX5c5ea4cd() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksReviewCommentUserTypeX5c5ea4cd() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksReviewCommentUserTypeX5c5ea4cd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksReviewCommentUserTypeX5c5ea4cd = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksReviewCommentUserTypeX5c5ea4cd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksReviewCommentUserTypeX5c5ea4cd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksReviewCommentUserTypeX5c5ea4cd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReviewCommentUserTypeX5c5ea4cd) {
      encoder.encodeString(value.value)
    }
  }
}
