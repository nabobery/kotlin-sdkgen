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

public sealed class AnthropicCodeExecutionContentDecodingException(
  message: String,
) : SerializationException(message)

public class AnthropicCodeExecutionContentNoMatchException(
  message: String,
) : AnthropicCodeExecutionContentDecodingException(message)

public class AnthropicCodeExecutionContentAmbiguityException(
  message: String,
) : AnthropicCodeExecutionContentDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionContent.
 */
@Serializable(with = AnthropicCodeExecutionContent.Serializer::class)
public sealed interface AnthropicCodeExecutionContent {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicCodeExecutionToolResultError internal constructor(
    public val errorCode: AnthropicServerToolErrorCode,
    public val type: InlineComponentsSchemasAnthropicCodeExecutionToolResultErrorPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicCodeExecutionContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(errorCode: AnthropicServerToolErrorCode,
        type: InlineComponentsSchemasAnthropicCodeExecutionToolResultErrorPropertiesType): AnthropicCodeExecutionToolResultError = AnthropicCodeExecutionToolResultError(
        errorCode = errorCode,
        type = type,
        raw = buildJsonObject {
          put("error_code", SdkJson.encodeToJsonElement(errorCode))
          put("type", "code_execution_tool_result_error")
        },
      )
    }
  }

  public class AnthropicCodeExecutionResult internal constructor(
    public val content: List<AnthropicCodeExecutionOutput>,
    public val returnCode: Int,
    public val stderr: String,
    public val stdout: String,
    public val type: InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicCodeExecutionContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: List<AnthropicCodeExecutionOutput>,
        returnCode: Int,
        stderr: String,
        stdout: String,
        type: InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType,
      ): AnthropicCodeExecutionResult = AnthropicCodeExecutionResult(
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
          put("type", "code_execution_result")
        },
      )
    }
  }

  public class AnthropicEncryptedCodeExecutionResult internal constructor(
    public val content: List<AnthropicCodeExecutionOutput>,
    public val encryptedStdout: String,
    public val returnCode: Int,
    public val stderr: String,
    public val type: InlineComponentsSchemasAnthropicEncryptedCodeExecutionResultPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicCodeExecutionContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: List<AnthropicCodeExecutionOutput>,
        encryptedStdout: String,
        returnCode: Int,
        stderr: String,
        type: InlineComponentsSchemasAnthropicEncryptedCodeExecutionResultPropertiesType,
      ): AnthropicEncryptedCodeExecutionResult = AnthropicEncryptedCodeExecutionResult(
        content = content,
        encryptedStdout = encryptedStdout,
        returnCode = returnCode,
        stderr = stderr,
        type = type,
        raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("encrypted_stdout", encryptedStdout)
          put("return_code", SdkJson.encodeToJsonElement(returnCode))
          put("stderr", stderr)
          put("type", "encrypted_code_execution_result")
        },
      )
    }
  }

  public object Serializer : KSerializer<AnthropicCodeExecutionContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCodeExecutionContent {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCodeExecutionContent")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw AnthropicCodeExecutionContentNoMatchException("AnthropicCodeExecutionContent matched 0 branches: " +
          "expected JSON object")
      val matches = inspectAnthropicCodeExecutionContent(raw)
      if (matches.size == 0) {
        throw AnthropicCodeExecutionContentNoMatchException("AnthropicCodeExecutionContent matched 0 branches: " +
          matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw AnthropicCodeExecutionContentAmbiguityException("AnthropicCodeExecutionContent matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState2Matches && matches.errorCodeDecoded -> AnthropicCodeExecutionToolResultError(errorCode =
          requireNotNull(matches.errorCode), type = requireNotNull(matches.typeState2), raw = raw)
        matches.typeState1Matches && matches.contentDecoded && matches.returnCodeDecoded && matches.stderrDecoded &&
          matches.stdoutDecoded -> AnthropicCodeExecutionResult(content = requireNotNull(matches.content), returnCode =
            requireNotNull(matches.returnCode), stderr = requireNotNull(matches.stderr), stdout =
              requireNotNull(matches.stdout), type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState3Matches && matches.contentDecoded && matches.encryptedStdoutDecoded && matches
          .returnCodeDecoded && matches.stderrDecoded -> AnthropicEncryptedCodeExecutionResult(content =
            requireNotNull(matches.content), encryptedStdout = requireNotNull(matches.encryptedStdout), returnCode =
              requireNotNull(matches.returnCode), stderr = requireNotNull(matches.stderr), type =
                requireNotNull(matches.typeState3), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCodeExecutionContent) {
      encoder.requireJsonEncoder("AnthropicCodeExecutionContent").encodeJsonElement(value.raw)
    }
  }
}

private data class AnthropicCodeExecutionContentInspection(
  public val typeState2:
      InlineComponentsSchemasAnthropicCodeExecutionToolResultErrorPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val errorCode: AnthropicServerToolErrorCode?,
  public val errorCodeDecoded: Boolean,
  public val typeState1: InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val content: List<AnthropicCodeExecutionOutput>?,
  public val contentDecoded: Boolean,
  public val returnCode: Int?,
  public val returnCodeDecoded: Boolean,
  public val stderr: String?,
  public val stderrDecoded: Boolean,
  public val stdout: String?,
  public val stdoutDecoded: Boolean,
  public val typeState3:
      InlineComponentsSchemasAnthropicEncryptedCodeExecutionResultPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val encryptedStdout: String?,
  public val encryptedStdoutDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState2Matches && errorCodeDecoded) add("AnthropicCodeExecutionToolResultError")
      if (typeState1Matches && contentDecoded && returnCodeDecoded && stderrDecoded &&
        stdoutDecoded) add("AnthropicCodeExecutionResult")
      if (typeState3Matches && contentDecoded && encryptedStdoutDecoded && returnCodeDecoded &&
        stderrDecoded) add("AnthropicEncryptedCodeExecutionResult")
    }

  public val size: Int
    get() = names.size
}

private fun inspectAnthropicCodeExecutionContent(raw: JsonObject): AnthropicCodeExecutionContentInspection {
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCodeExecutionToolResultErrorPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "code_execution_tool_result_error" && typeState2Decoded
  val errorCodeResult = raw["error_code"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<AnthropicServerToolErrorCode>(element) } }
  val errorCode = errorCodeResult?.getOrNull()
  val errorCodeDecoded = errorCodeResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "code_execution_result" && typeState1Decoded
  val contentResult = raw["content"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<List<AnthropicCodeExecutionOutput>>(element) } }
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
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicEncryptedCodeExecutionResultPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "encrypted_code_execution_result" && typeState3Decoded
  val encryptedStdoutResult = raw["encrypted_stdout"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val encryptedStdout = encryptedStdoutResult?.getOrNull()
  val encryptedStdoutDecoded = encryptedStdoutResult?.isSuccess == true
  return AnthropicCodeExecutionContentInspection(
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
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    encryptedStdout = encryptedStdout,
    encryptedStdoutDecoded = encryptedStdoutDecoded,
    failures = buildList {
      if (!typeState2Matches ||
        !errorCodeDecoded) add("AnthropicCodeExecutionToolResultError: required properties 'type' and 'error_code' do " +
          "not match their declared types")
      if (!typeState1Matches || !contentDecoded || !returnCodeDecoded || !stderrDecoded ||
        !stdoutDecoded) add("AnthropicCodeExecutionResult: required properties 'type' and 'content' and 'return_code' " +
          "and 'stderr' and 'stdout' do not match their declared types")
      if (!typeState3Matches || !contentDecoded || !encryptedStdoutDecoded || !returnCodeDecoded ||
        !stderrDecoded) add("AnthropicEncryptedCodeExecutionResult: required properties 'type' and 'content' and " +
          "'encrypted_stdout' and 'return_code' and 'stderr' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
