package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem/properties/content/items/oneOf/2
 */
@Serializable(with = InlineAgentMessageItemContentItemOneOf3X70e2ca1a.Serializer::class)
public class InlineAgentMessageItemContentItemOneOf3X70e2ca1a(
  public val encryptedContent: String,
  public val type: InlineAgentMessageItemContentItemOneOf3TypeX5fe6d0fe,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateInlineAgentMessageItemContentItemOneOf3X70e2ca1aAdditionalProperties(additionalProperties)

  public class Builder {
    private var encryptedContentValue: String? = null

    public var encryptedContent: String
      get() = requireNotNull(encryptedContentValue) { "encryptedContent is required" }
      set(`value`) {
        encryptedContentValue = value
      }

    private var typeValue: InlineAgentMessageItemContentItemOneOf3TypeX5fe6d0fe? = null

    public var type: InlineAgentMessageItemContentItemOneOf3TypeX5fe6d0fe
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var additionalPropertiesValue: Map<String, JsonElement> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, JsonElement>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): InlineAgentMessageItemContentItemOneOf3X70e2ca1a {
      check(encryptedContentValue != null) { "encryptedContent is required" }
      check(typeValue != null) { "type is required" }
      return InlineAgentMessageItemContentItemOneOf3X70e2ca1a(
        encryptedContent = encryptedContent,
        type = type,
        additionalProperties = additionalProperties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentMessageItemContentItemOneOf3X70e2ca1a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentMessageItemContentItemOneOf3X70e2ca1a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentMessageItemContentItemOneOf3X70e2ca1a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentMessageItemContentItemOneOf3X70e2ca1a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentMessageItemContentItemOneOf3X70e2ca1a must be a JSON object")
      val encryptedContent = json.decodeRequired<String>(rawObject, "encrypted_content")
      val type = json.decodeRequired<InlineAgentMessageItemContentItemOneOf3TypeX5fe6d0fe>(rawObject, "type")
      return InlineAgentMessageItemContentItemOneOf3X70e2ca1a(
        encryptedContent = encryptedContent,
        type = type,
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("encrypted_content", "type") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentMessageItemContentItemOneOf3X70e2ca1a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentMessageItemContentItemOneOf3X70e2ca1a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("encrypted_content", value.encryptedContent)
        put("type", json.encodeToJsonElement(value.type))
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("encrypted_content", "type")) { "InlineAgentMessageItemContentItemOneOf3X70e2ca1a additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateInlineAgentMessageItemContentItemOneOf3X70e2ca1aAdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("encrypted_content", "type") }
  require(collision == null) { "InlineAgentMessageItemContentItemOneOf3X70e2ca1a additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun inlineAgentMessageItemContentItemOneOf3X70e2ca1a(block: InlineAgentMessageItemContentItemOneOf3X70e2ca1a.Builder.() -> Unit): InlineAgentMessageItemContentItemOneOf3X70e2ca1a = InlineAgentMessageItemContentItemOneOf3X70e2ca1a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentMessageItemContentItemOneOf3X70e2ca1a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
