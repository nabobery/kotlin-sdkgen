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
 * A shell command execution call (newer variant)
 */
@Serializable(with = ShellCallItem.Serializer::class)
public class ShellCallItem(
  public val action: InlineComponentsSchemasShellCallItemPropertiesAction,
  public val callId: String,
  public val type: InlineComponentsSchemasShellCallItemPropertiesType,
  public val environment: JsonElement? = null,
  public val id: String? = null,
  public val status: ToolCallStatus? = null,
) {
  public class Builder {
    private var actionValue: InlineComponentsSchemasShellCallItemPropertiesAction? = null

    public var action: InlineComponentsSchemasShellCallItemPropertiesAction
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var callIdValue: String? = null

    public var callId: String
      get() = requireNotNull(callIdValue) { "callId is required" }
      set(`value`) {
        callIdValue = value
      }

    private var typeValue: InlineComponentsSchemasShellCallItemPropertiesType? = null

    public var type: InlineComponentsSchemasShellCallItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var environment: JsonElement? = null

    public var id: String? = null

    public var status: ToolCallStatus? = null

    public fun build(): ShellCallItem {
      check(actionValue != null) { "action is required" }
      check(callIdValue != null) { "callId is required" }
      check(typeValue != null) { "type is required" }
      return ShellCallItem(
        action = action,
        callId = callId,
        type = type,
        environment = environment,
        id = id,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ShellCallItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ShellCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ShellCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("ShellCallItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ShellCallItem must be a JSON object")
      val action = json.decodeRequired<InlineComponentsSchemasShellCallItemPropertiesAction>(raw, "action")
      val callId = json.decodeRequired<String>(raw, "call_id")
      val type = json.decodeRequired<InlineComponentsSchemasShellCallItemPropertiesType>(raw, "type")
      return ShellCallItem(
        action = action,
        callId = callId,
        type = type,
        environment = raw["environment"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<JsonElement?>(element) },
        id = raw["id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        status = raw["status"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ToolCallStatus?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ShellCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("ShellCallItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("call_id", value.callId)
        put("type", json.encodeToJsonElement(value.type))
        value.environment?.let { put("environment", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun shellCallItem(block: ShellCallItem.Builder.() -> Unit): ShellCallItem = ShellCallItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ShellCallItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
