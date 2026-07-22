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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run/propertie
 * s/referenced_workflows/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run/propertie
 * s/referenced_workflows/items
 */
@Serializable(with = InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f.Serializer::class)
public class InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f(
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

    public fun build(): InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f {
      check(pathValue != null) { "path is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f(
        path = path,
        sha = sha,
        ref = ref,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f must be a JSON object")
      val path = json.decodeRequired<String>(rawObject, "path")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f(
        path = path,
        sha = sha,
        ref = rawObject["ref"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f")
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

public fun inlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f(block: InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f.Builder.() -> Unit): InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f = InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
