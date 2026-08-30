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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/workflow-run-usage/properties/billable/properties/MACOS/properties/j
 * ob_runs/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/workflow-run-usage/properties/billable/properties/MACOS/properties/j
 * ob_runs/items
 */
@Serializable(with = InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda.Serializer::class)
public class InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda(
  public val durationMs: Int,
  public val jobId: Int,
) {
  public class Builder {
    private var durationMsValue: Int? = null

    public var durationMs: Int
      get() = requireNotNull(durationMsValue) { "durationMs is required" }
      set(`value`) {
        durationMsValue = value
      }

    private var jobIdValue: Int? = null

    public var jobId: Int
      get() = requireNotNull(jobIdValue) { "jobId is required" }
      set(`value`) {
        jobIdValue = value
      }

    public fun build(): InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda {
      check(durationMsValue != null) { "durationMs is required" }
      check(jobIdValue != null) { "jobId is required" }
      return InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda(
        durationMs = durationMs,
        jobId = jobId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda must be a JSON object")
      val durationMs = json.decodeRequired<Int>(rawObject, "duration_ms")
      val jobId = json.decodeRequired<Int>(rawObject, "job_id")
      return InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda(
        durationMs = durationMs,
        jobId = jobId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("duration_ms", json.encodeToJsonElement(value.durationMs))
        put("job_id", json.encodeToJsonElement(value.jobId))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda(block: InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda.Builder.() -> Unit): InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda = InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
