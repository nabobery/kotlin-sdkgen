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
 * Represents a 'pull_request_review' secret scanning location type. This location type shows that a secret was detected
 * in a review on a pull request.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location-pull-request-review
 */
@Serializable(with = SecretScanningLocationPullRequestReview.Serializer::class)
public class SecretScanningLocationPullRequestReview(
  /**
   * The API URL to get the pull request review where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullRequestReviewUrl: String,
  /**
   * The GitHub URL for the pull request review where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
) {
  public class Builder {
    private var pullRequestReviewUrlValue: String? = null

    public var pullRequestReviewUrl: String
      get() = requireNotNull(pullRequestReviewUrlValue) { "pullRequestReviewUrl is required" }
      set(`value`) {
        pullRequestReviewUrlValue = value
      }

    /**
     * The GitHub URL for the pull request review where the secret was detected.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    public fun build(): SecretScanningLocationPullRequestReview {
      check(pullRequestReviewUrlValue != null) { "pullRequestReviewUrl is required" }
      return SecretScanningLocationPullRequestReview(
        pullRequestReviewUrl = pullRequestReviewUrl,
        htmlUrl = htmlUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocationPullRequestReview = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SecretScanningLocationPullRequestReview> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocationPullRequestReview {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocationPullRequestReview")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocationPullRequestReview must be a JSON object")
      val pullRequestReviewUrl = json.decodeRequired<String>(rawObject, "pull_request_review_url")
      return SecretScanningLocationPullRequestReview(
        pullRequestReviewUrl = pullRequestReviewUrl,
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocationPullRequestReview) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocationPullRequestReview")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("pull_request_review_url", value.pullRequestReviewUrl)
        value.htmlUrl?.let { put("html_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocationPullRequestReview(block: SecretScanningLocationPullRequestReview.Builder.() -> Unit): SecretScanningLocationPullRequestReview = SecretScanningLocationPullRequestReview.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningLocationPullRequestReview is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
