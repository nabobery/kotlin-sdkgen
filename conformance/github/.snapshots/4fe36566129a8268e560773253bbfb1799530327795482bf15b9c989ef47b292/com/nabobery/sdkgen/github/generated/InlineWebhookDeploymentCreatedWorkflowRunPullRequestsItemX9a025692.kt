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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/pull_r
 * equests/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/pull_r
 * equests/items
 */
@Serializable(with = InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692.Serializer::class)
public class InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692(
  public val base: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595,
  public val head: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226,
  public val id: Int,
  public val number: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var baseValue: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595? =
        null

    public var base: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var headValue: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226? =
        null

    public var head: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226
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

    public fun build(): InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692 {
      check(baseValue != null) { "base is required" }
      check(headValue != null) { "head is required" }
      check(idValue != null) { "id is required" }
      check(numberValue != null) { "number is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692 must be a JSON object")
      val base = json.decodeRequired<InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595>(rawObject, "base")
      val head = json.decodeRequired<InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226>(rawObject, "head")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692")
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

public fun inlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692(block: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692.Builder.() -> Unit): InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692 = InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemX9a025692 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
