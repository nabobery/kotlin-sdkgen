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

public sealed class AnthropicBashCodeExecutionContentDecodingException(
  message: String,
) : SerializationException(message)

public class AnthropicBashCodeExecutionContentNoMatchException(
  message: String,
) : AnthropicBashCodeExecutionContentDecodingException(message)

public class AnthropicBashCodeExecutionContentAmbiguityException(
  message: String,
) : AnthropicBashCodeExecutionContentDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionContent.
 */
@Serializable(with = AnthropicBashCodeExecutionContent.Serializer::class)
public sealed interface AnthropicBashCodeExecutionContent {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicBashCodeExecutionToolResultError internal constructor(
    public val errorCode:
        InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode,
    public val type: InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicBashCodeExecutionContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(errorCode: InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode,
        type: InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesType): AnthropicBashCodeExecutionToolResultError = AnthropicBashCodeExecutionToolResultError(
        errorCode = errorCode,
        type = type,
        raw = buildJsonObject {
          put("error_code", SdkJson.encodeToJsonElement(errorCode))
          put("type", "bash_code_execution_tool_result_error")
        },
      )
    }
  }

  public class AnthropicBashCodeExecutionResult internal constructor(
    public val content: List<AnthropicBashCodeExecutionOutput>,
    public val returnCode: Int,
    public val stderr: String,
    public val stdout: String,
    public val type: InlineComponentsSchemasAnthropicBashCodeExecutionResultPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicBashCodeExecutionContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: List<AnthropicBashCodeExecutionOutput>,
        returnCode: Int,
        stderr: String,
        stdout: String,
        type: InlineComponentsSchemasAnthropicBashCodeExecutionResultPropertiesType,
      ): AnthropicBashCodeExecutionResult = AnthropicBashCodeExecutionResult(
        content = content,
        returnCode = returnCode,
        stderr = stderr,
        stdout = stdout,
        type = type,
        raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("return_code", SdkJson.encodeToJsonElement(returnCode))
          put("stderr", stderr)
          put("stdout", stdout)
          put("type", "bash_code_execution_result")
        },
      )
    }
  }

  public object Serializer : KSerializer<AnthropicBashCodeExecutionContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicBashCodeExecutionContent {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicBashCodeExecutionContent")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw AnthropicBashCodeExecutionContentNoMatchException("AnthropicBashCodeExecutionContent matched 0 " +
          "branches: expected JSON object")
      val matches = inspectAnthropicBashCodeExecutionContent(raw)
      if (matches.size == 0) {
        throw AnthropicBashCodeExecutionContentNoMatchException("AnthropicBashCodeExecutionContent matched 0 " +
          "branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw AnthropicBashCodeExecutionContentAmbiguityException("AnthropicBashCodeExecutionContent matched " +
          matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState2Matches && matches.errorCodeDecoded -> AnthropicBashCodeExecutionToolResultError(errorCode =
          requireNotNull(matches.errorCode), type = requireNotNull(matches.typeState2), raw = raw)
        matches.typeState1Matches && matches.contentDecoded && matches.returnCodeDecoded && matches.stderrDecoded &&
          matches.stdoutDecoded -> AnthropicBashCodeExecutionResult(content = requireNotNull(matches.content),
            returnCode = requireNotNull(matches.returnCode), stderr = requireNotNull(matches.stderr), stdout =
              requireNotNull(matches.stdout), type = requireNotNull(matches.typeState1), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicBashCodeExecutionContent) {
      encoder.requireJsonEncoder("AnthropicBashCodeExecutionContent").encodeJsonElement(value.raw)
    }
  }
}

private data class AnthropicBashCodeExecutionContentInspection(
  public val typeState2:
      InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val errorCode:
      InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode?,
  public val errorCodeDecoded: Boolean,
  public val typeState1: InlineComponentsSchemasAnthropicBashCodeExecutionResultPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val content: List<AnthropicBashCodeExecutionOutput>?,
  public val contentDecoded: Boolean,
  public val returnCode: Int?,
  public val returnCodeDecoded: Boolean,
  public val stderr: String?,
  public val stderrDecoded: Boolean,
  public val stdout: String?,
  public val stdoutDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState2Matches && errorCodeDecoded) add("AnthropicBashCodeExecutionToolResultError")
      if (typeState1Matches && contentDecoded && returnCodeDecoded && stderrDecoded &&
        stdoutDecoded) add("AnthropicBashCodeExecutionResult")
    }

  public val size: Int
    get() = names.size
}

private fun inspectAnthropicBashCodeExecutionContent(raw: JsonObject): AnthropicBashCodeExecutionContentInspection {
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "bash_code_execution_tool_result_error" && typeState2Decoded
  val errorCodeResult = raw["error_code"]?.let { element -> runCatching { SdkJson


























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode>(element) } }
  val errorCode = errorCodeResult?.getOrNull()
  val errorCodeDecoded = errorCodeResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicBashCodeExecutionResultPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "bash_code_execution_result" && typeState1Decoded
  val contentResult = raw["content"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<List<AnthropicBashCodeExecutionOutput>>(element) } }
  val content = contentResult?.getOrNull()
  val contentDecoded = contentResult?.isSuccess == true
  val returnCodeResult = raw["return_code"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val returnCode = returnCodeResult?.getOrNull()
  val returnCodeDecoded = returnCodeResult?.isSuccess == true
  val stderrResult = raw["stderr"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val stderr = stderrResult?.getOrNull()
  val stderrDecoded = stderrResult?.isSuccess == true
  val stdoutResult = raw["stdout"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val stdout = stdoutResult?.getOrNull()
  val stdoutDecoded = stdoutResult?.isSuccess == true
  return AnthropicBashCodeExecutionContentInspection(
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    errorCode = errorCode,
    errorCodeDecoded = errorCodeDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    content = content,
    contentDecoded = contentDecoded,
    returnCode = returnCode,
    returnCodeDecoded = returnCodeDecoded,
    stderr = stderr,
    stderrDecoded = stderrDecoded,
    stdout = stdout,
    stdoutDecoded = stdoutDecoded,
    failures = buildList {
      if (!typeState2Matches ||
        !errorCodeDecoded) add("AnthropicBashCodeExecutionToolResultError: required properties 'type' and " +
          "'error_code' do not match their declared types")
      if (!typeState1Matches || !contentDecoded || !returnCodeDecoded || !stderrDecoded ||
        !stdoutDecoded) add("AnthropicBashCodeExecutionResult: required properties 'type' and 'content' and " +
          "'return_code' and 'stderr' and 'stdout' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
