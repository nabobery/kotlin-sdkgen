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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolUseBlock.
 */
@Serializable(with = AnthropicToolUseBlock.Serializer::class)
public class AnthropicToolUseBlock(
  public val caller: AnthropicCaller,
  public val id: String,
  public val name: String,
  public val type: InlineComponentsSchemasAnthropicToolUseBlockPropertiesType,
  public val input: JsonElement? = null,
) {
  public class Builder {
    private var callerValue: AnthropicCaller? = null

    public var caller: AnthropicCaller
      get() = requireNotNull(callerValue) { "caller is required" }
      set(`value`) {
        callerValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineComponentsSchemasAnthropicToolUseBlockPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicToolUseBlockPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var input: JsonElement? = null

    public fun build(): AnthropicToolUseBlock {
      check(callerValue != null) { "caller is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicToolUseBlock(
        caller = caller,
        id = id,
        name = name,
        type = type,
        input = input,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicToolUseBlock = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicToolUseBlock> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicToolUseBlock {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicToolUseBlock")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicToolUseBlock must be a JSON object")
      val caller = json.decodeRequired<AnthropicCaller>(raw, "caller")
      val id = json.decodeRequired<String>(raw, "id")
      val name = json.decodeRequired<String>(raw, "name")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicToolUseBlockPropertiesType>(raw, "type")
      return AnthropicToolUseBlock(
        caller = caller,
        id = id,
        name = name,
        type = type,
        input = raw["input"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<JsonElement?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicToolUseBlock) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicToolUseBlock")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("caller", json.encodeToJsonElement(value.caller))
        put("id", value.id)
        put("name", value.name)
        put("type", json.encodeToJsonElement(value.type))
        value.input?.let { put("input", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicToolUseBlock(block: AnthropicToolUseBlock.Builder.() -> Unit): AnthropicToolUseBlock =
  AnthropicToolUseBlock.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicToolUseBlock is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
