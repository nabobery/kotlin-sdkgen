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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run/propertie
 * s/pull_requests/items/properties/head/properties/repo.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run/propertie
 * s/pull_requests/items/properties/head/properties/repo
 */
@Serializable(with = InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026.Serializer::class)
public class InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026(
  public val id: Int,
  public val name: String,
  public val url: String,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026 {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026(
        id = id,
        name = name,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026(
        id = id,
        name = name,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026(block: InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026.Builder.() -> Unit): InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026 = InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
