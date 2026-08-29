package com.nabobery.sdkgen.github.generated

import kotlin.Double
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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/pu
 * ll_requests/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/pu
 * ll_requests/items
 */
@Serializable(with = InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834.Serializer::class)
public class InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834(
  public val base: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51,
  public val head: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val id: Double,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val number: Double,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var baseValue:
        InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51? = null

    public var base: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var headValue:
        InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d? = null

    public var head: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d
      get() = requireNotNull(headValue) { "head is required" }
      set(`value`) {
        headValue = value
      }

    private var idValue: Double? = null

    public var id: Double
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var numberValue: Double? = null

    public var number: Double
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

    public fun build(): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834 {
      check(baseValue != null) { "base is required" }
      check(headValue != null) { "head is required" }
      check(idValue != null) { "id is required" }
      check(numberValue != null) { "number is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834 must be a JSON object")
      val base = json.decodeRequired<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51>(rawObject, "base")
      val head = json.decodeRequired<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d>(rawObject, "head")
      val id = json.decodeRequired<Double>(rawObject, "id")
      val number = json.decodeRequired<Double>(rawObject, "number")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834")
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

public fun inlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834(block: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834.Builder.() -> Unit): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834 = InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
