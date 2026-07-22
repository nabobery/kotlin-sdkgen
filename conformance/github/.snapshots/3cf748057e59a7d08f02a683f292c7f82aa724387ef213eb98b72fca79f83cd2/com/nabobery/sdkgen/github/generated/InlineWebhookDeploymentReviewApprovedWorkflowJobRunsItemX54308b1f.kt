package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_job_runs/item
 * s.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_job_runs/item
 * s
 */
@Serializable(with = InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f.Serializer::class)
public class InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f(
  public val conclusion: JsonElement? = null,
  public val createdAt: String? = null,
  public val environment: String? = null,
  public val htmlUrl: String? = null,
  public val id: Int? = null,
  public val name: String? = null,
  public val status: String? = null,
  public val updatedAt: String? = null,
) {
  public class Builder {
    public var conclusion: JsonElement? = null

    public var createdAt: String? = null

    public var environment: String? = null

    public var htmlUrl: String? = null

    public var id: Int? = null

    public var name: String? = null

    public var status: String? = null

    public var updatedAt: String? = null

    public fun build(): InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f = InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f(
      conclusion = conclusion,
      createdAt = createdAt,
      environment = environment,
      htmlUrl = htmlUrl,
      id = id,
      name = name,
      status = status,
      updatedAt = updatedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f must be a JSON object")
      return InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f(
        conclusion = rawObject["conclusion"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(element) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        environment = rawObject["environment"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.conclusion?.let { put("conclusion", json.encodeToJsonElement(it)) }
        value.createdAt?.let { put("created_at", it) }
        value.environment?.let { put("environment", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.status?.let { put("status", it) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f(block: InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f.Builder.() -> Unit): InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f = InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f.build(block)
