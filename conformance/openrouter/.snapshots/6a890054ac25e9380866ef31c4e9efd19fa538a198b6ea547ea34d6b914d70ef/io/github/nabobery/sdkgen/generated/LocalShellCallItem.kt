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
 * A local shell command execution call
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/LocalShellCallItem
 */
@Serializable(with = LocalShellCallItem.Serializer::class)
public class LocalShellCallItem(
  public val action: InlineLocalShellCallItemActionXc05bceb6,
  public val callId: String,
  public val id: String,
  public val status: ToolCallStatus,
  public val type: InlineLocalShellCallItemTypeX8c954f03,
) {
  public class Builder {
    private var actionValue: InlineLocalShellCallItemActionXc05bceb6? = null

    public var action: InlineLocalShellCallItemActionXc05bceb6
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

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineLocalShellCallItemTypeX8c954f03? = null

    public var type: InlineLocalShellCallItemTypeX8c954f03
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): LocalShellCallItem {
      check(actionValue != null) { "action is required" }
      check(callIdValue != null) { "callId is required" }
      check(idValue != null) { "id is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return LocalShellCallItem(
        action = action,
        callId = callId,
        id = id,
        status = status,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LocalShellCallItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LocalShellCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LocalShellCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("LocalShellCallItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LocalShellCallItem must be a JSON object")
      val action = json.decodeRequired<InlineLocalShellCallItemActionXc05bceb6>(rawObject, "action")
      val callId = json.decodeRequired<String>(rawObject, "call_id")
      val id = json.decodeRequired<String>(rawObject, "id")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineLocalShellCallItemTypeX8c954f03>(rawObject, "type")
      return LocalShellCallItem(
        action = action,
        callId = callId,
        id = id,
        status = status,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: LocalShellCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("LocalShellCallItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("call_id", value.callId)
        put("id", value.id)
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun localShellCallItem(block: LocalShellCallItem.Builder.() -> Unit): LocalShellCallItem = LocalShellCallItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("LocalShellCallItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
