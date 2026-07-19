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
 * A native `shell_call` output item matching OpenAI's Responses API shape. Emitted for the sandbox-backed `shell` tool.
 */
@Serializable(with = OutputShellCallItem.Serializer::class)
public class OutputShellCallItem(
  public val callId: String,
  public val id: String,
  public val status: ShellCallStatus,
  public val type: InlineComponentsSchemasOutputShellCallItemPropertiesType,
  public val action: InlineComponentsSchemasOutputShellCallItemPropertiesAction? = null,
) {
  public class Builder {
    private var callIdValue: String? = null

    public var callId: String
      get() = requireNotNull(callIdValue) { "callId is required" }
      set(`value`) {
        callIdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var statusValue: ShellCallStatus? = null

    public var status: ShellCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineComponentsSchemasOutputShellCallItemPropertiesType? = null

    public var type: InlineComponentsSchemasOutputShellCallItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var action: InlineComponentsSchemasOutputShellCallItemPropertiesAction? = null

    public fun build(): OutputShellCallItem {
      check(callIdValue != null) { "callId is required" }
      check(idValue != null) { "id is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputShellCallItem(
        callId = callId,
        id = id,
        status = status,
        type = type,
        action = action,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputShellCallItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutputShellCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputShellCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputShellCallItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OutputShellCallItem must be a JSON object")
      val callId = json.decodeRequired<String>(raw, "call_id")
      val id = json.decodeRequired<String>(raw, "id")
      val status = json.decodeRequired<ShellCallStatus>(raw, "status")
      val type = json.decodeRequired<InlineComponentsSchemasOutputShellCallItemPropertiesType>(raw, "type")
      return OutputShellCallItem(
        callId = callId,
        id = id,
        status = status,
        type = type,
        action = raw["action"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasOutputShellCallItemPropertiesAction>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputShellCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputShellCallItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("call_id", value.callId)
        put("id", value.id)
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.action?.let { put("action", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputShellCallItem(block: OutputShellCallItem.Builder.() -> Unit): OutputShellCallItem =
  OutputShellCallItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputShellCallItem is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
