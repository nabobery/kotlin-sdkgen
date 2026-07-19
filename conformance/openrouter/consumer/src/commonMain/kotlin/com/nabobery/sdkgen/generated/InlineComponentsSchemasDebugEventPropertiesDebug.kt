package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlineComponentsSchemasDebugEventPropertiesDebug.Serializer::class)
public class InlineComponentsSchemasDebugEventPropertiesDebug(
  public val echoUpstreamBody: Map<String, JsonElement?>? = null,
  public val timings: InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings? = null,
) {
  public class Builder {
    public var echoUpstreamBody: Map<String, JsonElement?>? = null

    public var timings: InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings? = null

    public fun build(): InlineComponentsSchemasDebugEventPropertiesDebug =
      InlineComponentsSchemasDebugEventPropertiesDebug(
      echoUpstreamBody = echoUpstreamBody,
      timings = timings,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasDebugEventPropertiesDebug = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasDebugEventPropertiesDebug> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasDebugEventPropertiesDebug {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasDebugEventPropertiesDebug")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasDebugEventPropertiesDebug must be a JSON object")
      return InlineComponentsSchemasDebugEventPropertiesDebug(
        echoUpstreamBody = raw["echo_upstream_body"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        timings = raw["timings"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasDebugEventPropertiesDebug) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasDebugEventPropertiesDebug")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.echoUpstreamBody?.let { put("echo_upstream_body", json.encodeToJsonElement(it)) }
        value.timings?.let { put("timings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasDebugEventPropertiesDebug(block: InlineComponentsSchemasDebugEventPropertiesDebug
  .Builder.() -> Unit): InlineComponentsSchemasDebugEventPropertiesDebug =
    InlineComponentsSchemasDebugEventPropertiesDebug.build(block)
