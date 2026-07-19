package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolSearchResult.
 */
@Serializable(with = AnthropicToolSearchResult.Serializer::class)
public class AnthropicToolSearchResult(
  toolReferences: List<AnthropicToolReference>,
  public val type: InlineComponentsSchemasAnthropicToolSearchResultPropertiesType,
) {
  public val toolReferences: List<AnthropicToolReference> = toolReferences.toList()

  public class Builder {
    private var toolReferencesValue: List<AnthropicToolReference>? = null

    public var toolReferences: List<AnthropicToolReference>
      get() = requireNotNull(toolReferencesValue) { "toolReferences is required" }
      set(`value`) {
        toolReferencesValue = value
      }

    private var typeValue: InlineComponentsSchemasAnthropicToolSearchResultPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicToolSearchResultPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicToolSearchResult {
      check(toolReferencesValue != null) { "toolReferences is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicToolSearchResult(
        toolReferences = toolReferences,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicToolSearchResult = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicToolSearchResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicToolSearchResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicToolSearchResult")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicToolSearchResult must be a JSON object")
      val toolReferences = json.decodeRequired<List<AnthropicToolReference>>(raw, "tool_references")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicToolSearchResultPropertiesType>(raw, "type")
      return AnthropicToolSearchResult(
        toolReferences = toolReferences,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicToolSearchResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicToolSearchResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tool_references", json.encodeToJsonElement(value.toolReferences))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicToolSearchResult(block: AnthropicToolSearchResult.Builder.() -> Unit): AnthropicToolSearchResult =
  AnthropicToolSearchResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicToolSearchResult is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
