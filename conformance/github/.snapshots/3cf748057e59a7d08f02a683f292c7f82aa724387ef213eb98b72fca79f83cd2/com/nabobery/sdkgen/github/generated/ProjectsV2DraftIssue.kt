package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
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
 * A draft issue in a project
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-draft-issue
 */
@Serializable(with = ProjectsV2DraftIssue.Serializer::class)
public class ProjectsV2DraftIssue internal constructor(
  /**
   * The time the draft issue was created
   */
  public val createdAt: String,
  /**
   * The ID of the draft issue
   */
  public val id: Double,
  /**
   * The node ID of the draft issue
   */
  public val nodeId: String,
  /**
   * The title of the draft issue
   */
  public val title: String,
  /**
   * The time the draft issue was last updated
   */
  public val updatedAt: String,
  public val user: NullableSimpleUser?,
  private val bodyState: FieldState<String?>,
) {
  /**
   * The body content of the draft issue
   */
  public val body: String?
    get() = bodyState.valueOrNull()

  public constructor(
    createdAt: String,
    id: Double,
    nodeId: String,
    title: String,
    updatedAt: String,
    user: NullableSimpleUser?,
  ) : this(createdAt = createdAt,
  id = id,
  nodeId = nodeId,
  title = title,
  updatedAt = updatedAt,
  user = user,
  bodyState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `body`.
   */
  public fun bodyPresence(): FieldPresence = bodyState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: Double? = null

    public var id: Double
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

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
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

    private var bodyState: FieldState<String?> = FieldState.Absent

    /**
     * The body content of the draft issue
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        bodyState = value.toNullableFieldState()
      }

    /**
     * Omits `body` from serialized output.
     */
    public fun unsetBody() {
      bodyState = FieldState.Absent
    }

    public fun build(): ProjectsV2DraftIssue {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(titleValue != null) { "title is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return ProjectsV2DraftIssue(
        createdAt = createdAt,
        id = id,
        nodeId = nodeId,
        title = title,
        updatedAt = updatedAt,
        user = userState.valueOrNull(),
        bodyState = bodyState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProjectsV2DraftIssue = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ProjectsV2DraftIssue> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProjectsV2DraftIssue {
      val jsonDecoder = decoder.requireJsonDecoder("ProjectsV2DraftIssue")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProjectsV2DraftIssue must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Double>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val title = json.decodeRequired<String>(rawObject, "title")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("user")) {
        throw SerializationException("ProjectsV2DraftIssue is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return ProjectsV2DraftIssue(
        createdAt = createdAt,
        id = id,
        nodeId = nodeId,
        title = title,
        updatedAt = updatedAt,
        user = user,
        bodyState = json.decodeOptional(rawObject, "body", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProjectsV2DraftIssue) {
      val jsonEncoder = encoder.requireJsonEncoder("ProjectsV2DraftIssue")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("title", value.title)
        put("updated_at", value.updatedAt)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("body", value.bodyState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun projectsV2DraftIssue(block: ProjectsV2DraftIssue.Builder.() -> Unit): ProjectsV2DraftIssue = ProjectsV2DraftIssue.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProjectsV2DraftIssue is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ProjectsV2DraftIssue property '" + name + "' is not nullable")
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
