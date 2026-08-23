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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesOutputConfig/properties/format
 */
@Serializable(with = InlineMessagesOutputConfigFormatX27ce9294.Serializer::class)
public class InlineMessagesOutputConfigFormatX27ce9294(
  schema: Map<String, JsonElement?>,
  public val type: InlineMessagesOutputConfigFormatTypeXf0154fb6,
) {
  public val schema: Map<String, JsonElement?> = schema.toMap()

  public class Builder {
    private var schemaValue: Map<String, JsonElement?>? = null

    public var schema: Map<String, JsonElement?>
      get() = requireNotNull(schemaValue) { "schema is required" }.toMap()
      set(`value`) {
        schemaValue = value.toMap()
      }

    private var typeValue: InlineMessagesOutputConfigFormatTypeXf0154fb6? = null

    public var type: InlineMessagesOutputConfigFormatTypeXf0154fb6
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineMessagesOutputConfigFormatX27ce9294 {
      check(schemaValue != null) { "schema is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesOutputConfigFormatX27ce9294(
        schema = schema,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesOutputConfigFormatX27ce9294 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesOutputConfigFormatX27ce9294> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesOutputConfigFormatX27ce9294 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesOutputConfigFormatX27ce9294")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesOutputConfigFormatX27ce9294 must be a JSON object")
      val schema = json.decodeRequired<Map<String, JsonElement?>>(rawObject, "schema")
      val type = json.decodeRequired<InlineMessagesOutputConfigFormatTypeXf0154fb6>(rawObject, "type")
      return InlineMessagesOutputConfigFormatX27ce9294(
        schema = schema,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesOutputConfigFormatX27ce9294) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesOutputConfigFormatX27ce9294")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("schema", json.encodeToJsonElement(value.schema))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesOutputConfigFormatX27ce9294(block: InlineMessagesOutputConfigFormatX27ce9294.Builder.() -> Unit): InlineMessagesOutputConfigFormatX27ce9294 = InlineMessagesOutputConfigFormatX27ce9294.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesOutputConfigFormatX27ce9294 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
