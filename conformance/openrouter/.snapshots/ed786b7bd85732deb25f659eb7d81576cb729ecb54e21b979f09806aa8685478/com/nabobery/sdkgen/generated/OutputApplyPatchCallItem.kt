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
 * A native `apply_patch_call` output item matching OpenAI's Responses API shape. Emitted when the client requested the
 * `apply_patch` shorthand.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputApplyPatchCallItem
 */
@Serializable(with = OutputApplyPatchCallItem.Serializer::class)
public class OutputApplyPatchCallItem(
  public val callId: String,
  public val id: String,
  public val operation: ApplyPatchCallOperation,
  public val status: ApplyPatchCallStatus,
  public val type: InlineOutputApplyPatchCallItemTypeX5efc0c7d,
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

    private var operationValue: ApplyPatchCallOperation? = null

    public var operation: ApplyPatchCallOperation
      get() = requireNotNull(operationValue) { "operation is required" }
      set(`value`) {
        operationValue = value
      }

    private var statusValue: ApplyPatchCallStatus? = null

    public var status: ApplyPatchCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputApplyPatchCallItemTypeX5efc0c7d? = null

    public var type: InlineOutputApplyPatchCallItemTypeX5efc0c7d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): OutputApplyPatchCallItem {
      check(callIdValue != null) { "callId is required" }
      check(idValue != null) { "id is required" }
      check(operationValue != null) { "operation is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputApplyPatchCallItem(
        callId = callId,
        id = id,
        operation = operation,
        status = status,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputApplyPatchCallItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputApplyPatchCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputApplyPatchCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputApplyPatchCallItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputApplyPatchCallItem must be a JSON object")
      val callId = json.decodeRequired<String>(rawObject, "call_id")
      val id = json.decodeRequired<String>(rawObject, "id")
      val operation = json.decodeRequired<ApplyPatchCallOperation>(rawObject, "operation")
      val status = json.decodeRequired<ApplyPatchCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputApplyPatchCallItemTypeX5efc0c7d>(rawObject, "type")
      return OutputApplyPatchCallItem(
        callId = callId,
        id = id,
        operation = operation,
        status = status,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputApplyPatchCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputApplyPatchCallItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("call_id", value.callId)
        put("id", value.id)
        put("operation", json.encodeToJsonElement(value.operation))
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputApplyPatchCallItem(block: OutputApplyPatchCallItem.Builder.() -> Unit): OutputApplyPatchCallItem = OutputApplyPatchCallItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputApplyPatchCallItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
