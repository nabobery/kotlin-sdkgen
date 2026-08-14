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
 * Represents a 'pull_request_comment' secret scanning location type. This location type shows that a secret was
 * detected in a comment on a pull request.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location-pull-request-comment
 */
@Serializable(with = SecretScanningLocationPullRequestComment.Serializer::class)
public class SecretScanningLocationPullRequestComment(
  /**
   * The API URL to get the pull request comment where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullRequestCommentUrl: String,
  /**
   * The GitHub URL for the pull request comment where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
) {
  public class Builder {
    private var pullRequestCommentUrlValue: String? = null

    public var pullRequestCommentUrl: String
      get() = requireNotNull(pullRequestCommentUrlValue) { "pullRequestCommentUrl is required" }
      set(`value`) {
        pullRequestCommentUrlValue = value
      }

    /**
     * The GitHub URL for the pull request comment where the secret was detected.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    public fun build(): SecretScanningLocationPullRequestComment {
      check(pullRequestCommentUrlValue != null) { "pullRequestCommentUrl is required" }
      return SecretScanningLocationPullRequestComment(
        pullRequestCommentUrl = pullRequestCommentUrl,
        htmlUrl = htmlUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocationPullRequestComment = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SecretScanningLocationPullRequestComment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocationPullRequestComment {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocationPullRequestComment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocationPullRequestComment must be a JSON object")
      val pullRequestCommentUrl = json.decodeRequired<String>(rawObject, "pull_request_comment_url")
      return SecretScanningLocationPullRequestComment(
        pullRequestCommentUrl = pullRequestCommentUrl,
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocationPullRequestComment) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocationPullRequestComment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("pull_request_comment_url", value.pullRequestCommentUrl)
        value.htmlUrl?.let { put("html_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocationPullRequestComment(block: SecretScanningLocationPullRequestComment.Builder.() -> Unit): SecretScanningLocationPullRequestComment = SecretScanningLocationPullRequestComment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningLocationPullRequestComment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
