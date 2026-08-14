package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * An openrouter:subagent server tool output item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputSubagentServerToolItem
 */
@Serializable(with = OutputSubagentServerToolItem.Serializer::class)
public class OutputSubagentServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineOutputSubagentServerToolItemTypeXf7a3e6e2,
  /**
   * Error message when the subagent task did not produce an outcome.
   */
  public val error: String? = null,
  public val id: String? = null,
  /**
   * Slug of the worker model that executed the task.
   */
  public val model: String? = null,
  /**
   * The worker model's result (the outcome text returned to the delegating model).
   */
  public val outcome: String? = null,
  /**
   * The task description the delegating model sent to the worker.
   */
  public val taskDescription: String? = null,
  /**
   * The short task identifier the delegating model supplied.
   */
  public val taskName: String? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputSubagentServerToolItemTypeXf7a3e6e2? = null

    public var type: InlineOutputSubagentServerToolItemTypeXf7a3e6e2
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Error message when the subagent task did not produce an outcome.
     */
    public var error: String? = null

    public var id: String? = null

    /**
     * Slug of the worker model that executed the task.
     */
    public var model: String? = null

    /**
     * The worker model's result (the outcome text returned to the delegating model).
     */
    public var outcome: String? = null

    /**
     * The task description the delegating model sent to the worker.
     */
    public var taskDescription: String? = null

    /**
     * The short task identifier the delegating model supplied.
     */
    public var taskName: String? = null

    public fun build(): OutputSubagentServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputSubagentServerToolItem(
        status = status,
        type = type,
        error = error,
        id = id,
        model = model,
        outcome = outcome,
        taskDescription = taskDescription,
        taskName = taskName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputSubagentServerToolItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputSubagentServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputSubagentServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputSubagentServerToolItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputSubagentServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputSubagentServerToolItemTypeXf7a3e6e2>(rawObject, "type")
      return OutputSubagentServerToolItem(
        status = status,
        type = type,
        error = rawObject["error"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        outcome = rawObject["outcome"]?.let { json.decodeFromJsonElement<String>(it) },
        taskDescription = rawObject["task_description"]?.let { json.decodeFromJsonElement<String>(it) },
        taskName = rawObject["task_name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputSubagentServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputSubagentServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.error?.let { put("error", it) }
        value.id?.let { put("id", it) }
        value.model?.let { put("model", it) }
        value.outcome?.let { put("outcome", it) }
        value.taskDescription?.let { put("task_description", it) }
        value.taskName?.let { put("task_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputSubagentServerToolItem(block: OutputSubagentServerToolItem.Builder.() -> Unit): OutputSubagentServerToolItem = OutputSubagentServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputSubagentServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
