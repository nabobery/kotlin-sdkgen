package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-push/properties/head_commit.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-push/properties/head_commit
 */
@Serializable(with = InlineWebhookPushHeadCommitX7bf4b1dd.Serializer::class)
public class InlineWebhookPushHeadCommitX7bf4b1dd(
  /**
   * Metaproperties for Git author/committer information.
   */
  public val author: InlineWebhookPushHeadCommitAuthorXe91d0385,
  /**
   * Metaproperties for Git author/committer information.
   */
  public val committer: InlineWebhookPushHeadCommitCommitterX389f491a,
  /**
   * Whether this commit is distinct from any that have been pushed before.
   */
  public val distinct: Boolean,
  public val id: String,
  /**
   * The commit message.
   */
  public val message: String,
  /**
   * The ISO 8601 timestamp of the commit.
   */
  public val timestamp: String,
  public val treeId: String,
  /**
   * URL that points to the commit API resource.
   */
  public val url: String,
  /**
   * An array of files added in the commit.
   */
  public val added: List<String>? = null,
  /**
   * An array of files modified by the commit.
   */
  public val modified: List<String>? = null,
  /**
   * An array of files removed in the commit.
   */
  public val removed: List<String>? = null,
) {
  public class Builder {
    private var authorValue: InlineWebhookPushHeadCommitAuthorXe91d0385? = null

    public var author: InlineWebhookPushHeadCommitAuthorXe91d0385
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var committerValue: InlineWebhookPushHeadCommitCommitterX389f491a? = null

    public var committer: InlineWebhookPushHeadCommitCommitterX389f491a
      get() = requireNotNull(committerValue) { "committer is required" }
      set(`value`) {
        committerValue = value
      }

    private var distinctValue: Boolean? = null

    public var distinct: Boolean
      get() = requireNotNull(distinctValue) { "distinct is required" }
      set(`value`) {
        distinctValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var timestampValue: String? = null

    public var timestamp: String
      get() = requireNotNull(timestampValue) { "timestamp is required" }
      set(`value`) {
        timestampValue = value
      }

    private var treeIdValue: String? = null

    public var treeId: String
      get() = requireNotNull(treeIdValue) { "treeId is required" }
      set(`value`) {
        treeIdValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    /**
     * An array of files added in the commit.
     */
    public var added: List<String>? = null

    /**
     * An array of files modified by the commit.
     */
    public var modified: List<String>? = null

    /**
     * An array of files removed in the commit.
     */
    public var removed: List<String>? = null

    public fun build(): InlineWebhookPushHeadCommitX7bf4b1dd {
      check(authorValue != null) { "author is required" }
      check(committerValue != null) { "committer is required" }
      check(distinctValue != null) { "distinct is required" }
      check(idValue != null) { "id is required" }
      check(messageValue != null) { "message is required" }
      check(timestampValue != null) { "timestamp is required" }
      check(treeIdValue != null) { "treeId is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookPushHeadCommitX7bf4b1dd(
        author = author,
        committer = committer,
        distinct = distinct,
        id = id,
        message = message,
        timestamp = timestamp,
        treeId = treeId,
        url = url,
        added = added,
        modified = modified,
        removed = removed,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPushHeadCommitX7bf4b1dd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPushHeadCommitX7bf4b1dd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPushHeadCommitX7bf4b1dd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPushHeadCommitX7bf4b1dd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPushHeadCommitX7bf4b1dd must be a JSON object")
      val author = json.decodeRequired<InlineWebhookPushHeadCommitAuthorXe91d0385>(rawObject, "author")
      val committer = json.decodeRequired<InlineWebhookPushHeadCommitCommitterX389f491a>(rawObject, "committer")
      val distinct = json.decodeRequired<Boolean>(rawObject, "distinct")
      val id = json.decodeRequired<String>(rawObject, "id")
      val message = json.decodeRequired<String>(rawObject, "message")
      val timestamp = json.decodeRequired<String>(rawObject, "timestamp")
      val treeId = json.decodeRequired<String>(rawObject, "tree_id")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookPushHeadCommitX7bf4b1dd(
        author = author,
        committer = committer,
        distinct = distinct,
        id = id,
        message = message,
        timestamp = timestamp,
        treeId = treeId,
        url = url,
        added = rawObject["added"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        modified = rawObject["modified"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        removed = rawObject["removed"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPushHeadCommitX7bf4b1dd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPushHeadCommitX7bf4b1dd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", json.encodeToJsonElement(value.author))
        put("committer", json.encodeToJsonElement(value.committer))
        put("distinct", json.encodeToJsonElement(value.distinct))
        put("id", value.id)
        put("message", value.message)
        put("timestamp", value.timestamp)
        put("tree_id", value.treeId)
        put("url", value.url)
        value.added?.let { put("added", json.encodeToJsonElement(it)) }
        value.modified?.let { put("modified", json.encodeToJsonElement(it)) }
        value.removed?.let { put("removed", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPushHeadCommitX7bf4b1dd(block: InlineWebhookPushHeadCommitX7bf4b1dd.Builder.() -> Unit): InlineWebhookPushHeadCommitX7bf4b1dd = InlineWebhookPushHeadCommitX7bf4b1dd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPushHeadCommitX7bf4b1dd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
