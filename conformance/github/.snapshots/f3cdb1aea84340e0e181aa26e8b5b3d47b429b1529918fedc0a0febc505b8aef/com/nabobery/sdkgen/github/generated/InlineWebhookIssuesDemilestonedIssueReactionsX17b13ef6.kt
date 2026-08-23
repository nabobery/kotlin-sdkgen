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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/reactions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/reactions
 */
@Serializable(with = InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6.Serializer::class)
public class InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6(
  public val _1: Int,
  public val _12: Int,
  public val confused: Int,
  public val eyes: Int,
  public val heart: Int,
  public val hooray: Int,
  public val laugh: Int,
  public val rocket: Int,
  public val totalCount: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var _1Value: Int? = null

    public var _1: Int
      get() = requireNotNull(_1Value) { "_1 is required" }
      set(`value`) {
        _1Value = value
      }

    private var _12Value: Int? = null

    public var _12: Int
      get() = requireNotNull(_12Value) { "_12 is required" }
      set(`value`) {
        _12Value = value
      }

    private var confusedValue: Int? = null

    public var confused: Int
      get() = requireNotNull(confusedValue) { "confused is required" }
      set(`value`) {
        confusedValue = value
      }

    private var eyesValue: Int? = null

    public var eyes: Int
      get() = requireNotNull(eyesValue) { "eyes is required" }
      set(`value`) {
        eyesValue = value
      }

    private var heartValue: Int? = null

    public var heart: Int
      get() = requireNotNull(heartValue) { "heart is required" }
      set(`value`) {
        heartValue = value
      }

    private var hoorayValue: Int? = null

    public var hooray: Int
      get() = requireNotNull(hoorayValue) { "hooray is required" }
      set(`value`) {
        hoorayValue = value
      }

    private var laughValue: Int? = null

    public var laugh: Int
      get() = requireNotNull(laughValue) { "laugh is required" }
      set(`value`) {
        laughValue = value
      }

    private var rocketValue: Int? = null

    public var rocket: Int
      get() = requireNotNull(rocketValue) { "rocket is required" }
      set(`value`) {
        rocketValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6 {
      check(_1Value != null) { "_1 is required" }
      check(_12Value != null) { "_12 is required" }
      check(confusedValue != null) { "confused is required" }
      check(eyesValue != null) { "eyes is required" }
      check(heartValue != null) { "heart is required" }
      check(hoorayValue != null) { "hooray is required" }
      check(laughValue != null) { "laugh is required" }
      check(rocketValue != null) { "rocket is required" }
      check(totalCountValue != null) { "totalCount is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6(
        _1 = _1,
        _12 = _12,
        confused = confused,
        eyes = eyes,
        heart = heart,
        hooray = hooray,
        laugh = laugh,
        rocket = rocket,
        totalCount = totalCount,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6 must be a JSON object")
      val _1 = json.decodeRequired<Int>(rawObject, "+1")
      val _12 = json.decodeRequired<Int>(rawObject, "-1")
      val confused = json.decodeRequired<Int>(rawObject, "confused")
      val eyes = json.decodeRequired<Int>(rawObject, "eyes")
      val heart = json.decodeRequired<Int>(rawObject, "heart")
      val hooray = json.decodeRequired<Int>(rawObject, "hooray")
      val laugh = json.decodeRequired<Int>(rawObject, "laugh")
      val rocket = json.decodeRequired<Int>(rawObject, "rocket")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6(
        _1 = _1,
        _12 = _12,
        confused = confused,
        eyes = eyes,
        heart = heart,
        hooray = hooray,
        laugh = laugh,
        rocket = rocket,
        totalCount = totalCount,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("+1", json.encodeToJsonElement(value._1))
        put("-1", json.encodeToJsonElement(value._12))
        put("confused", json.encodeToJsonElement(value.confused))
        put("eyes", json.encodeToJsonElement(value.eyes))
        put("heart", json.encodeToJsonElement(value.heart))
        put("hooray", json.encodeToJsonElement(value.hooray))
        put("laugh", json.encodeToJsonElement(value.laugh))
        put("rocket", json.encodeToJsonElement(value.rocket))
        put("total_count", json.encodeToJsonElement(value.totalCount))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6(block: InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6.Builder.() -> Unit): InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6 = InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesDemilestonedIssueReactionsX17b13ef6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
