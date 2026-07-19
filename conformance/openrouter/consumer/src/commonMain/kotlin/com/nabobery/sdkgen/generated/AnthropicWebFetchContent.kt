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

public sealed class AnthropicWebFetchContentDecodingException(
  message: String,
) : SerializationException(message)

public class AnthropicWebFetchContentNoMatchException(
  message: String,
) : AnthropicWebFetchContentDecodingException(message)

public class AnthropicWebFetchContentAmbiguityException(
  message: String,
) : AnthropicWebFetchContentDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchContent.
 */
@Serializable(with = AnthropicWebFetchContent.Serializer::class)
public sealed interface AnthropicWebFetchContent {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicWebFetchToolResultError internal constructor(
    public val errorCode:
        InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesErrorCode,
    public val type: InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicWebFetchContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(errorCode: InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesErrorCode,
        type: InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesType): AnthropicWebFetchToolResultError = AnthropicWebFetchToolResultError(
        errorCode = errorCode,
        type = type,
        raw = buildJsonObject {
          put("error_code", SdkJson.encodeToJsonElement(errorCode))
          put("type", "web_fetch_tool_result_error")
        },
      )
    }
  }

  public class AnthropicWebFetchBlock internal constructor(
    public val content: AnthropicDocumentBlock,
    public val retrievedAt: String?,
    public val type: InlineComponentsSchemasAnthropicWebFetchBlockPropertiesType,
    public val url: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicWebFetchContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: AnthropicDocumentBlock,
        retrievedAt: String?,
        type: InlineComponentsSchemasAnthropicWebFetchBlockPropertiesType,
        url: String,
      ): AnthropicWebFetchBlock = AnthropicWebFetchBlock(
        content = content,
        retrievedAt = retrievedAt,
        type = type,
        url = url,
        raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("retrieved_at", retrievedAt)
          put("type", "web_fetch_result")
          put("url", url)
        },
      )
    }
  }

  public object Serializer : KSerializer<AnthropicWebFetchContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicWebFetchContent {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicWebFetchContent")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw AnthropicWebFetchContentNoMatchException("AnthropicWebFetchContent matched 0 branches: expected JSON " +
          "object")
      val matches = inspectAnthropicWebFetchContent(raw)
      if (matches.size == 0) {
        throw AnthropicWebFetchContentNoMatchException("AnthropicWebFetchContent matched 0 branches: " + matches
          .failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw AnthropicWebFetchContentAmbiguityException("AnthropicWebFetchContent matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState2Matches && matches.errorCodeDecoded -> AnthropicWebFetchToolResultError(errorCode =
          requireNotNull(matches.errorCode), type = requireNotNull(matches.typeState2), raw = raw)
        matches.typeState1Matches && matches.contentDecoded && matches.retrievedAtPresent && matches
          .retrievedAtDecoded && matches.urlDecoded -> AnthropicWebFetchBlock(content = requireNotNull(matches
            .content), retrievedAt = matches.retrievedAt, type = requireNotNull(matches.typeState1), url =
              requireNotNull(matches.url), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicWebFetchContent) {
      encoder.requireJsonEncoder("AnthropicWebFetchContent").encodeJsonElement(value.raw)
    }
  }
}

private data class AnthropicWebFetchContentInspection(
  public val typeState2: InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val errorCode: InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesErrorCode?,
  public val errorCodeDecoded: Boolean,
  public val typeState1: InlineComponentsSchemasAnthropicWebFetchBlockPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val content: AnthropicDocumentBlock?,
  public val contentDecoded: Boolean,
  public val retrievedAt: String?,
  public val retrievedAtPresent: Boolean,
  public val retrievedAtDecoded: Boolean,
  public val url: String?,
  public val urlDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState2Matches && errorCodeDecoded) add("AnthropicWebFetchToolResultError")
      if (typeState1Matches && contentDecoded && retrievedAtPresent && retrievedAtDecoded &&
        urlDecoded) add("AnthropicWebFetchBlock")
    }

  public val size: Int
    get() = names.size
}

private fun inspectAnthropicWebFetchContent(raw: JsonObject): AnthropicWebFetchContentInspection {
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "web_fetch_tool_result_error" && typeState2Decoded
  val errorCodeResult = raw["error_code"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesErrorCode>(element) } }
  val errorCode = errorCodeResult?.getOrNull()
  val errorCodeDecoded = errorCodeResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicWebFetchBlockPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "web_fetch_result" && typeState1Decoded
  val contentResult = raw["content"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<AnthropicDocumentBlock>(element) } }
  val content = contentResult?.getOrNull()
  val contentDecoded = contentResult?.isSuccess == true
  val retrievedAtResult = raw["retrieved_at"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String?>(element) } }
  val retrievedAt = retrievedAtResult?.getOrNull()
  val retrievedAtPresent = raw.containsKey("retrieved_at")
  val retrievedAtDecoded = retrievedAtResult?.isSuccess == true
  val urlResult = raw["url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val url = urlResult?.getOrNull()
  val urlDecoded = urlResult?.isSuccess == true
  return AnthropicWebFetchContentInspection(
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
    retrievedAt = retrievedAt,
    retrievedAtPresent = retrievedAtPresent,
    retrievedAtDecoded = retrievedAtDecoded,
    url = url,
    urlDecoded = urlDecoded,
    failures = buildList {
      if (!typeState2Matches ||
        !errorCodeDecoded) add("AnthropicWebFetchToolResultError: required properties 'type' and 'error_code' do not " +
          "match their declared types")
      if (!typeState1Matches || !contentDecoded || !retrievedAtPresent || !retrievedAtDecoded ||
        !urlDecoded) add("AnthropicWebFetchBlock: required properties 'type' and 'content' and 'retrieved_at' and " +
          "'url' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
