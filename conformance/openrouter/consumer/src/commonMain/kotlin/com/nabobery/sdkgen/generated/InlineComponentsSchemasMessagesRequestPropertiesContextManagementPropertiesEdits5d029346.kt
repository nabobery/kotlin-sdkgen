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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/0.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346
  .Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346(
  public val type:
      InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4,
  public val clearAtLeast: AnthropicInputTokensClearAtLeast? = null,
  public val clearToolInputs:
      InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b? = null,
  public val excludeTools: List<String>? = null,
  public val keep: AnthropicToolUsesKeep? = null,
  public val trigger:
      InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f? = null,
) {
  public class Builder {
    private var typeValue:
        InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4? =
        null

    public var type:
        InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var clearAtLeast: AnthropicInputTokensClearAtLeast? = null

    public var clearToolInputs:
        InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b? =
        null

    public var excludeTools: List<String>? = null

    public var keep: AnthropicToolUsesKeep? = null

    public var trigger:
        InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f? =
        null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346(
        type = type,
        clearAtLeast = clearAtLeast,
        clearToolInputs = clearToolInputs,
        excludeTools = excludeTools,
        keep = keep,
        trigger = trigger,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346 = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346 " +
          "must be a JSON object")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4>(raw,
          "type")
      return InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346(
        type = type,
        clearAtLeast = raw["clear_at_least"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<AnthropicInputTokensClearAtLeast?>(element) },
        clearToolInputs = raw["clear_tool_inputs"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b?>(element) },
        excludeTools = raw["exclude_tools"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<String>?>(element) },
        keep = raw["keep"]?.let { json.decodeFromJsonElement<AnthropicToolUsesKeep>(it) },
        trigger = raw["trigger"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.clearAtLeast?.let { put("clear_at_least", json.encodeToJsonElement(it)) }
        value.clearToolInputs?.let { put("clear_tool_inputs", json.encodeToJsonElement(it)) }
        value.excludeTools?.let { put("exclude_tools", json.encodeToJsonElement(it)) }
        value.keep?.let { put("keep", json.encodeToJsonElement(it)) }
        value.trigger?.let { put("trigger", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346(block: InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346 = InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346 " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
