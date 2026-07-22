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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * pull_requests/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * pull_requests/items
 */
@Serializable(with = InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb.Serializer::class)
public class InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb(
  public val base: InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseX0d3d47a8,
  public val head: InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae,
  public val id: Double,
  public val number: Double,
  public val url: String,
) {
  public class Builder {
    private var baseValue:
        InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseX0d3d47a8? = null

    public var base: InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseX0d3d47a8
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var headValue:
        InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae? = null

    public var head: InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae
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

    public fun build(): InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb {
      check(baseValue != null) { "base is required" }
      check(headValue != null) { "head is required" }
      check(idValue != null) { "id is required" }
      check(numberValue != null) { "number is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb must be a JSON object")
      val base = json.decodeRequired<InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseX0d3d47a8>(rawObject, "base")
      val head = json.decodeRequired<InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae>(rawObject, "head")
      val id = json.decodeRequired<Double>(rawObject, "id")
      val number = json.decodeRequired<Double>(rawObject, "number")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb")
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

public fun inlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb(block: InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb.Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb = InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemX0d5b85eb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
