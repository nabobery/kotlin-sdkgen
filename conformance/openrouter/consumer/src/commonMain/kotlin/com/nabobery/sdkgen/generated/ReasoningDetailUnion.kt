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
import kotlinx.serialization.json.put

public sealed class ReasoningDetailUnionDecodingException(
  message: String,
) : SerializationException(message)

public class ReasoningDetailUnionNoMatchException(
  message: String,
) : ReasoningDetailUnionDecodingException(message)

public class ReasoningDetailUnionAmbiguityException(
  message: String,
) : ReasoningDetailUnionDecodingException(message)

/**
 * Reasoning detail union schema
 */
@Serializable(with = ReasoningDetailUnion.Serializer::class)
public sealed interface ReasoningDetailUnion {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class ReasoningDetailSummary internal constructor(
    public val summary: String,
    public val type: InlineComponentsSchemasReasoningDetailSummaryPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ReasoningDetailUnion {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(summary: String,
        type: InlineComponentsSchemasReasoningDetailSummaryPropertiesType): ReasoningDetailSummary =
          ReasoningDetailSummary(
        summary = summary,
        type = type,
        raw = buildJsonObject {
          put("summary", summary)
          put("type", "reasoning.summary")
        },
      )
    }
  }

  public class ReasoningDetailEncrypted internal constructor(
    public val `data`: String,
    public val type: InlineComponentsSchemasReasoningDetailEncryptedPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ReasoningDetailUnion {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(`data`: String,
        type: InlineComponentsSchemasReasoningDetailEncryptedPropertiesType): ReasoningDetailEncrypted =
          ReasoningDetailEncrypted(
        data = data,
        type = type,
        raw = buildJsonObject {
          put("data", data)
          put("type", "reasoning.encrypted")
        },
      )
    }
  }

  public class ReasoningDetailText internal constructor(
    public val type: InlineComponentsSchemasReasoningDetailTextPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ReasoningDetailUnion {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasReasoningDetailTextPropertiesType): ReasoningDetailText =
        ReasoningDetailText(
        type = type,
        raw = buildJsonObject {
          put("type", "reasoning.text")
        },
      )
    }
  }

  public class ReasoningDetailServerToolCall internal constructor(
    public val arguments: String,
    public val result: String,
    public val toolName: String,
    public val type: InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ReasoningDetailUnion {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        arguments: String,
        result: String,
        toolName: String,
        type: InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType,
      ): ReasoningDetailServerToolCall = ReasoningDetailServerToolCall(
        arguments = arguments,
        result = result,
        toolName = toolName,
        type = type,
        raw = buildJsonObject {
          put("arguments", arguments)
          put("result", result)
          put("tool_name", toolName)
          put("type", "reasoning.server_tool_call")
        },
      )
    }
  }

  public object Serializer : KSerializer<ReasoningDetailUnion> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReasoningDetailUnion {
      val jsonDecoder = decoder.requireJsonDecoder("ReasoningDetailUnion")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw ReasoningDetailUnionNoMatchException("ReasoningDetailUnion matched 0 branches: expected JSON object")
      val matches = inspectReasoningDetailUnion(raw)
      if (matches.size == 0) {
        throw ReasoningDetailUnionNoMatchException("ReasoningDetailUnion matched 0 branches: " + matches.failures
          .joinToString("; "))
      }
      if (matches.size > 1) {
        throw ReasoningDetailUnionAmbiguityException("ReasoningDetailUnion matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState3Matches && matches.summaryDecoded -> ReasoningDetailSummary(summary = requireNotNull(matches
          .summary), type = requireNotNull(matches.typeState3), raw = raw)
        matches.typeState1Matches && matches.dataDecoded -> ReasoningDetailEncrypted(data = requireNotNull(matches
          .data), type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState4Matches -> ReasoningDetailText(type = requireNotNull(matches.typeState4), raw = raw)
        matches.typeState2Matches && matches.argumentsDecoded && matches.resultDecoded && matches.toolNameDecoded ->
          ReasoningDetailServerToolCall(arguments = requireNotNull(matches.arguments), result = requireNotNull(matches
            .result), toolName = requireNotNull(matches.toolName), type = requireNotNull(matches.typeState2), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: ReasoningDetailUnion) {
      encoder.requireJsonEncoder("ReasoningDetailUnion").encodeJsonElement(value.raw)
    }
  }
}

private data class ReasoningDetailUnionInspection(
  public val typeState3: InlineComponentsSchemasReasoningDetailSummaryPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val summary: String?,
  public val summaryDecoded: Boolean,
  public val typeState1: InlineComponentsSchemasReasoningDetailEncryptedPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val `data`: String?,
  public val dataDecoded: Boolean,
  public val typeState4: InlineComponentsSchemasReasoningDetailTextPropertiesType?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val typeState2: InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val arguments: String?,
  public val argumentsDecoded: Boolean,
  public val result: String?,
  public val resultDecoded: Boolean,
  public val toolName: String?,
  public val toolNameDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState3Matches && summaryDecoded) add("ReasoningDetailSummary")
      if (typeState1Matches && dataDecoded) add("ReasoningDetailEncrypted")
      if (typeState4Matches) add("ReasoningDetailText")
      if (typeState2Matches && argumentsDecoded && resultDecoded &&
        toolNameDecoded) add("ReasoningDetailServerToolCall")
    }

  public val size: Int
    get() = names.size
}

private fun inspectReasoningDetailUnion(raw: JsonObject): ReasoningDetailUnionInspection {
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasReasoningDetailSummaryPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "reasoning.summary" && typeState3Decoded
  val summaryResult = raw["summary"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val summary = summaryResult?.getOrNull()
  val summaryDecoded = summaryResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasReasoningDetailEncryptedPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "reasoning.encrypted" && typeState1Decoded
  val dataResult = raw["data"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val data = dataResult?.getOrNull()
  val dataDecoded = dataResult?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasReasoningDetailTextPropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = raw.stringValue("type") == "reasoning.text" && typeState4Decoded
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "reasoning.server_tool_call" && typeState2Decoded
  val argumentsResult = raw["arguments"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val arguments = argumentsResult?.getOrNull()
  val argumentsDecoded = argumentsResult?.isSuccess == true
  val resultResult = raw["result"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val result = resultResult?.getOrNull()
  val resultDecoded = resultResult?.isSuccess == true
  val toolNameResult = raw["tool_name"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val toolName = toolNameResult?.getOrNull()
  val toolNameDecoded = toolNameResult?.isSuccess == true
  return ReasoningDetailUnionInspection(
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    summary = summary,
    summaryDecoded = summaryDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    data = data,
    dataDecoded = dataDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    arguments = arguments,
    argumentsDecoded = argumentsDecoded,
    result = result,
    resultDecoded = resultDecoded,
    toolName = toolName,
    toolNameDecoded = toolNameDecoded,
    failures = buildList {
      if (!typeState3Matches ||
        !summaryDecoded) add("ReasoningDetailSummary: required properties 'type' and 'summary' do not match their " +
          "declared types")
      if (!typeState1Matches ||
        !dataDecoded) add("ReasoningDetailEncrypted: required properties 'type' and 'data' do not match their " +
          "declared types")
      if (!typeState4Matches) add("ReasoningDetailText: required properties 'type' do not match their declared types")
      if (!typeState2Matches || !argumentsDecoded || !resultDecoded ||
        !toolNameDecoded) add("ReasoningDetailServerToolCall: required properties 'type' and 'arguments' and 'result' " +
          "and 'tool_name' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
