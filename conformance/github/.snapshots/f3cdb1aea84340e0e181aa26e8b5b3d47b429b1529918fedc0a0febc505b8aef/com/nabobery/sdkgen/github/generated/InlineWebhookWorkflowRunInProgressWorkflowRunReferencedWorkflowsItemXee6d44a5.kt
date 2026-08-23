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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * referenced_workflows/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * referenced_workflows/items
 */
@Serializable(with = InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5.Serializer::class)
public class InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5(
  public val path: String,
  public val sha: String,
  public val ref: String? = null,
) {
  public class Builder {
    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    public var ref: String? = null

    public fun build(): InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5 {
      check(pathValue != null) { "path is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5(
        path = path,
        sha = sha,
        ref = ref,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5 must be a JSON object")
      val path = json.decodeRequired<String>(rawObject, "path")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5(
        path = path,
        sha = sha,
        ref = rawObject["ref"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("path", value.path)
        put("sha", value.sha)
        value.ref?.let { put("ref", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5(block: InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5.Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5 = InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunReferencedWorkflowsItemXee6d44a5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
