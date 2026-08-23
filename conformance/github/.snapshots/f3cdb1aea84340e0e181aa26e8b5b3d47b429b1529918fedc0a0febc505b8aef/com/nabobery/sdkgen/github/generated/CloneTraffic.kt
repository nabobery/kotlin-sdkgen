package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Clone Traffic
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/clone-traffic
 */
@Serializable(with = CloneTraffic.Serializer::class)
public class CloneTraffic(
  clones: List<Traffic>,
  public val count: Int,
  public val uniques: Int,
) {
  public val clones: List<Traffic> = clones.toList()

  public class Builder {
    private var clonesValue: List<Traffic>? = null

    public var clones: List<Traffic>
      get() = requireNotNull(clonesValue) { "clones is required" }.toList()
      set(`value`) {
        clonesValue = value.toList()
      }

    private var countValue: Int? = null

    public var count: Int
      get() = requireNotNull(countValue) { "count is required" }
      set(`value`) {
        countValue = value
      }

    private var uniquesValue: Int? = null

    public var uniques: Int
      get() = requireNotNull(uniquesValue) { "uniques is required" }
      set(`value`) {
        uniquesValue = value
      }

    public fun build(): CloneTraffic {
      check(clonesValue != null) { "clones is required" }
      check(countValue != null) { "count is required" }
      check(uniquesValue != null) { "uniques is required" }
      return CloneTraffic(
        clones = clones,
        count = count,
        uniques = uniques,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CloneTraffic = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CloneTraffic> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CloneTraffic {
      val jsonDecoder = decoder.requireJsonDecoder("CloneTraffic")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CloneTraffic must be a JSON object")
      val clones = json.decodeRequired<List<Traffic>>(rawObject, "clones")
      val count = json.decodeRequired<Int>(rawObject, "count")
      val uniques = json.decodeRequired<Int>(rawObject, "uniques")
      return CloneTraffic(
        clones = clones,
        count = count,
        uniques = uniques,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CloneTraffic) {
      val jsonEncoder = encoder.requireJsonEncoder("CloneTraffic")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("clones", json.encodeToJsonElement(value.clones))
        put("count", json.encodeToJsonElement(value.count))
        put("uniques", json.encodeToJsonElement(value.uniques))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun cloneTraffic(block: CloneTraffic.Builder.() -> Unit): CloneTraffic = CloneTraffic.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CloneTraffic is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
