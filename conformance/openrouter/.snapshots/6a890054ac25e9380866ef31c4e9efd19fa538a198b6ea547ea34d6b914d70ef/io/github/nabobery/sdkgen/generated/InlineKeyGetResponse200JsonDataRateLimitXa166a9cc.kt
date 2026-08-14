package io.github.nabobery.sdkgen.generated

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
 * Legacy rate limit information about a key. Will always return -1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1key/get/responses/200/content/application~1json/schema/properties/data/properti
 * es/rate_limit
 */
@Serializable(with = InlineKeyGetResponse200JsonDataRateLimitXa166a9cc.Serializer::class)
public class InlineKeyGetResponse200JsonDataRateLimitXa166a9cc(
  /**
   * Rate limit interval
   */
  public val interval: String,
  /**
   * Note about the rate limit
   */
  public val note: String,
  /**
   * Number of requests allowed per interval
   */
  public val requests: Int,
) {
  public class Builder {
    private var intervalValue: String? = null

    public var interval: String
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    private var noteValue: String? = null

    public var note: String
      get() = requireNotNull(noteValue) { "note is required" }
      set(`value`) {
        noteValue = value
      }

    private var requestsValue: Int? = null

    public var requests: Int
      get() = requireNotNull(requestsValue) { "requests is required" }
      set(`value`) {
        requestsValue = value
      }

    public fun build(): InlineKeyGetResponse200JsonDataRateLimitXa166a9cc {
      check(intervalValue != null) { "interval is required" }
      check(noteValue != null) { "note is required" }
      check(requestsValue != null) { "requests is required" }
      return InlineKeyGetResponse200JsonDataRateLimitXa166a9cc(
        interval = interval,
        note = note,
        requests = requests,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineKeyGetResponse200JsonDataRateLimitXa166a9cc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineKeyGetResponse200JsonDataRateLimitXa166a9cc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineKeyGetResponse200JsonDataRateLimitXa166a9cc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineKeyGetResponse200JsonDataRateLimitXa166a9cc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineKeyGetResponse200JsonDataRateLimitXa166a9cc must be a JSON object")
      val interval = json.decodeRequired<String>(rawObject, "interval")
      val note = json.decodeRequired<String>(rawObject, "note")
      val requests = json.decodeRequired<Int>(rawObject, "requests")
      return InlineKeyGetResponse200JsonDataRateLimitXa166a9cc(
        interval = interval,
        note = note,
        requests = requests,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineKeyGetResponse200JsonDataRateLimitXa166a9cc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineKeyGetResponse200JsonDataRateLimitXa166a9cc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", value.interval)
        put("note", value.note)
        put("requests", json.encodeToJsonElement(value.requests))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineKeyGetResponse200JsonDataRateLimitXa166a9cc(block: InlineKeyGetResponse200JsonDataRateLimitXa166a9cc.Builder.() -> Unit): InlineKeyGetResponse200JsonDataRateLimitXa166a9cc = InlineKeyGetResponse200JsonDataRateLimitXa166a9cc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineKeyGetResponse200JsonDataRateLimitXa166a9cc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
