package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/responses/200/content/application~1json/schema/properties
 * /data/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/responses/200/content/application~1json/schema/properties
 * /data/properties/metadata
 */
@Serializable(with = InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b.Serializer::class)
public class InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val queryTimeMs: Double,
  public val rowCount: Int,
  public val truncated: Boolean,
) {
  public class Builder {
    private var queryTimeMsValue: Double? = null

    public var queryTimeMs: Double
      get() = requireNotNull(queryTimeMsValue) { "queryTimeMs is required" }
      set(`value`) {
        queryTimeMsValue = value
      }

    private var rowCountValue: Int? = null

    public var rowCount: Int
      get() = requireNotNull(rowCountValue) { "rowCount is required" }
      set(`value`) {
        rowCountValue = value
      }

    private var truncatedValue: Boolean? = null

    public var truncated: Boolean
      get() = requireNotNull(truncatedValue) { "truncated is required" }
      set(`value`) {
        truncatedValue = value
      }

    public fun build(): InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b {
      check(queryTimeMsValue != null) { "queryTimeMs is required" }
      check(rowCountValue != null) { "rowCount is required" }
      check(truncatedValue != null) { "truncated is required" }
      return InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b(
        queryTimeMs = queryTimeMs,
        rowCount = rowCount,
        truncated = truncated,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b must be a JSON object")
      val queryTimeMs = json.decodeRequired<Double>(rawObject, "query_time_ms")
      val rowCount = json.decodeRequired<Int>(rawObject, "row_count")
      val truncated = json.decodeRequired<Boolean>(rawObject, "truncated")
      return InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b(
        queryTimeMs = queryTimeMs,
        rowCount = rowCount,
        truncated = truncated,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("query_time_ms", json.encodeToJsonElement(value.queryTimeMs))
        put("row_count", json.encodeToJsonElement(value.rowCount))
        put("truncated", json.encodeToJsonElement(value.truncated))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b(block: InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b.Builder.() -> Unit): InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b = InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
