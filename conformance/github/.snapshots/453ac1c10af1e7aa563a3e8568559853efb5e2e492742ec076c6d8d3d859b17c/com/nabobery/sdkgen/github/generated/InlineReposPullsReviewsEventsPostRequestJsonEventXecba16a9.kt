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
 * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When
 * you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to
 * `PENDING`, which means you will need to re-submit the pull request review using a review action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews~1{review_id}~1events/post
 * /requestBody/content/application~1json/schema/properties/event
 */
@Serializable(with = InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9.Serializer::class)
public sealed class InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `APPROVE`.
   */
  public data object Approve : InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9() {
    public override val `value`: String = "APPROVE"
  }

  /**
   * Documented value. Wire value: `REQUEST_CHANGES`.
   */
  public data object RequestChanges : InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9() {
    public override val `value`: String = "REQUEST_CHANGES"
  }

  /**
   * Documented value. Wire value: `COMMENT`.
   */
  public data object Comment : InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9() {
    public override val `value`: String = "COMMENT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9 = when (value) {
      Approve.value -> Approve
      RequestChanges.value -> RequestChanges
      Comment.value -> Comment
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9) {
      encoder.encodeString(value.value)
    }
  }
}
