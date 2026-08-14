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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs/get/responses/200/content/application~1js
 * on/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs/get/responses/200/content/application~1js
 * on/schema
 */
@Serializable(with = InlineReposActionsRunsGetResponse200JsonX15860cd5.Serializer::class)
public class InlineReposActionsRunsGetResponse200JsonX15860cd5(
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
      get() = requireNotNull(workflowRunsValue) { "workflowRuns is required" }.toList()
      set(`value`) {
        workflowRunsValue = value.toList()
      }

    public fun build(): InlineReposActionsRunsGetResponse200JsonX15860cd5 {
      check(totalCountValue != null) { "totalCount is required" }
      check(workflowRunsValue != null) { "workflowRuns is required" }
      return InlineReposActionsRunsGetResponse200JsonX15860cd5(
        totalCount = totalCount,
        workflowRuns = workflowRuns,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsRunsGetResponse200JsonX15860cd5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsRunsGetResponse200JsonX15860cd5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsRunsGetResponse200JsonX15860cd5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsRunsGetResponse200JsonX15860cd5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsRunsGetResponse200JsonX15860cd5 must be a JSON object")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      val workflowRuns = json.decodeRequired<List<WorkflowRun>>(rawObject, "workflow_runs")
      return InlineReposActionsRunsGetResponse200JsonX15860cd5(
        totalCount = totalCount,
        workflowRuns = workflowRuns,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsRunsGetResponse200JsonX15860cd5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsRunsGetResponse200JsonX15860cd5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_count", json.encodeToJsonElement(value.totalCount))
        put("workflow_runs", json.encodeToJsonElement(value.workflowRuns))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsRunsGetResponse200JsonX15860cd5(block: InlineReposActionsRunsGetResponse200JsonX15860cd5.Builder.() -> Unit): InlineReposActionsRunsGetResponse200JsonX15860cd5 = InlineReposActionsRunsGetResponse200JsonX15860cd5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsRunsGetResponse200JsonX15860cd5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
