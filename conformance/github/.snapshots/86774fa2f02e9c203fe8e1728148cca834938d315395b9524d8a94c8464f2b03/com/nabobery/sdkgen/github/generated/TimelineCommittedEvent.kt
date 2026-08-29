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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Timeline Committed Event
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/timeline-committed-event
 */
@Serializable(with = TimelineCommittedEvent.Serializer::class)
public class TimelineCommittedEvent(
  /**
   * Identifying information for the git-user
   */
  public val author: InlineTimelineCommittedEventAuthorX73c6e393,
  /**
   * Identifying information for the git-user
   */
  public val committer: InlineTimelineCommittedEventCommitterX52258ce1,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Message describing the purpose of the commit
   */
  public val message: String,
  public val nodeId: String,
  parents: List<InlineTimelineCommittedEventParentsItemX56555918>,
  /**
   * SHA for the commit
   */
  public val sha: String,
  public val tree: InlineTimelineCommittedEventTreeXb337075b,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val verification: InlineTimelineCommittedEventVerificationXfc174c41,
  public val event: String? = null,
) {
  public val parents: List<InlineTimelineCommittedEventParentsItemX56555918> = parents.toList()

  public class Builder {
    private var authorValue: InlineTimelineCommittedEventAuthorX73c6e393? = null

    public var author: InlineTimelineCommittedEventAuthorX73c6e393
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var committerValue: InlineTimelineCommittedEventCommitterX52258ce1? = null

    public var committer: InlineTimelineCommittedEventCommitterX52258ce1
      get() = requireNotNull(committerValue) { "committer is required" }
      set(`value`) {
        committerValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var parentsValue: List<InlineTimelineCommittedEventParentsItemX56555918>? = null

    public var parents: List<InlineTimelineCommittedEventParentsItemX56555918>
      get() = requireNotNull(parentsValue) { "parents is required" }.toList()
      set(`value`) {
        parentsValue = value.toList()
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var treeValue: InlineTimelineCommittedEventTreeXb337075b? = null

    public var tree: InlineTimelineCommittedEventTreeXb337075b
      get() = requireNotNull(treeValue) { "tree is required" }
      set(`value`) {
        treeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var verificationValue: InlineTimelineCommittedEventVerificationXfc174c41? = null

    public var verification: InlineTimelineCommittedEventVerificationXfc174c41
      get() = requireNotNull(verificationValue) { "verification is required" }
      set(`value`) {
        verificationValue = value
      }

    public var event: String? = null

    public fun build(): TimelineCommittedEvent {
      check(authorValue != null) { "author is required" }
      check(committerValue != null) { "committer is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(messageValue != null) { "message is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(parentsValue != null) { "parents is required" }
      check(shaValue != null) { "sha is required" }
      check(treeValue != null) { "tree is required" }
      check(urlValue != null) { "url is required" }
      check(verificationValue != null) { "verification is required" }
      return TimelineCommittedEvent(
        author = author,
        committer = committer,
        htmlUrl = htmlUrl,
        message = message,
        nodeId = nodeId,
        parents = parents,
        sha = sha,
        tree = tree,
        url = url,
        verification = verification,
        event = event,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TimelineCommittedEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TimelineCommittedEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TimelineCommittedEvent {
      val jsonDecoder = decoder.requireJsonDecoder("TimelineCommittedEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TimelineCommittedEvent must be a JSON object")
      val author = json.decodeRequired<InlineTimelineCommittedEventAuthorX73c6e393>(rawObject, "author")
      val committer = json.decodeRequired<InlineTimelineCommittedEventCommitterX52258ce1>(rawObject, "committer")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val message = json.decodeRequired<String>(rawObject, "message")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val parents = json.decodeRequired<List<InlineTimelineCommittedEventParentsItemX56555918>>(rawObject, "parents")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val tree = json.decodeRequired<InlineTimelineCommittedEventTreeXb337075b>(rawObject, "tree")
      val url = json.decodeRequired<String>(rawObject, "url")
      val verification = json.decodeRequired<InlineTimelineCommittedEventVerificationXfc174c41>(rawObject, "verification")
      return TimelineCommittedEvent(
        author = author,
        committer = committer,
        htmlUrl = htmlUrl,
        message = message,
        nodeId = nodeId,
        parents = parents,
        sha = sha,
        tree = tree,
        url = url,
        verification = verification,
        event = rawObject["event"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TimelineCommittedEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("TimelineCommittedEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", json.encodeToJsonElement(value.author))
        put("committer", json.encodeToJsonElement(value.committer))
        put("html_url", value.htmlUrl)
        put("message", value.message)
        put("node_id", value.nodeId)
        put("parents", json.encodeToJsonElement(value.parents))
        put("sha", value.sha)
        put("tree", json.encodeToJsonElement(value.tree))
        put("url", value.url)
        put("verification", json.encodeToJsonElement(value.verification))
        value.event?.let { put("event", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun timelineCommittedEvent(block: TimelineCommittedEvent.Builder.() -> Unit): TimelineCommittedEvent = TimelineCommittedEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TimelineCommittedEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
