package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A commit.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-simple-commit
 */
@Serializable(with = NullableSimpleCommit.Serializer::class)
public class NullableSimpleCommit(
  /**
   * Information about the Git author
   */
  public val author: InlineNullableSimpleCommitAuthorX6a223e77?,
  /**
   * Information about the Git committer
   */
  public val committer: InlineNullableSimpleCommitCommitterXdd79f8dc?,
  /**
   * SHA for the commit
   */
  public val id: String,
  /**
   * Message describing the purpose of the commit
   */
  public val message: String,
  /**
   * Timestamp of the commit
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val timestamp: String,
  /**
   * SHA for the commit's tree
   */
  public val treeId: String,
) {
  public class Builder {
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

    private var authorState: FieldState<InlineNullableSimpleCommitAuthorX6a223e77?> =
        FieldState.Absent

    /**
     * Information about the Git author
     * Required nullable field; assigning `null` records present-null.
     */
    public var author: InlineNullableSimpleCommitAuthorX6a223e77?
      get() = authorState.valueOrNull()
      set(`value`) {
        authorState = value.toNullableFieldState()
      }

    private var committerState: FieldState<InlineNullableSimpleCommitCommitterXdd79f8dc?> =
        FieldState.Absent

    /**
     * Information about the Git committer
     * Required nullable field; assigning `null` records present-null.
     */
    public var committer: InlineNullableSimpleCommitCommitterXdd79f8dc?
      get() = committerState.valueOrNull()
      set(`value`) {
        committerState = value.toNullableFieldState()
      }

    public fun build(): NullableSimpleCommit {
      check(idValue != null) { "id is required" }
      check(messageValue != null) { "message is required" }
      check(timestampValue != null) { "timestamp is required" }
      check(treeIdValue != null) { "treeId is required" }
      check(authorState !== FieldState.Absent) { "author is required, even when null" }
      check(committerState !== FieldState.Absent) { "committer is required, even when null" }
      return NullableSimpleCommit(
        author = authorState.valueOrNull(),
        committer = committerState.valueOrNull(),
        id = id,
        message = message,
        timestamp = timestamp,
        treeId = treeId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NullableSimpleCommit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<NullableSimpleCommit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NullableSimpleCommit {
      val jsonDecoder = decoder.requireJsonDecoder("NullableSimpleCommit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NullableSimpleCommit must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val message = json.decodeRequired<String>(rawObject, "message")
      val timestamp = json.decodeRequired<String>(rawObject, "timestamp")
      val treeId = json.decodeRequired<String>(rawObject, "tree_id")
      if (!rawObject.containsKey("author")) {
        throw SerializationException("NullableSimpleCommit is missing required property 'author'")
      }
      val author = rawObject["author"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineNullableSimpleCommitAuthorX6a223e77?>(requireNotNull(element)) }
      if (!rawObject.containsKey("committer")) {
        throw SerializationException("NullableSimpleCommit is missing required property 'committer'")
      }
      val committer = rawObject["committer"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineNullableSimpleCommitCommitterXdd79f8dc?>(requireNotNull(element)) }
      return NullableSimpleCommit(
        author = author,
        committer = committer,
        id = id,
        message = message,
        timestamp = timestamp,
        treeId = treeId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: NullableSimpleCommit) {
      val jsonEncoder = encoder.requireJsonEncoder("NullableSimpleCommit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", value.author?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("committer", value.committer?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", value.id)
        put("message", value.message)
        put("timestamp", value.timestamp)
        put("tree_id", value.treeId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun nullableSimpleCommit(block: NullableSimpleCommit.Builder.() -> Unit): NullableSimpleCommit = NullableSimpleCommit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NullableSimpleCommit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("NullableSimpleCommit property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
