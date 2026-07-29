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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/participation-stats.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/participation-stats
 */
@Serializable(with = ParticipationStats.Serializer::class)
public class ParticipationStats(
  all: List<Int>,
  owner: List<Int>,
) {
  public val all: List<Int> = all.toList()

  public val owner: List<Int> = owner.toList()

  public class Builder {
    private var allValue: List<Int>? = null

    public var all: List<Int>
      get() = requireNotNull(allValue) { "all is required" }.toList()
      set(`value`) {
        allValue = value.toList()
      }

    private var ownerValue: List<Int>? = null

    public var owner: List<Int>
      get() = requireNotNull(ownerValue) { "owner is required" }.toList()
      set(`value`) {
        ownerValue = value.toList()
      }

    public fun build(): ParticipationStats {
      check(allValue != null) { "all is required" }
      check(ownerValue != null) { "owner is required" }
      return ParticipationStats(
        all = all,
        owner = owner,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ParticipationStats = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ParticipationStats> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ParticipationStats {
      val jsonDecoder = decoder.requireJsonDecoder("ParticipationStats")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ParticipationStats must be a JSON object")
      val all = json.decodeRequired<List<Int>>(rawObject, "all")
      val owner = json.decodeRequired<List<Int>>(rawObject, "owner")
      return ParticipationStats(
        all = all,
        owner = owner,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ParticipationStats) {
      val jsonEncoder = encoder.requireJsonEncoder("ParticipationStats")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("all", json.encodeToJsonElement(value.all))
        put("owner", json.encodeToJsonElement(value.owner))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun participationStats(block: ParticipationStats.Builder.() -> Unit): ParticipationStats = ParticipationStats.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ParticipationStats is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
