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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/0
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77.Serializer::class)
public class InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77(
  public val inputSchema: InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0,
  public val name: String,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val description: String? = null,
  public val type: InlineMessagesRequestToolsItemAnyOf1TypeXef0cc66d? = null,
) {
  public class Builder {
    private var inputSchemaValue: InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0? = null

    public var inputSchema: InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0
      get() = requireNotNull(inputSchemaValue) { "inputSchema is required" }
      set(`value`) {
        inputSchemaValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var description: String? = null

    public var type: InlineMessagesRequestToolsItemAnyOf1TypeXef0cc66d? = null

    public fun build(): InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77 {
      check(inputSchemaValue != null) { "inputSchema is required" }
      check(nameValue != null) { "name is required" }
      return InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77(
        inputSchema = inputSchema,
        name = name,
        cacheControl = cacheControl,
        description = description,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77 must be a JSON object")
      val inputSchema = json.decodeRequired<InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0>(rawObject, "input_schema")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77(
        inputSchema = inputSchema,
        name = name,
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineMessagesRequestToolsItemAnyOf1TypeXef0cc66d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_schema", json.encodeToJsonElement(value.inputSchema))
        put("name", value.name)
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestToolsItemAnyOf1Xfd5a8d77(block: InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77.Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77 = InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
