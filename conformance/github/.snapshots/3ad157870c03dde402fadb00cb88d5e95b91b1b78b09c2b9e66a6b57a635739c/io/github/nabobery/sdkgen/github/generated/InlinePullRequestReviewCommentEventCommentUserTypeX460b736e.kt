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
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment-event/properties/comment/properties/user
 * /properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment-event/properties/comment/properties/user
 * /properties/type
 */
@Serializable(with = InlinePullRequestReviewCommentEventCommentUserTypeX460b736e.Serializer::class)
public sealed class InlinePullRequestReviewCommentEventCommentUserTypeX460b736e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlinePullRequestReviewCommentEventCommentUserTypeX460b736e() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlinePullRequestReviewCommentEventCommentUserTypeX460b736e() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlinePullRequestReviewCommentEventCommentUserTypeX460b736e() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePullRequestReviewCommentEventCommentUserTypeX460b736e()

  public companion object {
    public fun fromValue(`value`: String): InlinePullRequestReviewCommentEventCommentUserTypeX460b736e = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePullRequestReviewCommentEventCommentUserTypeX460b736e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlinePullRequestReviewCommentEventCommentUserTypeX460b736e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewCommentEventCommentUserTypeX460b736e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewCommentEventCommentUserTypeX460b736e) {
      encoder.encodeString(value.value)
    }
  }
}
