package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * An status update belonging to a project
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-status-update
 */
@Serializable(with = ProjectsV2StatusUpdate.Serializer::class)
public class ProjectsV2StatusUpdate(
  /**
   * The time when the status update was created.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The unique identifier of the status update.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val id: Double,
  /**
   * The node ID of the status update.
   */
  public val nodeId: String,
  /**
   * The time when the status update was last updated.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Body of the status update
   */
  public val body: String? = null,
  public val creator: SimpleUser? = null,
  /**
   * The node ID of the project that this status update belongs to.
   */
  public val projectNodeId: String? = null,
  /**
   * The start date of the period covered by the update.
   *
   * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val startDate: String? = null,
  /**
   * The current status.
   */
  public val status: InlineProjectsV2StatusUpdateStatusX4f735874? = null,
  /**
   * The target date associated with the update.
   *
   * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val targetDate: String? = null,
) {
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

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    /**
     * Body of the status update
     */
    public var body: String? = null

    public var creator: SimpleUser? = null

    /**
     * The node ID of the project that this status update belongs to.
     */
    public var projectNodeId: String? = null

    /**
     * The start date of the period covered by the update.
     *
     * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var startDate: String? = null

    /**
     * The current status.
     */
    public var status: InlineProjectsV2StatusUpdateStatusX4f735874? = null

    /**
     * The target date associated with the update.
     *
     * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var targetDate: String? = null

    public fun build(): ProjectsV2StatusUpdate {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      return ProjectsV2StatusUpdate(
        createdAt = createdAt,
        id = id,
        nodeId = nodeId,
        updatedAt = updatedAt,
        body = body,
        creator = creator,
        projectNodeId = projectNodeId,
        startDate = startDate,
        status = status,
        targetDate = targetDate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProjectsV2StatusUpdate = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ProjectsV2StatusUpdate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProjectsV2StatusUpdate {
      val jsonDecoder = decoder.requireJsonDecoder("ProjectsV2StatusUpdate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProjectsV2StatusUpdate must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Double>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      return ProjectsV2StatusUpdate(
        createdAt = createdAt,
        id = id,
        nodeId = nodeId,
        updatedAt = updatedAt,
        body = rawObject["body"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        creator = rawObject["creator"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
        projectNodeId = rawObject["project_node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<String>(it) },
        status = rawObject["status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineProjectsV2StatusUpdateStatusX4f735874?>(element) },
        targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProjectsV2StatusUpdate) {
      val jsonEncoder = encoder.requireJsonEncoder("ProjectsV2StatusUpdate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("updated_at", value.updatedAt)
        value.body?.let { put("body", it) }
        value.creator?.let { put("creator", json.encodeToJsonElement(it)) }
        value.projectNodeId?.let { put("project_node_id", it) }
        value.startDate?.let { put("start_date", it) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
        value.targetDate?.let { put("target_date", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun projectsV2StatusUpdate(block: ProjectsV2StatusUpdate.Builder.() -> Unit): ProjectsV2StatusUpdate = ProjectsV2StatusUpdate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProjectsV2StatusUpdate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
