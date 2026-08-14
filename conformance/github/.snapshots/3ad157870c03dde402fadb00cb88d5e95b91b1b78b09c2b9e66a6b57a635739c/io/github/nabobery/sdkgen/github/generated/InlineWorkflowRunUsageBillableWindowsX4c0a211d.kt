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
 * sdkgen://source/openapi.yaml#/components/schemas/workflow-run-usage/properties/billable/properties/WINDOWS.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow-run-usage/properties/billable/properties/WINDOWS
 */
@Serializable(with = InlineWorkflowRunUsageBillableWindowsX4c0a211d.Serializer::class)
public class InlineWorkflowRunUsageBillableWindowsX4c0a211d(
  public val jobs: Int,
  public val totalMs: Int,
  jobRuns: List<InlineWorkflowRunUsageBillableWindowsJobRunsItemX04045f94>? = null,
) {
  public val jobRuns: List<InlineWorkflowRunUsageBillableWindowsJobRunsItemX04045f94>? =
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

    private var jobRunsValue: List<InlineWorkflowRunUsageBillableWindowsJobRunsItemX04045f94>? =
        null

    public var jobRuns: List<InlineWorkflowRunUsageBillableWindowsJobRunsItemX04045f94>?
      get() = jobRunsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        jobRunsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineWorkflowRunUsageBillableWindowsX4c0a211d {
      check(jobsValue != null) { "jobs is required" }
      check(totalMsValue != null) { "totalMs is required" }
      return InlineWorkflowRunUsageBillableWindowsX4c0a211d(
        jobs = jobs,
        totalMs = totalMs,
        jobRuns = jobRuns,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWorkflowRunUsageBillableWindowsX4c0a211d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWorkflowRunUsageBillableWindowsX4c0a211d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWorkflowRunUsageBillableWindowsX4c0a211d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWorkflowRunUsageBillableWindowsX4c0a211d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWorkflowRunUsageBillableWindowsX4c0a211d must be a JSON object")
      val jobs = json.decodeRequired<Int>(rawObject, "jobs")
      val totalMs = json.decodeRequired<Int>(rawObject, "total_ms")
      return InlineWorkflowRunUsageBillableWindowsX4c0a211d(
        jobs = jobs,
        totalMs = totalMs,
        jobRuns = rawObject["job_runs"]?.let { json.decodeFromJsonElement<List<InlineWorkflowRunUsageBillableWindowsJobRunsItemX04045f94>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWorkflowRunUsageBillableWindowsX4c0a211d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWorkflowRunUsageBillableWindowsX4c0a211d")
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

public fun inlineWorkflowRunUsageBillableWindowsX4c0a211d(block: InlineWorkflowRunUsageBillableWindowsX4c0a211d.Builder.() -> Unit): InlineWorkflowRunUsageBillableWindowsX4c0a211d = InlineWorkflowRunUsageBillableWindowsX4c0a211d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWorkflowRunUsageBillableWindowsX4c0a211d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
