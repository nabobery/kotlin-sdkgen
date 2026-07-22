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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1workflows~1{workflow_id}~1runs/get/responses/2
 * 00/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1workflows~1{workflow_id}~1runs/get/responses/2
 * 00/content/application~1json/schema
 */
@Serializable(with = InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef.Serializer::class)
public class InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef(
  public val totalCount: Int,
  workflowRuns: List<WorkflowRun>,
) {
  public val workflowRuns: List<WorkflowRun> = workflowRuns.toList()

  public class Builder {
    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    private var workflowRunsValue: List<WorkflowRun>? = null

    public var workflowRuns: List<WorkflowRun>
      get() = requireNotNull(workflowRunsValue) { "workflowRuns is required" }
      set(`value`) {
        workflowRunsValue = value
      }

    public fun build(): InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef {
      check(totalCountValue != null) { "totalCount is required" }
      check(workflowRunsValue != null) { "workflowRuns is required" }
      return InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef(
        totalCount = totalCount,
        workflowRuns = workflowRuns,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef must be a JSON object")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      val workflowRuns = json.decodeRequired<List<WorkflowRun>>(rawObject, "workflow_runs")
      return InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef(
        totalCount = totalCount,
        workflowRuns = workflowRuns,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_count", json.encodeToJsonElement(value.totalCount))
        put("workflow_runs", json.encodeToJsonElement(value.workflowRuns))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef(block: InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef.Builder.() -> Unit): InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef = InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsWorkflowsRunsGetResponse200JsonXf0dbf4ef is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
