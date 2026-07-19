package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
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
 */
@Serializable(with = TraceConfig.Serializer::class)
public class TraceConfig(
  public val generationName: String? = null,
  public val parentSpanId: String? = null,
  public val spanName: String? = null,
  public val traceId: String? = null,
  public val traceName: String? = null,
) {
  public class Builder {
    public var generationName: String? = null

    public var parentSpanId: String? = null

    public var spanName: String? = null

    public var traceId: String? = null

    public var traceName: String? = null

    public fun build(): TraceConfig = TraceConfig(
      generationName = generationName,
      parentSpanId = parentSpanId,
      spanName = spanName,
      traceId = traceId,
      traceName = traceName,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TraceConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TraceConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TraceConfig {
      val jsonDecoder = decoder.requireJsonDecoder("TraceConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("TraceConfig must be a JSON object")
      return TraceConfig(
        generationName = raw["generation_name"]?.let { json.decodeFromJsonElement<String>(it) },
        parentSpanId = raw["parent_span_id"]?.let { json.decodeFromJsonElement<String>(it) },
        spanName = raw["span_name"]?.let { json.decodeFromJsonElement<String>(it) },
        traceId = raw["trace_id"]?.let { json.decodeFromJsonElement<String>(it) },
        traceName = raw["trace_name"]?.let { json.decodeFromJsonElement<String>(it) },
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
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun traceConfig(block: TraceConfig.Builder.() -> Unit): TraceConfig = TraceConfig.build(block)
