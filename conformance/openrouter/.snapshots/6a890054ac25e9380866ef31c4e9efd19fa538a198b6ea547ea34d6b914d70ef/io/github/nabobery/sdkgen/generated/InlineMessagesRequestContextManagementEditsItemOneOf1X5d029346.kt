package io.github.nabobery.sdkgen.generated

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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/0
 */
@Serializable(with = InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346.Serializer::class)
public class InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346(
  public val type: InlineMessagesRequestContextManagementEditsItemOneOf1TypeXad9edda4,
  public val clearAtLeast: AnthropicInputTokensClearAtLeast? = null,
  public val clearToolInputs:
      InlineMessagesRequestContextManagementEditsItemOneOf1ClearToolInputsX878b025b? = null,
  excludeTools: List<String>? = null,
  public val keep: AnthropicToolUsesKeep? = null,
  public val trigger: InlineMessagesRequestContextManagementEditsItemOneOf1TriggerX9c378f3f? = null,
) {
  public val excludeTools: List<String>? = excludeTools?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var typeValue: InlineMessagesRequestContextManagementEditsItemOneOf1TypeXad9edda4? =
        null

    public var type: InlineMessagesRequestContextManagementEditsItemOneOf1TypeXad9edda4
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var clearAtLeast: AnthropicInputTokensClearAtLeast? = null

    public var clearToolInputs:
        InlineMessagesRequestContextManagementEditsItemOneOf1ClearToolInputsX878b025b? = null

    private var excludeToolsValue: List<String>? = null

    public var excludeTools: List<String>?
      get() = excludeToolsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        excludeToolsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var keep: AnthropicToolUsesKeep? = null

    public var trigger: InlineMessagesRequestContextManagementEditsItemOneOf1TriggerX9c378f3f? =
        null

    public fun build(): InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346 {
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346(
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
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346 must be a JSON object")
      val type = json.decodeRequired<InlineMessagesRequestContextManagementEditsItemOneOf1TypeXad9edda4>(rawObject, "type")
      return InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346(
        type = type,
        clearAtLeast = rawObject["clear_at_least"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicInputTokensClearAtLeast?>(element) },
        clearToolInputs = rawObject["clear_tool_inputs"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineMessagesRequestContextManagementEditsItemOneOf1ClearToolInputsX878b025b?>(element) },
        excludeTools = rawObject["exclude_tools"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        keep = rawObject["keep"]?.let { json.decodeFromJsonElement<AnthropicToolUsesKeep>(it) },
        trigger = rawObject["trigger"]?.let { json.decodeFromJsonElement<InlineMessagesRequestContextManagementEditsItemOneOf1TriggerX9c378f3f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346")
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

public fun inlineMessagesRequestContextManagementEditsItemOneOf1X5d029346(block: InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346.Builder.() -> Unit): InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346 = InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestContextManagementEditsItemOneOf1X5d029346 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
