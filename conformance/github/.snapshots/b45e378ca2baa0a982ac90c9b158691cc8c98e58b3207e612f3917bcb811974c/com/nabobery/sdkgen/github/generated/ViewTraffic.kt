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
 * View Traffic
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/view-traffic
 */
@Serializable(with = ViewTraffic.Serializer::class)
public class ViewTraffic(
  public val count: Int,
  public val uniques: Int,
  views: List<Traffic>,
) {
  public val views: List<Traffic> = views.toList()

  public class Builder {
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

    private var viewsValue: List<Traffic>? = null

    public var views: List<Traffic>
      get() = requireNotNull(viewsValue) { "views is required" }.toList()
      set(`value`) {
        viewsValue = value.toList()
      }

    public fun build(): ViewTraffic {
      check(countValue != null) { "count is required" }
      check(uniquesValue != null) { "uniques is required" }
      check(viewsValue != null) { "views is required" }
      return ViewTraffic(
        count = count,
        uniques = uniques,
        views = views,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ViewTraffic = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ViewTraffic> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ViewTraffic {
      val jsonDecoder = decoder.requireJsonDecoder("ViewTraffic")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ViewTraffic must be a JSON object")
      val count = json.decodeRequired<Int>(rawObject, "count")
      val uniques = json.decodeRequired<Int>(rawObject, "uniques")
      val views = json.decodeRequired<List<Traffic>>(rawObject, "views")
      return ViewTraffic(
        count = count,
        uniques = uniques,
        views = views,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ViewTraffic) {
      val jsonEncoder = encoder.requireJsonEncoder("ViewTraffic")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("count", json.encodeToJsonElement(value.count))
        put("uniques", json.encodeToJsonElement(value.uniques))
        put("views", json.encodeToJsonElement(value.views))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun viewTraffic(block: ViewTraffic.Builder.() -> Unit): ViewTraffic = ViewTraffic.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ViewTraffic is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
