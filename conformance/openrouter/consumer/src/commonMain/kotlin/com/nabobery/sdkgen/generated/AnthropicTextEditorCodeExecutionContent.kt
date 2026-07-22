package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class AnthropicTextEditorCodeExecutionContentDecodingException(
  message: String,
) : SerializationException(message)

public class AnthropicTextEditorCodeExecutionContentNoMatchException(
  message: String,
) : AnthropicTextEditorCodeExecutionContentDecodingException(message)

public class AnthropicTextEditorCodeExecutionContentAmbiguityException(
  message: String,
) : AnthropicTextEditorCodeExecutionContentDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionContent.
 */
@Serializable(with = AnthropicTextEditorCodeExecutionContent.Serializer::class)
public sealed interface AnthropicTextEditorCodeExecutionContent {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicTextEditorCodeExecutionToolResultError internal constructor(
    public val errorCode:
        InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode,
    public val errorMessage: String?,
    public val type:
        InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicTextEditorCodeExecutionContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        errorCode: InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode,
        errorMessage: String?,
        type: InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesType,
      ): AnthropicTextEditorCodeExecutionToolResultError = AnthropicTextEditorCodeExecutionToolResultError(
        errorCode = errorCode,
        errorMessage = errorMessage,
        type = type,
        raw = buildJsonObject {
          put("error_code", SdkJson.encodeToJsonElement(errorCode))
          put("error_message", errorMessage)
          put("type", "text_editor_code_execution_tool_result_error")
        },
      )
    }
  }

  public class AnthropicTextEditorCodeExecutionViewResult internal constructor(
    public val content: String,
    public val fileType:
        InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType,
    public val numLines: Int?,
    public val startLine: Int?,
    public val totalLines: Int?,
    public val type:
        InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicTextEditorCodeExecutionContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: String,
        fileType: InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType,
        numLines: Int?,
        startLine: Int?,
        totalLines: Int?,
        type: InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesType,
      ): AnthropicTextEditorCodeExecutionViewResult = AnthropicTextEditorCodeExecutionViewResult(
        content = content,
        fileType = fileType,
        numLines = numLines,
        startLine = startLine,
        totalLines = totalLines,
        type = type,
        raw = buildJsonObject {
          put("content", content)
          put("file_type", SdkJson.encodeToJsonElement(fileType))
          put("num_lines", SdkJson.encodeToJsonElement(numLines))
          put("start_line", SdkJson.encodeToJsonElement(startLine))
          put("total_lines", SdkJson.encodeToJsonElement(totalLines))
          put("type", "text_editor_code_execution_view_result")
        },
      )
    }
  }

  public class AnthropicTextEditorCodeExecutionCreateResult internal constructor(
    public val isFileUpdate: Boolean,
    public val type:
        InlineComponentsSchemasAnthropicTextEditorCodeExecutionCreateResultPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicTextEditorCodeExecutionContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(isFileUpdate: Boolean,
        type: InlineComponentsSchemasAnthropicTextEditorCodeExecutionCreateResultPropertiesType): AnthropicTextEditorCodeExecutionCreateResult = AnthropicTextEditorCodeExecutionCreateResult(
        isFileUpdate = isFileUpdate,
        type = type,
        raw = buildJsonObject {
          put("is_file_update", SdkJson.encodeToJsonElement(isFileUpdate))
          put("type", "text_editor_code_execution_create_result")
        },
      )
    }
  }

  public class AnthropicTextEditorCodeExecutionStrReplaceResult internal constructor(
    public val lines: List<String>?,
    public val newLines: Int?,
    public val newStart: Int?,
    public val oldLines: Int?,
    public val oldStart: Int?,
    public val type:
        InlineComponentsSchemasAnthropicTextEditorCodeExecutionStrReplaceResultPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicTextEditorCodeExecutionContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        lines: List<String>?,
        newLines: Int?,
        newStart: Int?,
        oldLines: Int?,
        oldStart: Int?,
        type: InlineComponentsSchemasAnthropicTextEditorCodeExecutionStrReplaceResultPropertiesType,
      ): AnthropicTextEditorCodeExecutionStrReplaceResult = AnthropicTextEditorCodeExecutionStrReplaceResult(
        lines = lines,
        newLines = newLines,
        newStart = newStart,
        oldLines = oldLines,
        oldStart = oldStart,
        type = type,
        raw = buildJsonObject {
          put("lines", SdkJson.encodeToJsonElement(lines))
          put("new_lines", SdkJson.encodeToJsonElement(newLines))
          put("new_start", SdkJson.encodeToJsonElement(newStart))
          put("old_lines", SdkJson.encodeToJsonElement(oldLines))
          put("old_start", SdkJson.encodeToJsonElement(oldStart))
          put("type", "text_editor_code_execution_str_replace_result")
        },
      )
    }
  }

  public object Serializer : KSerializer<AnthropicTextEditorCodeExecutionContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicTextEditorCodeExecutionContent {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicTextEditorCodeExecutionContent")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw AnthropicTextEditorCodeExecutionContentNoMatchException("AnthropicTextEditorCodeExecutionContent " +
          "matched 0 branches: expected JSON object")
      val matches = inspectAnthropicTextEditorCodeExecutionContent(raw)
      if (matches.size == 0) {
        throw AnthropicTextEditorCodeExecutionContentNoMatchException("AnthropicTextEditorCodeExecutionContent " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw AnthropicTextEditorCodeExecutionContentAmbiguityException("AnthropicTextEditorCodeExecutionContent " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState3Matches && matches.errorCodeDecoded && matches.errorMessagePresent && matches
          .errorMessageDecoded -> AnthropicTextEditorCodeExecutionToolResultError(errorCode = requireNotNull(matches
            .errorCode), errorMessage = matches.errorMessage, type = requireNotNull(matches.typeState3), raw = raw)
        matches.typeState4Matches && matches.contentDecoded && matches.fileTypeDecoded && matches.numLinesPresent &&
          matches.numLinesDecoded && matches.startLinePresent && matches.startLineDecoded && matches
            .totalLinesPresent && matches.totalLinesDecoded -> AnthropicTextEditorCodeExecutionViewResult(content =
              requireNotNull(matches.content), fileType = requireNotNull(matches.fileType), numLines = matches
                .numLines, startLine = matches.startLine, totalLines = matches.totalLines, type =
                  requireNotNull(matches.typeState4), raw = raw)
        matches.typeState1Matches && matches.isFileUpdateDecoded ->
          AnthropicTextEditorCodeExecutionCreateResult(isFileUpdate = requireNotNull(matches.isFileUpdate), type =
            requireNotNull(matches.typeState1), raw = raw)
        matches.typeState2Matches && matches.linesPresent && matches.linesDecoded && matches.newLinesPresent && matches
          .newLinesDecoded && matches.newStartPresent && matches.newStartDecoded && matches.oldLinesPresent && matches
            .oldLinesDecoded && matches.oldStartPresent && matches.oldStartDecoded ->
              AnthropicTextEditorCodeExecutionStrReplaceResult(lines = matches.lines, newLines = matches.newLines,
                newStart = matches.newStart, oldLines = matches.oldLines, oldStart = matches.oldStart, type =
                  requireNotNull(matches.typeState2), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicTextEditorCodeExecutionContent) {
      encoder.requireJsonEncoder("AnthropicTextEditorCodeExecutionContent").encodeJsonElement(value.raw)
    }
  }
}

private data class AnthropicTextEditorCodeExecutionContentInspection(
  public val typeState3:
      InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val errorCode:
      InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode?,
  public val errorCodeDecoded: Boolean,
  public val errorMessage: String?,
  public val errorMessagePresent: Boolean,
  public val errorMessageDecoded: Boolean,
  public val typeState4:
      InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesType?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val content: String?,
  public val contentDecoded: Boolean,
  public val fileType:
      InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType?,
  public val fileTypeDecoded: Boolean,
  public val numLines: Int?,
  public val numLinesPresent: Boolean,
  public val numLinesDecoded: Boolean,
  public val startLine: Int?,
  public val startLinePresent: Boolean,
  public val startLineDecoded: Boolean,
  public val totalLines: Int?,
  public val totalLinesPresent: Boolean,
  public val totalLinesDecoded: Boolean,
  public val typeState1:
      InlineComponentsSchemasAnthropicTextEditorCodeExecutionCreateResultPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val isFileUpdate: Boolean?,
  public val isFileUpdateDecoded: Boolean,
  public val typeState2:
      InlineComponentsSchemasAnthropicTextEditorCodeExecutionStrReplaceResultPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val lines: List<String>?,
  public val linesPresent: Boolean,
  public val linesDecoded: Boolean,
  public val newLines: Int?,
  public val newLinesPresent: Boolean,
  public val newLinesDecoded: Boolean,
  public val newStart: Int?,
  public val newStartPresent: Boolean,
  public val newStartDecoded: Boolean,
  public val oldLines: Int?,
  public val oldLinesPresent: Boolean,
  public val oldLinesDecoded: Boolean,
  public val oldStart: Int?,
  public val oldStartPresent: Boolean,
  public val oldStartDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState3Matches && errorCodeDecoded && errorMessagePresent &&
        errorMessageDecoded) add("AnthropicTextEditorCodeExecutionToolResultError")
      if (typeState4Matches && contentDecoded && fileTypeDecoded && numLinesPresent && numLinesDecoded &&
        startLinePresent && startLineDecoded && totalLinesPresent &&
          totalLinesDecoded) add("AnthropicTextEditorCodeExecutionViewResult")
      if (typeState1Matches && isFileUpdateDecoded) add("AnthropicTextEditorCodeExecutionCreateResult")
      if (typeState2Matches && linesPresent && linesDecoded && newLinesPresent && newLinesDecoded && newStartPresent &&
        newStartDecoded && oldLinesPresent && oldLinesDecoded && oldStartPresent &&
          oldStartDecoded) add("AnthropicTextEditorCodeExecutionStrReplaceResult")
    }

  public val size: Int
    get() = names.size
}

private fun inspectAnthropicTextEditorCodeExecutionContent(raw: JsonObject): AnthropicTextEditorCodeExecutionContentInspection {
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "text_editor_code_execution_tool_result_error" && typeState3Decoded
  val errorCodeResult = raw["error_code"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode>(element) } }
  val errorCode = errorCodeResult?.getOrNull()
  val errorCodeDecoded = errorCodeResult?.isSuccess == true
  val errorMessageResult = raw["error_message"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String?>(element) } }
  val errorMessage = errorMessageResult?.getOrNull()
  val errorMessagePresent = raw.containsKey("error_message")
  val errorMessageDecoded = errorMessageResult?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = raw.stringValue("type") == "text_editor_code_execution_view_result" && typeState4Decoded
  val contentResult = raw["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val content = contentResult?.getOrNull()
  val contentDecoded = contentResult?.isSuccess == true
  val fileTypeResult = raw["file_type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType>(element) } }
  val fileType = fileTypeResult?.getOrNull()
  val fileTypeDecoded = fileTypeResult?.isSuccess == true
  val numLinesResult = raw["num_lines"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int?>(element) } }
  val numLines = numLinesResult?.getOrNull()
  val numLinesPresent = raw.containsKey("num_lines")
  val numLinesDecoded = numLinesResult?.isSuccess == true
  val startLineResult = raw["start_line"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int?>(element) } }
  val startLine = startLineResult?.getOrNull()
  val startLinePresent = raw.containsKey("start_line")
  val startLineDecoded = startLineResult?.isSuccess == true
  val totalLinesResult = raw["total_lines"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int?>(element) } }
  val totalLines = totalLinesResult?.getOrNull()
  val totalLinesPresent = raw.containsKey("total_lines")
  val totalLinesDecoded = totalLinesResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicTextEditorCodeExecutionCreateResultPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "text_editor_code_execution_create_result" && typeState1Decoded
  val isFileUpdateResult = raw["is_file_update"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Boolean>(element) } }
  val isFileUpdate = isFileUpdateResult?.getOrNull()
  val isFileUpdateDecoded = isFileUpdateResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicTextEditorCodeExecutionStrReplaceResultPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "text_editor_code_execution_str_replace_result" &&
    typeState2Decoded
  val linesResult = raw["lines"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<List<String>?>(element) } }
  val lines = linesResult?.getOrNull()
  val linesPresent = raw.containsKey("lines")
  val linesDecoded = linesResult?.isSuccess == true
  val newLinesResult = raw["new_lines"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int?>(element) } }
  val newLines = newLinesResult?.getOrNull()
  val newLinesPresent = raw.containsKey("new_lines")
  val newLinesDecoded = newLinesResult?.isSuccess == true
  val newStartResult = raw["new_start"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int?>(element) } }
  val newStart = newStartResult?.getOrNull()
  val newStartPresent = raw.containsKey("new_start")
  val newStartDecoded = newStartResult?.isSuccess == true
  val oldLinesResult = raw["old_lines"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int?>(element) } }
  val oldLines = oldLinesResult?.getOrNull()
  val oldLinesPresent = raw.containsKey("old_lines")
  val oldLinesDecoded = oldLinesResult?.isSuccess == true
  val oldStartResult = raw["old_start"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int?>(element) } }
  val oldStart = oldStartResult?.getOrNull()
  val oldStartPresent = raw.containsKey("old_start")
  val oldStartDecoded = oldStartResult?.isSuccess == true
  return AnthropicTextEditorCodeExecutionContentInspection(
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    errorCode = errorCode,
    errorCodeDecoded = errorCodeDecoded,
    errorMessage = errorMessage,
    errorMessagePresent = errorMessagePresent,
    errorMessageDecoded = errorMessageDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    content = content,
    contentDecoded = contentDecoded,
    fileType = fileType,
    fileTypeDecoded = fileTypeDecoded,
    numLines = numLines,
    numLinesPresent = numLinesPresent,
    numLinesDecoded = numLinesDecoded,
    startLine = startLine,
    startLinePresent = startLinePresent,
    startLineDecoded = startLineDecoded,
    totalLines = totalLines,
    totalLinesPresent = totalLinesPresent,
    totalLinesDecoded = totalLinesDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    isFileUpdate = isFileUpdate,
    isFileUpdateDecoded = isFileUpdateDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    lines = lines,
    linesPresent = linesPresent,
    linesDecoded = linesDecoded,
    newLines = newLines,
    newLinesPresent = newLinesPresent,
    newLinesDecoded = newLinesDecoded,
    newStart = newStart,
    newStartPresent = newStartPresent,
    newStartDecoded = newStartDecoded,
    oldLines = oldLines,
    oldLinesPresent = oldLinesPresent,
    oldLinesDecoded = oldLinesDecoded,
    oldStart = oldStart,
    oldStartPresent = oldStartPresent,
    oldStartDecoded = oldStartDecoded,
    failures = buildList {
      if (!typeState3Matches || !errorCodeDecoded || !errorMessagePresent ||
        !errorMessageDecoded) add("AnthropicTextEditorCodeExecutionToolResultError: required properties 'type' and " +
          "'error_code' and 'error_message' do not match their declared types")
      if (!typeState4Matches || !contentDecoded || !fileTypeDecoded || !numLinesPresent || !numLinesDecoded ||
        !startLinePresent || !startLineDecoded || !totalLinesPresent ||
          !totalLinesDecoded) add("AnthropicTextEditorCodeExecutionViewResult: required properties 'type' and " +
            "'content' and 'file_type' and 'num_lines' and 'start_line' and 'total_lines' do not match their declared " +
            "types")
      if (!typeState1Matches ||
        !isFileUpdateDecoded) add("AnthropicTextEditorCodeExecutionCreateResult: required properties 'type' and " +
          "'is_file_update' do not match their declared types")
      if (!typeState2Matches || !linesPresent || !linesDecoded || !newLinesPresent || !newLinesDecoded ||
        !newStartPresent || !newStartDecoded || !oldLinesPresent || !oldLinesDecoded || !oldStartPresent ||
          !oldStartDecoded) add("AnthropicTextEditorCodeExecutionStrReplaceResult: required properties 'type' and " +
            "'lines' and 'new_lines' and 'new_start' and 'old_lines' and 'old_start' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
