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
 * sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem/properties/content/items/oneOf/2.
 */
@Serializable(with = InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2.Serializer::class)
public class InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2(
  public val encryptedContent: String,
  public val type:
      InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType,
) {
  public class Builder {
    private var encryptedContentValue: String? = null

    public var encryptedContent: String
      get() = requireNotNull(encryptedContentValue) { "encryptedContent is required" }
      set(`value`) {
        encryptedContentValue = value
      }

    private var typeValue:
        InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType? = null

    public var type:
        InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2 {
      check(encryptedContentValue != null) { "encryptedContent is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2(
        encryptedContent = encryptedContent,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2 must be a " +
          "JSON object")
      val encryptedContent = json.decodeRequired<String>(raw, "encrypted_content")
      val type = json
        .decodeRequired<InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType>(raw, "type")
      return InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2(
        encryptedContent = encryptedContent,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("encrypted_content", value.encryptedContent)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2(block: InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2.Builder.() -> Unit): InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2 = InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
