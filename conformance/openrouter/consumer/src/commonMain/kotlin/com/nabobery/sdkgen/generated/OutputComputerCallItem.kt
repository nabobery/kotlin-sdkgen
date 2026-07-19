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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OutputComputerCallItem.
 */
@Serializable(with = OutputComputerCallItem.Serializer::class)
public class OutputComputerCallItem(
  public val callId: String,
  pendingSafetyChecks: List<InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems>,
  public val status: InlineComponentsSchemasOutputComputerCallItemPropertiesStatus,
  public val type: InlineComponentsSchemasOutputComputerCallItemPropertiesType,
  public val action: JsonElement? = null,
  public val id: String? = null,
) {
  public val pendingSafetyChecks:
      List<InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems> =
      pendingSafetyChecks.toList()

  public class Builder {
    private var callIdValue: String? = null

    public var callId: String
      get() = requireNotNull(callIdValue) { "callId is required" }
      set(`value`) {
        callIdValue = value
      }

    private var pendingSafetyChecksValue:
        List<InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems>? =
        null

    public var pendingSafetyChecks:
        List<InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems>
      get() = requireNotNull(pendingSafetyChecksValue) { "pendingSafetyChecks is required" }
      set(`value`) {
        pendingSafetyChecksValue = value
      }

    private var statusValue: InlineComponentsSchemasOutputComputerCallItemPropertiesStatus? = null

    public var status: InlineComponentsSchemasOutputComputerCallItemPropertiesStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineComponentsSchemasOutputComputerCallItemPropertiesType? = null

    public var type: InlineComponentsSchemasOutputComputerCallItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var action: JsonElement? = null

    public var id: String? = null

    public fun build(): OutputComputerCallItem {
      check(callIdValue != null) { "callId is required" }
      check(pendingSafetyChecksValue != null) { "pendingSafetyChecks is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputComputerCallItem(
        callId = callId,
        pendingSafetyChecks = pendingSafetyChecks,
        status = status,
        type = type,
        action = action,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputComputerCallItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutputComputerCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputComputerCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputComputerCallItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OutputComputerCallItem must be a JSON object")
      val callId = json.decodeRequired<String>(raw, "call_id")
      val pendingSafetyChecks = json
        .decodeRequired<List<InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems>>(raw,
          "pending_safety_checks")
      val status = json.decodeRequired<InlineComponentsSchemasOutputComputerCallItemPropertiesStatus>(raw, "status")
      val type = json.decodeRequired<InlineComponentsSchemasOutputComputerCallItemPropertiesType>(raw, "type")
      return OutputComputerCallItem(
        callId = callId,
        pendingSafetyChecks = pendingSafetyChecks,
        status = status,
        type = type,
        action = raw["action"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<JsonElement?>(element) },
        id = raw["id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputComputerCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputComputerCallItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("call_id", value.callId)
        put("pending_safety_checks", json.encodeToJsonElement(value.pendingSafetyChecks))
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.action?.let { put("action", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputComputerCallItem(block: OutputComputerCallItem.Builder.() -> Unit): OutputComputerCallItem =
  OutputComputerCallItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputComputerCallItem is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
