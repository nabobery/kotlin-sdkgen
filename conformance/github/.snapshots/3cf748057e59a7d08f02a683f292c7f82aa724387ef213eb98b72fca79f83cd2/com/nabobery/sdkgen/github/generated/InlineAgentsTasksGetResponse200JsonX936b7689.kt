package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonX936b7689.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonX936b7689(
  tasks: List<InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33>,
  /**
   * Total count of active (non-archived) tasks
   */
  public val totalActiveCount: Int? = null,
  /**
   * Total count of archived tasks
   */
  public val totalArchivedCount: Int? = null,
) {
  /**
   * List of tasks
   */
  public val tasks: List<InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33> = tasks.toList()

  public class Builder {
    private var tasksValue: List<InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33>? = null

    public var tasks: List<InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33>
      get() = requireNotNull(tasksValue) { "tasks is required" }
      set(`value`) {
        tasksValue = value
      }

    /**
     * Total count of active (non-archived) tasks
     */
    public var totalActiveCount: Int? = null

    /**
     * Total count of archived tasks
     */
    public var totalArchivedCount: Int? = null

    public fun build(): InlineAgentsTasksGetResponse200JsonX936b7689 {
      check(tasksValue != null) { "tasks is required" }
      return InlineAgentsTasksGetResponse200JsonX936b7689(
        tasks = tasks,
        totalActiveCount = totalActiveCount,
        totalArchivedCount = totalArchivedCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonX936b7689 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonX936b7689> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonX936b7689 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonX936b7689")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonX936b7689 must be a JSON object")
      val tasks = json.decodeRequired<List<InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33>>(rawObject, "tasks")
      return InlineAgentsTasksGetResponse200JsonX936b7689(
        tasks = tasks,
        totalActiveCount = rawObject["total_active_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        totalArchivedCount = rawObject["total_archived_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonX936b7689) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonX936b7689")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tasks", json.encodeToJsonElement(value.tasks))
        value.totalActiveCount?.let { put("total_active_count", json.encodeToJsonElement(it)) }
        value.totalArchivedCount?.let { put("total_archived_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse200JsonX936b7689(block: InlineAgentsTasksGetResponse200JsonX936b7689.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonX936b7689 = InlineAgentsTasksGetResponse200JsonX936b7689.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonX936b7689 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
