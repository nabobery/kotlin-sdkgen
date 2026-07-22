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
 * sdkgen://source/openapi.yaml#/components/schemas/workflow-run-usage/properties/billable/properties/UBUNTU.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow-run-usage/properties/billable/properties/UBUNTU
 */
@Serializable(with = InlineWorkflowRunUsageBillableUbuntuX37d348b1.Serializer::class)
public class InlineWorkflowRunUsageBillableUbuntuX37d348b1(
  public val jobs: Int,
  public val totalMs: Int,
  public val jobRuns: List<InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3>? = null,
) {
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

    public var jobRuns: List<InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3>? = null

    public fun build(): InlineWorkflowRunUsageBillableUbuntuX37d348b1 {
      check(jobsValue != null) { "jobs is required" }
      check(totalMsValue != null) { "totalMs is required" }
      return InlineWorkflowRunUsageBillableUbuntuX37d348b1(
        jobs = jobs,
        totalMs = totalMs,
        jobRuns = jobRuns,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWorkflowRunUsageBillableUbuntuX37d348b1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWorkflowRunUsageBillableUbuntuX37d348b1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWorkflowRunUsageBillableUbuntuX37d348b1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWorkflowRunUsageBillableUbuntuX37d348b1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWorkflowRunUsageBillableUbuntuX37d348b1 must be a JSON object")
      val jobs = json.decodeRequired<Int>(rawObject, "jobs")
      val totalMs = json.decodeRequired<Int>(rawObject, "total_ms")
      return InlineWorkflowRunUsageBillableUbuntuX37d348b1(
        jobs = jobs,
        totalMs = totalMs,
        jobRuns = rawObject["job_runs"]?.let { json.decodeFromJsonElement<List<InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWorkflowRunUsageBillableUbuntuX37d348b1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWorkflowRunUsageBillableUbuntuX37d348b1")
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

public fun inlineWorkflowRunUsageBillableUbuntuX37d348b1(block: InlineWorkflowRunUsageBillableUbuntuX37d348b1.Builder.() -> Unit): InlineWorkflowRunUsageBillableUbuntuX37d348b1 = InlineWorkflowRunUsageBillableUbuntuX37d348b1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWorkflowRunUsageBillableUbuntuX37d348b1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
