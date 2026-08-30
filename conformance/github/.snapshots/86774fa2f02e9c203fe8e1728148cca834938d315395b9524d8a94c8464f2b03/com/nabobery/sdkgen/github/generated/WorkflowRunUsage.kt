package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Workflow Run Usage
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow-run-usage
 */
@Serializable(with = WorkflowRunUsage.Serializer::class)
public class WorkflowRunUsage(
  public val billable: InlineWorkflowRunUsageBillableX56139eab,
  public val runDurationMs: Int? = null,
) {
  public class Builder {
    private var billableValue: InlineWorkflowRunUsageBillableX56139eab? = null

    public var billable: InlineWorkflowRunUsageBillableX56139eab
      get() = requireNotNull(billableValue) { "billable is required" }
      set(`value`) {
        billableValue = value
      }

    public var runDurationMs: Int? = null

    public fun build(): WorkflowRunUsage {
      check(billableValue != null) { "billable is required" }
      return WorkflowRunUsage(
        billable = billable,
        runDurationMs = runDurationMs,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WorkflowRunUsage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WorkflowRunUsage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WorkflowRunUsage {
      val jsonDecoder = decoder.requireJsonDecoder("WorkflowRunUsage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WorkflowRunUsage must be a JSON object")
      val billable = json.decodeRequired<InlineWorkflowRunUsageBillableX56139eab>(rawObject, "billable")
      return WorkflowRunUsage(
        billable = billable,
        runDurationMs = rawObject["run_duration_ms"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WorkflowRunUsage) {
      val jsonEncoder = encoder.requireJsonEncoder("WorkflowRunUsage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billable", json.encodeToJsonElement(value.billable))
        value.runDurationMs?.let { put("run_duration_ms", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun workflowRunUsage(block: WorkflowRunUsage.Builder.() -> Unit): WorkflowRunUsage = WorkflowRunUsage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WorkflowRunUsage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
