package com.nabobery.sdkgen.github.generated

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
 * Workflow Usage
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow-usage
 */
@Serializable(with = WorkflowUsage.Serializer::class)
public class WorkflowUsage(
  public val billable: InlineWorkflowUsageBillableX4f0004d3,
) {
  public class Builder {
    private var billableValue: InlineWorkflowUsageBillableX4f0004d3? = null

    public var billable: InlineWorkflowUsageBillableX4f0004d3
      get() = requireNotNull(billableValue) { "billable is required" }
      set(`value`) {
        billableValue = value
      }

    public fun build(): WorkflowUsage {
      check(billableValue != null) { "billable is required" }
      return WorkflowUsage(
        billable = billable,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WorkflowUsage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WorkflowUsage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WorkflowUsage {
      val jsonDecoder = decoder.requireJsonDecoder("WorkflowUsage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WorkflowUsage must be a JSON object")
      val billable = json.decodeRequired<InlineWorkflowUsageBillableX4f0004d3>(rawObject, "billable")
      return WorkflowUsage(
        billable = billable,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WorkflowUsage) {
      val jsonEncoder = encoder.requireJsonEncoder("WorkflowUsage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billable", json.encodeToJsonElement(value.billable))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun workflowUsage(block: WorkflowUsage.Builder.() -> Unit): WorkflowUsage = WorkflowUsage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WorkflowUsage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
