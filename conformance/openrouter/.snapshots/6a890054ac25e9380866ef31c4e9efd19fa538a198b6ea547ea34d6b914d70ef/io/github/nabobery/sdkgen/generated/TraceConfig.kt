package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Metadata for observability and tracing. Known keys (trace_id, trace_name, span_name, generation_name, parent_span_id)
 * have special handling. Additional keys are passed through as custom metadata to configured broadcast destinations.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TraceConfig
 */
@Serializable(with = TraceConfig.Serializer::class)
public class TraceConfig(
  public val generationName: String? = null,
  public val parentSpanId: String? = null,
  public val spanName: String? = null,
  public val traceId: String? = null,
  public val traceName: String? = null,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateTraceConfigAdditionalProperties(additionalProperties)

  public class Builder {
    public var generationName: String? = null

    public var parentSpanId: String? = null

    public var spanName: String? = null

    public var traceId: String? = null

    public var traceName: String? = null

    private var additionalPropertiesValue: Map<String, JsonElement> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, JsonElement>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): TraceConfig = TraceConfig(
      generationName = generationName,
      parentSpanId = parentSpanId,
      spanName = spanName,
      traceId = traceId,
      traceName = traceName,
      additionalProperties = additionalProperties,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TraceConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TraceConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TraceConfig {
      val jsonDecoder = decoder.requireJsonDecoder("TraceConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TraceConfig must be a JSON object")
      return TraceConfig(
        generationName = rawObject["generation_name"]?.let { json.decodeFromJsonElement<String>(it) },
        parentSpanId = rawObject["parent_span_id"]?.let { json.decodeFromJsonElement<String>(it) },
        spanName = rawObject["span_name"]?.let { json.decodeFromJsonElement<String>(it) },
        traceId = rawObject["trace_id"]?.let { json.decodeFromJsonElement<String>(it) },
        traceName = rawObject["trace_name"]?.let { json.decodeFromJsonElement<String>(it) },
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("generation_name", "parent_span_id", "span_name", "trace_id", "trace_name") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: TraceConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("TraceConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.generationName?.let { put("generation_name", it) }
        value.parentSpanId?.let { put("parent_span_id", it) }
        value.spanName?.let { put("span_name", it) }
        value.traceId?.let { put("trace_id", it) }
        value.traceName?.let { put("trace_name", it) }
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("generation_name", "parent_span_id", "span_name", "trace_id", "trace_name")) { "TraceConfig additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateTraceConfigAdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("generation_name", "parent_span_id", "span_name", "trace_id", "trace_name") }
  require(collision == null) { "TraceConfig additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun traceConfig(block: TraceConfig.Builder.() -> Unit): TraceConfig = TraceConfig.build(block)
