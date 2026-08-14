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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1workflows/get/responses/200/content/applicatio
 * n~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1workflows/get/responses/200/content/applicatio
 * n~1json/schema
 */
@Serializable(with = InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b.Serializer::class)
public class InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b(
  public val totalCount: Int,
  workflows: List<Workflow>,
) {
  public val workflows: List<Workflow> = workflows.toList()

  public class Builder {
    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    private var workflowsValue: List<Workflow>? = null

    public var workflows: List<Workflow>
      get() = requireNotNull(workflowsValue) { "workflows is required" }.toList()
      set(`value`) {
        workflowsValue = value.toList()
      }

    public fun build(): InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b {
      check(totalCountValue != null) { "totalCount is required" }
      check(workflowsValue != null) { "workflows is required" }
      return InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b(
        totalCount = totalCount,
        workflows = workflows,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b must be a JSON object")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      val workflows = json.decodeRequired<List<Workflow>>(rawObject, "workflows")
      return InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b(
        totalCount = totalCount,
        workflows = workflows,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_count", json.encodeToJsonElement(value.totalCount))
        put("workflows", json.encodeToJsonElement(value.workflows))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b(block: InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b.Builder.() -> Unit): InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b = InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsWorkflowsGetResponse200JsonX0dfabe6b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
