package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-push/properties/commits/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-push/properties/commits/items
 */
@Serializable(with = InlineWebhookPushCommitsItemX88ce9531.Serializer::class)
public class InlineWebhookPushCommitsItemX88ce9531(
  /**
   * Metaproperties for Git author/committer information.
   */
  public val author: InlineWebhookPushCommitsItemAuthorX4155fb79,
  /**
   * Metaproperties for Git author/committer information.
   */
  public val committer: InlineWebhookPushCommitsItemCommitterXf5654f5b,
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
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val timestamp: String,
  public val treeId: String,
  /**
   * URL that points to the commit API resource.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  added: List<String>? = null,
  modified: List<String>? = null,
  removed: List<String>? = null,
) {
  /**
   * An array of files added in the commit. A maximum of 3000 changed files will be reported per commit.
   */
  public val added: List<String>? = added?.let { collection0 -> collection0.toList() }

  /**
   * An array of files modified by the commit. A maximum of 3000 changed files will be reported per commit.
   */
  public val modified: List<String>? = modified?.let { collection0 -> collection0.toList() }

  /**
   * An array of files removed in the commit. A maximum of 3000 changed files will be reported per commit.
   */
  public val removed: List<String>? = removed?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var authorValue: InlineWebhookPushCommitsItemAuthorX4155fb79? = null

    public var author: InlineWebhookPushCommitsItemAuthorX4155fb79
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var committerValue: InlineWebhookPushCommitsItemCommitterXf5654f5b? = null

    public var committer: InlineWebhookPushCommitsItemCommitterXf5654f5b
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

    private var addedValue: List<String>? = null

    /**
     * An array of files added in the commit. A maximum of 3000 changed files will be reported per commit.
     */
    public var added: List<String>?
      get() = addedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        addedValue = value?.let { collection0 -> collection0.toList() }
      }

    private var modifiedValue: List<String>? = null

    /**
     * An array of files modified by the commit. A maximum of 3000 changed files will be reported per commit.
     */
    public var modified: List<String>?
      get() = modifiedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        modifiedValue = value?.let { collection0 -> collection0.toList() }
      }

    private var removedValue: List<String>? = null

    /**
     * An array of files removed in the commit. A maximum of 3000 changed files will be reported per commit.
     */
    public var removed: List<String>?
      get() = removedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        removedValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineWebhookPushCommitsItemX88ce9531 {
      check(authorValue != null) { "author is required" }
      check(committerValue != null) { "committer is required" }
      check(distinctValue != null) { "distinct is required" }
      check(idValue != null) { "id is required" }
      check(messageValue != null) { "message is required" }
      check(timestampValue != null) { "timestamp is required" }
      check(treeIdValue != null) { "treeId is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookPushCommitsItemX88ce9531(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPushCommitsItemX88ce9531 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPushCommitsItemX88ce9531> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPushCommitsItemX88ce9531 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPushCommitsItemX88ce9531")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPushCommitsItemX88ce9531 must be a JSON object")
      val author = json.decodeRequired<InlineWebhookPushCommitsItemAuthorX4155fb79>(rawObject, "author")
      val committer = json.decodeRequired<InlineWebhookPushCommitsItemCommitterXf5654f5b>(rawObject, "committer")
      val distinct = json.decodeRequired<Boolean>(rawObject, "distinct")
      val id = json.decodeRequired<String>(rawObject, "id")
      val message = json.decodeRequired<String>(rawObject, "message")
      val timestamp = json.decodeRequired<String>(rawObject, "timestamp")
      val treeId = json.decodeRequired<String>(rawObject, "tree_id")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookPushCommitsItemX88ce9531(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPushCommitsItemX88ce9531) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPushCommitsItemX88ce9531")
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

public fun inlineWebhookPushCommitsItemX88ce9531(block: InlineWebhookPushCommitsItemX88ce9531.Builder.() -> Unit): InlineWebhookPushCommitsItemX88ce9531 = InlineWebhookPushCommitsItemX88ce9531.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPushCommitsItemX88ce9531 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
