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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/filters/anyOf/0
 */
@Serializable(with = InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5.Serializer::class)
public class InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5(
  public val key: String,
  public val type: InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a,
  public val `value`: InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var typeValue: InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a? = null

    public var type: InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var valueValue: InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2? = null

    public var `value`: InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5 {
      check(keyValue != null) { "key is required" }
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5(
        key = key,
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5 must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val type = json.decodeRequired<InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a>(rawObject, "type")
      val value = json.decodeRequired<InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2>(rawObject, "value")
      return InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5(
        key = key,
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5")
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

public fun inlineFileSearchServerToolFiltersAnyOf1Xe0235bc5(block: InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5.Builder.() -> Unit): InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5 = InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
