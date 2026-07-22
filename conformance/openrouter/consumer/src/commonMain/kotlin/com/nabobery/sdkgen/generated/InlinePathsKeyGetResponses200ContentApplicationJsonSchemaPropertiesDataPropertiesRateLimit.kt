package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit
  .Serializer::class)
public class InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit(
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

    public fun build(): InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit {
      check(intervalValue != null) { "interval is required" }
      check(noteValue != null) { "note is required" }
      check(requestsValue != null) { "requests is required" }
      return InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit(
        interval = interval,
        note = note,
        requests = requests,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit " +
          "must be a JSON object")
      val interval = json.decodeRequired<String>(raw, "interval")
      val note = json.decodeRequired<String>(raw, "note")
      val requests = json.decodeRequired<Int>(raw, "requests")
      return InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit(
        interval = interval,
        note = note,
        requests = requests,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit")
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

public fun inlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit(block: InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit.Builder.() -> Unit): InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit = InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
