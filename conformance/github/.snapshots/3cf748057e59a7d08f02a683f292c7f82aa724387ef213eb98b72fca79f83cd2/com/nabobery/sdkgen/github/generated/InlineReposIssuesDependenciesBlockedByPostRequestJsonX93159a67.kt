package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1dependencies~1blocked_by/post/r
 * equestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1dependencies~1blocked_by/post/r
 * equestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67.Serializer::class)
public class InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67(
  /**
   * The id of the issue that blocks the current issue
   */
  public val issueId: Int,
) {
  public class Builder {
    private var issueIdValue: Int? = null

    public var issueId: Int
      get() = requireNotNull(issueIdValue) { "issueId is required" }
      set(`value`) {
        issueIdValue = value
      }

    public fun build(): InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67 {
      check(issueIdValue != null) { "issueId is required" }
      return InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67(
        issueId = issueId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67 must be a JSON object")
      val issueId = json.decodeRequired<Int>(rawObject, "issue_id")
      return InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67(
        issueId = issueId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("issue_id", json.encodeToJsonElement(value.issueId))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67(block: InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67.Builder.() -> Unit): InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67 = InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesDependenciesBlockedByPostRequestJsonX93159a67 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
