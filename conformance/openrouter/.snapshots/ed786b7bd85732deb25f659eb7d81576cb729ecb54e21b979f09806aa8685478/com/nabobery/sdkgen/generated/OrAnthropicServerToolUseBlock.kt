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

@Serializable
public data class OrAnthropicServerToolUseBlockView(
  public val caller: OrAnthropicNullableCaller? = null,
  public val id: String,
  public val input: JsonElement? = null,
  public val name: String,
  public val type: InlineOrAnthropicServerToolUseBlockTypeX72973005,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ORAnthropicServerToolUseBlock.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ORAnthropicServerToolUseBlock
 */
@Serializable(with = OrAnthropicServerToolUseBlock.Serializer::class)
public class OrAnthropicServerToolUseBlock(
  public val id: String,
  public val name: String,
  public val type: InlineOrAnthropicServerToolUseBlockTypeX72973005,
  public val caller: OrAnthropicNullableCaller? = null,
  public val input: JsonElement? = null,
) {
  public class Builder {
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

    private var typeValue: InlineOrAnthropicServerToolUseBlockTypeX72973005? = null

    public var type: InlineOrAnthropicServerToolUseBlockTypeX72973005
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var caller: OrAnthropicNullableCaller? = null

    public var input: JsonElement? = null

    public fun build(): OrAnthropicServerToolUseBlock {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return OrAnthropicServerToolUseBlock(
        id = id,
        name = name,
        type = type,
        caller = caller,
        input = input,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrAnthropicServerToolUseBlock = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OrAnthropicServerToolUseBlock> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrAnthropicServerToolUseBlock {
      val jsonDecoder = decoder.requireJsonDecoder("OrAnthropicServerToolUseBlock")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrAnthropicServerToolUseBlock must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<InlineOrAnthropicServerToolUseBlockTypeX72973005>(rawObject, "type")
      return OrAnthropicServerToolUseBlock(
        id = id,
        name = name,
        type = type,
        caller = rawObject["caller"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<OrAnthropicNullableCaller?>(element) },
        input = rawObject["input"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrAnthropicServerToolUseBlock) {
      val jsonEncoder = encoder.requireJsonEncoder("OrAnthropicServerToolUseBlock")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("name", value.name)
        put("type", json.encodeToJsonElement(value.type))
        value.caller?.let { put("caller", json.encodeToJsonElement(it)) }
        value.input?.let { put("input", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun orAnthropicServerToolUseBlock(block: OrAnthropicServerToolUseBlock.Builder.() -> Unit): OrAnthropicServerToolUseBlock = OrAnthropicServerToolUseBlock.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrAnthropicServerToolUseBlock is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
