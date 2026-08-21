package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class ApplyPatchCallItemView(
  @SerialName("call_id")
  public val callId: String,
  public val id: String? = null,
  public val operation: ApplyPatchCallOperation,
  public val status: ApplyPatchCallStatus,
  public val type: InlineApplyPatchCallItemTypeX3b26d518,
)

/**
 * A tool call emitted by the model requesting a V4A patch operation. The client applies the patch and echoes an
 * `apply_patch_call_output` on the next turn.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallItem
 */
@Serializable(with = ApplyPatchCallItem.Serializer::class)
public class ApplyPatchCallItem(
  public val callId: String,
  public val operation: ApplyPatchCallOperation,
  public val status: ApplyPatchCallStatus,
  public val type: InlineApplyPatchCallItemTypeX3b26d518,
  public val id: String? = null,
) {
  public class Builder {
    private var callIdValue: String? = null

    public var callId: String
      get() = requireNotNull(callIdValue) { "callId is required" }
      set(`value`) {
        callIdValue = value
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

    private var typeValue: InlineApplyPatchCallItemTypeX3b26d518? = null

    public var type: InlineApplyPatchCallItemTypeX3b26d518
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public fun build(): ApplyPatchCallItem {
      check(callIdValue != null) { "callId is required" }
      check(operationValue != null) { "operation is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return ApplyPatchCallItem(
        callId = callId,
        operation = operation,
        status = status,
        type = type,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ApplyPatchCallItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ApplyPatchCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApplyPatchCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("ApplyPatchCallItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ApplyPatchCallItem must be a JSON object")
      val callId = json.decodeRequired<String>(rawObject, "call_id")
      val operation = json.decodeRequired<ApplyPatchCallOperation>(rawObject, "operation")
      val status = json.decodeRequired<ApplyPatchCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineApplyPatchCallItemTypeX3b26d518>(rawObject, "type")
      return ApplyPatchCallItem(
        callId = callId,
        operation = operation,
        status = status,
        type = type,
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ApplyPatchCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("ApplyPatchCallItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("call_id", value.callId)
        put("operation", json.encodeToJsonElement(value.operation))
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun applyPatchCallItem(block: ApplyPatchCallItem.Builder.() -> Unit): ApplyPatchCallItem = ApplyPatchCallItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ApplyPatchCallItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
