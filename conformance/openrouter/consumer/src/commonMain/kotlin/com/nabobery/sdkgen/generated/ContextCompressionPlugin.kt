package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ContextCompressionPlugin.
 */
@Serializable(with = ContextCompressionPlugin.Serializer::class)
public class ContextCompressionPlugin(
  public val id: InlineComponentsSchemasContextCompressionPluginPropertiesId,
  /**
   * Set to false to disable the context-compression plugin for this request. Defaults to true.
   */
  public val enabled: Boolean? = null,
  public val engine: ContextCompressionEngine? = null,
) {
  public class Builder {
    private var idValue: InlineComponentsSchemasContextCompressionPluginPropertiesId? = null

    public var id: InlineComponentsSchemasContextCompressionPluginPropertiesId
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    /**
     * Set to false to disable the context-compression plugin for this request. Defaults to true.
     */
    public var enabled: Boolean? = null

    public var engine: ContextCompressionEngine? = null

    public fun build(): ContextCompressionPlugin {
      check(idValue != null) { "id is required" }
      return ContextCompressionPlugin(
        id = id,
        enabled = enabled,
        engine = engine,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContextCompressionPlugin = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ContextCompressionPlugin> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContextCompressionPlugin {
      val jsonDecoder = decoder.requireJsonDecoder("ContextCompressionPlugin")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ContextCompressionPlugin must be a JSON object")
      val id = json.decodeRequired<InlineComponentsSchemasContextCompressionPluginPropertiesId>(raw, "id")
      return ContextCompressionPlugin(
        id = id,
        enabled = raw["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        engine = raw["engine"]?.let { json.decodeFromJsonElement<ContextCompressionEngine>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContextCompressionPlugin) {
      val jsonEncoder = encoder.requireJsonEncoder("ContextCompressionPlugin")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
        value.engine?.let { put("engine", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contextCompressionPlugin(block: ContextCompressionPlugin.Builder.() -> Unit): ContextCompressionPlugin =
  ContextCompressionPlugin.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContextCompressionPlugin is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
