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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-projects-v2-status-update
 */
@Serializable(with = NullableProjectsV2StatusUpdate.Serializer::class)
public class NullableProjectsV2StatusUpdate(
  /**
   * The time when the status update was created.
   */
  public val createdAt: String,
  /**
   * The unique identifier of the status update.
   */
  public val id: Double,
  /**
   * The node ID of the status update.
   */
  public val nodeId: String,
  /**
   * The time when the status update was last updated.
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
   */
  public val startDate: String? = null,
  /**
   * The current status.
   */
  public val status: InlineNullableProjectsV2StatusUpdateStatusX315eeecf? = null,
  /**
   * The target date associated with the update.
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
     */
    public var startDate: String? = null

    /**
     * The current status.
     */
    public var status: InlineNullableProjectsV2StatusUpdateStatusX315eeecf? = null

    /**
     * The target date associated with the update.
     */
    public var targetDate: String? = null

    public fun build(): NullableProjectsV2StatusUpdate {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      return NullableProjectsV2StatusUpdate(
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
    public fun build(block: Builder.() -> Unit): NullableProjectsV2StatusUpdate = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<NullableProjectsV2StatusUpdate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NullableProjectsV2StatusUpdate {
      val jsonDecoder = decoder.requireJsonDecoder("NullableProjectsV2StatusUpdate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NullableProjectsV2StatusUpdate must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Double>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      return NullableProjectsV2StatusUpdate(
        createdAt = createdAt,
        id = id,
        nodeId = nodeId,
        updatedAt = updatedAt,
        body = rawObject["body"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        creator = rawObject["creator"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
        projectNodeId = rawObject["project_node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<String>(it) },
        status = rawObject["status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineNullableProjectsV2StatusUpdateStatusX315eeecf?>(element) },
        targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: NullableProjectsV2StatusUpdate) {
      val jsonEncoder = encoder.requireJsonEncoder("NullableProjectsV2StatusUpdate")
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

public fun nullableProjectsV2StatusUpdate(block: NullableProjectsV2StatusUpdate.Builder.() -> Unit): NullableProjectsV2StatusUpdate = NullableProjectsV2StatusUpdate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NullableProjectsV2StatusUpdate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
