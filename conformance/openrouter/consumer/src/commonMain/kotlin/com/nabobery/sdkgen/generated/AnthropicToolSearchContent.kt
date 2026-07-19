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

public sealed class AnthropicToolSearchContentDecodingException(
  message: String,
) : SerializationException(message)

public class AnthropicToolSearchContentNoMatchException(
  message: String,
) : AnthropicToolSearchContentDecodingException(message)

public class AnthropicToolSearchContentAmbiguityException(
  message: String,
) : AnthropicToolSearchContentDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolSearchContent.
 */
@Serializable(with = AnthropicToolSearchContent.Serializer::class)
public sealed interface AnthropicToolSearchContent {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicToolSearchResultError internal constructor(
    public val errorCode: AnthropicServerToolErrorCode,
    public val errorMessage: String?,
    public val type: InlineComponentsSchemasAnthropicToolSearchResultErrorPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicToolSearchContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        errorCode: AnthropicServerToolErrorCode,
        errorMessage: String?,
        type: InlineComponentsSchemasAnthropicToolSearchResultErrorPropertiesType,
      ): AnthropicToolSearchResultError = AnthropicToolSearchResultError(
        errorCode = errorCode,
        errorMessage = errorMessage,
        type = type,
        raw = buildJsonObject {
          put("error_code", SdkJson.encodeToJsonElement(errorCode))
          put("error_message", errorMessage)
          put("type", "tool_search_tool_result_error")
        },
      )
    }
  }

  public class AnthropicToolSearchResult internal constructor(
    public val toolReferences: List<AnthropicToolReference>,
    public val type: InlineComponentsSchemasAnthropicToolSearchResultPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicToolSearchContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(toolReferences: List<AnthropicToolReference>,
        type: InlineComponentsSchemasAnthropicToolSearchResultPropertiesType): AnthropicToolSearchResult =
          AnthropicToolSearchResult(
        toolReferences = toolReferences,
        type = type,
        raw = buildJsonObject {
          put("tool_references", SdkJson.encodeToJsonElement(toolReferences))
          put("type", "tool_search_tool_search_result")
        },
      )
    }
  }

  public object Serializer : KSerializer<AnthropicToolSearchContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicToolSearchContent {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicToolSearchContent")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw AnthropicToolSearchContentNoMatchException("AnthropicToolSearchContent matched 0 branches: expected " +
          "JSON object")
      val matches = inspectAnthropicToolSearchContent(raw)
      if (matches.size == 0) {
        throw AnthropicToolSearchContentNoMatchException("AnthropicToolSearchContent matched 0 branches: " + matches
          .failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw AnthropicToolSearchContentAmbiguityException("AnthropicToolSearchContent matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState1Matches && matches.errorCodeDecoded && matches.errorMessagePresent && matches
          .errorMessageDecoded -> AnthropicToolSearchResultError(errorCode = requireNotNull(matches.errorCode),
            errorMessage = matches.errorMessage, type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState2Matches && matches.toolReferencesDecoded -> AnthropicToolSearchResult(toolReferences =
          requireNotNull(matches.toolReferences), type = requireNotNull(matches.typeState2), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicToolSearchContent) {
      encoder.requireJsonEncoder("AnthropicToolSearchContent").encodeJsonElement(value.raw)
    }
  }
}

private data class AnthropicToolSearchContentInspection(
  public val typeState1: InlineComponentsSchemasAnthropicToolSearchResultErrorPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val errorCode: AnthropicServerToolErrorCode?,
  public val errorCodeDecoded: Boolean,
  public val errorMessage: String?,
  public val errorMessagePresent: Boolean,
  public val errorMessageDecoded: Boolean,
  public val typeState2: InlineComponentsSchemasAnthropicToolSearchResultPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val toolReferences: List<AnthropicToolReference>?,
  public val toolReferencesDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState1Matches && errorCodeDecoded && errorMessagePresent &&
        errorMessageDecoded) add("AnthropicToolSearchResultError")
      if (typeState2Matches && toolReferencesDecoded) add("AnthropicToolSearchResult")
    }

  public val size: Int
    get() = names.size
}

private fun inspectAnthropicToolSearchContent(raw: JsonObject): AnthropicToolSearchContentInspection {
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicToolSearchResultErrorPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "tool_search_tool_result_error" && typeState1Decoded
  val errorCodeResult = raw["error_code"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<AnthropicServerToolErrorCode>(element) } }
  val errorCode = errorCodeResult?.getOrNull()
  val errorCodeDecoded = errorCodeResult?.isSuccess == true
  val errorMessageResult = raw["error_message"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String?>(element) } }
  val errorMessage = errorMessageResult?.getOrNull()
  val errorMessagePresent = raw.containsKey("error_message")
  val errorMessageDecoded = errorMessageResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicToolSearchResultPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "tool_search_tool_search_result" && typeState2Decoded
  val toolReferencesResult = raw["tool_references"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<List<AnthropicToolReference>>(element) } }
  val toolReferences = toolReferencesResult?.getOrNull()
  val toolReferencesDecoded = toolReferencesResult?.isSuccess == true
  return AnthropicToolSearchContentInspection(
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    errorCode = errorCode,
    errorCodeDecoded = errorCodeDecoded,
    errorMessage = errorMessage,
    errorMessagePresent = errorMessagePresent,
    errorMessageDecoded = errorMessageDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    toolReferences = toolReferences,
    toolReferencesDecoded = toolReferencesDecoded,
    failures = buildList {
      if (!typeState1Matches || !errorCodeDecoded || !errorMessagePresent ||
        !errorMessageDecoded) add("AnthropicToolSearchResultError: required properties 'type' and 'error_code' and " +
          "'error_message' do not match their declared types")
      if (!typeState2Matches ||
        !toolReferencesDecoded) add("AnthropicToolSearchResult: required properties 'type' and 'tool_references' do " +
          "not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
