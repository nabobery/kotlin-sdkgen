package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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

public sealed class StopServerToolsWhenConditionDecodingException(
  message: String,
) : SerializationException(message)

public class StopServerToolsWhenConditionNoMatchException(
  message: String,
) : StopServerToolsWhenConditionDecodingException(message)

public class StopServerToolsWhenConditionAmbiguityException(
  message: String,
) : StopServerToolsWhenConditionDecodingException(message)

/**
 * A single condition that, when met, halts the server-tool agent loop.
 */
@Serializable(with = StopServerToolsWhenCondition.Serializer::class)
public sealed interface StopServerToolsWhenCondition {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class StopServerToolsWhenStepCountIs internal constructor(
    public val stepCount: Int,
    public val type: InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StopServerToolsWhenCondition {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(stepCount: Int,
        type: InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType): StopServerToolsWhenStepCountIs =
          StopServerToolsWhenStepCountIs(
        stepCount = stepCount,
        type = type,
        raw = buildJsonObject {
          put("step_count", SdkJson.encodeToJsonElement(stepCount))
          put("type", "step_count_is")
        },
      )
    }
  }

  public class StopServerToolsWhenHasToolCall internal constructor(
    public val toolName: String,
    public val type: InlineComponentsSchemasStopServerToolsWhenHasToolCallPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StopServerToolsWhenCondition {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(toolName: String,
        type: InlineComponentsSchemasStopServerToolsWhenHasToolCallPropertiesType): StopServerToolsWhenHasToolCall =
          StopServerToolsWhenHasToolCall(
        toolName = toolName,
        type = type,
        raw = buildJsonObject {
          put("tool_name", toolName)
          put("type", "has_tool_call")
        },
      )
    }
  }

  public class StopServerToolsWhenMaxTokensUsed internal constructor(
    public val maxTokens: Int,
    public val type: InlineComponentsSchemasStopServerToolsWhenMaxTokensUsedPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StopServerToolsWhenCondition {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(maxTokens: Int,
        type: InlineComponentsSchemasStopServerToolsWhenMaxTokensUsedPropertiesType): StopServerToolsWhenMaxTokensUsed = StopServerToolsWhenMaxTokensUsed(
        maxTokens = maxTokens,
        type = type,
        raw = buildJsonObject {
          put("max_tokens", SdkJson.encodeToJsonElement(maxTokens))
          put("type", "max_tokens_used")
        },
      )
    }
  }

  public class StopServerToolsWhenMaxCost internal constructor(
    public val maxCostInDollars: Double,
    public val type: InlineComponentsSchemasStopServerToolsWhenMaxCostPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StopServerToolsWhenCondition {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(maxCostInDollars: Double,
        type: InlineComponentsSchemasStopServerToolsWhenMaxCostPropertiesType): StopServerToolsWhenMaxCost =
          StopServerToolsWhenMaxCost(
        maxCostInDollars = maxCostInDollars,
        type = type,
        raw = buildJsonObject {
          put("max_cost_in_dollars", SdkJson.encodeToJsonElement(maxCostInDollars))
          put("type", "max_cost")
        },
      )
    }
  }

  public class StopServerToolsWhenFinishReasonIs internal constructor(
    public val reason: String,
    public val type: InlineComponentsSchemasStopServerToolsWhenFinishReasonIsPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StopServerToolsWhenCondition {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(reason: String,
        type: InlineComponentsSchemasStopServerToolsWhenFinishReasonIsPropertiesType): StopServerToolsWhenFinishReasonIs = StopServerToolsWhenFinishReasonIs(
        reason = reason,
        type = type,
        raw = buildJsonObject {
          put("reason", reason)
          put("type", "finish_reason_is")
        },
      )
    }
  }

  public object Serializer : KSerializer<StopServerToolsWhenCondition> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): StopServerToolsWhenCondition {
      val jsonDecoder = decoder.requireJsonDecoder("StopServerToolsWhenCondition")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw StopServerToolsWhenConditionNoMatchException("StopServerToolsWhenCondition matched 0 branches: expected " +
          "JSON object")
      val matches = inspectStopServerToolsWhenCondition(raw)
      if (matches.size == 0) {
        throw StopServerToolsWhenConditionNoMatchException("StopServerToolsWhenCondition matched 0 branches: " +
          matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw StopServerToolsWhenConditionAmbiguityException("StopServerToolsWhenCondition matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState5Matches && matches.stepCountDecoded -> StopServerToolsWhenStepCountIs(stepCount =
          requireNotNull(matches.stepCount), type = requireNotNull(matches.typeState5), raw = raw)
        matches.typeState2Matches && matches.toolNameDecoded -> StopServerToolsWhenHasToolCall(toolName =
          requireNotNull(matches.toolName), type = requireNotNull(matches.typeState2), raw = raw)
        matches.typeState4Matches && matches.maxTokensDecoded -> StopServerToolsWhenMaxTokensUsed(maxTokens =
          requireNotNull(matches.maxTokens), type = requireNotNull(matches.typeState4), raw = raw)
        matches.typeState3Matches && matches.maxCostInDollarsDecoded -> StopServerToolsWhenMaxCost(maxCostInDollars =
          requireNotNull(matches.maxCostInDollars), type = requireNotNull(matches.typeState3), raw = raw)
        matches.typeState1Matches && matches.reasonDecoded -> StopServerToolsWhenFinishReasonIs(reason =
          requireNotNull(matches.reason), type = requireNotNull(matches.typeState1), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: StopServerToolsWhenCondition) {
      encoder.requireJsonEncoder("StopServerToolsWhenCondition").encodeJsonElement(value.raw)
    }
  }
}

private data class StopServerToolsWhenConditionInspection(
  public val typeState5: InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val stepCount: Int?,
  public val stepCountDecoded: Boolean,
  public val typeState2: InlineComponentsSchemasStopServerToolsWhenHasToolCallPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val toolName: String?,
  public val toolNameDecoded: Boolean,
  public val typeState4: InlineComponentsSchemasStopServerToolsWhenMaxTokensUsedPropertiesType?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val maxTokens: Int?,
  public val maxTokensDecoded: Boolean,
  public val typeState3: InlineComponentsSchemasStopServerToolsWhenMaxCostPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val maxCostInDollars: Double?,
  public val maxCostInDollarsDecoded: Boolean,
  public val typeState1: InlineComponentsSchemasStopServerToolsWhenFinishReasonIsPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val reason: String?,
  public val reasonDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState5Matches && stepCountDecoded) add("StopServerToolsWhenStepCountIs")
      if (typeState2Matches && toolNameDecoded) add("StopServerToolsWhenHasToolCall")
      if (typeState4Matches && maxTokensDecoded) add("StopServerToolsWhenMaxTokensUsed")
      if (typeState3Matches && maxCostInDollarsDecoded) add("StopServerToolsWhenMaxCost")
      if (typeState1Matches && reasonDecoded) add("StopServerToolsWhenFinishReasonIs")
    }

  public val size: Int
    get() = names.size
}

private fun inspectStopServerToolsWhenCondition(raw: JsonObject): StopServerToolsWhenConditionInspection {
  val typeState5Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = raw.stringValue("type") == "step_count_is" && typeState5Decoded
  val stepCountResult = raw["step_count"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val stepCount = stepCountResult?.getOrNull()
  val stepCountDecoded = stepCountResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasStopServerToolsWhenHasToolCallPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "has_tool_call" && typeState2Decoded
  val toolNameResult = raw["tool_name"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val toolName = toolNameResult?.getOrNull()
  val toolNameDecoded = toolNameResult?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasStopServerToolsWhenMaxTokensUsedPropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = raw.stringValue("type") == "max_tokens_used" && typeState4Decoded
  val maxTokensResult = raw["max_tokens"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val maxTokens = maxTokensResult?.getOrNull()
  val maxTokensDecoded = maxTokensResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasStopServerToolsWhenMaxCostPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "max_cost" && typeState3Decoded
  val maxCostInDollarsResult = raw["max_cost_in_dollars"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Double>(element) } }
  val maxCostInDollars = maxCostInDollarsResult?.getOrNull()
  val maxCostInDollarsDecoded = maxCostInDollarsResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasStopServerToolsWhenFinishReasonIsPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "finish_reason_is" && typeState1Decoded
  val reasonResult = raw["reason"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val reason = reasonResult?.getOrNull()
  val reasonDecoded = reasonResult?.isSuccess == true
  return StopServerToolsWhenConditionInspection(
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    stepCount = stepCount,
    stepCountDecoded = stepCountDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    toolName = toolName,
    toolNameDecoded = toolNameDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    maxTokens = maxTokens,
    maxTokensDecoded = maxTokensDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    maxCostInDollars = maxCostInDollars,
    maxCostInDollarsDecoded = maxCostInDollarsDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    reason = reason,
    reasonDecoded = reasonDecoded,
    failures = buildList {
      if (!typeState5Matches ||
        !stepCountDecoded) add("StopServerToolsWhenStepCountIs: required properties 'type' and 'step_count' do not " +
          "match their declared types")
      if (!typeState2Matches ||
        !toolNameDecoded) add("StopServerToolsWhenHasToolCall: required properties 'type' and 'tool_name' do not " +
          "match their declared types")
      if (!typeState4Matches ||
        !maxTokensDecoded) add("StopServerToolsWhenMaxTokensUsed: required properties 'type' and 'max_tokens' do not " +
          "match their declared types")
      if (!typeState3Matches ||
        !maxCostInDollarsDecoded) add("StopServerToolsWhenMaxCost: required properties 'type' and " +
          "'max_cost_in_dollars' do not match their declared types")
      if (!typeState1Matches ||
        !reasonDecoded) add("StopServerToolsWhenFinishReasonIs: required properties 'type' and 'reason' do not match " +
          "their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
