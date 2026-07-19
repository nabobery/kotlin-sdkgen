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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1.Serializer::class)
public class InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1(
  public val definition: String,
  public val syntax: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax,
  public val type: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType,
) {
  public class Builder {
    private var definitionValue: String? = null

    public var definition: String
      get() = requireNotNull(definitionValue) { "definition is required" }
      set(`value`) {
        definitionValue = value
      }

    private var syntaxValue:
        InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax? = null

    public var syntax: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax
      get() = requireNotNull(syntaxValue) { "syntax is required" }
      set(`value`) {
        syntaxValue = value
      }

    private var typeValue: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType? =
        null

    public var type: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1 {
      check(definitionValue != null) { "definition is required" }
      check(syntaxValue != null) { "syntax is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1(
        definition = definition,
        syntax = syntax,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1 = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1 must be a JSON object")
      val definition = json.decodeRequired<String>(raw, "definition")
      val syntax = json.decodeRequired<InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax>(raw,
        "syntax")
      val type = json.decodeRequired<InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType>(raw, "type")
      return InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1(
        definition = definition,
        syntax = syntax,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("definition", value.definition)
        put("syntax", json.encodeToJsonElement(value.syntax))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasCustomToolPropertiesFormatAnyOf1(block: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1.Builder.() -> Unit): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1 = InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1 is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
