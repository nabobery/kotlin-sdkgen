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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/pu
 * ll_requests/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/pu
 * ll_requests/items
 */
@Serializable(with = InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d.Serializer::class)
public class InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d(
  public val base: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f,
  public val head: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb,
  public val id: Double,
  public val number: Double,
  public val url: String,
) {
  public class Builder {
    private var baseValue:
        InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f? = null

    public var base: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var headValue:
        InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb? = null

    public var head: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb
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

    public fun build(): InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d {
      check(baseValue != null) { "base is required" }
      check(headValue != null) { "head is required" }
      check(idValue != null) { "id is required" }
      check(numberValue != null) { "number is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d must be a JSON object")
      val base = json.decodeRequired<InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f>(rawObject, "base")
      val head = json.decodeRequired<InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb>(rawObject, "head")
      val id = json.decodeRequired<Double>(rawObject, "id")
      val number = json.decodeRequired<Double>(rawObject, "number")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d")
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

public fun inlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d(block: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d.Builder.() -> Unit): InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d = InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemXde180c9d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
