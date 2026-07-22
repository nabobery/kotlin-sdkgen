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
 * An item belonging to a project
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-item-with-content
 */
@Serializable(with = ProjectsV2ItemWithContent.Serializer::class)
public class ProjectsV2ItemWithContent internal constructor(
  /**
   * The time when the item was archived.
   */
  public val archivedAt: String?,
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
  private val contentState: FieldState<JsonObject?>,
  private val creatorState: FieldState<SimpleUser>,
  private val fieldsState: FieldState<List<JsonObject>>,
  private val itemUrlState: FieldState<String?>,
  private val nodeIdState: FieldState<String>,
  private val projectUrlState: FieldState<String>,
) {
  /**
   * The content of the item, which varies by content type.
   */
  public val content: JsonObject?
    get() = contentState.valueOrNull()

  public val creator: SimpleUser?
    get() = creatorState.valueOrNull()

  /**
   * The fields and values associated with this item.
   */
  public val fields: List<JsonObject>?
    get() = fieldsState.valueOrNull()

  /**
   * The API URL of this item.
   */
  public val itemUrl: String?
    get() = itemUrlState.valueOrNull()

  /**
   * The node ID of the project item.
   */
  public val nodeId: String?
    get() = nodeIdState.valueOrNull()

  /**
   * The API URL of the project that contains this item.
   */
  public val projectUrl: String?
    get() = projectUrlState.valueOrNull()

  public constructor(
    archivedAt: String?,
    contentType: ProjectsV2ItemContentType,
    createdAt: String,
    id: Double,
    updatedAt: String,
  ) : this(archivedAt = archivedAt,
  contentType = contentType,
  createdAt = createdAt,
  id = id,
  updatedAt = updatedAt,
  contentState = FieldState.Absent,
  creatorState = FieldState.Absent,
  fieldsState = FieldState.Absent,
  itemUrlState = FieldState.Absent,
  nodeIdState = FieldState.Absent,
  projectUrlState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `content`.
   */
  public fun contentPresence(): FieldPresence = contentState.presence

  /**
   * Returns the wire presence of `creator`.
   */
  public fun creatorPresence(): FieldPresence = creatorState.presence

  /**
   * Returns the wire presence of `fields`.
   */
  public fun fieldsPresence(): FieldPresence = fieldsState.presence

  /**
   * Returns the wire presence of `item_url`.
   */
  public fun itemUrlPresence(): FieldPresence = itemUrlState.presence

  /**
   * Returns the wire presence of `node_id`.
   */
  public fun nodeIdPresence(): FieldPresence = nodeIdState.presence

  /**
   * Returns the wire presence of `project_url`.
   */
  public fun projectUrlPresence(): FieldPresence = projectUrlState.presence

  public class Builder {
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

    private var contentState: FieldState<JsonObject?> = FieldState.Absent

    /**
     * The content of the item, which varies by content type.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var content: JsonObject?
      get() = contentState.valueOrNull()
      set(`value`) {
        contentState = value.toNullableFieldState()
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

    private var fieldsState: FieldState<List<JsonObject>> = FieldState.Absent

    /**
     * The fields and values associated with this item.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var fields: List<JsonObject>?
      get() = fieldsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "fields is not nullable; call unsetFields() to omit it" }
        fieldsState = FieldState.Value(present)
      }

    private var itemUrlState: FieldState<String?> = FieldState.Absent

    /**
     * The API URL of this item.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var itemUrl: String?
      get() = itemUrlState.valueOrNull()
      set(`value`) {
        itemUrlState = value.toNullableFieldState()
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

    private var projectUrlState: FieldState<String> = FieldState.Absent

    /**
     * The API URL of the project that contains this item.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var projectUrl: String?
      get() = projectUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "projectUrl is not nullable; call unsetProjectUrl() to omit it" }
        projectUrlState = FieldState.Value(present)
      }

    /**
     * Omits `content` from serialized output.
     */
    public fun unsetContent() {
      contentState = FieldState.Absent
    }

    /**
     * Omits `creator` from serialized output.
     */
    public fun unsetCreator() {
      creatorState = FieldState.Absent
    }

    /**
     * Omits `fields` from serialized output.
     */
    public fun unsetFields() {
      fieldsState = FieldState.Absent
    }

    /**
     * Omits `item_url` from serialized output.
     */
    public fun unsetItemUrl() {
      itemUrlState = FieldState.Absent
    }

    /**
     * Omits `node_id` from serialized output.
     */
    public fun unsetNodeId() {
      nodeIdState = FieldState.Absent
    }

    /**
     * Omits `project_url` from serialized output.
     */
    public fun unsetProjectUrl() {
      projectUrlState = FieldState.Absent
    }

    public fun build(): ProjectsV2ItemWithContent {
      check(contentTypeValue != null) { "contentType is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(archivedAtState !== FieldState.Absent) { "archivedAt is required, even when null" }
      return ProjectsV2ItemWithContent(
        archivedAt = archivedAtState.valueOrNull(),
        contentType = contentType,
        createdAt = createdAt,
        id = id,
        updatedAt = updatedAt,
        contentState = contentState,
        creatorState = creatorState,
        fieldsState = fieldsState,
        itemUrlState = itemUrlState,
        nodeIdState = nodeIdState,
        projectUrlState = projectUrlState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProjectsV2ItemWithContent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ProjectsV2ItemWithContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProjectsV2ItemWithContent {
      val jsonDecoder = decoder.requireJsonDecoder("ProjectsV2ItemWithContent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProjectsV2ItemWithContent must be a JSON object")
      val contentType = json.decodeRequired<ProjectsV2ItemContentType>(rawObject, "content_type")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Double>(rawObject, "id")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("archived_at")) {
        throw SerializationException("ProjectsV2ItemWithContent is missing required property 'archived_at'")
      }
      val archivedAt = rawObject["archived_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return ProjectsV2ItemWithContent(
        archivedAt = archivedAt,
        contentType = contentType,
        createdAt = createdAt,
        id = id,
        updatedAt = updatedAt,
        contentState = json.decodeOptional(rawObject, "content", nullable = true),
        creatorState = json.decodeOptional(rawObject, "creator", nullable = false),
        fieldsState = json.decodeOptional(rawObject, "fields", nullable = false),
        itemUrlState = json.decodeOptional(rawObject, "item_url", nullable = true),
        nodeIdState = json.decodeOptional(rawObject, "node_id", nullable = false),
        projectUrlState = json.decodeOptional(rawObject, "project_url", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProjectsV2ItemWithContent) {
      val jsonEncoder = encoder.requireJsonEncoder("ProjectsV2ItemWithContent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("archived_at", value.archivedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("content_type", json.encodeToJsonElement(value.contentType))
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("updated_at", value.updatedAt)
        putState("content", value.contentState, json::encodeToJsonElement)
        putState("creator", value.creatorState, json::encodeToJsonElement)
        putState("fields", value.fieldsState, json::encodeToJsonElement)
        putState("item_url", value.itemUrlState, json::encodeToJsonElement)
        putState("node_id", value.nodeIdState, json::encodeToJsonElement)
        putState("project_url", value.projectUrlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun projectsV2ItemWithContent(block: ProjectsV2ItemWithContent.Builder.() -> Unit): ProjectsV2ItemWithContent = ProjectsV2ItemWithContent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProjectsV2ItemWithContent is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ProjectsV2ItemWithContent property '" + name + "' is not nullable")
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
