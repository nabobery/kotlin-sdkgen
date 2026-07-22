package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews/post/requestBody/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews/post/requestBody/content/
 * application~1json/schema
 */
@Serializable(with = InlineReposPullsReviewsPostRequestJsonX257d334c.Serializer::class)
public class InlineReposPullsReviewsPostRequestJsonX257d334c(
  /**
   * **Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull request
   * review.
   */
  public val body: String? = null,
  /**
   * Use the following table to specify the location, destination, and contents of the draft review comment.
   */
  public val comments: List<InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5>? = null,
  /**
   * The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated
   * if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent commit in the
   * pull request when you do not specify a value.
   */
  public val commitId: String? = null,
  /**
   * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By
   * leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull
   * request review](https://docs.github.com/rest/pulls/reviews#submit-a-review-for-a-pull-request) when you are ready.
   */
  public val event: InlineReposPullsReviewsPostRequestJsonEventXec7fff30? = null,
) {
  public class Builder {
    /**
     * **Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull
     * request review.
     */
    public var body: String? = null

    /**
     * Use the following table to specify the location, destination, and contents of the draft review comment.
     */
    public var comments: List<InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5>? = null

    /**
     * The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment
     * outdated if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent
     * commit in the pull request when you do not specify a value.
     */
    public var commitId: String? = null

    /**
     * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By
     * leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull
     * request review](https://docs.github.com/rest/pulls/reviews#submit-a-review-for-a-pull-request) when you are
     * ready.
     */
    public var event: InlineReposPullsReviewsPostRequestJsonEventXec7fff30? = null

    public fun build(): InlineReposPullsReviewsPostRequestJsonX257d334c = InlineReposPullsReviewsPostRequestJsonX257d334c(
      body = body,
      comments = comments,
      commitId = commitId,
      event = event,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsReviewsPostRequestJsonX257d334c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposPullsReviewsPostRequestJsonX257d334c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsReviewsPostRequestJsonX257d334c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsReviewsPostRequestJsonX257d334c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsReviewsPostRequestJsonX257d334c must be a JSON object")
      return InlineReposPullsReviewsPostRequestJsonX257d334c(
        body = rawObject["body"]?.let { json.decodeFromJsonElement<String>(it) },
        comments = rawObject["comments"]?.let { json.decodeFromJsonElement<List<InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5>>(it) },
        commitId = rawObject["commit_id"]?.let { json.decodeFromJsonElement<String>(it) },
        event = rawObject["event"]?.let { json.decodeFromJsonElement<InlineReposPullsReviewsPostRequestJsonEventXec7fff30>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsReviewsPostRequestJsonX257d334c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsReviewsPostRequestJsonX257d334c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.body?.let { put("body", it) }
        value.comments?.let { put("comments", json.encodeToJsonElement(it)) }
        value.commitId?.let { put("commit_id", it) }
        value.event?.let { put("event", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsReviewsPostRequestJsonX257d334c(block: InlineReposPullsReviewsPostRequestJsonX257d334c.Builder.() -> Unit): InlineReposPullsReviewsPostRequestJsonX257d334c = InlineReposPullsReviewsPostRequestJsonX257d334c.build(block)
