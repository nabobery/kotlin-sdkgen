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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/review-comment/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/review-comment/properties/_links
 */
@Serializable(with = InlineReviewCommentLinksX4b56894a.Serializer::class)
public class InlineReviewCommentLinksX4b56894a(
  public val html: Link,
  public val pullRequest: Link,
  public val self: Link,
) {
  public class Builder {
    private var htmlValue: Link? = null

    public var html: Link
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var pullRequestValue: Link? = null

    public var pullRequest: Link
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    private var selfValue: Link? = null

    public var self: Link
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    public fun build(): InlineReviewCommentLinksX4b56894a {
      check(htmlValue != null) { "html is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(selfValue != null) { "self is required" }
      return InlineReviewCommentLinksX4b56894a(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReviewCommentLinksX4b56894a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReviewCommentLinksX4b56894a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReviewCommentLinksX4b56894a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReviewCommentLinksX4b56894a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReviewCommentLinksX4b56894a must be a JSON object")
      val html = json.decodeRequired<Link>(rawObject, "html")
      val pullRequest = json.decodeRequired<Link>(rawObject, "pull_request")
      val self = json.decodeRequired<Link>(rawObject, "self")
      return InlineReviewCommentLinksX4b56894a(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReviewCommentLinksX4b56894a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReviewCommentLinksX4b56894a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html", json.encodeToJsonElement(value.html))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
        put("self", json.encodeToJsonElement(value.self))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReviewCommentLinksX4b56894a(block: InlineReviewCommentLinksX4b56894a.Builder.() -> Unit): InlineReviewCommentLinksX4b56894a = InlineReviewCommentLinksX4b56894a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReviewCommentLinksX4b56894a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
