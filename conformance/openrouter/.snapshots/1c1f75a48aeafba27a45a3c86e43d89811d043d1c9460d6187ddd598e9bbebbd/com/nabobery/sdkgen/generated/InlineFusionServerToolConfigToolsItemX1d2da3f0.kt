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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/FusionServerToolConfig/properties/tools/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionServerToolConfig/properties/tools/items
 */
@Serializable(with = InlineFusionServerToolConfigToolsItemX1d2da3f0.Serializer::class)
public class InlineFusionServerToolConfigToolsItemX1d2da3f0(
  /**
   * Server tool type identifier (e.g. "openrouter:web_search", "openrouter:web_fetch").
   */
  public val type: String,
  parameters: Map<String, JsonElement?>? = null,
) {
  /**
   * Optional configuration forwarded as the tool's `parameters` object.
   */
  public val parameters: Map<String, JsonElement?>? =
      parameters?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var parametersValue: Map<String, JsonElement?>? = null

    /**
     * Optional configuration forwarded as the tool's `parameters` object.
     */
    public var parameters: Map<String, JsonElement?>?
      get() = parametersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        parametersValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineFusionServerToolConfigToolsItemX1d2da3f0 {
      check(typeValue != null) { "type is required" }
      return InlineFusionServerToolConfigToolsItemX1d2da3f0(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFusionServerToolConfigToolsItemX1d2da3f0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFusionServerToolConfigToolsItemX1d2da3f0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFusionServerToolConfigToolsItemX1d2da3f0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFusionServerToolConfigToolsItemX1d2da3f0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFusionServerToolConfigToolsItemX1d2da3f0 must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return InlineFusionServerToolConfigToolsItemX1d2da3f0(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFusionServerToolConfigToolsItemX1d2da3f0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFusionServerToolConfigToolsItemX1d2da3f0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFusionServerToolConfigToolsItemX1d2da3f0(block: InlineFusionServerToolConfigToolsItemX1d2da3f0.Builder.() -> Unit): InlineFusionServerToolConfigToolsItemX1d2da3f0 = InlineFusionServerToolConfigToolsItemX1d2da3f0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineFusionServerToolConfigToolsItemX1d2da3f0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
