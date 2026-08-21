package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A code interpreter execution call with outputs
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputCodeInterpreterCallItem
 */
@Serializable(with = OutputCodeInterpreterCallItem.Serializer::class)
public class OutputCodeInterpreterCallItem(
  public val code: String?,
  public val containerId: String,
  public val id: String,
  outputs: List<InlineCodeInterpreterCallItemOutputsItemXcf11179a>?,
  public val status: ToolCallStatus,
  public val type: InlineCodeInterpreterCallItemTypeXbc02d595,
) {
  public val outputs: List<InlineCodeInterpreterCallItemOutputsItemXcf11179a>? =
      outputs?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var containerIdValue: String? = null

    public var containerId: String
      get() = requireNotNull(containerIdValue) { "containerId is required" }
      set(`value`) {
        containerIdValue = value
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

    private var typeValue: InlineCodeInterpreterCallItemTypeXbc02d595? = null

    public var type: InlineCodeInterpreterCallItemTypeXbc02d595
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var codeState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var code: String?
      get() = codeState.valueOrNull()
      set(`value`) {
        codeState = value.toNullableFieldState()
      }

    private var outputsState: FieldState<List<InlineCodeInterpreterCallItemOutputsItemXcf11179a>?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var outputs: List<InlineCodeInterpreterCallItemOutputsItemXcf11179a>?
      get() = outputsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        outputsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    public fun build(): OutputCodeInterpreterCallItem {
      check(containerIdValue != null) { "containerId is required" }
      check(idValue != null) { "id is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      check(codeState !== FieldState.Absent) { "code is required, even when null" }
      check(outputsState !== FieldState.Absent) { "outputs is required, even when null" }
      return OutputCodeInterpreterCallItem(
        code = codeState.valueOrNull(),
        containerId = containerId,
        id = id,
        outputs = outputsState.valueOrNull(),
        status = status,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputCodeInterpreterCallItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputCodeInterpreterCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputCodeInterpreterCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputCodeInterpreterCallItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputCodeInterpreterCallItem must be a JSON object")
      val containerId = json.decodeRequired<String>(rawObject, "container_id")
      val id = json.decodeRequired<String>(rawObject, "id")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineCodeInterpreterCallItemTypeXbc02d595>(rawObject, "type")
      if (!rawObject.containsKey("code")) {
        throw SerializationException("OutputCodeInterpreterCallItem is missing required property 'code'")
      }
      val code = rawObject["code"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("outputs")) {
        throw SerializationException("OutputCodeInterpreterCallItem is missing required property 'outputs'")
      }
      val outputs = rawObject["outputs"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineCodeInterpreterCallItemOutputsItemXcf11179a>?>(requireNotNull(element)) }
      return OutputCodeInterpreterCallItem(
        code = code,
        containerId = containerId,
        id = id,
        outputs = outputs,
        status = status,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputCodeInterpreterCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputCodeInterpreterCallItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", value.code?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("container_id", value.containerId)
        put("id", value.id)
        put("outputs", value.outputs?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputCodeInterpreterCallItem(block: OutputCodeInterpreterCallItem.Builder.() -> Unit): OutputCodeInterpreterCallItem = OutputCodeInterpreterCallItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputCodeInterpreterCallItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("OutputCodeInterpreterCallItem property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
