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
 * sdkgen://source/openapi.yaml#/components/schemas/workflow-run-usage/properties/billable/properties/MACOS.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow-run-usage/properties/billable/properties/MACOS
 */
@Serializable(with = InlineWorkflowRunUsageBillableMacosXb7fec781.Serializer::class)
public class InlineWorkflowRunUsageBillableMacosXb7fec781(
  public val jobs: Int,
  public val totalMs: Int,
  jobRuns: List<InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda>? = null,
) {
  public val jobRuns: List<InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda>? =
      jobRuns?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var jobsValue: Int? = null

    public var jobs: Int
      get() = requireNotNull(jobsValue) { "jobs is required" }
      set(`value`) {
        jobsValue = value
      }

    private var totalMsValue: Int? = null

    public var totalMs: Int
      get() = requireNotNull(totalMsValue) { "totalMs is required" }
      set(`value`) {
        totalMsValue = value
      }

    private var jobRunsValue: List<InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda>? = null

    public var jobRuns: List<InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda>?
      get() = jobRunsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        jobRunsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineWorkflowRunUsageBillableMacosXb7fec781 {
      check(jobsValue != null) { "jobs is required" }
      check(totalMsValue != null) { "totalMs is required" }
      return InlineWorkflowRunUsageBillableMacosXb7fec781(
        jobs = jobs,
        totalMs = totalMs,
        jobRuns = jobRuns,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWorkflowRunUsageBillableMacosXb7fec781 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWorkflowRunUsageBillableMacosXb7fec781> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWorkflowRunUsageBillableMacosXb7fec781 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWorkflowRunUsageBillableMacosXb7fec781")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWorkflowRunUsageBillableMacosXb7fec781 must be a JSON object")
      val jobs = json.decodeRequired<Int>(rawObject, "jobs")
      val totalMs = json.decodeRequired<Int>(rawObject, "total_ms")
      return InlineWorkflowRunUsageBillableMacosXb7fec781(
        jobs = jobs,
        totalMs = totalMs,
        jobRuns = rawObject["job_runs"]?.let { json.decodeFromJsonElement<List<InlineWorkflowRunUsageBillableMacosJobRunsItemX0771dbda>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWorkflowRunUsageBillableMacosXb7fec781) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWorkflowRunUsageBillableMacosXb7fec781")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("jobs", json.encodeToJsonElement(value.jobs))
        put("total_ms", json.encodeToJsonElement(value.totalMs))
        value.jobRuns?.let { put("job_runs", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWorkflowRunUsageBillableMacosXb7fec781(block: InlineWorkflowRunUsageBillableMacosXb7fec781.Builder.() -> Unit): InlineWorkflowRunUsageBillableMacosXb7fec781 = InlineWorkflowRunUsageBillableMacosXb7fec781.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWorkflowRunUsageBillableMacosXb7fec781 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
