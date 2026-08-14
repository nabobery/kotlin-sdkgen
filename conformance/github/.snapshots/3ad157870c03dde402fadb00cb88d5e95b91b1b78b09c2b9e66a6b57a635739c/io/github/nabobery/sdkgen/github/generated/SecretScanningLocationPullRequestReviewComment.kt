package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Represents a 'pull_request_review_comment' secret scanning location type. This location type shows that a secret was
 * detected in a review comment on a pull request.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location-pull-request-review-comment
 */
@Serializable(with = SecretScanningLocationPullRequestReviewComment.Serializer::class)
public class SecretScanningLocationPullRequestReviewComment(
  /**
   * The API URL to get the pull request review comment where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullRequestReviewCommentUrl: String,
  /**
   * The GitHub URL for the pull request review comment where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
) {
  public class Builder {
    private var pullRequestReviewCommentUrlValue: String? = null

    public var pullRequestReviewCommentUrl: String
      get() = requireNotNull(pullRequestReviewCommentUrlValue) { "pullRequestReviewCommentUrl is required" }
      set(`value`) {
        pullRequestReviewCommentUrlValue = value
      }

    /**
     * The GitHub URL for the pull request review comment where the secret was detected.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    public fun build(): SecretScanningLocationPullRequestReviewComment {
      check(pullRequestReviewCommentUrlValue != null) { "pullRequestReviewCommentUrl is required" }
      return SecretScanningLocationPullRequestReviewComment(
        pullRequestReviewCommentUrl = pullRequestReviewCommentUrl,
        htmlUrl = htmlUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocationPullRequestReviewComment = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SecretScanningLocationPullRequestReviewComment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocationPullRequestReviewComment {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocationPullRequestReviewComment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocationPullRequestReviewComment must be a JSON object")
      val pullRequestReviewCommentUrl = json.decodeRequired<String>(rawObject, "pull_request_review_comment_url")
      return SecretScanningLocationPullRequestReviewComment(
        pullRequestReviewCommentUrl = pullRequestReviewCommentUrl,
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocationPullRequestReviewComment) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocationPullRequestReviewComment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("pull_request_review_comment_url", value.pullRequestReviewCommentUrl)
        value.htmlUrl?.let { put("html_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocationPullRequestReviewComment(block: SecretScanningLocationPullRequestReviewComment.Builder.() -> Unit): SecretScanningLocationPullRequestReviewComment = SecretScanningLocationPullRequestReviewComment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningLocationPullRequestReviewComment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
