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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesResult/allOf/1/properties/context_management/properties/appl
 * ied_edits/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesResult/allOf/1/properties/context_management/properties/appl
 * ied_edits/items
 */
@Serializable(with = InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489.Serializer::class)
public class InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489(
  public val type: String,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateInlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489AdditionalProperties(additionalProperties)

  public class Builder {
    private var typeValue: String? = null

    public var type: String
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

    public fun build(): InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489 {
      check(typeValue != null) { "type is required" }
      return InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489(
        type = type,
        additionalProperties = additionalProperties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489 must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489(
        type = type,
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("type") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("type")) { "InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489 additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateInlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489AdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("type") }
  require(collision == null) { "InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489 additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun inlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489(block: InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489.Builder.() -> Unit): InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489 = InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
