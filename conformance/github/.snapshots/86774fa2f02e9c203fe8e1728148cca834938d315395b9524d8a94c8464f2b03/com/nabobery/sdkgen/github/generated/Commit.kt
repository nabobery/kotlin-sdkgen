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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Commit
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit
 */
@Serializable(with = Commit.Serializer::class)
public class Commit internal constructor(
  public val author: InlineCommitAuthorXd0b5b3ea?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val commentsUrl: String,
  public val commit: InlineCommitCommitXf196640a,
  public val committer: InlineCommitCommitterX8c72b084?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val nodeId: String,
  parents: List<InlineCommitParentsItemX10153dfe>,
  public val sha: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  filesState: FieldState<List<DiffEntry>>,
  private val statsState: FieldState<InlineCommitStatsX0f18389f>,
) {
  public val parents: List<InlineCommitParentsItemX10153dfe> = parents.toList()

  private val filesState: FieldState<List<DiffEntry>> =
      filesState.copyValue { fieldValue -> fieldValue.toList() }

  public val files: List<DiffEntry>?
    get() = filesState.valueOrNull()

  public val stats: InlineCommitStatsX0f18389f?
    get() = statsState.valueOrNull()

  public constructor(
    author: InlineCommitAuthorXd0b5b3ea?,
    commentsUrl: String,
    commit: InlineCommitCommitXf196640a,
    committer: InlineCommitCommitterX8c72b084?,
    htmlUrl: String,
    nodeId: String,
    parents: List<InlineCommitParentsItemX10153dfe>,
    sha: String,
    url: String,
  ) : this(author = author,
  commentsUrl = commentsUrl,
  commit = commit,
  committer = committer,
  htmlUrl = htmlUrl,
  nodeId = nodeId,
  parents = parents,
  sha = sha,
  url = url,
  filesState = FieldState.Absent,
  statsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `files`.
   */
  public fun filesPresence(): FieldPresence = filesState.presence

  /**
   * Returns the wire presence of `stats`.
   */
  public fun statsPresence(): FieldPresence = statsState.presence

  public class Builder {
    private var commentsUrlValue: String? = null

    public var commentsUrl: String
      get() = requireNotNull(commentsUrlValue) { "commentsUrl is required" }
      set(`value`) {
        commentsUrlValue = value
      }

    private var commitValue: InlineCommitCommitXf196640a? = null

    public var commit: InlineCommitCommitXf196640a
      get() = requireNotNull(commitValue) { "commit is required" }
      set(`value`) {
        commitValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var parentsValue: List<InlineCommitParentsItemX10153dfe>? = null

    public var parents: List<InlineCommitParentsItemX10153dfe>
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

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var authorState: FieldState<InlineCommitAuthorXd0b5b3ea?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var author: InlineCommitAuthorXd0b5b3ea?
      get() = authorState.valueOrNull()
      set(`value`) {
        authorState = value.toNullableFieldState()
      }

    private var committerState: FieldState<InlineCommitCommitterX8c72b084?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var committer: InlineCommitCommitterX8c72b084?
      get() = committerState.valueOrNull()
      set(`value`) {
        committerState = value.toNullableFieldState()
      }

    private var filesState: FieldState<List<DiffEntry>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var files: List<DiffEntry>?
      get() = filesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "files is not nullable; call unsetFiles() to omit it" }
        filesState = FieldState.Value(present.toList())
      }

    private var statsState: FieldState<InlineCommitStatsX0f18389f> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var stats: InlineCommitStatsX0f18389f?
      get() = statsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "stats is not nullable; call unsetStats() to omit it" }
        statsState = FieldState.Value(present)
      }

    /**
     * Omits `files` from serialized output.
     */
    public fun unsetFiles() {
      filesState = FieldState.Absent
    }

    /**
     * Omits `stats` from serialized output.
     */
    public fun unsetStats() {
      statsState = FieldState.Absent
    }

    public fun build(): Commit {
      check(commentsUrlValue != null) { "commentsUrl is required" }
      check(commitValue != null) { "commit is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(parentsValue != null) { "parents is required" }
      check(shaValue != null) { "sha is required" }
      check(urlValue != null) { "url is required" }
      check(authorState !== FieldState.Absent) { "author is required, even when null" }
      check(committerState !== FieldState.Absent) { "committer is required, even when null" }
      return Commit(
        author = authorState.valueOrNull(),
        commentsUrl = commentsUrl,
        commit = commit,
        committer = committerState.valueOrNull(),
        htmlUrl = htmlUrl,
        nodeId = nodeId,
        parents = parents,
        sha = sha,
        url = url,
        filesState = filesState,
        statsState = statsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Commit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Commit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Commit {
      val jsonDecoder = decoder.requireJsonDecoder("Commit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Commit must be a JSON object")
      val commentsUrl = json.decodeRequired<String>(rawObject, "comments_url")
      val commit = json.decodeRequired<InlineCommitCommitXf196640a>(rawObject, "commit")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val parents = json.decodeRequired<List<InlineCommitParentsItemX10153dfe>>(rawObject, "parents")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("author")) {
        throw SerializationException("Commit is missing required property 'author'")
      }
      val author = rawObject["author"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCommitAuthorXd0b5b3ea?>(requireNotNull(element)) }
      if (!rawObject.containsKey("committer")) {
        throw SerializationException("Commit is missing required property 'committer'")
      }
      val committer = rawObject["committer"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCommitCommitterX8c72b084?>(requireNotNull(element)) }
      return Commit(
        author = author,
        commentsUrl = commentsUrl,
        commit = commit,
        committer = committer,
        htmlUrl = htmlUrl,
        nodeId = nodeId,
        parents = parents,
        sha = sha,
        url = url,
        filesState = json.decodeOptional(rawObject, "files", nullable = false),
        statsState = json.decodeOptional(rawObject, "stats", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Commit) {
      val jsonEncoder = encoder.requireJsonEncoder("Commit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", value.author?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("comments_url", value.commentsUrl)
        put("commit", json.encodeToJsonElement(value.commit))
        put("committer", value.committer?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("node_id", value.nodeId)
        put("parents", json.encodeToJsonElement(value.parents))
        put("sha", value.sha)
        put("url", value.url)
        putState("files", value.filesState, json::encodeToJsonElement)
        putState("stats", value.statsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun commit(block: Commit.Builder.() -> Unit): Commit = Commit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Commit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("Commit property '" + name + "' is not nullable")
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
