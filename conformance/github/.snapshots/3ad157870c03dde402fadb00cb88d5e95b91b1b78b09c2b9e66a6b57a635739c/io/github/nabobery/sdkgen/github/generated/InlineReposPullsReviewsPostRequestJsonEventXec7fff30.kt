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
 * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By
 * leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull
 * request review](https://docs.github.com/rest/pulls/reviews#submit-a-review-for-a-pull-request) when you are ready.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews/post/requestBody/content/
 * application~1json/schema/properties/event
 */
@Serializable(with = InlineReposPullsReviewsPostRequestJsonEventXec7fff30.Serializer::class)
public sealed class InlineReposPullsReviewsPostRequestJsonEventXec7fff30 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `APPROVE`.
   */
  public data object Approve : InlineReposPullsReviewsPostRequestJsonEventXec7fff30() {
    public override val `value`: String = "APPROVE"
  }

  /**
   * Documented value. Wire value: `REQUEST_CHANGES`.
   */
  public data object RequestChanges : InlineReposPullsReviewsPostRequestJsonEventXec7fff30() {
    public override val `value`: String = "REQUEST_CHANGES"
  }

  /**
   * Documented value. Wire value: `COMMENT`.
   */
  public data object Comment : InlineReposPullsReviewsPostRequestJsonEventXec7fff30() {
    public override val `value`: String = "COMMENT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsReviewsPostRequestJsonEventXec7fff30()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsReviewsPostRequestJsonEventXec7fff30 = when (value) {
      Approve.value -> Approve
      RequestChanges.value -> RequestChanges
      Comment.value -> Comment
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPullsReviewsPostRequestJsonEventXec7fff30> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposPullsReviewsPostRequestJsonEventXec7fff30", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsReviewsPostRequestJsonEventXec7fff30 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsReviewsPostRequestJsonEventXec7fff30) {
      encoder.encodeString(value.value)
    }
  }
}
