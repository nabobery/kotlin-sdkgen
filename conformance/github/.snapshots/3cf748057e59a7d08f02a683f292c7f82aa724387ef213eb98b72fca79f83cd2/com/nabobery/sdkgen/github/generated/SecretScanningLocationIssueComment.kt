package com.nabobery.sdkgen.github.generated

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
 * Represents an 'issue_comment' secret scanning location type. This location type shows that a secret was detected in a
 * comment on an issue.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location-issue-comment
 */
@Serializable(with = SecretScanningLocationIssueComment.Serializer::class)
public class SecretScanningLocationIssueComment(
  /**
   * The API URL to get the issue comment where the secret was detected.
   */
  public val issueCommentUrl: String,
  /**
   * The GitHub URL for the issue comment where the secret was detected.
   */
  public val htmlUrl: String? = null,
) {
  public class Builder {
    private var issueCommentUrlValue: String? = null

    public var issueCommentUrl: String
      get() = requireNotNull(issueCommentUrlValue) { "issueCommentUrl is required" }
      set(`value`) {
        issueCommentUrlValue = value
      }

    /**
     * The GitHub URL for the issue comment where the secret was detected.
     */
    public var htmlUrl: String? = null

    public fun build(): SecretScanningLocationIssueComment {
      check(issueCommentUrlValue != null) { "issueCommentUrl is required" }
      return SecretScanningLocationIssueComment(
        issueCommentUrl = issueCommentUrl,
        htmlUrl = htmlUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocationIssueComment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningLocationIssueComment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocationIssueComment {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocationIssueComment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocationIssueComment must be a JSON object")
      val issueCommentUrl = json.decodeRequired<String>(rawObject, "issue_comment_url")
      return SecretScanningLocationIssueComment(
        issueCommentUrl = issueCommentUrl,
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocationIssueComment) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocationIssueComment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("issue_comment_url", value.issueCommentUrl)
        value.htmlUrl?.let { put("html_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocationIssueComment(block: SecretScanningLocationIssueComment.Builder.() -> Unit): SecretScanningLocationIssueComment = SecretScanningLocationIssueComment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningLocationIssueComment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
