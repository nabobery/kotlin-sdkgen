package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
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
 * Commit Search Result Item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit-search-result-item
 */
@Serializable(with = CommitSearchResultItem.Serializer::class)
public class CommitSearchResultItem internal constructor(
  public val author: NullableSimpleUser?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val commentsUrl: String,
  public val commit: InlineCommitSearchResultItemCommitXdb4a8d53,
  public val committer: NullableGitUser?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val nodeId: String,
  parents: List<InlineCommitSearchResultItemParentsItemX3af33651>,
  public val repository: MinimalRepository,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val score: Double,
  public val sha: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>>,
) {
  public val parents: List<InlineCommitSearchResultItemParentsItemX3af33651> = parents.toList()

  private val textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>> =
      textMatchesState.copyValue { fieldValue -> fieldValue.toList() }

  public val textMatches: List<InlineSearchResultTextMatchesItemXe380e62a>?
    get() = textMatchesState.valueOrNull()

  public constructor(
    author: NullableSimpleUser?,
    commentsUrl: String,
    commit: InlineCommitSearchResultItemCommitXdb4a8d53,
    committer: NullableGitUser?,
    htmlUrl: String,
    nodeId: String,
    parents: List<InlineCommitSearchResultItemParentsItemX3af33651>,
    repository: MinimalRepository,
    score: Double,
    sha: String,
    url: String,
  ) : this(author = author,
  commentsUrl = commentsUrl,
  commit = commit,
  committer = committer,
  htmlUrl = htmlUrl,
  nodeId = nodeId,
  parents = parents,
  repository = repository,
  score = score,
  sha = sha,
  url = url,
  textMatchesState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `text_matches`.
   */
  public fun textMatchesPresence(): FieldPresence = textMatchesState.presence

  public class Builder {
    private var commentsUrlValue: String? = null

    public var commentsUrl: String
      get() = requireNotNull(commentsUrlValue) { "commentsUrl is required" }
      set(`value`) {
        commentsUrlValue = value
      }

    private var commitValue: InlineCommitSearchResultItemCommitXdb4a8d53? = null

    public var commit: InlineCommitSearchResultItemCommitXdb4a8d53
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

    private var parentsValue: List<InlineCommitSearchResultItemParentsItemX3af33651>? = null

    public var parents: List<InlineCommitSearchResultItemParentsItemX3af33651>
      get() = requireNotNull(parentsValue) { "parents is required" }.toList()
      set(`value`) {
        parentsValue = value.toList()
      }

    private var repositoryValue: MinimalRepository? = null

    public var repository: MinimalRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var scoreValue: Double? = null

    public var score: Double
      get() = requireNotNull(scoreValue) { "score is required" }
      set(`value`) {
        scoreValue = value
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

    private var authorState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var author: NullableSimpleUser?
      get() = authorState.valueOrNull()
      set(`value`) {
        authorState = value.toNullableFieldState()
      }

    private var committerState: FieldState<NullableGitUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var committer: NullableGitUser?
      get() = committerState.valueOrNull()
      set(`value`) {
        committerState = value.toNullableFieldState()
      }

    private var textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var textMatches: List<InlineSearchResultTextMatchesItemXe380e62a>?
      get() = textMatchesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "textMatches is not nullable; call unsetTextMatches() to omit it" }
        textMatchesState = FieldState.Value(present.toList())
      }

    /**
     * Omits `text_matches` from serialized output.
     */
    public fun unsetTextMatches() {
      textMatchesState = FieldState.Absent
    }

    public fun build(): CommitSearchResultItem {
      check(commentsUrlValue != null) { "commentsUrl is required" }
      check(commitValue != null) { "commit is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(parentsValue != null) { "parents is required" }
      check(repositoryValue != null) { "repository is required" }
      check(scoreValue != null) { "score is required" }
      check(shaValue != null) { "sha is required" }
      check(urlValue != null) { "url is required" }
      check(authorState !== FieldState.Absent) { "author is required, even when null" }
      check(committerState !== FieldState.Absent) { "committer is required, even when null" }
      return CommitSearchResultItem(
        author = authorState.valueOrNull(),
        commentsUrl = commentsUrl,
        commit = commit,
        committer = committerState.valueOrNull(),
        htmlUrl = htmlUrl,
        nodeId = nodeId,
        parents = parents,
        repository = repository,
        score = score,
        sha = sha,
        url = url,
        textMatchesState = textMatchesState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CommitSearchResultItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CommitSearchResultItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CommitSearchResultItem {
      val jsonDecoder = decoder.requireJsonDecoder("CommitSearchResultItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CommitSearchResultItem must be a JSON object")
      val commentsUrl = json.decodeRequired<String>(rawObject, "comments_url")
      val commit = json.decodeRequired<InlineCommitSearchResultItemCommitXdb4a8d53>(rawObject, "commit")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val parents = json.decodeRequired<List<InlineCommitSearchResultItemParentsItemX3af33651>>(rawObject, "parents")
      val repository = json.decodeRequired<MinimalRepository>(rawObject, "repository")
      val score = json.decodeRequired<Double>(rawObject, "score")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("author")) {
        throw SerializationException("CommitSearchResultItem is missing required property 'author'")
      }
      val author = rawObject["author"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      if (!rawObject.containsKey("committer")) {
        throw SerializationException("CommitSearchResultItem is missing required property 'committer'")
      }
      val committer = rawObject["committer"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableGitUser?>(requireNotNull(element)) }
      return CommitSearchResultItem(
        author = author,
        commentsUrl = commentsUrl,
        commit = commit,
        committer = committer,
        htmlUrl = htmlUrl,
        nodeId = nodeId,
        parents = parents,
        repository = repository,
        score = score,
        sha = sha,
        url = url,
        textMatchesState = json.decodeOptional(rawObject, "text_matches", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CommitSearchResultItem) {
      val jsonEncoder = encoder.requireJsonEncoder("CommitSearchResultItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", value.author?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("comments_url", value.commentsUrl)
        put("commit", json.encodeToJsonElement(value.commit))
        put("committer", value.committer?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("node_id", value.nodeId)
        put("parents", json.encodeToJsonElement(value.parents))
        put("repository", json.encodeToJsonElement(value.repository))
        put("score", json.encodeToJsonElement(value.score))
        put("sha", value.sha)
        put("url", value.url)
        putState("text_matches", value.textMatchesState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun commitSearchResultItem(block: CommitSearchResultItem.Builder.() -> Unit): CommitSearchResultItem = CommitSearchResultItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CommitSearchResultItem is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("CommitSearchResultItem property '" + name + "' is not nullable")
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
