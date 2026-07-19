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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1.Serializer::class)
public class InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1(
  public val logs: String,
  public val type:
      InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType,
) {
  public class Builder {
    private var logsValue: String? = null

    public var logs: String
      get() = requireNotNull(logsValue) { "logs is required" }
      set(`value`) {
        logsValue = value
      }

    private var typeValue:
        InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType? =
        null

    public var type:
        InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1 {
      check(logsValue != null) { "logs is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1(
        logs = logs,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1 must " +
          "be a JSON object")
      val logs = json.decodeRequired<String>(raw, "logs")
      val type = json
        .decodeRequired<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType>(raw,
          "type")
      return InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1(
        logs = logs,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("logs", value.logs)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1(block: InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1.Builder.() -> Unit): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1 = InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1 is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
