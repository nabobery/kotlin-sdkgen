package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * Base Gist
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/base-gist
 */
@Serializable(with = BaseGist.Serializer::class)
public class BaseGist internal constructor(
  public val comments: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val commentsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val commitsUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val description: String?,
  files: Map<String, InlineBaseGistFilesAdditionalValueX33b45b98>,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val forksUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val gitPullUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val gitPushUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: String,
  public val nodeId: String,
  public val `public`: Boolean,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val user: NullableSimpleUser?,
  private val commentsEnabledState: FieldState<Boolean>,
  forksState: FieldState<List<JsonElement>>,
  historyState: FieldState<List<JsonElement>>,
  private val ownerState: FieldState<SimpleUser>,
  private val truncatedState: FieldState<Boolean>,
) {
  public val files: Map<String, InlineBaseGistFilesAdditionalValueX33b45b98> = files.toMap()

  private val forksState: FieldState<List<JsonElement>> =
      forksState.copyValue { fieldValue -> fieldValue.toList() }

  private val historyState: FieldState<List<JsonElement>> =
      historyState.copyValue { fieldValue -> fieldValue.toList() }

  public val commentsEnabled: Boolean?
    get() = commentsEnabledState.valueOrNull()

  public val forks: List<JsonElement>?
    get() = forksState.valueOrNull()

  public val history: List<JsonElement>?
    get() = historyState.valueOrNull()

  public val owner: SimpleUser?
    get() = ownerState.valueOrNull()

  public val truncated: Boolean?
    get() = truncatedState.valueOrNull()

  public constructor(
    comments: Int,
    commentsUrl: String,
    commitsUrl: String,
    createdAt: String,
    description: String?,
    files: Map<String, InlineBaseGistFilesAdditionalValueX33b45b98>,
    forksUrl: String,
    gitPullUrl: String,
    gitPushUrl: String,
    htmlUrl: String,
    id: String,
    nodeId: String,
    `public`: Boolean,
    updatedAt: String,
    url: String,
    user: NullableSimpleUser?,
  ) : this(comments = comments,
  commentsUrl = commentsUrl,
  commitsUrl = commitsUrl,
  createdAt = createdAt,
  description = description,
  files = files,
  forksUrl = forksUrl,
  gitPullUrl = gitPullUrl,
  gitPushUrl = gitPushUrl,
  htmlUrl = htmlUrl,
  id = id,
  nodeId = nodeId,
  public = public,
  updatedAt = updatedAt,
  url = url,
  user = user,
  commentsEnabledState = FieldState.Absent,
  forksState = FieldState.Absent,
  historyState = FieldState.Absent,
  ownerState = FieldState.Absent,
  truncatedState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `comments_enabled`.
   */
  public fun commentsEnabledPresence(): FieldPresence = commentsEnabledState.presence

  /**
   * Returns the wire presence of `forks`.
   */
  public fun forksPresence(): FieldPresence = forksState.presence

  /**
   * Returns the wire presence of `history`.
   */
  public fun historyPresence(): FieldPresence = historyState.presence

  /**
   * Returns the wire presence of `owner`.
   */
  public fun ownerPresence(): FieldPresence = ownerState.presence

  /**
   * Returns the wire presence of `truncated`.
   */
  public fun truncatedPresence(): FieldPresence = truncatedState.presence

  public class Builder {
    private var commentsValue: Int? = null

    public var comments: Int
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commentsUrlValue: String? = null

    public var commentsUrl: String
      get() = requireNotNull(commentsUrlValue) { "commentsUrl is required" }
      set(`value`) {
        commentsUrlValue = value
      }

    private var commitsUrlValue: String? = null

    public var commitsUrl: String
      get() = requireNotNull(commitsUrlValue) { "commitsUrl is required" }
      set(`value`) {
        commitsUrlValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var filesValue: Map<String, InlineBaseGistFilesAdditionalValueX33b45b98>? = null

    public var files: Map<String, InlineBaseGistFilesAdditionalValueX33b45b98>
      get() = requireNotNull(filesValue) { "files is required" }.toMap()
      set(`value`) {
        filesValue = value.toMap()
      }

    private var forksUrlValue: String? = null

    public var forksUrl: String
      get() = requireNotNull(forksUrlValue) { "forksUrl is required" }
      set(`value`) {
        forksUrlValue = value
      }

    private var gitPullUrlValue: String? = null

    public var gitPullUrl: String
      get() = requireNotNull(gitPullUrlValue) { "gitPullUrl is required" }
      set(`value`) {
        gitPullUrlValue = value
      }

    private var gitPushUrlValue: String? = null

    public var gitPushUrl: String
      get() = requireNotNull(gitPushUrlValue) { "gitPushUrl is required" }
      set(`value`) {
        gitPushUrlValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var publicValue: Boolean? = null

    public var `public`: Boolean
      get() = requireNotNull(publicValue) { "public is required" }
      set(`value`) {
        publicValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var userState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: NullableSimpleUser?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    private var commentsEnabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var commentsEnabled: Boolean?
      get() = commentsEnabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "commentsEnabled is not nullable; call unsetCommentsEnabled() to omit it" }
        commentsEnabledState = FieldState.Value(present)
      }

    private var forksState: FieldState<List<JsonElement>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var forks: List<JsonElement>?
      get() = forksState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "forks is not nullable; call unsetForks() to omit it" }
        forksState = FieldState.Value(present.toList())
      }

    private var historyState: FieldState<List<JsonElement>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var history: List<JsonElement>?
      get() = historyState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "history is not nullable; call unsetHistory() to omit it" }
        historyState = FieldState.Value(present.toList())
      }

    private var ownerState: FieldState<SimpleUser> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var owner: SimpleUser?
      get() = ownerState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "owner is not nullable; call unsetOwner() to omit it" }
        ownerState = FieldState.Value(present)
      }

    private var truncatedState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var truncated: Boolean?
      get() = truncatedState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "truncated is not nullable; call unsetTruncated() to omit it" }
        truncatedState = FieldState.Value(present)
      }

    /**
     * Omits `comments_enabled` from serialized output.
     */
    public fun unsetCommentsEnabled() {
      commentsEnabledState = FieldState.Absent
    }

    /**
     * Omits `forks` from serialized output.
     */
    public fun unsetForks() {
      forksState = FieldState.Absent
    }

    /**
     * Omits `history` from serialized output.
     */
    public fun unsetHistory() {
      historyState = FieldState.Absent
    }

    /**
     * Omits `owner` from serialized output.
     */
    public fun unsetOwner() {
      ownerState = FieldState.Absent
    }

    /**
     * Omits `truncated` from serialized output.
     */
    public fun unsetTruncated() {
      truncatedState = FieldState.Absent
    }

    public fun build(): BaseGist {
      check(commentsValue != null) { "comments is required" }
      check(commentsUrlValue != null) { "commentsUrl is required" }
      check(commitsUrlValue != null) { "commitsUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(filesValue != null) { "files is required" }
      check(forksUrlValue != null) { "forksUrl is required" }
      check(gitPullUrlValue != null) { "gitPullUrl is required" }
      check(gitPushUrlValue != null) { "gitPushUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(publicValue != null) { "public is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return BaseGist(
        comments = comments,
        commentsUrl = commentsUrl,
        commitsUrl = commitsUrl,
        createdAt = createdAt,
        description = descriptionState.valueOrNull(),
        files = files,
        forksUrl = forksUrl,
        gitPullUrl = gitPullUrl,
        gitPushUrl = gitPushUrl,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        public = public,
        updatedAt = updatedAt,
        url = url,
        user = userState.valueOrNull(),
        commentsEnabledState = commentsEnabledState,
        forksState = forksState,
        historyState = historyState,
        ownerState = ownerState,
        truncatedState = truncatedState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BaseGist = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BaseGist> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BaseGist {
      val jsonDecoder = decoder.requireJsonDecoder("BaseGist")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BaseGist must be a JSON object")
      val comments = json.decodeRequired<Int>(rawObject, "comments")
      val commentsUrl = json.decodeRequired<String>(rawObject, "comments_url")
      val commitsUrl = json.decodeRequired<String>(rawObject, "commits_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val files = json.decodeRequired<Map<String, InlineBaseGistFilesAdditionalValueX33b45b98>>(rawObject, "files")
      val forksUrl = json.decodeRequired<String>(rawObject, "forks_url")
      val gitPullUrl = json.decodeRequired<String>(rawObject, "git_pull_url")
      val gitPushUrl = json.decodeRequired<String>(rawObject, "git_push_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<String>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val public = json.decodeRequired<Boolean>(rawObject, "public")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("BaseGist is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("BaseGist is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return BaseGist(
        comments = comments,
        commentsUrl = commentsUrl,
        commitsUrl = commitsUrl,
        createdAt = createdAt,
        description = description,
        files = files,
        forksUrl = forksUrl,
        gitPullUrl = gitPullUrl,
        gitPushUrl = gitPushUrl,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        public = public,
        updatedAt = updatedAt,
        url = url,
        user = user,
        commentsEnabledState = json.decodeOptional(rawObject, "comments_enabled", nullable = false),
        forksState = json.decodeOptional(rawObject, "forks", nullable = false),
        historyState = json.decodeOptional(rawObject, "history", nullable = false),
        ownerState = json.decodeOptional(rawObject, "owner", nullable = false),
        truncatedState = json.decodeOptional(rawObject, "truncated", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: BaseGist) {
      val jsonEncoder = encoder.requireJsonEncoder("BaseGist")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("comments", json.encodeToJsonElement(value.comments))
        put("comments_url", value.commentsUrl)
        put("commits_url", value.commitsUrl)
        put("created_at", value.createdAt)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("files", json.encodeToJsonElement(value.files))
        put("forks_url", value.forksUrl)
        put("git_pull_url", value.gitPullUrl)
        put("git_push_url", value.gitPushUrl)
        put("html_url", value.htmlUrl)
        put("id", value.id)
        put("node_id", value.nodeId)
        put("public", json.encodeToJsonElement(value.public))
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("comments_enabled", value.commentsEnabledState, json::encodeToJsonElement)
        putState("forks", value.forksState, json::encodeToJsonElement)
        putState("history", value.historyState, json::encodeToJsonElement)
        putState("owner", value.ownerState, json::encodeToJsonElement)
        putState("truncated", value.truncatedState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun baseGist(block: BaseGist.Builder.() -> Unit): BaseGist = BaseGist.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BaseGist is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("BaseGist property '" + name + "' is not nullable")
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
