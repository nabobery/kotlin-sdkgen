package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/workflow-run-usage/properties/billable/properties/UBUNTU/properties/
 * job_runs/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/workflow-run-usage/properties/billable/properties/UBUNTU/properties/
 * job_runs/items
 */
@Serializable(with = InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3.Serializer::class)
public class InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3(
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

    public fun build(): InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3 {
      check(durationMsValue != null) { "durationMs is required" }
      check(jobIdValue != null) { "jobId is required" }
      return InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3(
        durationMs = durationMs,
        jobId = jobId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3 must be a JSON object")
      val durationMs = json.decodeRequired<Int>(rawObject, "duration_ms")
      val jobId = json.decodeRequired<Int>(rawObject, "job_id")
      return InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3(
        durationMs = durationMs,
        jobId = jobId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("duration_ms", json.encodeToJsonElement(value.durationMs))
        put("job_id", json.encodeToJsonElement(value.jobId))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3(block: InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3.Builder.() -> Unit): InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3 = InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWorkflowRunUsageBillableUbuntuJobRunsItemX304343e3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
