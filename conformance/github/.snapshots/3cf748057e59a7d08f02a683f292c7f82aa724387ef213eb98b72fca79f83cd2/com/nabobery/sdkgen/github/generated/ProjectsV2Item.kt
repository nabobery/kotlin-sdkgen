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
 * An item belonging to a project
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-item
 */
@Serializable(with = ProjectsV2Item.Serializer::class)
public class ProjectsV2Item internal constructor(
  /**
   * The time when the item was archived.
   */
  public val archivedAt: String?,
  /**
   * The node ID of the content represented by this item.
   */
  public val contentNodeId: String,
  public val contentType: ProjectsV2ItemContentType,
  /**
   * The time when the item was created.
   */
  public val createdAt: String,
  /**
   * The unique identifier of the project item.
   */
  public val id: Double,
  /**
   * The time when the item was last updated.
   */
  public val updatedAt: String,
  private val creatorState: FieldState<SimpleUser>,
  private val nodeIdState: FieldState<String>,
  private val projectNodeIdState: FieldState<String>,
) {
  public val creator: SimpleUser?
    get() = creatorState.valueOrNull()

  /**
   * The node ID of the project item.
   */
  public val nodeId: String?
    get() = nodeIdState.valueOrNull()

  /**
   * The node ID of the project that contains this item.
   */
  public val projectNodeId: String?
    get() = projectNodeIdState.valueOrNull()

  public constructor(
    archivedAt: String?,
    contentNodeId: String,
    contentType: ProjectsV2ItemContentType,
    createdAt: String,
    id: Double,
    updatedAt: String,
  ) : this(archivedAt = archivedAt,
  contentNodeId = contentNodeId,
  contentType = contentType,
  createdAt = createdAt,
  id = id,
  updatedAt = updatedAt,
  creatorState = FieldState.Absent,
  nodeIdState = FieldState.Absent,
  projectNodeIdState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `creator`.
   */
  public fun creatorPresence(): FieldPresence = creatorState.presence

  /**
   * Returns the wire presence of `node_id`.
   */
  public fun nodeIdPresence(): FieldPresence = nodeIdState.presence

  /**
   * Returns the wire presence of `project_node_id`.
   */
  public fun projectNodeIdPresence(): FieldPresence = projectNodeIdState.presence

  public class Builder {
    private var contentNodeIdValue: String? = null

    public var contentNodeId: String
      get() = requireNotNull(contentNodeIdValue) { "contentNodeId is required" }
      set(`value`) {
        contentNodeIdValue = value
      }

    private var contentTypeValue: ProjectsV2ItemContentType? = null

    public var contentType: ProjectsV2ItemContentType
      get() = requireNotNull(contentTypeValue) { "contentType is required" }
      set(`value`) {
        contentTypeValue = value
      }

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

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var archivedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The time when the item was archived.
     * Required nullable field; assigning `null` records present-null.
     */
    public var archivedAt: String?
      get() = archivedAtState.valueOrNull()
      set(`value`) {
        archivedAtState = value.toNullableFieldState()
      }

    private var creatorState: FieldState<SimpleUser> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var creator: SimpleUser?
      get() = creatorState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "creator is not nullable; call unsetCreator() to omit it" }
        creatorState = FieldState.Value(present)
      }

    private var nodeIdState: FieldState<String> = FieldState.Absent

    /**
     * The node ID of the project item.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var nodeId: String?
      get() = nodeIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "nodeId is not nullable; call unsetNodeId() to omit it" }
        nodeIdState = FieldState.Value(present)
      }

    private var projectNodeIdState: FieldState<String> = FieldState.Absent

    /**
     * The node ID of the project that contains this item.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var projectNodeId: String?
      get() = projectNodeIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "projectNodeId is not nullable; call unsetProjectNodeId() to omit it" }
        projectNodeIdState = FieldState.Value(present)
      }

    /**
     * Omits `creator` from serialized output.
     */
    public fun unsetCreator() {
      creatorState = FieldState.Absent
    }

    /**
     * Omits `node_id` from serialized output.
     */
    public fun unsetNodeId() {
      nodeIdState = FieldState.Absent
    }

    /**
     * Omits `project_node_id` from serialized output.
     */
    public fun unsetProjectNodeId() {
      projectNodeIdState = FieldState.Absent
    }

    public fun build(): ProjectsV2Item {
      check(contentNodeIdValue != null) { "contentNodeId is required" }
      check(contentTypeValue != null) { "contentType is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(archivedAtState !== FieldState.Absent) { "archivedAt is required, even when null" }
      return ProjectsV2Item(
        archivedAt = archivedAtState.valueOrNull(),
        contentNodeId = contentNodeId,
        contentType = contentType,
        createdAt = createdAt,
        id = id,
        updatedAt = updatedAt,
        creatorState = creatorState,
        nodeIdState = nodeIdState,
        projectNodeIdState = projectNodeIdState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProjectsV2Item = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ProjectsV2Item> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProjectsV2Item {
      val jsonDecoder = decoder.requireJsonDecoder("ProjectsV2Item")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProjectsV2Item must be a JSON object")
      val contentNodeId = json.decodeRequired<String>(rawObject, "content_node_id")
      val contentType = json.decodeRequired<ProjectsV2ItemContentType>(rawObject, "content_type")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Double>(rawObject, "id")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("archived_at")) {
        throw SerializationException("ProjectsV2Item is missing required property 'archived_at'")
      }
      val archivedAt = rawObject["archived_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return ProjectsV2Item(
        archivedAt = archivedAt,
        contentNodeId = contentNodeId,
        contentType = contentType,
        createdAt = createdAt,
        id = id,
        updatedAt = updatedAt,
        creatorState = json.decodeOptional(rawObject, "creator", nullable = false),
        nodeIdState = json.decodeOptional(rawObject, "node_id", nullable = false),
        projectNodeIdState = json.decodeOptional(rawObject, "project_node_id", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProjectsV2Item) {
      val jsonEncoder = encoder.requireJsonEncoder("ProjectsV2Item")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("archived_at", value.archivedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("content_node_id", value.contentNodeId)
        put("content_type", json.encodeToJsonElement(value.contentType))
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("updated_at", value.updatedAt)
        putState("creator", value.creatorState, json::encodeToJsonElement)
        putState("node_id", value.nodeIdState, json::encodeToJsonElement)
        putState("project_node_id", value.projectNodeIdState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun projectsV2Item(block: ProjectsV2Item.Builder.() -> Unit): ProjectsV2Item = ProjectsV2Item.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProjectsV2Item is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ProjectsV2Item property '" + name + "' is not nullable")
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
