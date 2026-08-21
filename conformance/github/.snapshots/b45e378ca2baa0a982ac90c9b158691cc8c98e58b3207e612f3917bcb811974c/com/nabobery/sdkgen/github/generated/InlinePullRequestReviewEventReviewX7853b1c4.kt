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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-event/properties/review.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-event/properties/review
 */
@Serializable(with = InlinePullRequestReviewEventReviewX7853b1c4.Serializer::class)
public class InlinePullRequestReviewEventReviewX7853b1c4(
  public val links: InlinePullRequestReviewEventReviewLinksX55683efe? = null,
  public val body: String? = null,
  public val commitId: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
  public val id: Int? = null,
  public val nodeId: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullRequestUrl: String? = null,
  public val state: String? = null,
  public val submittedAt: String? = null,
  public val updatedAt: String? = null,
  public val user: NullableSimpleUser? = null,
) {
  public class Builder {
    public var links: InlinePullRequestReviewEventReviewLinksX55683efe? = null

    public var body: String? = null

    public var commitId: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    public var id: Int? = null

    public var nodeId: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var pullRequestUrl: String? = null

    public var state: String? = null

    public var submittedAt: String? = null

    public var updatedAt: String? = null

    public var user: NullableSimpleUser? = null

    public fun build(): InlinePullRequestReviewEventReviewX7853b1c4 = InlinePullRequestReviewEventReviewX7853b1c4(
      links = links,
      body = body,
      commitId = commitId,
      htmlUrl = htmlUrl,
      id = id,
      nodeId = nodeId,
      pullRequestUrl = pullRequestUrl,
      state = state,
      submittedAt = submittedAt,
      updatedAt = updatedAt,
      user = user,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestReviewEventReviewX7853b1c4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePullRequestReviewEventReviewX7853b1c4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewEventReviewX7853b1c4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestReviewEventReviewX7853b1c4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestReviewEventReviewX7853b1c4 must be a JSON object")
      return InlinePullRequestReviewEventReviewX7853b1c4(
        links = rawObject["_links"]?.let { json.decodeFromJsonElement<InlinePullRequestReviewEventReviewLinksX55683efe>(it) },
        body = rawObject["body"]?.let { json.decodeFromJsonElement<String>(it) },
        commitId = rawObject["commit_id"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        pullRequestUrl = rawObject["pull_request_url"]?.let { json.decodeFromJsonElement<String>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
        submittedAt = rawObject["submitted_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        user = rawObject["user"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewEventReviewX7853b1c4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestReviewEventReviewX7853b1c4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.links?.let { put("_links", json.encodeToJsonElement(it)) }
        value.body?.let { put("body", it) }
        value.commitId?.let { put("commit_id", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.nodeId?.let { put("node_id", it) }
        value.pullRequestUrl?.let { put("pull_request_url", it) }
        value.state?.let { put("state", it) }
        value.submittedAt?.let { put("submitted_at", it) }
        value.updatedAt?.let { put("updated_at", it) }
        value.user?.let { put("user", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestReviewEventReviewX7853b1c4(block: InlinePullRequestReviewEventReviewX7853b1c4.Builder.() -> Unit): InlinePullRequestReviewEventReviewX7853b1c4 = InlinePullRequestReviewEventReviewX7853b1c4.build(block)
