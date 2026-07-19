package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0.Serializer::class)
public class InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0(
  public val type: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType? =
        null

    public var type: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0 = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0 must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType>(raw, "type")
      return InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasCustomToolPropertiesFormatAnyOf0(block: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0.Builder.() -> Unit): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0 = InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0 is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
