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
 * Referrer Traffic
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/referrer-traffic
 */
@Serializable(with = ReferrerTraffic.Serializer::class)
public class ReferrerTraffic(
  public val count: Int,
  public val referrer: String,
  public val uniques: Int,
) {
  public class Builder {
    private var countValue: Int? = null

    public var count: Int
      get() = requireNotNull(countValue) { "count is required" }
      set(`value`) {
        countValue = value
      }

    private var referrerValue: String? = null

    public var referrer: String
      get() = requireNotNull(referrerValue) { "referrer is required" }
      set(`value`) {
        referrerValue = value
      }

    private var uniquesValue: Int? = null

    public var uniques: Int
      get() = requireNotNull(uniquesValue) { "uniques is required" }
      set(`value`) {
        uniquesValue = value
      }

    public fun build(): ReferrerTraffic {
      check(countValue != null) { "count is required" }
      check(referrerValue != null) { "referrer is required" }
      check(uniquesValue != null) { "uniques is required" }
      return ReferrerTraffic(
        count = count,
        referrer = referrer,
        uniques = uniques,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReferrerTraffic = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ReferrerTraffic> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReferrerTraffic {
      val jsonDecoder = decoder.requireJsonDecoder("ReferrerTraffic")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReferrerTraffic must be a JSON object")
      val count = json.decodeRequired<Int>(rawObject, "count")
      val referrer = json.decodeRequired<String>(rawObject, "referrer")
      val uniques = json.decodeRequired<Int>(rawObject, "uniques")
      return ReferrerTraffic(
        count = count,
        referrer = referrer,
        uniques = uniques,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReferrerTraffic) {
      val jsonEncoder = encoder.requireJsonEncoder("ReferrerTraffic")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("count", json.encodeToJsonElement(value.count))
        put("referrer", value.referrer)
        put("uniques", json.encodeToJsonElement(value.uniques))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun referrerTraffic(block: ReferrerTraffic.Builder.() -> Unit): ReferrerTraffic = ReferrerTraffic.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReferrerTraffic is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
