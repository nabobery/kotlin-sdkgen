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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/pu
 * ll_requests/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/pu
 * ll_requests/items
 */
@Serializable(with = InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525.Serializer::class)
public class InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525(
  public val base: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869,
  public val head: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802,
  public val id: Int,
  public val number: Int,
  public val url: String,
) {
  public class Builder {
    private var baseValue:
        InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869? = null

    public var base: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var headValue:
        InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802? = null

    public var head: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802
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

    public fun build(): InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525 {
      check(baseValue != null) { "base is required" }
      check(headValue != null) { "head is required" }
      check(idValue != null) { "id is required" }
      check(numberValue != null) { "number is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525 must be a JSON object")
      val base = json.decodeRequired<InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869>(rawObject, "base")
      val head = json.decodeRequired<InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802>(rawObject, "head")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525")
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

public fun inlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525(block: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525.Builder.() -> Unit): InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525 = InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
