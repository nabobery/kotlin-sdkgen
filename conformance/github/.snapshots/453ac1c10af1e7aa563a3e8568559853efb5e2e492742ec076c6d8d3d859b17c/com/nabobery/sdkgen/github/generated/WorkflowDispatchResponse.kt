package com.nabobery.sdkgen.github.generated

import kotlin.Long
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
 * Response containing the workflow run ID and URLs.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow-dispatch-response
 */
@Serializable(with = WorkflowDispatchResponse.Serializer::class)
public class WorkflowDispatchResponse(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * The URL to the workflow run.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val runUrl: String,
  public val workflowRunId: Long,
) {
  public class Builder {
    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var runUrlValue: String? = null

    public var runUrl: String
      get() = requireNotNull(runUrlValue) { "runUrl is required" }
      set(`value`) {
        runUrlValue = value
      }

    private var workflowRunIdValue: Long? = null

    public var workflowRunId: Long
      get() = requireNotNull(workflowRunIdValue) { "workflowRunId is required" }
      set(`value`) {
        workflowRunIdValue = value
      }

    public fun build(): WorkflowDispatchResponse {
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(runUrlValue != null) { "runUrl is required" }
      check(workflowRunIdValue != null) { "workflowRunId is required" }
      return WorkflowDispatchResponse(
        htmlUrl = htmlUrl,
        runUrl = runUrl,
        workflowRunId = workflowRunId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WorkflowDispatchResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WorkflowDispatchResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WorkflowDispatchResponse {
      val jsonDecoder = decoder.requireJsonDecoder("WorkflowDispatchResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WorkflowDispatchResponse must be a JSON object")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val runUrl = json.decodeRequired<String>(rawObject, "run_url")
      val workflowRunId = json.decodeRequired<Long>(rawObject, "workflow_run_id")
      return WorkflowDispatchResponse(
        htmlUrl = htmlUrl,
        runUrl = runUrl,
        workflowRunId = workflowRunId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WorkflowDispatchResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("WorkflowDispatchResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html_url", value.htmlUrl)
        put("run_url", value.runUrl)
        put("workflow_run_id", json.encodeToJsonElement(value.workflowRunId))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun workflowDispatchResponse(block: WorkflowDispatchResponse.Builder.() -> Unit): WorkflowDispatchResponse = WorkflowDispatchResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WorkflowDispatchResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
