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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/filters/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0.Serializer::class)
public class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0(
  public val key: String,
  public val type: InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType,
  public val `value`:
      InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var typeValue:
        InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType? = null

    public var type:
        InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var valueValue:
        InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue? = null

    public var `value`:
        InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0 {
      check(keyValue != null) { "key is required" }
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0(
        key = key,
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0 must be a " +
          "JSON object")
      val key = json.decodeRequired<String>(raw, "key")
      val type = json
        .decodeRequired<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType>(raw, "type")
      val value = json
        .decodeRequired<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue>(raw, "value")
      return InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0(
        key = key,
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        put("type", json.encodeToJsonElement(value.type))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0(block: InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0.Builder.() -> Unit): InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0 = InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
