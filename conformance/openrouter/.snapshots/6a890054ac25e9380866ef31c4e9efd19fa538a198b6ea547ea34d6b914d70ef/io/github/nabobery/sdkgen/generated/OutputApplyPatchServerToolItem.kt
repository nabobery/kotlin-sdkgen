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
 * An openrouter:apply_patch server tool output item. The turn halts when validation succeeds so the client can apply
 * the patch and echo an `apply_patch_call_output` on the next turn.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputApplyPatchServerToolItem
 */
@Serializable(with = OutputApplyPatchServerToolItem.Serializer::class)
public class OutputApplyPatchServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineOutputApplyPatchServerToolItemTypeX816f4f63,
  public val callId: String? = null,
  public val id: String? = null,
  public val operation: ApplyPatchCallOperation? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputApplyPatchServerToolItemTypeX816f4f63? = null

    public var type: InlineOutputApplyPatchServerToolItemTypeX816f4f63
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var callId: String? = null

    public var id: String? = null

    public var operation: ApplyPatchCallOperation? = null

    public fun build(): OutputApplyPatchServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputApplyPatchServerToolItem(
        status = status,
        type = type,
        callId = callId,
        id = id,
        operation = operation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputApplyPatchServerToolItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputApplyPatchServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputApplyPatchServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputApplyPatchServerToolItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputApplyPatchServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputApplyPatchServerToolItemTypeX816f4f63>(rawObject, "type")
      return OutputApplyPatchServerToolItem(
        status = status,
        type = type,
        callId = rawObject["call_id"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        operation = rawObject["operation"]?.let { json.decodeFromJsonElement<ApplyPatchCallOperation>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputApplyPatchServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputApplyPatchServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.callId?.let { put("call_id", it) }
        value.id?.let { put("id", it) }
        value.operation?.let { put("operation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputApplyPatchServerToolItem(block: OutputApplyPatchServerToolItem.Builder.() -> Unit): OutputApplyPatchServerToolItem = OutputApplyPatchServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputApplyPatchServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
