package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Pair
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
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

public class StopServerToolsWhenConditionBranchValidationException(
  message: String,
) : StopServerToolsWhenConditionDecodingException(message)

/**
 * A single condition that, when met, halts the server-tool agent loop.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenCondition
 */
@Serializable(with = StopServerToolsWhenConditionSerializer::class)
public sealed interface StopServerToolsWhenCondition {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class StopServerToolsWhenStepCountIs internal constructor(
    public val stepCount: Int,
    public val type: InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StopServerToolsWhenCondition {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(stepCount: Int, type: InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48): StopServerToolsWhenStepCountIs {
        val raw = buildJsonObject {
          put("step_count", SdkJson.encodeToJsonElement(stepCount))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStopServerToolsWhenCondition(raw)
        if (inspection.size == 0) {
          throw StopServerToolsWhenConditionNoMatchException("StopServerToolsWhenCondition matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.stopServerToolsWhenStepCountIsMatches) {
          throw StopServerToolsWhenConditionBranchValidationException("StopServerToolsWhenStepCountIs factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StopServerToolsWhenConditionAmbiguityException("StopServerToolsWhenCondition matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return StopServerToolsWhenStepCountIs(
          stepCount = stepCount,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class StopServerToolsWhenHasToolCall internal constructor(
    public val toolName: String,
    public val type: InlineStopServerToolsWhenHasToolCallTypeX57d5992a,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StopServerToolsWhenCondition {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(toolName: String, type: InlineStopServerToolsWhenHasToolCallTypeX57d5992a): StopServerToolsWhenHasToolCall {
        val raw = buildJsonObject {
          put("tool_name", toolName)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStopServerToolsWhenCondition(raw)
        if (inspection.size == 0) {
          throw StopServerToolsWhenConditionNoMatchException("StopServerToolsWhenCondition matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.stopServerToolsWhenHasToolCallMatches) {
          throw StopServerToolsWhenConditionBranchValidationException("StopServerToolsWhenHasToolCall factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StopServerToolsWhenConditionAmbiguityException("StopServerToolsWhenCondition matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return StopServerToolsWhenHasToolCall(
          toolName = toolName,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class StopServerToolsWhenMaxTokensUsed internal constructor(
    public val maxTokens: Int,
    public val type: InlineStopServerToolsWhenMaxTokensUsedTypeX6ee9fb95,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StopServerToolsWhenCondition {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(maxTokens: Int, type: InlineStopServerToolsWhenMaxTokensUsedTypeX6ee9fb95): StopServerToolsWhenMaxTokensUsed {
        val raw = buildJsonObject {
          put("max_tokens", SdkJson.encodeToJsonElement(maxTokens))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStopServerToolsWhenCondition(raw)
        if (inspection.size == 0) {
          throw StopServerToolsWhenConditionNoMatchException("StopServerToolsWhenCondition matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.stopServerToolsWhenMaxTokensUsedMatches) {
          throw StopServerToolsWhenConditionBranchValidationException("StopServerToolsWhenMaxTokensUsed factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StopServerToolsWhenConditionAmbiguityException("StopServerToolsWhenCondition matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return StopServerToolsWhenMaxTokensUsed(
          maxTokens = maxTokens,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class StopServerToolsWhenMaxCost internal constructor(
    public val maxCostInDollars: Double,
    public val type: InlineStopServerToolsWhenMaxCostTypeXb96d6305,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StopServerToolsWhenCondition {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(maxCostInDollars: Double, type: InlineStopServerToolsWhenMaxCostTypeXb96d6305): StopServerToolsWhenMaxCost {
        val raw = buildJsonObject {
          put("max_cost_in_dollars", SdkJson.encodeToJsonElement(maxCostInDollars))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStopServerToolsWhenCondition(raw)
        if (inspection.size == 0) {
          throw StopServerToolsWhenConditionNoMatchException("StopServerToolsWhenCondition matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.stopServerToolsWhenMaxCostMatches) {
          throw StopServerToolsWhenConditionBranchValidationException("StopServerToolsWhenMaxCost factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StopServerToolsWhenConditionAmbiguityException("StopServerToolsWhenCondition matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return StopServerToolsWhenMaxCost(
          maxCostInDollars = maxCostInDollars,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class StopServerToolsWhenFinishReasonIs internal constructor(
    public val reason: String,
    public val type: InlineStopServerToolsWhenFinishReasonIsTypeX4550df21,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StopServerToolsWhenCondition {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(reason: String, type: InlineStopServerToolsWhenFinishReasonIsTypeX4550df21): StopServerToolsWhenFinishReasonIs {
        val raw = buildJsonObject {
          put("reason", reason)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStopServerToolsWhenCondition(raw)
        if (inspection.size == 0) {
          throw StopServerToolsWhenConditionNoMatchException("StopServerToolsWhenCondition matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.stopServerToolsWhenFinishReasonIsMatches) {
          throw StopServerToolsWhenConditionBranchValidationException("StopServerToolsWhenFinishReasonIs factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StopServerToolsWhenConditionAmbiguityException("StopServerToolsWhenCondition matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return StopServerToolsWhenFinishReasonIs(
          reason = reason,
          type = type,
          raw = raw,
        )
      }
    }
  }
}

internal object StopServerToolsWhenConditionSerializer : KSerializer<StopServerToolsWhenCondition> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): StopServerToolsWhenCondition {
    val jsonDecoder = decoder.requireJsonDecoder("StopServerToolsWhenCondition")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw StopServerToolsWhenConditionNoMatchException("StopServerToolsWhenCondition matched 0 branches: expected JSON object")
    val matches = inspectStopServerToolsWhenCondition(rawObject)
    if (matches.size == 0) {
      throw StopServerToolsWhenConditionNoMatchException("StopServerToolsWhenCondition matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw StopServerToolsWhenConditionAmbiguityException("StopServerToolsWhenCondition matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.stopServerToolsWhenStepCountIsMatches -> StopServerToolsWhenCondition.StopServerToolsWhenStepCountIs(stepCount = requireNotNull(matches.stepCount), type = requireNotNull(matches.typeState9), raw = rawObject)
      matches.stopServerToolsWhenHasToolCallMatches -> StopServerToolsWhenCondition.StopServerToolsWhenHasToolCall(toolName = requireNotNull(matches.toolName), type = requireNotNull(matches.typeState3), raw = rawObject)
      matches.stopServerToolsWhenMaxTokensUsedMatches -> StopServerToolsWhenCondition.StopServerToolsWhenMaxTokensUsed(maxTokens = requireNotNull(matches.maxTokens), type = requireNotNull(matches.typeState7), raw = rawObject)
      matches.stopServerToolsWhenMaxCostMatches -> StopServerToolsWhenCondition.StopServerToolsWhenMaxCost(maxCostInDollars = requireNotNull(matches.maxCostInDollars), type = requireNotNull(matches.typeState5), raw = rawObject)
      matches.stopServerToolsWhenFinishReasonIsMatches -> StopServerToolsWhenCondition.StopServerToolsWhenFinishReasonIs(reason = requireNotNull(matches.reason), type = requireNotNull(matches.typeState1), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: StopServerToolsWhenCondition) {
    encoder.requireJsonEncoder("StopServerToolsWhenCondition").encodeJsonElement(value.raw)
  }
}

internal data class StopServerToolsWhenConditionInspection(
  public val typeState9: InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48?,
  public val typeState9Decoded: Boolean,
  public val typeState9Matches: Boolean,
  public val stepCount: Int?,
  public val stepCountDecoded: Boolean,
  public val typeState10: InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48?,
  public val typeState10Decoded: Boolean,
  public val typeState10Matches: Boolean,
  public val typeState3: InlineStopServerToolsWhenHasToolCallTypeX57d5992a?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val toolName: String?,
  public val toolNameDecoded: Boolean,
  public val typeState4: InlineStopServerToolsWhenHasToolCallTypeX57d5992a?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val typeState7: InlineStopServerToolsWhenMaxTokensUsedTypeX6ee9fb95?,
  public val typeState7Decoded: Boolean,
  public val typeState7Matches: Boolean,
  public val maxTokens: Int?,
  public val maxTokensDecoded: Boolean,
  public val typeState8: InlineStopServerToolsWhenMaxTokensUsedTypeX6ee9fb95?,
  public val typeState8Decoded: Boolean,
  public val typeState8Matches: Boolean,
  public val typeState5: InlineStopServerToolsWhenMaxCostTypeXb96d6305?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val maxCostInDollars: Double?,
  public val maxCostInDollarsDecoded: Boolean,
  public val typeState6: InlineStopServerToolsWhenMaxCostTypeXb96d6305?,
  public val typeState6Decoded: Boolean,
  public val typeState6Matches: Boolean,
  public val typeState1: InlineStopServerToolsWhenFinishReasonIsTypeX4550df21?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val reason: String?,
  public val reasonDecoded: Boolean,
  public val typeState2: InlineStopServerToolsWhenFinishReasonIsTypeX4550df21?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val stopServerToolsWhenStepCountIsMatches: Boolean,
  public val stopServerToolsWhenHasToolCallMatches: Boolean,
  public val stopServerToolsWhenMaxTokensUsedMatches: Boolean,
  public val stopServerToolsWhenMaxCostMatches: Boolean,
  public val stopServerToolsWhenFinishReasonIsMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (stopServerToolsWhenStepCountIsMatches) add("StopServerToolsWhenStepCountIs")
      if (stopServerToolsWhenHasToolCallMatches) add("StopServerToolsWhenHasToolCall")
      if (stopServerToolsWhenMaxTokensUsedMatches) add("StopServerToolsWhenMaxTokensUsed")
      if (stopServerToolsWhenMaxCostMatches) add("StopServerToolsWhenMaxCost")
      if (stopServerToolsWhenFinishReasonIsMatches) add("StopServerToolsWhenFinishReasonIs")
    }

  public val size: Int
    get() = names.size
}

private fun inspectStopServerToolsWhenCondition(rawObject: JsonObject): StopServerToolsWhenConditionInspection {
  val typeState9Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState9Matches = (rawObject.stringValue("type") == "step_count_is") && typeState9Decoded
  val stepCountResult = rawObject["step_count"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val stepCount = stepCountResult?.getOrNull()
  val stepCountDecoded = stepCountResult?.isSuccess == true
  val typeState10Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState10Matches = (rawObject.stringValue("type") == "step_count_is") && typeState10Decoded
  val typeState3Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineStopServerToolsWhenHasToolCallTypeX57d5992a>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = (rawObject.stringValue("type") == "has_tool_call") && typeState3Decoded
  val toolNameResult = rawObject["tool_name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val toolName = toolNameResult?.getOrNull()
  val toolNameDecoded = toolNameResult?.isSuccess == true
  val typeState4Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineStopServerToolsWhenHasToolCallTypeX57d5992a>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = (rawObject.stringValue("type") == "has_tool_call") && typeState4Decoded
  val typeState7Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineStopServerToolsWhenMaxTokensUsedTypeX6ee9fb95>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = (rawObject.stringValue("type") == "max_tokens_used") && typeState7Decoded
  val maxTokensResult = rawObject["max_tokens"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val maxTokens = maxTokensResult?.getOrNull()
  val maxTokensDecoded = maxTokensResult?.isSuccess == true
  val typeState8Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineStopServerToolsWhenMaxTokensUsedTypeX6ee9fb95>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = (rawObject.stringValue("type") == "max_tokens_used") && typeState8Decoded
  val typeState5Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineStopServerToolsWhenMaxCostTypeXb96d6305>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = (rawObject.stringValue("type") == "max_cost") && typeState5Decoded
  val maxCostInDollarsResult = rawObject["max_cost_in_dollars"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double>(element) } }
  val maxCostInDollars = maxCostInDollarsResult?.getOrNull()
  val maxCostInDollarsDecoded = maxCostInDollarsResult?.isSuccess == true
  val typeState6Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineStopServerToolsWhenMaxCostTypeXb96d6305>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = (rawObject.stringValue("type") == "max_cost") && typeState6Decoded
  val typeState1Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineStopServerToolsWhenFinishReasonIsTypeX4550df21>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = (rawObject.stringValue("type") == "finish_reason_is") && typeState1Decoded
  val reasonResult = rawObject["reason"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val reason = reasonResult?.getOrNull()
  val reasonDecoded = reasonResult?.isSuccess == true
  val typeState2Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineStopServerToolsWhenFinishReasonIsTypeX4550df21>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = (rawObject.stringValue("type") == "finish_reason_is") && typeState2Decoded
  val rawEmpty = rawObject.isEmpty()
  val stopServerToolsWhenStepCountIsMatches = matchesStopServerToolsWhenConditionStopServerToolsWhenStepCountIsBranch(rawObject) && (typeState9Matches)
  val stopServerToolsWhenHasToolCallMatches = matchesStopServerToolsWhenConditionStopServerToolsWhenHasToolCallBranch(rawObject) && (typeState3Matches)
  val stopServerToolsWhenMaxTokensUsedMatches = matchesStopServerToolsWhenConditionStopServerToolsWhenMaxTokensUsedBranch(rawObject) && (typeState7Matches)
  val stopServerToolsWhenMaxCostMatches = matchesStopServerToolsWhenConditionStopServerToolsWhenMaxCostBranch(rawObject) && (typeState5Matches)
  val stopServerToolsWhenFinishReasonIsMatches = matchesStopServerToolsWhenConditionStopServerToolsWhenFinishReasonIsBranch(rawObject) && (typeState1Matches)
  return StopServerToolsWhenConditionInspection(
    typeState9 = typeState9,
    typeState9Decoded = typeState9Decoded,
    typeState9Matches = typeState9Matches,
    stepCount = stepCount,
    stepCountDecoded = stepCountDecoded,
    typeState10 = typeState10,
    typeState10Decoded = typeState10Decoded,
    typeState10Matches = typeState10Matches,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    toolName = toolName,
    toolNameDecoded = toolNameDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    typeState7Matches = typeState7Matches,
    maxTokens = maxTokens,
    maxTokensDecoded = maxTokensDecoded,
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    typeState8Matches = typeState8Matches,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    maxCostInDollars = maxCostInDollars,
    maxCostInDollarsDecoded = maxCostInDollarsDecoded,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    typeState6Matches = typeState6Matches,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    reason = reason,
    reasonDecoded = reasonDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    stopServerToolsWhenStepCountIsMatches = stopServerToolsWhenStepCountIsMatches,
    stopServerToolsWhenHasToolCallMatches = stopServerToolsWhenHasToolCallMatches,
    stopServerToolsWhenMaxTokensUsedMatches = stopServerToolsWhenMaxTokensUsedMatches,
    stopServerToolsWhenMaxCostMatches = stopServerToolsWhenMaxCostMatches,
    stopServerToolsWhenFinishReasonIsMatches = stopServerToolsWhenFinishReasonIsMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!stopServerToolsWhenStepCountIsMatches) add("StopServerToolsWhenStepCountIs: branch predicate did not match properties 'type'")
      if (!stopServerToolsWhenHasToolCallMatches) add("StopServerToolsWhenHasToolCall: branch predicate did not match properties 'type'")
      if (!stopServerToolsWhenMaxTokensUsedMatches) add("StopServerToolsWhenMaxTokensUsed: branch predicate did not match properties 'type'")
      if (!stopServerToolsWhenMaxCostMatches) add("StopServerToolsWhenMaxCost: branch predicate did not match properties 'type'")
      if (!stopServerToolsWhenFinishReasonIsMatches) add("StopServerToolsWhenFinishReasonIs: branch predicate did not match properties 'type'")
    },
  )
}

private fun matchesStopServerToolsWhenConditionStopServerToolsWhenStepCountIsBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("step_count") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["step_count"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"step_count_is\"")))) } ?: true))))

private fun matchesStopServerToolsWhenConditionStopServerToolsWhenHasToolCallBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("tool_name") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["tool_name"]?.let { property -> (property is JsonPrimitive && property.isString && property.matchesJsonSchemaString(1, null, null)) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"has_tool_call\"")))) } ?: true))))

private fun matchesStopServerToolsWhenConditionStopServerToolsWhenMaxTokensUsedBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("max_tokens") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["max_tokens"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"max_tokens_used\"")))) } ?: true))))

private fun matchesStopServerToolsWhenConditionStopServerToolsWhenMaxCostBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("max_cost_in_dollars") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["max_cost_in_dollars"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"max_cost\"")))) } ?: true))))

private fun matchesStopServerToolsWhenConditionStopServerToolsWhenFinishReasonIsBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("reason") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["reason"]?.let { property -> (property is JsonPrimitive && property.isString && property.matchesJsonSchemaString(1, null, null)) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"finish_reason_is\"")))) } ?: true))))

private fun schemaExactDecimal(`value`: String): SchemaDecimal? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  if (digits == "0") return SchemaDecimal(false, "0", SchemaInteger(false, "0"))
  var scale = schemaIntegerSubtract(
      SchemaInteger(false, match.groupValues[3].length.toString()),
      requireNotNull(schemaInteger(match.groupValues[4].ifEmpty { "0" })),
  )
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale = schemaIntegerSubtract(scale, SchemaInteger(false, "1"))
  }
  return SchemaDecimal(match.groupValues[1] == "-", digits, scale)
}

private fun schemaInteger(`value`: String): SchemaInteger? {
  val match = Regex("^([+-]?)(\\d+)$").matchEntire(value) ?: return null
  val digits = match.groupValues[2].trimStart('0').ifEmpty { "0" }
  return SchemaInteger(match.groupValues[1] == "-" && digits != "0", digits)
}

private fun schemaIntegerCompare(left: SchemaInteger, right: SchemaInteger): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  return if (left.negative) -comparison else comparison
}

private fun schemaIntegerMagnitudeCompare(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaIntegerSubtract(left: SchemaInteger, right: SchemaInteger): SchemaInteger = schemaIntegerAdd(left, SchemaInteger(!right.negative && right.digits != "0", right.digits))

private fun schemaIntegerAdd(left: SchemaInteger, right: SchemaInteger): SchemaInteger {
  if (left.negative == right.negative) return SchemaInteger(left.negative, schemaIntegerMagnitudeAdd(left.digits, right.digits))
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  if (comparison == 0) return SchemaInteger(false, "0")
  return if (comparison > 0) {
      SchemaInteger(left.negative, schemaIntegerMagnitudeSubtract(left.digits, right.digits))
  } else {
      SchemaInteger(right.negative, schemaIntegerMagnitudeSubtract(right.digits, left.digits))
  }
}

private fun schemaIntegerMagnitudeAdd(left: String, right: String): String {
  val result = StringBuilder()
  var carry = 0
  val width = maxOf(left.length, right.length)
  for (offset in 0 until width) {
      val leftDigit = left.getOrNull(left.length - 1 - offset)?.minus('0') ?: 0
      val rightDigit = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      val total = leftDigit + rightDigit + carry
      result.append(('0'.code + total % 10).toChar())
      carry = total / 10
  }
  if (carry > 0) result.append(('0'.code + carry).toChar())
  return result.reverse().toString()
}

private fun schemaIntegerMagnitudeSubtract(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (offset in left.indices) {
      var digit = left[left.length - 1 - offset] - '0' - borrow
      val subtrahend = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun schemaExactCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaExactMagnitudeCompare(left, right)
  return if (left.negative) -comparison else comparison
}

private fun schemaExactMagnitudeCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  val leftPower = schemaIntegerSubtract(SchemaInteger(false, (left.digits.length - 1).toString()), left.scale)
  val rightPower = schemaIntegerSubtract(SchemaInteger(false, (right.digits.length - 1).toString()), right.scale)
  val powerComparison = schemaIntegerCompare(leftPower, rightPower)
  if (powerComparison != 0) return powerComparison
  val width = maxOf(left.digits.length, right.digits.length)
  for (index in 0 until width) {
      val leftDigit = left.digits.getOrNull(index) ?: '0'
      val rightDigit = right.digits.getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaExactIsMultipleOf(`value`: SchemaDecimal, divisor: SchemaDecimal): Boolean {
  if (divisor.digits == "0") return false
  if (value.digits == "0") return true
  val shift = schemaIntegerSubtract(divisor.scale, value.scale)
  if (schemaIntegerCompare(shift, SchemaInteger(false, "0")) < 0) return false
  val divisorTwos = schemaFactorCount(divisor.digits, 2)
  val divisorFives = schemaFactorCount(divisorTwos.first, 5)
  if (schemaExactRemainder(value.digits, divisorFives.first) != "0") return false
  val valueTwos = schemaFactorCount(value.digits, 2).second
  val valueFives = schemaFactorCount(value.digits, 5).second
  val requiredTwos = (divisorTwos.second - valueTwos).coerceAtLeast(0)
  val requiredFives = (divisorFives.second - valueFives).coerceAtLeast(0)
  return schemaIntegerCompare(shift, SchemaInteger(false, requiredTwos.toString())) >= 0 &&
      schemaIntegerCompare(shift, SchemaInteger(false, requiredFives.toString())) >= 0
}

private fun schemaFactorCount(`value`: String, factor: Int): Pair<String, Int> {
  var remainder = value
  var count = 0
  while (remainder != "0") {
      val division = schemaDivideBySmall(remainder, factor)
      if (division.second != 0) break
      remainder = division.first
      count += 1
  }
  return remainder to count
}

private fun schemaDivideBySmall(`value`: String, divisor: Int): Pair<String, Int> {
  val quotient = StringBuilder()
  var remainder = 0
  value.forEach { digit ->
      val combined = remainder * 10 + (digit - '0')
      quotient.append(('0'.code + combined / divisor).toChar())
      remainder = combined % divisor
  }
  return quotient.toString().trimStart('0').ifEmpty { "0" } to remainder
}

private fun schemaExactRemainder(dividend: String, divisor: String): String {
  if (divisor == "1") return "0"
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaIntegerMagnitudeCompare(remainder, divisor) >= 0) {
          remainder = schemaIntegerMagnitudeSubtract(remainder, divisor)
      }
  }
  return remainder
}

private fun JsonElement.isJsonSchemaNumber(): Boolean {
  val primitive = this as? JsonPrimitive ?: return false
  if (primitive.isString || primitive.content == "true" || primitive.content == "false" || this is JsonNull) return false
  return schemaExactDecimal(primitive.content) != null
}

private fun JsonElement.isJsonSchemaInteger(): Boolean {
  val parts = (this as? JsonPrimitive)?.takeIf { isJsonSchemaNumber() }?.let { schemaExactDecimal(it.content) }
      ?: return false
  return schemaIntegerCompare(parts.scale, SchemaInteger(false, "0")) <= 0
}

private fun JsonElement.matchesJsonSchemaNumber(
  minimum: String?,
  maximum: String?,
  exclusiveMinimum: String?,
  exclusiveMaximum: String?,
  multipleOf: String?,
): Boolean {
  if (!isJsonSchemaNumber()) return true
  val value = requireNotNull(schemaExactDecimal((this as JsonPrimitive).content))
  minimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) < 0) return false }
  maximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) > 0) return false }
  exclusiveMinimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) <= 0) return false }
  exclusiveMaximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) >= 0) return false }
  multipleOf?.let { if (!schemaExactIsMultipleOf(value, requireNotNull(schemaExactDecimal(it)))) return false }
  return true
}

private fun JsonElement.matchesJsonSchemaString(
  minLength: Int?,
  maxLength: Int?,
  format: String?,
): Boolean {
  val primitive = this as? JsonPrimitive ?: return true
  if (!primitive.isString) return true
  val value = primitive.content
  val length = value.jsonSchemaCodePointCount()
  if (minLength != null && length < minLength) return false
  if (maxLength != null && length > maxLength) return false
  return when (format) {
      null -> true
      "date" -> value.isRfc3339Date()
      "date-time" -> value.isRfc3339DateTime()
      else -> false
  }
}

private fun JsonElement.jsonSchemaEquals(other: JsonElement): Boolean {
  if (this is JsonNull || other is JsonNull) return this is JsonNull && other is JsonNull
  if (this is JsonArray && other is JsonArray) return size == other.size && indices.all { this[it].jsonSchemaEquals(other[it]) }
  if (this is JsonObject && other is JsonObject) return keys == other.keys && keys.all { key -> getValue(key).jsonSchemaEquals(other.getValue(key)) }
  if (this !is JsonPrimitive || other !is JsonPrimitive) return false
  if (isString || other.isString) return isString && other.isString && content == other.content
  if (isJsonSchemaNumber() && other.isJsonSchemaNumber()) {
      return schemaExactCompare(
          requireNotNull(schemaExactDecimal(content)),
          requireNotNull(schemaExactDecimal(other.content)),
      ) == 0
  }
  return content == other.content
}

private fun String.jsonSchemaCodePointCount(): Int {
  var count = 0
  var index = 0
  while (index < length) {
      val highSurrogate = this[index].code in 55296..56319
      val lowSurrogate = index + 1 < length && this[index + 1].code in 56320..57343
      index += if (highSurrogate && lowSurrogate) 2 else 1
      count += 1
  }
  return count
}

private fun String.isRfc3339Date(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})$").matchEntire(this) ?: return false
  return isValidRfc3339Date(match.groupValues[1].toInt(), match.groupValues[2].toInt(), match.groupValues[3].toInt())
}

private fun String.isRfc3339DateTime(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})[Tt](\\d{2}):(\\d{2}):(\\d{2})(?:\\.\\d+)?([Zz]|[+-]\\d{2}:\\d{2})$")
      .matchEntire(this) ?: return false
  val hour = match.groupValues[4].toInt()
  val minute = match.groupValues[5].toInt()
  val second = match.groupValues[6].toInt()
  val offset = match.groupValues[7]
  val year = match.groupValues[1].toInt()
  val month = match.groupValues[2].toInt()
  val day = match.groupValues[3].toInt()
  if (!isValidRfc3339Date(year, month, day)) return false
  if (hour !in 0..23 || minute !in 0..59 || second !in 0..60) return false
  if (offset.length != 1) {
      val offsetHour = offset.substring(1, 3).toInt()
      val offsetMinute = offset.substring(4, 6).toInt()
      if (offsetHour !in 0..23 || offsetMinute !in 0..59) return false
  }
  return second != 60 || isKnownRfc3339LeapSecond(year, month, day, hour, minute, offset)
}

private fun isValidRfc3339Date(
  year: Int,
  month: Int,
  day: Int,
): Boolean {
  if (month !in 1..12) return false
  val days = when (month) {
      2 -> if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28
      4, 6, 9, 11 -> 30
      else -> 31
  }
  return day in 1..days
}

private fun isKnownRfc3339LeapSecond(
  year: Int,
  month: Int,
  day: Int,
  hour: Int,
  minute: Int,
  offset: String,
): Boolean {
  val offsetMinutes =
      if (offset.length == 1) 0
      else {
          val value = offset.substring(1, 3).toInt() * 60 + offset.substring(4, 6).toInt()
          if (offset[0] == '-') -value else value
      }
  val instant = rfc3339DayIndex(year, month, day) * 1_440L + hour * 60L + minute + 1L - offsetMinutes
  return rfc3339LeapSecondInstants().contains(instant)
}

private fun rfc3339DayIndex(
  year: Int,
  month: Int,
  day: Int,
): Long {
  val yearDays = 365L * year + (year + 3L) / 4L - (year + 99L) / 100L + (year + 399L) / 400L
  val monthDays = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)[month - 1]
  val leapDay = if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 1 else 0
  return yearDays + monthDays + leapDay + day - 1L
}

private fun rfc3339LeapSecondInstants(): Set<Long> = setOf(
    (rfc3339DayIndex(1972, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1972, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1973, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1974, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1975, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1976, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1977, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1978, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1979, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1981, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1982, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1983, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1985, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1987, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1989, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1990, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1992, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1993, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1994, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1995, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1997, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1998, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2005, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(2008, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2012, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(2015, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(2016, 12, 31) + 1L) * 1_440L,
)

private fun schemaDecimalParts(`value`: String): List<String>? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  val exponent = match.groupValues[4].ifEmpty { "0" }.toLongOrNull() ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  var scale = match.groupValues[3].length.toLong() - exponent
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale -= 1L
  }
  return listOf(if (digits == "0") "" else match.groupValues[1], digits, scale.toString())
}

private fun schemaCompare(left: List<String>, right: List<String>): Int {
  val leftNegative = left[0] == "-"
  val rightNegative = right[0] == "-"
  if (leftNegative != rightNegative) return if (leftNegative) -1 else 1
  val comparison = schemaCompareMagnitude(left, right)
  return if (leftNegative) -comparison else comparison
}

private fun schemaCompareMagnitude(left: List<String>, right: List<String>): Int {
  val leftScale = left[2].toLong()
  val rightScale = right[2].toLong()
  val leftPower = left[1].length.toLong() - 1L - leftScale
  val rightPower = right[1].length.toLong() - 1L - rightScale
  if (leftPower != rightPower) return leftPower.compareTo(rightPower)
  val width = maxOf(left[1].length, right[1].length)
  for (index in 0 until width) {
      val leftDigit = left[1].getOrNull(index) ?: '0'
      val rightDigit = right[1].getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaIsMultipleOf(`value`: List<String>, divisor: List<String>): Boolean {
  if (divisor[1] == "0") return false
  if (value[1] == "0") return true
  val shift = divisor[2].toLong() - value[2].toLong()
  return if (shift >= 0L) {
      schemaRemainderAfterZeros(value[1], divisor[1], shift) == "0"
  } else {
      val zeros = -shift
      if (zeros > value[1].length.toLong()) false
      else {
          val count = zeros.toInt()
          value[1].takeLast(count).all { it == '0' } && schemaRemainder(value[1].dropLast(count), divisor[1]) == "0"
      }
  }
}

private fun schemaRemainderAfterZeros(
  dividend: String,
  divisor: String,
  zeros: Long,
): String {
  var remainder = schemaRemainder(dividend, divisor)
  var remaining = zeros
  while (remaining > 0L) {
      remainder = schemaRemainder(remainder + "0", divisor)
      remaining -= 1L
  }
  return remainder
}

private fun schemaRemainder(dividend: String, divisor: String): String {
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaCompareInteger(remainder, divisor) >= 0) remainder = schemaSubtractInteger(remainder, divisor)
  }
  return remainder
}

private fun schemaCompareInteger(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaSubtractInteger(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (index in left.indices.reversed()) {
      var digit = (left[index] - '0') - borrow
      val subtrahend = right.getOrNull(right.length - (left.length - index))?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
