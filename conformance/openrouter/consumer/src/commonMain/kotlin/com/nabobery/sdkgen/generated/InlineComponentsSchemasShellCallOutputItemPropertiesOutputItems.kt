package com.nabobery.sdkgen.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ShellCallOutputItem/properties/output/items.
 */
@Serializable(with = InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems.Serializer::class)
public class InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems(
  public val type: String,
  public val content: String? = null,
  public val exitCode: Int? = null,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var content: String? = null

    public var exitCode: Int? = null

    public fun build(): InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems(
        type = type,
        content = content,
        exitCode = exitCode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems must be a JSON " +
          "object")
      val type = json.decodeRequired<String>(raw, "type")
      return InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems(
        type = type,
        content = raw["content"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        exitCode = raw["exit_code"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.content?.let { put("content", it) }
        value.exitCode?.let { put("exit_code", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasShellCallOutputItemPropertiesOutputItems(block: InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems.Builder.() -> Unit): InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems = InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
