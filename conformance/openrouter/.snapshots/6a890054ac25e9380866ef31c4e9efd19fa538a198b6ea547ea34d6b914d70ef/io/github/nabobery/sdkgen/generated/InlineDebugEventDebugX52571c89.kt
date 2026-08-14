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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/DebugEvent/properties/debug.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/DebugEvent/properties/debug
 */
@Serializable(with = InlineDebugEventDebugX52571c89.Serializer::class)
public class InlineDebugEventDebugX52571c89(
  echoUpstreamBody: Map<String, JsonElement?>? = null,
  public val timings: InlineDebugEventDebugTimingsX0805aad9? = null,
) {
  public val echoUpstreamBody: Map<String, JsonElement?>? =
      echoUpstreamBody?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var echoUpstreamBodyValue: Map<String, JsonElement?>? = null

    public var echoUpstreamBody: Map<String, JsonElement?>?
      get() = echoUpstreamBodyValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        echoUpstreamBodyValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var timings: InlineDebugEventDebugTimingsX0805aad9? = null

    public fun build(): InlineDebugEventDebugX52571c89 = InlineDebugEventDebugX52571c89(
      echoUpstreamBody = echoUpstreamBody,
      timings = timings,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDebugEventDebugX52571c89 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineDebugEventDebugX52571c89> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDebugEventDebugX52571c89 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDebugEventDebugX52571c89")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDebugEventDebugX52571c89 must be a JSON object")
      return InlineDebugEventDebugX52571c89(
        echoUpstreamBody = rawObject["echo_upstream_body"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        timings = rawObject["timings"]?.let { json.decodeFromJsonElement<InlineDebugEventDebugTimingsX0805aad9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDebugEventDebugX52571c89) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDebugEventDebugX52571c89")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.echoUpstreamBody?.let { put("echo_upstream_body", json.encodeToJsonElement(it)) }
        value.timings?.let { put("timings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDebugEventDebugX52571c89(block: InlineDebugEventDebugX52571c89.Builder.() -> Unit): InlineDebugEventDebugX52571c89 = InlineDebugEventDebugX52571c89.build(block)
