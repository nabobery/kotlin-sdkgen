package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
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
 * A projects v2 project
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2
 */
@Serializable(with = ProjectsV2.Serializer::class)
public class ProjectsV2 internal constructor(
  /**
   * The time when the project was closed.
   */
  public val closedAt: String?,
  /**
   * The time when the project was created.
   */
  public val createdAt: String,
  public val creator: SimpleUser,
  /**
   * The time when the project was deleted.
   */
  public val deletedAt: String?,
  public val deletedBy: NullableSimpleUser?,
  /**
   * A short description of the project.
   */
  public val description: String?,
  /**
   * The unique identifier of the project.
   */
  public val id: Double,
  /**
   * The node ID of the project.
   */
  public val nodeId: String,
  /**
   * The project number.
   */
  public val number: Int,
  public val owner: SimpleUser,
  /**
   * Whether the project is visible to anyone with access to the owner.
   */
  public val `public`: Boolean,
  /**
   * A concise summary of the project.
   */
  public val shortDescription: String?,
  /**
   * The project title.
   */
  public val title: String,
  /**
   * The time when the project was last updated.
   */
  public val updatedAt: String,
  private val isTemplateState: FieldState<Boolean>,
  private val latestStatusUpdateState: FieldState<NullableProjectsV2StatusUpdate?>,
  private val stateState: FieldState<InlineProjectsV2StateX9b68f4bd>,
) {
  /**
   * Whether this project is a template
   */
  public val isTemplate: Boolean?
    get() = isTemplateState.valueOrNull()

  public val latestStatusUpdate: NullableProjectsV2StatusUpdate?
    get() = latestStatusUpdateState.valueOrNull()

  /**
   * The current state of the project.
   */
  public val state: InlineProjectsV2StateX9b68f4bd?
    get() = stateState.valueOrNull()

  public constructor(
    closedAt: String?,
    createdAt: String,
    creator: SimpleUser,
    deletedAt: String?,
    deletedBy: NullableSimpleUser?,
    description: String?,
    id: Double,
    nodeId: String,
    number: Int,
    owner: SimpleUser,
    `public`: Boolean,
    shortDescription: String?,
    title: String,
    updatedAt: String,
  ) : this(closedAt = closedAt,
  createdAt = createdAt,
  creator = creator,
  deletedAt = deletedAt,
  deletedBy = deletedBy,
  description = description,
  id = id,
  nodeId = nodeId,
  number = number,
  owner = owner,
  public = public,
  shortDescription = shortDescription,
  title = title,
  updatedAt = updatedAt,
  isTemplateState = FieldState.Absent,
  latestStatusUpdateState = FieldState.Absent,
  stateState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `is_template`.
   */
  public fun isTemplatePresence(): FieldPresence = isTemplateState.presence

  /**
   * Returns the wire presence of `latest_status_update`.
   */
  public fun latestStatusUpdatePresence(): FieldPresence = latestStatusUpdateState.presence

  /**
   * Returns the wire presence of `state`.
   */
  public fun statePresence(): FieldPresence = stateState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var creatorValue: SimpleUser? = null

    public var creator: SimpleUser
      get() = requireNotNull(creatorValue) { "creator is required" }
      set(`value`) {
        creatorValue = value
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

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var ownerValue: SimpleUser? = null

    public var owner: SimpleUser
      get() = requireNotNull(ownerValue) { "owner is required" }
      set(`value`) {
        ownerValue = value
      }

    private var publicValue: Boolean? = null

    public var `public`: Boolean
      get() = requireNotNull(publicValue) { "public is required" }
      set(`value`) {
        publicValue = value
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

    private var closedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The time when the project was closed.
     * Required nullable field; assigning `null` records present-null.
     */
    public var closedAt: String?
      get() = closedAtState.valueOrNull()
      set(`value`) {
        closedAtState = value.toNullableFieldState()
      }

    private var deletedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The time when the project was deleted.
     * Required nullable field; assigning `null` records present-null.
     */
    public var deletedAt: String?
      get() = deletedAtState.valueOrNull()
      set(`value`) {
        deletedAtState = value.toNullableFieldState()
      }

    private var deletedByState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var deletedBy: NullableSimpleUser?
      get() = deletedByState.valueOrNull()
      set(`value`) {
        deletedByState = value.toNullableFieldState()
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * A short description of the project.
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var shortDescriptionState: FieldState<String?> = FieldState.Absent

    /**
     * A concise summary of the project.
     * Required nullable field; assigning `null` records present-null.
     */
    public var shortDescription: String?
      get() = shortDescriptionState.valueOrNull()
      set(`value`) {
        shortDescriptionState = value.toNullableFieldState()
      }

    private var isTemplateState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether this project is a template
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var isTemplate: Boolean?
      get() = isTemplateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "isTemplate is not nullable; call unsetIsTemplate() to omit it" }
        isTemplateState = FieldState.Value(present)
      }

    private var latestStatusUpdateState: FieldState<NullableProjectsV2StatusUpdate?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var latestStatusUpdate: NullableProjectsV2StatusUpdate?
      get() = latestStatusUpdateState.valueOrNull()
      set(`value`) {
        latestStatusUpdateState = value.toNullableFieldState()
      }

    private var stateState: FieldState<InlineProjectsV2StateX9b68f4bd> = FieldState.Absent

    /**
     * The current state of the project.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var state: InlineProjectsV2StateX9b68f4bd?
      get() = stateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "state is not nullable; call unsetState() to omit it" }
        stateState = FieldState.Value(present)
      }

    /**
     * Omits `is_template` from serialized output.
     */
    public fun unsetIsTemplate() {
      isTemplateState = FieldState.Absent
    }

    /**
     * Omits `latest_status_update` from serialized output.
     */
    public fun unsetLatestStatusUpdate() {
      latestStatusUpdateState = FieldState.Absent
    }

    /**
     * Omits `state` from serialized output.
     */
    public fun unsetState() {
      stateState = FieldState.Absent
    }

    public fun build(): ProjectsV2 {
      check(createdAtValue != null) { "createdAt is required" }
      check(creatorValue != null) { "creator is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(numberValue != null) { "number is required" }
      check(ownerValue != null) { "owner is required" }
      check(publicValue != null) { "public is required" }
      check(titleValue != null) { "title is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(closedAtState !== FieldState.Absent) { "closedAt is required, even when null" }
      check(deletedAtState !== FieldState.Absent) { "deletedAt is required, even when null" }
      check(deletedByState !== FieldState.Absent) { "deletedBy is required, even when null" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(shortDescriptionState !== FieldState.Absent) { "shortDescription is required, even when null" }
      return ProjectsV2(
        closedAt = closedAtState.valueOrNull(),
        createdAt = createdAt,
        creator = creator,
        deletedAt = deletedAtState.valueOrNull(),
        deletedBy = deletedByState.valueOrNull(),
        description = descriptionState.valueOrNull(),
        id = id,
        nodeId = nodeId,
        number = number,
        owner = owner,
        public = public,
        shortDescription = shortDescriptionState.valueOrNull(),
        title = title,
        updatedAt = updatedAt,
        isTemplateState = isTemplateState,
        latestStatusUpdateState = latestStatusUpdateState,
        stateState = stateState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProjectsV2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ProjectsV2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProjectsV2 {
      val jsonDecoder = decoder.requireJsonDecoder("ProjectsV2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProjectsV2 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val creator = json.decodeRequired<SimpleUser>(rawObject, "creator")
      val id = json.decodeRequired<Double>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val owner = json.decodeRequired<SimpleUser>(rawObject, "owner")
      val public = json.decodeRequired<Boolean>(rawObject, "public")
      val title = json.decodeRequired<String>(rawObject, "title")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("closed_at")) {
        throw SerializationException("ProjectsV2 is missing required property 'closed_at'")
      }
      val closedAt = rawObject["closed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("deleted_at")) {
        throw SerializationException("ProjectsV2 is missing required property 'deleted_at'")
      }
      val deletedAt = rawObject["deleted_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("deleted_by")) {
        throw SerializationException("ProjectsV2 is missing required property 'deleted_by'")
      }
      val deletedBy = rawObject["deleted_by"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      if (!rawObject.containsKey("description")) {
        throw SerializationException("ProjectsV2 is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("short_description")) {
        throw SerializationException("ProjectsV2 is missing required property 'short_description'")
      }
      val shortDescription = rawObject["short_description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return ProjectsV2(
        closedAt = closedAt,
        createdAt = createdAt,
        creator = creator,
        deletedAt = deletedAt,
        deletedBy = deletedBy,
        description = description,
        id = id,
        nodeId = nodeId,
        number = number,
        owner = owner,
        public = public,
        shortDescription = shortDescription,
        title = title,
        updatedAt = updatedAt,
        isTemplateState = json.decodeOptional(rawObject, "is_template", nullable = false),
        latestStatusUpdateState = json.decodeOptional(rawObject, "latest_status_update", nullable = true),
        stateState = json.decodeOptional(rawObject, "state", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProjectsV2) {
      val jsonEncoder = encoder.requireJsonEncoder("ProjectsV2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("closed_at", value.closedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("creator", json.encodeToJsonElement(value.creator))
        put("deleted_at", value.deletedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("deleted_by", value.deletedBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("number", json.encodeToJsonElement(value.number))
        put("owner", json.encodeToJsonElement(value.owner))
        put("public", json.encodeToJsonElement(value.public))
        put("short_description", value.shortDescription?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("title", value.title)
        put("updated_at", value.updatedAt)
        putState("is_template", value.isTemplateState, json::encodeToJsonElement)
        putState("latest_status_update", value.latestStatusUpdateState, json::encodeToJsonElement)
        putState("state", value.stateState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun projectsV2(block: ProjectsV2.Builder.() -> Unit): ProjectsV2 = ProjectsV2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProjectsV2 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ProjectsV2 property '" + name + "' is not nullable")
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
