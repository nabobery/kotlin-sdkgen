package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/0/properties/input_sche
 * ma.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema
  .Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema(
  public val properties: JsonElement? = null,
  public val required: List<String>? = null,
  public val type: String? = null,
) {
  public class Builder {
    public var properties: JsonElement? = null

    public var required: List<String>? = null

    public var type: String? = null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema =
      InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema(
      properties = properties,
      required = required,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema " +
          "must be a JSON object")
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema(
        properties = raw["properties"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<JsonElement?>(element) },
        required = raw["required"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<String>?>(element) },
        type = raw["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.properties?.let { put("properties", json.encodeToJsonElement(it)) }
        value.required?.let { put("required", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema(block: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema.build(block)
