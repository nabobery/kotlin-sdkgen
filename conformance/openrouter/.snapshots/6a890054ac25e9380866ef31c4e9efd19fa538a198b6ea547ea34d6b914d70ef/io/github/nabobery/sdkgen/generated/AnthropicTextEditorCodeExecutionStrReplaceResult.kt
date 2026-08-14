package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionStrReplaceResult.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionStrReplaceResult
 */
@Serializable(with = AnthropicTextEditorCodeExecutionStrReplaceResult.Serializer::class)
public class AnthropicTextEditorCodeExecutionStrReplaceResult(
  lines: List<String>?,
  public val newLines: Int?,
  public val newStart: Int?,
  public val oldLines: Int?,
  public val oldStart: Int?,
  public val type: InlineAnthropicTextEditorCodeExecutionStrReplaceResultTypeX303fffb8,
) {
  public val lines: List<String>? = lines?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var typeValue: InlineAnthropicTextEditorCodeExecutionStrReplaceResultTypeX303fffb8? =
        null

    public var type: InlineAnthropicTextEditorCodeExecutionStrReplaceResultTypeX303fffb8
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var linesState: FieldState<List<String>?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var lines: List<String>?
      get() = linesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        linesState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var newLinesState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var newLines: Int?
      get() = newLinesState.valueOrNull()
      set(`value`) {
        newLinesState = value.toNullableFieldState()
      }

    private var newStartState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var newStart: Int?
      get() = newStartState.valueOrNull()
      set(`value`) {
        newStartState = value.toNullableFieldState()
      }

    private var oldLinesState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var oldLines: Int?
      get() = oldLinesState.valueOrNull()
      set(`value`) {
        oldLinesState = value.toNullableFieldState()
      }

    private var oldStartState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var oldStart: Int?
      get() = oldStartState.valueOrNull()
      set(`value`) {
        oldStartState = value.toNullableFieldState()
      }

    public fun build(): AnthropicTextEditorCodeExecutionStrReplaceResult {
      check(typeValue != null) { "type is required" }
      check(linesState !== FieldState.Absent) { "lines is required, even when null" }
      check(newLinesState !== FieldState.Absent) { "newLines is required, even when null" }
      check(newStartState !== FieldState.Absent) { "newStart is required, even when null" }
      check(oldLinesState !== FieldState.Absent) { "oldLines is required, even when null" }
      check(oldStartState !== FieldState.Absent) { "oldStart is required, even when null" }
      return AnthropicTextEditorCodeExecutionStrReplaceResult(
        lines = linesState.valueOrNull(),
        newLines = newLinesState.valueOrNull(),
        newStart = newStartState.valueOrNull(),
        oldLines = oldLinesState.valueOrNull(),
        oldStart = oldStartState.valueOrNull(),
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicTextEditorCodeExecutionStrReplaceResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicTextEditorCodeExecutionStrReplaceResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicTextEditorCodeExecutionStrReplaceResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicTextEditorCodeExecutionStrReplaceResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicTextEditorCodeExecutionStrReplaceResult must be a JSON object")
      val type = json.decodeRequired<InlineAnthropicTextEditorCodeExecutionStrReplaceResultTypeX303fffb8>(rawObject, "type")
      if (!rawObject.containsKey("lines")) {
        throw SerializationException("AnthropicTextEditorCodeExecutionStrReplaceResult is missing required property 'lines'")
      }
      val lines = rawObject["lines"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("new_lines")) {
        throw SerializationException("AnthropicTextEditorCodeExecutionStrReplaceResult is missing required property 'new_lines'")
      }
      val newLines = rawObject["new_lines"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("new_start")) {
        throw SerializationException("AnthropicTextEditorCodeExecutionStrReplaceResult is missing required property 'new_start'")
      }
      val newStart = rawObject["new_start"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("old_lines")) {
        throw SerializationException("AnthropicTextEditorCodeExecutionStrReplaceResult is missing required property 'old_lines'")
      }
      val oldLines = rawObject["old_lines"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("old_start")) {
        throw SerializationException("AnthropicTextEditorCodeExecutionStrReplaceResult is missing required property 'old_start'")
      }
      val oldStart = rawObject["old_start"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      return AnthropicTextEditorCodeExecutionStrReplaceResult(
        lines = lines,
        newLines = newLines,
        newStart = newStart,
        oldLines = oldLines,
        oldStart = oldStart,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicTextEditorCodeExecutionStrReplaceResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicTextEditorCodeExecutionStrReplaceResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("lines", value.lines?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("new_lines", value.newLines?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("new_start", value.newStart?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("old_lines", value.oldLines?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("old_start", value.oldStart?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicTextEditorCodeExecutionStrReplaceResult(block: AnthropicTextEditorCodeExecutionStrReplaceResult.Builder.() -> Unit): AnthropicTextEditorCodeExecutionStrReplaceResult = AnthropicTextEditorCodeExecutionStrReplaceResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicTextEditorCodeExecutionStrReplaceResult is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("AnthropicTextEditorCodeExecutionStrReplaceResult property '" + name + "' is not nullable")
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
