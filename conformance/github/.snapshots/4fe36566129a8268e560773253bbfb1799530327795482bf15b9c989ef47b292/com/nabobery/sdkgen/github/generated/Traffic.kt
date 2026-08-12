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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/traffic.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/traffic
 */
@Serializable(with = Traffic.Serializer::class)
public class Traffic(
  public val count: Int,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val timestamp: String,
  public val uniques: Int,
) {
  public class Builder {
    private var countValue: Int? = null

    public var count: Int
      get() = requireNotNull(countValue) { "count is required" }
      set(`value`) {
        countValue = value
      }

    private var timestampValue: String? = null

    public var timestamp: String
      get() = requireNotNull(timestampValue) { "timestamp is required" }
      set(`value`) {
        timestampValue = value
      }

    private var uniquesValue: Int? = null

    public var uniques: Int
      get() = requireNotNull(uniquesValue) { "uniques is required" }
      set(`value`) {
        uniquesValue = value
      }

    public fun build(): Traffic {
      check(countValue != null) { "count is required" }
      check(timestampValue != null) { "timestamp is required" }
      check(uniquesValue != null) { "uniques is required" }
      return Traffic(
        count = count,
        timestamp = timestamp,
        uniques = uniques,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Traffic = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Traffic> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Traffic {
      val jsonDecoder = decoder.requireJsonDecoder("Traffic")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Traffic must be a JSON object")
      val count = json.decodeRequired<Int>(rawObject, "count")
      val timestamp = json.decodeRequired<String>(rawObject, "timestamp")
      val uniques = json.decodeRequired<Int>(rawObject, "uniques")
      return Traffic(
        count = count,
        timestamp = timestamp,
        uniques = uniques,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Traffic) {
      val jsonEncoder = encoder.requireJsonEncoder("Traffic")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("count", json.encodeToJsonElement(value.count))
        put("timestamp", value.timestamp)
        put("uniques", json.encodeToJsonElement(value.uniques))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun traffic(block: Traffic.Builder.() -> Unit): Traffic = Traffic.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Traffic is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
