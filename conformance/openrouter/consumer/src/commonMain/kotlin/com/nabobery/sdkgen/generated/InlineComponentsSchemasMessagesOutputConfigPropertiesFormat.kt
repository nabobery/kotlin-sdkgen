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
 * A schema to specify Claude's output format in responses. See [structured
 * outputs](https://platform.claude.com/docs/en/build-with-claude/structured-outputs).
 */
@Serializable(with = InlineComponentsSchemasMessagesOutputConfigPropertiesFormat.Serializer::class)
public class InlineComponentsSchemasMessagesOutputConfigPropertiesFormat(
  public val schema: Map<String, JsonElement?>,
  public val type: InlineComponentsSchemasMessagesOutputConfigPropertiesFormatPropertiesType,
) {
  public class Builder {
    private var schemaValue: Map<String, JsonElement?>? = null

    public var schema: Map<String, JsonElement?>
      get() = requireNotNull(schemaValue) { "schema is required" }
      set(`value`) {
        schemaValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesOutputConfigPropertiesFormatPropertiesType? = null

    public var type: InlineComponentsSchemasMessagesOutputConfigPropertiesFormatPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasMessagesOutputConfigPropertiesFormat {
      check(schemaValue != null) { "schema is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesOutputConfigPropertiesFormat(
        schema = schema,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesOutputConfigPropertiesFormat =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesOutputConfigPropertiesFormat> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesOutputConfigPropertiesFormat {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesOutputConfigPropertiesFormat")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesOutputConfigPropertiesFormat must be a JSON " +
          "object")
      val schema = json.decodeRequired<Map<String, JsonElement?>>(raw, "schema")
      val type = json.decodeRequired<InlineComponentsSchemasMessagesOutputConfigPropertiesFormatPropertiesType>(raw,
        "type")
      return InlineComponentsSchemasMessagesOutputConfigPropertiesFormat(
        schema = schema,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesOutputConfigPropertiesFormat) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesOutputConfigPropertiesFormat")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("schema", json.encodeToJsonElement(value.schema))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesOutputConfigPropertiesFormat(block: InlineComponentsSchemasMessagesOutputConfigPropertiesFormat.Builder.() -> Unit): InlineComponentsSchemasMessagesOutputConfigPropertiesFormat = InlineComponentsSchemasMessagesOutputConfigPropertiesFormat.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesOutputConfigPropertiesFormat is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
