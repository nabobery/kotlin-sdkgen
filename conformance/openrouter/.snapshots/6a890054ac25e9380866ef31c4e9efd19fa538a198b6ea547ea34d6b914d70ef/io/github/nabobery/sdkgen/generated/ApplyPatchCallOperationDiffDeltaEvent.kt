package io.github.nabobery.sdkgen.generated

import kotlin.Int
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
 * Incremental chunk of `operation.diff` for an `apply_patch_call`. Matches OpenAI's streaming shape.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallOperationDiffDeltaEvent
 */
@Serializable(with = ApplyPatchCallOperationDiffDeltaEvent.Serializer::class)
public class ApplyPatchCallOperationDiffDeltaEvent(
  public val delta: String,
  public val itemId: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3,
) {
  public class Builder {
    private var deltaValue: String? = null

    public var delta: String
      get() = requireNotNull(deltaValue) { "delta is required" }
      set(`value`) {
        deltaValue = value
      }

    private var itemIdValue: String? = null

    public var itemId: String
      get() = requireNotNull(itemIdValue) { "itemId is required" }
      set(`value`) {
        itemIdValue = value
      }

    private var outputIndexValue: Int? = null

    public var outputIndex: Int
      get() = requireNotNull(outputIndexValue) { "outputIndex is required" }
      set(`value`) {
        outputIndexValue = value
      }

    private var sequenceNumberValue: Int? = null

    public var sequenceNumber: Int
      get() = requireNotNull(sequenceNumberValue) { "sequenceNumber is required" }
      set(`value`) {
        sequenceNumberValue = value
      }

    private var typeValue: InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3? = null

    public var type: InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ApplyPatchCallOperationDiffDeltaEvent {
      check(deltaValue != null) { "delta is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return ApplyPatchCallOperationDiffDeltaEvent(
        delta = delta,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ApplyPatchCallOperationDiffDeltaEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ApplyPatchCallOperationDiffDeltaEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApplyPatchCallOperationDiffDeltaEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ApplyPatchCallOperationDiffDeltaEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ApplyPatchCallOperationDiffDeltaEvent must be a JSON object")
      val delta = json.decodeRequired<String>(rawObject, "delta")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3>(rawObject, "type")
      return ApplyPatchCallOperationDiffDeltaEvent(
        delta = delta,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ApplyPatchCallOperationDiffDeltaEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ApplyPatchCallOperationDiffDeltaEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("delta", value.delta)
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun applyPatchCallOperationDiffDeltaEvent(block: ApplyPatchCallOperationDiffDeltaEvent.Builder.() -> Unit): ApplyPatchCallOperationDiffDeltaEvent = ApplyPatchCallOperationDiffDeltaEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ApplyPatchCallOperationDiffDeltaEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
