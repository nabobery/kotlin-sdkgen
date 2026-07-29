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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/workflow_run/properti
 * es/referenced_workflows/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/workflow_run/properti
 * es/referenced_workflows/items
 */
@Serializable(with = InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc.Serializer::class)
public class InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc(
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

    public fun build(): InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc {
      check(pathValue != null) { "path is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc(
        path = path,
        sha = sha,
        ref = ref,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc must be a JSON object")
      val path = json.decodeRequired<String>(rawObject, "path")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc(
        path = path,
        sha = sha,
        ref = rawObject["ref"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc")
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

public fun inlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc(block: InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc.Builder.() -> Unit): InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc = InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentRevd4e8WorkflowRunReferencedWorkflowsItemXa0a9f2cc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
