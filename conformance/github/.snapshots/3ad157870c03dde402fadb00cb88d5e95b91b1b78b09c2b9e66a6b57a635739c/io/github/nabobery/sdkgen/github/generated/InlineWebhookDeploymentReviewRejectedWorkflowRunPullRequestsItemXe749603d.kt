package io.github.nabobery.sdkgen.github.generated

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
 * s/pull_requests/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/workflow_run/propertie
 * s/pull_requests/items
 */
@Serializable(with = InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d.Serializer::class)
public class InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d(
  public val base: InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemBaseX4ad80437,
  public val head: InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319,
  public val id: Int,
  public val number: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var baseValue:
        InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemBaseX4ad80437? = null

    public var base: InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemBaseX4ad80437
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var headValue:
        InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319? = null

    public var head: InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319
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

    public fun build(): InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d {
      check(baseValue != null) { "base is required" }
      check(headValue != null) { "head is required" }
      check(idValue != null) { "id is required" }
      check(numberValue != null) { "number is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d must be a JSON object")
      val base = json.decodeRequired<InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemBaseX4ad80437>(rawObject, "base")
      val head = json.decodeRequired<InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319>(rawObject, "head")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d")
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

public fun inlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d(block: InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d.Builder.() -> Unit): InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d = InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemXe749603d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
