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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/pull
 * _requests/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/pull
 * _requests/items
 */
@Serializable(with = InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8.Serializer::class)
public class InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8(
  public val base: InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemBaseXcddc1acf,
  public val head: InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340,
  public val id: Int,
  public val number: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var baseValue: InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemBaseXcddc1acf?
        = null

    public var base: InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemBaseXcddc1acf
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var headValue: InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340?
        = null

    public var head: InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340
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

    public fun build(): InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8 {
      check(baseValue != null) { "base is required" }
      check(headValue != null) { "head is required" }
      check(idValue != null) { "id is required" }
      check(numberValue != null) { "number is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8 must be a JSON object")
      val base = json.decodeRequired<InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemBaseXcddc1acf>(rawObject, "base")
      val head = json.decodeRequired<InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340>(rawObject, "head")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8")
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

public fun inlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8(block: InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8.Builder.() -> Unit): InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8 = InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemX51a3d4d8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
