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
 * s/pull_requests/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run/propertie
 * s/pull_requests/items
 */
@Serializable(with = InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443.Serializer::class)
public class InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443(
  public val base: InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6,
  public val head: InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7,
  public val id: Int,
  public val number: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var baseValue:
        InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6? = null

    public var base: InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var headValue:
        InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7? = null

    public var head: InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7
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

    public fun build(): InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443 {
      check(baseValue != null) { "base is required" }
      check(headValue != null) { "head is required" }
      check(idValue != null) { "id is required" }
      check(numberValue != null) { "number is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443 must be a JSON object")
      val base = json.decodeRequired<InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6>(rawObject, "base")
      val head = json.decodeRequired<InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7>(rawObject, "head")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443")
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

public fun inlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443(block: InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443.Builder.() -> Unit): InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443 = InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
