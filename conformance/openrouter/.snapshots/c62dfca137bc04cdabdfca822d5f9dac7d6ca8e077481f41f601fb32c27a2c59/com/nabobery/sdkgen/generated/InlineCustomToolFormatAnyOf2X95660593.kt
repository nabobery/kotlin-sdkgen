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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format/anyOf/1
 */
@Serializable(with = InlineCustomToolFormatAnyOf2X95660593.Serializer::class)
public class InlineCustomToolFormatAnyOf2X95660593(
  public val definition: String,
  public val syntax: InlineCustomToolFormatAnyOf2SyntaxX3ad1799a,
  public val type: InlineCustomToolFormatAnyOf2TypeXd6ef7a4a,
) {
  public class Builder {
    private var definitionValue: String? = null

    public var definition: String
      get() = requireNotNull(definitionValue) { "definition is required" }
      set(`value`) {
        definitionValue = value
      }

    private var syntaxValue: InlineCustomToolFormatAnyOf2SyntaxX3ad1799a? = null

    public var syntax: InlineCustomToolFormatAnyOf2SyntaxX3ad1799a
      get() = requireNotNull(syntaxValue) { "syntax is required" }
      set(`value`) {
        syntaxValue = value
      }

    private var typeValue: InlineCustomToolFormatAnyOf2TypeXd6ef7a4a? = null

    public var type: InlineCustomToolFormatAnyOf2TypeXd6ef7a4a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineCustomToolFormatAnyOf2X95660593 {
      check(definitionValue != null) { "definition is required" }
      check(syntaxValue != null) { "syntax is required" }
      check(typeValue != null) { "type is required" }
      return InlineCustomToolFormatAnyOf2X95660593(
        definition = definition,
        syntax = syntax,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCustomToolFormatAnyOf2X95660593 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCustomToolFormatAnyOf2X95660593> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomToolFormatAnyOf2X95660593 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomToolFormatAnyOf2X95660593")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCustomToolFormatAnyOf2X95660593 must be a JSON object")
      val definition = json.decodeRequired<String>(rawObject, "definition")
      val syntax = json.decodeRequired<InlineCustomToolFormatAnyOf2SyntaxX3ad1799a>(rawObject, "syntax")
      val type = json.decodeRequired<InlineCustomToolFormatAnyOf2TypeXd6ef7a4a>(rawObject, "type")
      return InlineCustomToolFormatAnyOf2X95660593(
        definition = definition,
        syntax = syntax,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomToolFormatAnyOf2X95660593) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCustomToolFormatAnyOf2X95660593")
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

public fun inlineCustomToolFormatAnyOf2X95660593(block: InlineCustomToolFormatAnyOf2X95660593.Builder.() -> Unit): InlineCustomToolFormatAnyOf2X95660593 = InlineCustomToolFormatAnyOf2X95660593.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCustomToolFormatAnyOf2X95660593 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
