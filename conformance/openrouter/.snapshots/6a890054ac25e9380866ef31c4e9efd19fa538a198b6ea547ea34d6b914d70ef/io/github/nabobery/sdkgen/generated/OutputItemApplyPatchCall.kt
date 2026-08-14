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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OutputItemApplyPatchCall.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemApplyPatchCall
 */
@Serializable(with = OutputItemApplyPatchCall.Serializer::class)
public class OutputItemApplyPatchCall(
  public val callId: String,
  public val id: String,
  public val operation: InlineOutputItemApplyPatchCallOperationX930906f6,
  public val status: InlineOutputItemApplyPatchCallStatusX79afd49e,
  public val type: InlineOutputItemApplyPatchCallTypeX29e31f9b,
  public val createdBy: String? = null,
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

    private var operationValue: InlineOutputItemApplyPatchCallOperationX930906f6? = null

    public var operation: InlineOutputItemApplyPatchCallOperationX930906f6
      get() = requireNotNull(operationValue) { "operation is required" }
      set(`value`) {
        operationValue = value
      }

    private var statusValue: InlineOutputItemApplyPatchCallStatusX79afd49e? = null

    public var status: InlineOutputItemApplyPatchCallStatusX79afd49e
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputItemApplyPatchCallTypeX29e31f9b? = null

    public var type: InlineOutputItemApplyPatchCallTypeX29e31f9b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var createdBy: String? = null

    public fun build(): OutputItemApplyPatchCall {
      check(callIdValue != null) { "callId is required" }
      check(idValue != null) { "id is required" }
      check(operationValue != null) { "operation is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputItemApplyPatchCall(
        callId = callId,
        id = id,
        operation = operation,
        status = status,
        type = type,
        createdBy = createdBy,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputItemApplyPatchCall = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputItemApplyPatchCall> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputItemApplyPatchCall {
      val jsonDecoder = decoder.requireJsonDecoder("OutputItemApplyPatchCall")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputItemApplyPatchCall must be a JSON object")
      val callId = json.decodeRequired<String>(rawObject, "call_id")
      val id = json.decodeRequired<String>(rawObject, "id")
      val operation = json.decodeRequired<InlineOutputItemApplyPatchCallOperationX930906f6>(rawObject, "operation")
      val status = json.decodeRequired<InlineOutputItemApplyPatchCallStatusX79afd49e>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputItemApplyPatchCallTypeX29e31f9b>(rawObject, "type")
      return OutputItemApplyPatchCall(
        callId = callId,
        id = id,
        operation = operation,
        status = status,
        type = type,
        createdBy = rawObject["created_by"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputItemApplyPatchCall) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputItemApplyPatchCall")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("call_id", value.callId)
        put("id", value.id)
        put("operation", json.encodeToJsonElement(value.operation))
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.createdBy?.let { put("created_by", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputItemApplyPatchCall(block: OutputItemApplyPatchCall.Builder.() -> Unit): OutputItemApplyPatchCall = OutputItemApplyPatchCall.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputItemApplyPatchCall is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
