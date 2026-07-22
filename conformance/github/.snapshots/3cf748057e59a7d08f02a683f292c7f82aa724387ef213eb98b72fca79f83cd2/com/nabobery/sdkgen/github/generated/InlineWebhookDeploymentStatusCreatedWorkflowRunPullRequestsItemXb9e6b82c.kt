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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/workflow_run/properties
 * /pull_requests/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/workflow_run/properties
 * /pull_requests/items
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c.Serializer::class)
public class InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c(
  public val base: InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103,
  public val head: InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1,
  public val id: Int,
  public val number: Int,
  public val url: String,
) {
  public class Builder {
    private var baseValue:
        InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103? = null

    public var base: InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var headValue:
        InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1? = null

    public var head: InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1
      get() = requireNotNull(headValue) { "head is required" }
      set(`value`) {
        headValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c {
      check(baseValue != null) { "base is required" }
      check(headValue != null) { "head is required" }
      check(idValue != null) { "id is required" }
      check(numberValue != null) { "number is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c must be a JSON object")
      val base = json.decodeRequired<InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103>(rawObject, "base")
      val head = json.decodeRequired<InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1>(rawObject, "head")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("base", json.encodeToJsonElement(value.base))
        put("head", json.encodeToJsonElement(value.head))
        put("id", json.encodeToJsonElement(value.id))
        put("number", json.encodeToJsonElement(value.number))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c(block: InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c.Builder.() -> Unit): InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c = InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemXb9e6b82c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
