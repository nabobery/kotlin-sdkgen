package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionViewResult.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionViewResult
 */
@Serializable(with = AnthropicTextEditorCodeExecutionViewResult.Serializer::class)
public class AnthropicTextEditorCodeExecutionViewResult(
  public val content: String,
  public val fileType: InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c,
  public val numLines: Int?,
  public val startLine: Int?,
  public val totalLines: Int?,
  public val type: InlineAnthropicTextEditorCodeExecutionViewResultTypeXf03c7759,
) {
  public class Builder {
    private var contentValue: String? = null

    public var content: String
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var fileTypeValue: InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c? =
        null

    public var fileType: InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c
      get() = requireNotNull(fileTypeValue) { "fileType is required" }
      set(`value`) {
        fileTypeValue = value
      }

    private var typeValue: InlineAnthropicTextEditorCodeExecutionViewResultTypeXf03c7759? = null

    public var type: InlineAnthropicTextEditorCodeExecutionViewResultTypeXf03c7759
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var numLinesState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var numLines: Int?
      get() = numLinesState.valueOrNull()
      set(`value`) {
        numLinesState = value.toNullableFieldState()
      }

    private var startLineState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var startLine: Int?
      get() = startLineState.valueOrNull()
      set(`value`) {
        startLineState = value.toNullableFieldState()
      }

    private var totalLinesState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var totalLines: Int?
      get() = totalLinesState.valueOrNull()
      set(`value`) {
        totalLinesState = value.toNullableFieldState()
      }

    public fun build(): AnthropicTextEditorCodeExecutionViewResult {
      check(contentValue != null) { "content is required" }
      check(fileTypeValue != null) { "fileType is required" }
      check(typeValue != null) { "type is required" }
      check(numLinesState !== FieldState.Absent) { "numLines is required, even when null" }
      check(startLineState !== FieldState.Absent) { "startLine is required, even when null" }
      check(totalLinesState !== FieldState.Absent) { "totalLines is required, even when null" }
      return AnthropicTextEditorCodeExecutionViewResult(
        content = content,
        fileType = fileType,
        numLines = numLinesState.valueOrNull(),
        startLine = startLineState.valueOrNull(),
        totalLines = totalLinesState.valueOrNull(),
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicTextEditorCodeExecutionViewResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicTextEditorCodeExecutionViewResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicTextEditorCodeExecutionViewResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicTextEditorCodeExecutionViewResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicTextEditorCodeExecutionViewResult must be a JSON object")
      val content = json.decodeRequired<String>(rawObject, "content")
      val fileType = json.decodeRequired<InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c>(rawObject, "file_type")
      val type = json.decodeRequired<InlineAnthropicTextEditorCodeExecutionViewResultTypeXf03c7759>(rawObject, "type")
      if (!rawObject.containsKey("num_lines")) {
        throw SerializationException("AnthropicTextEditorCodeExecutionViewResult is missing required property 'num_lines'")
      }
      val numLines = rawObject["num_lines"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("start_line")) {
        throw SerializationException("AnthropicTextEditorCodeExecutionViewResult is missing required property 'start_line'")
      }
      val startLine = rawObject["start_line"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("total_lines")) {
        throw SerializationException("AnthropicTextEditorCodeExecutionViewResult is missing required property 'total_lines'")
      }
      val totalLines = rawObject["total_lines"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      return AnthropicTextEditorCodeExecutionViewResult(
        content = content,
        fileType = fileType,
        numLines = numLines,
        startLine = startLine,
        totalLines = totalLines,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicTextEditorCodeExecutionViewResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicTextEditorCodeExecutionViewResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", value.content)
        put("file_type", json.encodeToJsonElement(value.fileType))
        put("num_lines", value.numLines?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("start_line", value.startLine?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("total_lines", value.totalLines?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicTextEditorCodeExecutionViewResult(block: AnthropicTextEditorCodeExecutionViewResult.Builder.() -> Unit): AnthropicTextEditorCodeExecutionViewResult = AnthropicTextEditorCodeExecutionViewResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicTextEditorCodeExecutionViewResult is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("AnthropicTextEditorCodeExecutionViewResult property '" + name + "' is not nullable")
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
