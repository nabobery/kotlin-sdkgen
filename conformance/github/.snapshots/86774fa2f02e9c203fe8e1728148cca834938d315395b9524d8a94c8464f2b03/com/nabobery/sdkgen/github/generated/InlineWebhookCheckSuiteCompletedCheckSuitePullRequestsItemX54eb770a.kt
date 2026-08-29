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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/pull
 * _requests/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/pull
 * _requests/items
 */
@Serializable(with = InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a.Serializer::class)
public class InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a(
  public val base: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6,
  public val head: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655,
  public val id: Int,
  public val number: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var baseValue: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6?
        = null

    public var base: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var headValue: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655?
        = null

    public var head: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655
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

    public fun build(): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a {
      check(baseValue != null) { "base is required" }
      check(headValue != null) { "head is required" }
      check(idValue != null) { "id is required" }
      check(numberValue != null) { "number is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a must be a JSON object")
      val base = json.decodeRequired<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6>(rawObject, "base")
      val head = json.decodeRequired<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655>(rawObject, "head")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a")
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

public fun inlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a(block: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a.Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a = InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
