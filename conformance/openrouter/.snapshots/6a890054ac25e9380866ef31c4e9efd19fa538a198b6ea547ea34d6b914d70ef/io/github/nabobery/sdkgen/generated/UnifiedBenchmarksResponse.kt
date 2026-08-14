package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksResponse
 */
@Serializable(with = UnifiedBenchmarksResponse.Serializer::class)
public class UnifiedBenchmarksResponse(
  `data`: List<InlineUnifiedBenchmarksResponseDataItemX1b147ada>,
  public val meta: UnifiedBenchmarksMeta,
) {
  public val `data`: List<InlineUnifiedBenchmarksResponseDataItemX1b147ada> = data.toList()

  public class Builder {
    private var dataValue: List<InlineUnifiedBenchmarksResponseDataItemX1b147ada>? = null

    public var `data`: List<InlineUnifiedBenchmarksResponseDataItemX1b147ada>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var metaValue: UnifiedBenchmarksMeta? = null

    public var meta: UnifiedBenchmarksMeta
      get() = requireNotNull(metaValue) { "meta is required" }
      set(`value`) {
        metaValue = value
      }

    public fun build(): UnifiedBenchmarksResponse {
      check(dataValue != null) { "data is required" }
      check(metaValue != null) { "meta is required" }
      return UnifiedBenchmarksResponse(
        data = data,
        meta = meta,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UnifiedBenchmarksResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UnifiedBenchmarksResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UnifiedBenchmarksResponse {
      val jsonDecoder = decoder.requireJsonDecoder("UnifiedBenchmarksResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UnifiedBenchmarksResponse must be a JSON object")
      val data = json.decodeRequired<List<InlineUnifiedBenchmarksResponseDataItemX1b147ada>>(rawObject, "data")
      val meta = json.decodeRequired<UnifiedBenchmarksMeta>(rawObject, "meta")
      return UnifiedBenchmarksResponse(
        data = data,
        meta = meta,
      )
    }

    override fun serialize(encoder: Encoder, `value`: UnifiedBenchmarksResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("UnifiedBenchmarksResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("meta", json.encodeToJsonElement(value.meta))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun unifiedBenchmarksResponse(block: UnifiedBenchmarksResponse.Builder.() -> Unit): UnifiedBenchmarksResponse = UnifiedBenchmarksResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UnifiedBenchmarksResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
