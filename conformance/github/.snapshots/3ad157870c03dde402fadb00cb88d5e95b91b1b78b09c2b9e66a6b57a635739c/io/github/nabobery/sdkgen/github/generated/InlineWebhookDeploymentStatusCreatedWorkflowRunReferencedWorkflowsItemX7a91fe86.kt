package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/workflow_run/properties
 * /referenced_workflows/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/workflow_run/properties
 * /referenced_workflows/items
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86.Serializer::class)
public class InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86(
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

    public fun build(): InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86 {
      check(pathValue != null) { "path is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86(
        path = path,
        sha = sha,
        ref = ref,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86 must be a JSON object")
      val path = json.decodeRequired<String>(rawObject, "path")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86(
        path = path,
        sha = sha,
        ref = rawObject["ref"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86")
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

public fun inlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86(block: InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86.Builder.() -> Unit): InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86 = InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentStatusCreatedWorkflowRunReferencedWorkflowsItemX7a91fe86 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
