package com.nabobery.sdkgen.generated

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
 * Emitted when `operation.diff` streaming completes for an `apply_patch_call`.
 */
@Serializable(with = ApplyPatchCallOperationDiffDoneEvent.Serializer::class)
public class ApplyPatchCallOperationDiffDoneEvent(
  public val diff: String,
  public val itemId: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineComponentsSchemasApplyPatchCallOperationDiffDoneEventPropertiesType,
) {
  public class Builder {
    private var diffValue: String? = null

    public var diff: String
      get() = requireNotNull(diffValue) { "diff is required" }
      set(`value`) {
        diffValue = value
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

    private var typeValue:
        InlineComponentsSchemasApplyPatchCallOperationDiffDoneEventPropertiesType? = null

    public var type: InlineComponentsSchemasApplyPatchCallOperationDiffDoneEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ApplyPatchCallOperationDiffDoneEvent {
      check(diffValue != null) { "diff is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return ApplyPatchCallOperationDiffDoneEvent(
        diff = diff,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ApplyPatchCallOperationDiffDoneEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ApplyPatchCallOperationDiffDoneEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApplyPatchCallOperationDiffDoneEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ApplyPatchCallOperationDiffDoneEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ApplyPatchCallOperationDiffDoneEvent must be a JSON object")
      val diff = json.decodeRequired<String>(raw, "diff")
      val itemId = json.decodeRequired<String>(raw, "item_id")
      val outputIndex = json.decodeRequired<Int>(raw, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val type = json.decodeRequired<InlineComponentsSchemasApplyPatchCallOperationDiffDoneEventPropertiesType>(raw,
        "type")
      return ApplyPatchCallOperationDiffDoneEvent(
        diff = diff,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ApplyPatchCallOperationDiffDoneEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ApplyPatchCallOperationDiffDoneEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("diff", value.diff)
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun applyPatchCallOperationDiffDoneEvent(block: ApplyPatchCallOperationDiffDoneEvent.Builder.() ->
  Unit): ApplyPatchCallOperationDiffDoneEvent = ApplyPatchCallOperationDiffDoneEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("ApplyPatchCallOperationDiffDoneEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
