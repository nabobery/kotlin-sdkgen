package io.github.nabobery.sdkgen.generated

import kotlin.Double
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/responses/200/content/application~1json/schema/properties
 * /data.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/responses/200/content/application~1json/schema/properties
 * /data
 */
@Serializable(with = InlineAnalyticsQueryPostResponse200JsonDataX314b77b8.Serializer::class)
public class InlineAnalyticsQueryPostResponse200JsonDataX314b77b8(
  `data`: List<JsonObject>,
  public val metadata: InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val cachedAt: Double? = null,
  warnings: List<String>? = null,
) {
  public val `data`: List<JsonObject> = data.toList()

  /**
   * Warnings about filter resolution issues (e.g. unresolvable api_key_id hashes). The query still runs normally; these
   * inform the caller that some filter values could not be resolved.
   */
  public val warnings: List<String>? = warnings?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var dataValue: List<JsonObject>? = null

    public var `data`: List<JsonObject>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var metadataValue: InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b? = null

    public var metadata: InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b
      get() = requireNotNull(metadataValue) { "metadata is required" }
      set(`value`) {
        metadataValue = value
      }

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var cachedAt: Double? = null

    private var warningsValue: List<String>? = null

    /**
     * Warnings about filter resolution issues (e.g. unresolvable api_key_id hashes). The query still runs normally;
     * these inform the caller that some filter values could not be resolved.
     */
    public var warnings: List<String>?
      get() = warningsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        warningsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineAnalyticsQueryPostResponse200JsonDataX314b77b8 {
      check(dataValue != null) { "data is required" }
      check(metadataValue != null) { "metadata is required" }
      return InlineAnalyticsQueryPostResponse200JsonDataX314b77b8(
        data = data,
        metadata = metadata,
        cachedAt = cachedAt,
        warnings = warnings,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsQueryPostResponse200JsonDataX314b77b8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsQueryPostResponse200JsonDataX314b77b8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsQueryPostResponse200JsonDataX314b77b8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsQueryPostResponse200JsonDataX314b77b8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsQueryPostResponse200JsonDataX314b77b8 must be a JSON object")
      val data = json.decodeRequired<List<JsonObject>>(rawObject, "data")
      val metadata = json.decodeRequired<InlineAnalyticsQueryPostResponse200JsonDataMetadataXa98c1b2b>(rawObject, "metadata")
      return InlineAnalyticsQueryPostResponse200JsonDataX314b77b8(
        data = data,
        metadata = metadata,
        cachedAt = rawObject["cachedAt"]?.let { json.decodeFromJsonElement<Double>(it) },
        warnings = rawObject["warnings"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsQueryPostResponse200JsonDataX314b77b8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsQueryPostResponse200JsonDataX314b77b8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("metadata", json.encodeToJsonElement(value.metadata))
        value.cachedAt?.let { put("cachedAt", json.encodeToJsonElement(it)) }
        value.warnings?.let { put("warnings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnalyticsQueryPostResponse200JsonDataX314b77b8(block: InlineAnalyticsQueryPostResponse200JsonDataX314b77b8.Builder.() -> Unit): InlineAnalyticsQueryPostResponse200JsonDataX314b77b8 = InlineAnalyticsQueryPostResponse200JsonDataX314b77b8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsQueryPostResponse200JsonDataX314b77b8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
