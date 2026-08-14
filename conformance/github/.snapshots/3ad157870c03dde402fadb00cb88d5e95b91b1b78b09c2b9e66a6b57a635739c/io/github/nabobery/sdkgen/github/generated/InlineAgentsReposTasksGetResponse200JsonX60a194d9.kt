package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/200/content/application~1js
 * on/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/200/content/application~1js
 * on/schema
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonX60a194d9.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonX60a194d9(
  tasks: List<InlineAgentsReposTasksGetResponse200JsonTasksItemX8793abee>,
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
  public val tasks: List<InlineAgentsReposTasksGetResponse200JsonTasksItemX8793abee> =
      tasks.toList()

  public class Builder {
    private var tasksValue: List<InlineAgentsReposTasksGetResponse200JsonTasksItemX8793abee>? = null

    public var tasks: List<InlineAgentsReposTasksGetResponse200JsonTasksItemX8793abee>
      get() = requireNotNull(tasksValue) { "tasks is required" }.toList()
      set(`value`) {
        tasksValue = value.toList()
      }

    /**
     * Total count of active (non-archived) tasks
     */
    public var totalActiveCount: Int? = null

    /**
     * Total count of archived tasks
     */
    public var totalArchivedCount: Int? = null

    public fun build(): InlineAgentsReposTasksGetResponse200JsonX60a194d9 {
      check(tasksValue != null) { "tasks is required" }
      return InlineAgentsReposTasksGetResponse200JsonX60a194d9(
        tasks = tasks,
        totalActiveCount = totalActiveCount,
        totalArchivedCount = totalArchivedCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonX60a194d9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonX60a194d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonX60a194d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonX60a194d9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonX60a194d9 must be a JSON object")
      val tasks = json.decodeRequired<List<InlineAgentsReposTasksGetResponse200JsonTasksItemX8793abee>>(rawObject, "tasks")
      return InlineAgentsReposTasksGetResponse200JsonX60a194d9(
        tasks = tasks,
        totalActiveCount = rawObject["total_active_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        totalArchivedCount = rawObject["total_archived_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonX60a194d9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonX60a194d9")
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

public fun inlineAgentsReposTasksGetResponse200JsonX60a194d9(block: InlineAgentsReposTasksGetResponse200JsonX60a194d9.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonX60a194d9 = InlineAgentsReposTasksGetResponse200JsonX60a194d9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonX60a194d9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
