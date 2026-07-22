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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/workflow_run/propertie
 * s/pull_requests/items/properties/base/properties/repo.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/workflow_run/propertie
 * s/pull_requests/items/properties/base/properties/repo
 */
@Serializable(with = InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff.Serializer::class)
public class InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff(
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

    public fun build(): InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff(
        id = id,
        name = name,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff(
        id = id,
        name = name,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff")
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

public fun inlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff(block: InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff.Builder.() -> Unit): InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff = InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemBaseRepoX12d11dff is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
