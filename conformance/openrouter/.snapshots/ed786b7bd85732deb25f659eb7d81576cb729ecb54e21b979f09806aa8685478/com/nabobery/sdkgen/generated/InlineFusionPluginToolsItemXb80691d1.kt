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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/FusionPlugin/properties/tools/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionPlugin/properties/tools/items
 */
@Serializable(with = InlineFusionPluginToolsItemXb80691d1.Serializer::class)
public class InlineFusionPluginToolsItemXb80691d1(
  /**
   * Server tool type identifier (e.g. "openrouter:web_search", "openrouter:web_fetch").
   */
  public val type: String,
  parameters: Map<String, InlineFusionPluginToolsItemParametersAdditionalValueXca8bae30?>? = null,
) {
  /**
   * Optional configuration forwarded as the tool's `parameters` object.
   */
  public val parameters:
      Map<String, InlineFusionPluginToolsItemParametersAdditionalValueXca8bae30?>? =
      parameters?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var parametersValue:
        Map<String, InlineFusionPluginToolsItemParametersAdditionalValueXca8bae30?>? = null

    /**
     * Optional configuration forwarded as the tool's `parameters` object.
     */
    public var parameters:
        Map<String, InlineFusionPluginToolsItemParametersAdditionalValueXca8bae30?>?
      get() = parametersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        parametersValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineFusionPluginToolsItemXb80691d1 {
      check(typeValue != null) { "type is required" }
      return InlineFusionPluginToolsItemXb80691d1(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFusionPluginToolsItemXb80691d1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFusionPluginToolsItemXb80691d1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFusionPluginToolsItemXb80691d1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFusionPluginToolsItemXb80691d1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFusionPluginToolsItemXb80691d1 must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return InlineFusionPluginToolsItemXb80691d1(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<Map<String, InlineFusionPluginToolsItemParametersAdditionalValueXca8bae30?>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFusionPluginToolsItemXb80691d1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFusionPluginToolsItemXb80691d1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFusionPluginToolsItemXb80691d1(block: InlineFusionPluginToolsItemXb80691d1.Builder.() -> Unit): InlineFusionPluginToolsItemXb80691d1 = InlineFusionPluginToolsItemXb80691d1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineFusionPluginToolsItemXb80691d1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
