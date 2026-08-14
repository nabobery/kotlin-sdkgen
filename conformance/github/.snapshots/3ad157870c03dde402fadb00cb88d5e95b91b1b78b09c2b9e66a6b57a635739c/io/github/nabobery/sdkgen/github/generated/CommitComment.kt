package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Commit Comment
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit-comment
 */
@Serializable(with = CommitComment.Serializer::class)
public class CommitComment internal constructor(
  public val authorAssociation: AuthorAssociation,
  public val body: String,
  public val commitId: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  public val line: Int?,
  public val nodeId: String,
  public val path: String?,
  public val position: Int?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val user: NullableSimpleUser?,
  private val reactionsState: FieldState<ReactionRollup>,
) {
  public val reactions: ReactionRollup?
    get() = reactionsState.valueOrNull()

  public constructor(
    authorAssociation: AuthorAssociation,
    body: String,
    commitId: String,
    createdAt: String,
    htmlUrl: String,
    id: Int,
    line: Int?,
    nodeId: String,
    path: String?,
    position: Int?,
    updatedAt: String,
    url: String,
    user: NullableSimpleUser?,
  ) : this(authorAssociation = authorAssociation,
  body = body,
  commitId = commitId,
  createdAt = createdAt,
  htmlUrl = htmlUrl,
  id = id,
  line = line,
  nodeId = nodeId,
  path = path,
  position = position,
  updatedAt = updatedAt,
  url = url,
  user = user,
  reactionsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `reactions`.
   */
  public fun reactionsPresence(): FieldPresence = reactionsState.presence

  public class Builder {
    private var authorAssociationValue: AuthorAssociation? = null

    public var authorAssociation: AuthorAssociation
      get() = requireNotNull(authorAssociationValue) { "authorAssociation is required" }
      set(`value`) {
        authorAssociationValue = value
      }

    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    private var commitIdValue: String? = null

    public var commitId: String
      get() = requireNotNull(commitIdValue) { "commitId is required" }
      set(`value`) {
        commitIdValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
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

    private var lineState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var line: Int?
      get() = lineState.valueOrNull()
      set(`value`) {
        lineState = value.toNullableFieldState()
      }

    private var pathState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var path: String?
      get() = pathState.valueOrNull()
      set(`value`) {
        pathState = value.toNullableFieldState()
      }

    private var positionState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var position: Int?
      get() = positionState.valueOrNull()
      set(`value`) {
        positionState = value.toNullableFieldState()
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

    private var reactionsState: FieldState<ReactionRollup> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var reactions: ReactionRollup?
      get() = reactionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "reactions is not nullable; call unsetReactions() to omit it" }
        reactionsState = FieldState.Value(present)
      }

    /**
     * Omits `reactions` from serialized output.
     */
    public fun unsetReactions() {
      reactionsState = FieldState.Absent
    }

    public fun build(): CommitComment {
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(bodyValue != null) { "body is required" }
      check(commitIdValue != null) { "commitId is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(lineState !== FieldState.Absent) { "line is required, even when null" }
      check(pathState !== FieldState.Absent) { "path is required, even when null" }
      check(positionState !== FieldState.Absent) { "position is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return CommitComment(
        authorAssociation = authorAssociation,
        body = body,
        commitId = commitId,
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        line = lineState.valueOrNull(),
        nodeId = nodeId,
        path = pathState.valueOrNull(),
        position = positionState.valueOrNull(),
        updatedAt = updatedAt,
        url = url,
        user = userState.valueOrNull(),
        reactionsState = reactionsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CommitComment = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CommitComment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CommitComment {
      val jsonDecoder = decoder.requireJsonDecoder("CommitComment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CommitComment must be a JSON object")
      val authorAssociation = json.decodeRequired<AuthorAssociation>(rawObject, "author_association")
      val body = json.decodeRequired<String>(rawObject, "body")
      val commitId = json.decodeRequired<String>(rawObject, "commit_id")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("line")) {
        throw SerializationException("CommitComment is missing required property 'line'")
      }
      val line = rawObject["line"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("path")) {
        throw SerializationException("CommitComment is missing required property 'path'")
      }
      val path = rawObject["path"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("position")) {
        throw SerializationException("CommitComment is missing required property 'position'")
      }
      val position = rawObject["position"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("CommitComment is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return CommitComment(
        authorAssociation = authorAssociation,
        body = body,
        commitId = commitId,
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        line = line,
        nodeId = nodeId,
        path = path,
        position = position,
        updatedAt = updatedAt,
        url = url,
        user = user,
        reactionsState = json.decodeOptional(rawObject, "reactions", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CommitComment) {
      val jsonEncoder = encoder.requireJsonEncoder("CommitComment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
        put("body", value.body)
        put("commit_id", value.commitId)
        put("created_at", value.createdAt)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("line", value.line?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
        put("path", value.path?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("position", value.position?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("reactions", value.reactionsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun commitComment(block: CommitComment.Builder.() -> Unit): CommitComment = CommitComment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CommitComment is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("CommitComment property '" + name + "' is not nullable")
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
