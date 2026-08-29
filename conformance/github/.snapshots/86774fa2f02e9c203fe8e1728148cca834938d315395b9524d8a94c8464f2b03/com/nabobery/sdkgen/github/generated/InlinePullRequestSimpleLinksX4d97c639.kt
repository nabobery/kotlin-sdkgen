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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request-simple/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-simple/properties/_links
 */
@Serializable(with = InlinePullRequestSimpleLinksX4d97c639.Serializer::class)
public class InlinePullRequestSimpleLinksX4d97c639(
  public val comments: Link,
  public val commits: Link,
  public val html: Link,
  public val issue: Link,
  public val reviewComment: Link,
  public val reviewComments: Link,
  public val self: Link,
  public val statuses: Link,
) {
  public class Builder {
    private var commentsValue: Link? = null

    public var comments: Link
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: Link? = null

    public var commits: Link
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: Link? = null

    public var html: Link
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: Link? = null

    public var issue: Link
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue: Link? = null

    public var reviewComment: Link
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue: Link? = null

    public var reviewComments: Link
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: Link? = null

    public var self: Link
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue: Link? = null

    public var statuses: Link
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlinePullRequestSimpleLinksX4d97c639 {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlinePullRequestSimpleLinksX4d97c639(
        comments = comments,
        commits = commits,
        html = html,
        issue = issue,
        reviewComment = reviewComment,
        reviewComments = reviewComments,
        self = self,
        statuses = statuses,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestSimpleLinksX4d97c639 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePullRequestSimpleLinksX4d97c639> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestSimpleLinksX4d97c639 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestSimpleLinksX4d97c639")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestSimpleLinksX4d97c639 must be a JSON object")
      val comments = json.decodeRequired<Link>(rawObject, "comments")
      val commits = json.decodeRequired<Link>(rawObject, "commits")
      val html = json.decodeRequired<Link>(rawObject, "html")
      val issue = json.decodeRequired<Link>(rawObject, "issue")
      val reviewComment = json.decodeRequired<Link>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<Link>(rawObject, "review_comments")
      val self = json.decodeRequired<Link>(rawObject, "self")
      val statuses = json.decodeRequired<Link>(rawObject, "statuses")
      return InlinePullRequestSimpleLinksX4d97c639(
        comments = comments,
        commits = commits,
        html = html,
        issue = issue,
        reviewComment = reviewComment,
        reviewComments = reviewComments,
        self = self,
        statuses = statuses,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestSimpleLinksX4d97c639) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestSimpleLinksX4d97c639")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("comments", json.encodeToJsonElement(value.comments))
        put("commits", json.encodeToJsonElement(value.commits))
        put("html", json.encodeToJsonElement(value.html))
        put("issue", json.encodeToJsonElement(value.issue))
        put("review_comment", json.encodeToJsonElement(value.reviewComment))
        put("review_comments", json.encodeToJsonElement(value.reviewComments))
        put("self", json.encodeToJsonElement(value.self))
        put("statuses", json.encodeToJsonElement(value.statuses))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestSimpleLinksX4d97c639(block: InlinePullRequestSimpleLinksX4d97c639.Builder.() -> Unit): InlinePullRequestSimpleLinksX4d97c639 = InlinePullRequestSimpleLinksX4d97c639.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestSimpleLinksX4d97c639 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
