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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/re
 * ferenced_workflows/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/re
 * ferenced_workflows/items
 */
@Serializable(with = InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd.Serializer::class)
public class InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd(
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

    public fun build(): InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd {
      check(pathValue != null) { "path is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd(
        path = path,
        sha = sha,
        ref = ref,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd must be a JSON object")
      val path = json.decodeRequired<String>(rawObject, "path")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd(
        path = path,
        sha = sha,
        ref = rawObject["ref"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd")
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

public fun inlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd(block: InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd.Builder.() -> Unit): InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd = InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunRequestedWorkflowRunReferencedWorkflowsItemXf0a210bd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
