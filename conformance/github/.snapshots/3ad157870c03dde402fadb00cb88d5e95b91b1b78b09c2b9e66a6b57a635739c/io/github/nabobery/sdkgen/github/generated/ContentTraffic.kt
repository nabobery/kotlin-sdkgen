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
 * Content Traffic
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/content-traffic
 */
@Serializable(with = ContentTraffic.Serializer::class)
public class ContentTraffic(
  public val count: Int,
  public val path: String,
  public val title: String,
  public val uniques: Int,
) {
  public class Builder {
    private var countValue: Int? = null

    public var count: Int
      get() = requireNotNull(countValue) { "count is required" }
      set(`value`) {
        countValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    private var uniquesValue: Int? = null

    public var uniques: Int
      get() = requireNotNull(uniquesValue) { "uniques is required" }
      set(`value`) {
        uniquesValue = value
      }

    public fun build(): ContentTraffic {
      check(countValue != null) { "count is required" }
      check(pathValue != null) { "path is required" }
      check(titleValue != null) { "title is required" }
      check(uniquesValue != null) { "uniques is required" }
      return ContentTraffic(
        count = count,
        path = path,
        title = title,
        uniques = uniques,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContentTraffic = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ContentTraffic> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContentTraffic {
      val jsonDecoder = decoder.requireJsonDecoder("ContentTraffic")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ContentTraffic must be a JSON object")
      val count = json.decodeRequired<Int>(rawObject, "count")
      val path = json.decodeRequired<String>(rawObject, "path")
      val title = json.decodeRequired<String>(rawObject, "title")
      val uniques = json.decodeRequired<Int>(rawObject, "uniques")
      return ContentTraffic(
        count = count,
        path = path,
        title = title,
        uniques = uniques,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContentTraffic) {
      val jsonEncoder = encoder.requireJsonEncoder("ContentTraffic")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("count", json.encodeToJsonElement(value.count))
        put("path", value.path)
        put("title", value.title)
        put("uniques", json.encodeToJsonElement(value.uniques))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contentTraffic(block: ContentTraffic.Builder.() -> Unit): ContentTraffic = ContentTraffic.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContentTraffic is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
