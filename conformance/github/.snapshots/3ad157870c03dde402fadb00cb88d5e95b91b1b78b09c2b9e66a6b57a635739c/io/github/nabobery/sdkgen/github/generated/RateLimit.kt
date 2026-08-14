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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/rate-limit.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rate-limit
 */
@Serializable(with = RateLimit.Serializer::class)
public class RateLimit(
  public val limit: Int,
  public val remaining: Int,
  public val reset: Int,
  public val used: Int,
) {
  public class Builder {
    private var limitValue: Int? = null

    public var limit: Int
      get() = requireNotNull(limitValue) { "limit is required" }
      set(`value`) {
        limitValue = value
      }

    private var remainingValue: Int? = null

    public var remaining: Int
      get() = requireNotNull(remainingValue) { "remaining is required" }
      set(`value`) {
        remainingValue = value
      }

    private var resetValue: Int? = null

    public var reset: Int
      get() = requireNotNull(resetValue) { "reset is required" }
      set(`value`) {
        resetValue = value
      }

    private var usedValue: Int? = null

    public var used: Int
      get() = requireNotNull(usedValue) { "used is required" }
      set(`value`) {
        usedValue = value
      }

    public fun build(): RateLimit {
      check(limitValue != null) { "limit is required" }
      check(remainingValue != null) { "remaining is required" }
      check(resetValue != null) { "reset is required" }
      check(usedValue != null) { "used is required" }
      return RateLimit(
        limit = limit,
        remaining = remaining,
        reset = reset,
        used = used,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RateLimit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RateLimit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RateLimit {
      val jsonDecoder = decoder.requireJsonDecoder("RateLimit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RateLimit must be a JSON object")
      val limit = json.decodeRequired<Int>(rawObject, "limit")
      val remaining = json.decodeRequired<Int>(rawObject, "remaining")
      val reset = json.decodeRequired<Int>(rawObject, "reset")
      val used = json.decodeRequired<Int>(rawObject, "used")
      return RateLimit(
        limit = limit,
        remaining = remaining,
        reset = reset,
        used = used,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RateLimit) {
      val jsonEncoder = encoder.requireJsonEncoder("RateLimit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("limit", json.encodeToJsonElement(value.limit))
        put("remaining", json.encodeToJsonElement(value.remaining))
        put("reset", json.encodeToJsonElement(value.reset))
        put("used", json.encodeToJsonElement(value.used))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun rateLimit(block: RateLimit.Builder.() -> Unit): RateLimit = RateLimit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RateLimit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
