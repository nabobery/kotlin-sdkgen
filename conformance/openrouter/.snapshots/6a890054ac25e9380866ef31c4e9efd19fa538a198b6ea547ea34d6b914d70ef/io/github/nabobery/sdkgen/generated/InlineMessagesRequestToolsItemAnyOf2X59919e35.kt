package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/1
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf2X59919e35.Serializer::class)
public class InlineMessagesRequestToolsItemAnyOf2X59919e35(
  public val name: InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2,
  public val type: InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab,
  public val cacheControl: AnthropicCacheControlDirective? = null,
) {
  public class Builder {
    private var nameValue: InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2? = null

    public var name: InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab? = null

    public var type: InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public fun build(): InlineMessagesRequestToolsItemAnyOf2X59919e35 {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestToolsItemAnyOf2X59919e35(
        name = name,
        type = type,
        cacheControl = cacheControl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf2X59919e35 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf2X59919e35> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf2X59919e35 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestToolsItemAnyOf2X59919e35")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf2X59919e35 must be a JSON object")
      val name = json.decodeRequired<InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2>(rawObject, "name")
      val type = json.decodeRequired<InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab>(rawObject, "type")
      return InlineMessagesRequestToolsItemAnyOf2X59919e35(
        name = name,
        type = type,
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf2X59919e35) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestToolsItemAnyOf2X59919e35")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", json.encodeToJsonElement(value.name))
        put("type", json.encodeToJsonElement(value.type))
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestToolsItemAnyOf2X59919e35(block: InlineMessagesRequestToolsItemAnyOf2X59919e35.Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf2X59919e35 = InlineMessagesRequestToolsItemAnyOf2X59919e35.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf2X59919e35 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
