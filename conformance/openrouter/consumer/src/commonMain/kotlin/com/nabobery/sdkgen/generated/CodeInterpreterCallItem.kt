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
 */
@Serializable(with = CodeInterpreterCallItem.Serializer::class)
public class CodeInterpreterCallItem(
  public val code: String?,
  public val containerId: String,
  public val id: String,
  public val outputs: List<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems>?,
  public val status: ToolCallStatus,
  public val type: InlineComponentsSchemasCodeInterpreterCallItemPropertiesType,
) {
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

    private var typeValue: InlineComponentsSchemasCodeInterpreterCallItemPropertiesType? = null

    public var type: InlineComponentsSchemasCodeInterpreterCallItemPropertiesType
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

    private var outputsState:
        FieldState<List<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems>?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var outputs: List<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems>?
      get() = outputsState.valueOrNull()
      set(`value`) {
        outputsState = value.toNullableFieldState()
      }

    public fun build(): CodeInterpreterCallItem {
      check(containerIdValue != null) { "containerId is required" }
      check(idValue != null) { "id is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      check(codeState !== FieldState.Absent) { "code is required, even when null" }
      check(outputsState !== FieldState.Absent) { "outputs is required, even when null" }
      return CodeInterpreterCallItem(
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
    public fun build(block: Builder.() -> Unit): CodeInterpreterCallItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeInterpreterCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeInterpreterCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("CodeInterpreterCallItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("CodeInterpreterCallItem must be a JSON object")
      val containerId = json.decodeRequired<String>(raw, "container_id")
      val id = json.decodeRequired<String>(raw, "id")
      val status = json.decodeRequired<ToolCallStatus>(raw, "status")
      val type = json.decodeRequired<InlineComponentsSchemasCodeInterpreterCallItemPropertiesType>(raw, "type")
      if (!raw.containsKey("code")) {
        throw SerializationException("CodeInterpreterCallItem is missing required property 'code'")
      }
      val code = raw["code"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!raw.containsKey("outputs")) {
        throw SerializationException("CodeInterpreterCallItem is missing required property 'outputs'")
      }
      val outputs = raw["outputs"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<List<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems>?>(requireNotNull(element)) }
      return CodeInterpreterCallItem(
        code = code,
        containerId = containerId,
        id = id,
        outputs = outputs,
        status = status,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeInterpreterCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeInterpreterCallItem")
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

public fun codeInterpreterCallItem(block: CodeInterpreterCallItem.Builder.() -> Unit): CodeInterpreterCallItem =
  CodeInterpreterCallItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeInterpreterCallItem is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("CodeInterpreterCallItem property '" + name + "' is not nullable")
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
