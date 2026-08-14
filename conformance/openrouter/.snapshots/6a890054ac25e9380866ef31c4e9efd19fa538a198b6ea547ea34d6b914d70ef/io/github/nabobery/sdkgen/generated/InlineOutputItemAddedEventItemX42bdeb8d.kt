package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
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

public sealed class InlineOutputItemAddedEventItemX42bdeb8dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineOutputItemAddedEventItemX42bdeb8dNoMatchException(
  message: String,
) : InlineOutputItemAddedEventItemX42bdeb8dDecodingException(message)

public class InlineOutputItemAddedEventItemX42bdeb8dAmbiguityException(
  message: String,
) : InlineOutputItemAddedEventItemX42bdeb8dDecodingException(message)

public class InlineOutputItemAddedEventItemX42bdeb8dBranchValidationException(
  message: String,
) : InlineOutputItemAddedEventItemX42bdeb8dDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/OutputItemAddedEvent/properties/item.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemAddedEvent/properties/item
 */
@Serializable(with = InlineOutputItemAddedEventItemX42bdeb8dSerializer::class)
public sealed interface InlineOutputItemAddedEventItemX42bdeb8d {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class OutputMessage internal constructor(
    content: List<InlineOutputMessageContentItemX9f591485>,
    public val id: String,
    public val role: InlineOutputMessageRoleXe91a3401,
    public val type: InlineOutputMessageTypeXba66a1d6,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOutputItemAddedEventItemX42bdeb8d {
    public val content: List<InlineOutputMessageContentItemX9f591485> = content.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: List<InlineOutputMessageContentItemX9f591485>,
        id: String,
        role: InlineOutputMessageRoleXe91a3401,
        type: InlineOutputMessageTypeXba66a1d6,
      ): OutputMessage {
        val contentOwnershipSnapshot = content.toList()
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(contentOwnershipSnapshot))
          put("id", id)
          put("role", SdkJson.encodeToJsonElement(role))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineOutputItemAddedEventItemX42bdeb8d(raw)
        if (inspection.size == 0) {
          throw InlineOutputItemAddedEventItemX42bdeb8dNoMatchException("InlineOutputItemAddedEventItemX42bdeb8d matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputMessageMatches) {
          throw InlineOutputItemAddedEventItemX42bdeb8dBranchValidationException("OutputMessage factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOutputItemAddedEventItemX42bdeb8dAmbiguityException("InlineOutputItemAddedEventItemX42bdeb8d matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputMessage(
          content = contentOwnershipSnapshot,
          id = id,
          role = role,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputItemReasoning internal constructor(
    public val id: String,
    summary: List<ReasoningSummaryText>,
    public val type: InlineOutputItemReasoningTypeX9f535a4f,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOutputItemAddedEventItemX42bdeb8d {
    public val summary: List<ReasoningSummaryText> = summary.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        summary: List<ReasoningSummaryText>,
        type: InlineOutputItemReasoningTypeX9f535a4f,
      ): OutputItemReasoning {
        val summaryOwnershipSnapshot = summary.toList()
        val raw = buildJsonObject {
          put("id", id)
          put("summary", SdkJson.encodeToJsonElement(summaryOwnershipSnapshot))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineOutputItemAddedEventItemX42bdeb8d(raw)
        if (inspection.size == 0) {
          throw InlineOutputItemAddedEventItemX42bdeb8dNoMatchException("InlineOutputItemAddedEventItemX42bdeb8d matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputItemReasoningMatches) {
          throw InlineOutputItemAddedEventItemX42bdeb8dBranchValidationException("OutputItemReasoning factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOutputItemAddedEventItemX42bdeb8dAmbiguityException("InlineOutputItemAddedEventItemX42bdeb8d matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputItemReasoning(
          id = id,
          summary = summaryOwnershipSnapshot,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputItemFunctionCall internal constructor(
    public val arguments: String,
    public val callId: String,
    public val name: String,
    public val type: InlineOutputItemFunctionCallTypeX494d8eba,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOutputItemAddedEventItemX42bdeb8d {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        arguments: String,
        callId: String,
        name: String,
        type: InlineOutputItemFunctionCallTypeX494d8eba,
      ): OutputItemFunctionCall {
        val raw = buildJsonObject {
          put("arguments", arguments)
          put("call_id", callId)
          put("name", name)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineOutputItemAddedEventItemX42bdeb8d(raw)
        if (inspection.size == 0) {
          throw InlineOutputItemAddedEventItemX42bdeb8dNoMatchException("InlineOutputItemAddedEventItemX42bdeb8d matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputItemFunctionCallMatches) {
          throw InlineOutputItemAddedEventItemX42bdeb8dBranchValidationException("OutputItemFunctionCall factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOutputItemAddedEventItemX42bdeb8dAmbiguityException("InlineOutputItemAddedEventItemX42bdeb8d matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputItemFunctionCall(
          arguments = arguments,
          callId = callId,
          name = name,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputItemCustomToolCall internal constructor(
    public val callId: String,
    public val input: String,
    public val name: String,
    public val type: InlineOutputItemCustomToolCallTypeX9265eb82,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOutputItemAddedEventItemX42bdeb8d {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        callId: String,
        input: String,
        name: String,
        type: InlineOutputItemCustomToolCallTypeX9265eb82,
      ): OutputItemCustomToolCall {
        val raw = buildJsonObject {
          put("call_id", callId)
          put("input", input)
          put("name", name)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineOutputItemAddedEventItemX42bdeb8d(raw)
        if (inspection.size == 0) {
          throw InlineOutputItemAddedEventItemX42bdeb8dNoMatchException("InlineOutputItemAddedEventItemX42bdeb8d matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputItemCustomToolCallMatches) {
          throw InlineOutputItemAddedEventItemX42bdeb8dBranchValidationException("OutputItemCustomToolCall factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOutputItemAddedEventItemX42bdeb8dAmbiguityException("InlineOutputItemAddedEventItemX42bdeb8d matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputItemCustomToolCall(
          callId = callId,
          input = input,
          name = name,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputItemWebSearchCall internal constructor(
    public val id: String,
    public val status: WebSearchStatus,
    public val type: InlineOutputItemWebSearchCallTypeX70b2c197,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOutputItemAddedEventItemX42bdeb8d {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        status: WebSearchStatus,
        type: InlineOutputItemWebSearchCallTypeX70b2c197,
      ): OutputItemWebSearchCall {
        val raw = buildJsonObject {
          put("id", id)
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineOutputItemAddedEventItemX42bdeb8d(raw)
        if (inspection.size == 0) {
          throw InlineOutputItemAddedEventItemX42bdeb8dNoMatchException("InlineOutputItemAddedEventItemX42bdeb8d matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputItemWebSearchCallMatches) {
          throw InlineOutputItemAddedEventItemX42bdeb8dBranchValidationException("OutputItemWebSearchCall factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOutputItemAddedEventItemX42bdeb8dAmbiguityException("InlineOutputItemAddedEventItemX42bdeb8d matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputItemWebSearchCall(
          id = id,
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputItemFileSearchCall internal constructor(
    public val id: String,
    queries: List<String>,
    public val status: WebSearchStatus,
    public val type: InlineOutputItemFileSearchCallTypeX69a7137a,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOutputItemAddedEventItemX42bdeb8d {
    public val queries: List<String> = queries.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        queries: List<String>,
        status: WebSearchStatus,
        type: InlineOutputItemFileSearchCallTypeX69a7137a,
      ): OutputItemFileSearchCall {
        val queriesOwnershipSnapshot = queries.toList()
        val raw = buildJsonObject {
          put("id", id)
          put("queries", SdkJson.encodeToJsonElement(queriesOwnershipSnapshot))
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineOutputItemAddedEventItemX42bdeb8d(raw)
        if (inspection.size == 0) {
          throw InlineOutputItemAddedEventItemX42bdeb8dNoMatchException("InlineOutputItemAddedEventItemX42bdeb8d matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputItemFileSearchCallMatches) {
          throw InlineOutputItemAddedEventItemX42bdeb8dBranchValidationException("OutputItemFileSearchCall factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOutputItemAddedEventItemX42bdeb8dAmbiguityException("InlineOutputItemAddedEventItemX42bdeb8d matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputItemFileSearchCall(
          id = id,
          queries = queriesOwnershipSnapshot,
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputItemImageGenerationCall internal constructor(
    public val id: String,
    public val status: ImageGenerationStatus,
    public val type: InlineOutputItemImageGenerationCallTypeX8aee14b8,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOutputItemAddedEventItemX42bdeb8d {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        status: ImageGenerationStatus,
        type: InlineOutputItemImageGenerationCallTypeX8aee14b8,
      ): OutputItemImageGenerationCall {
        val raw = buildJsonObject {
          put("id", id)
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineOutputItemAddedEventItemX42bdeb8d(raw)
        if (inspection.size == 0) {
          throw InlineOutputItemAddedEventItemX42bdeb8dNoMatchException("InlineOutputItemAddedEventItemX42bdeb8d matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputItemImageGenerationCallMatches) {
          throw InlineOutputItemAddedEventItemX42bdeb8dBranchValidationException("OutputItemImageGenerationCall factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOutputItemAddedEventItemX42bdeb8dAmbiguityException("InlineOutputItemAddedEventItemX42bdeb8d matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputItemImageGenerationCall(
          id = id,
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputItemApplyPatchCall internal constructor(
    public val callId: String,
    public val id: String,
    public val operation: InlineOutputItemApplyPatchCallOperationX930906f6,
    public val status: InlineOutputItemApplyPatchCallStatusX79afd49e,
    public val type: InlineOutputItemApplyPatchCallTypeX29e31f9b,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOutputItemAddedEventItemX42bdeb8d {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        callId: String,
        id: String,
        operation: InlineOutputItemApplyPatchCallOperationX930906f6,
        status: InlineOutputItemApplyPatchCallStatusX79afd49e,
        type: InlineOutputItemApplyPatchCallTypeX29e31f9b,
      ): OutputItemApplyPatchCall {
        val raw = buildJsonObject {
          put("call_id", callId)
          put("id", id)
          put("operation", SdkJson.encodeToJsonElement(operation))
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineOutputItemAddedEventItemX42bdeb8d(raw)
        if (inspection.size == 0) {
          throw InlineOutputItemAddedEventItemX42bdeb8dNoMatchException("InlineOutputItemAddedEventItemX42bdeb8d matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputItemApplyPatchCallMatches) {
          throw InlineOutputItemAddedEventItemX42bdeb8dBranchValidationException("OutputItemApplyPatchCall factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOutputItemAddedEventItemX42bdeb8dAmbiguityException("InlineOutputItemAddedEventItemX42bdeb8d matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputItemApplyPatchCall(
          callId = callId,
          id = id,
          operation = operation,
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }
}

internal object InlineOutputItemAddedEventItemX42bdeb8dSerializer : KSerializer<InlineOutputItemAddedEventItemX42bdeb8d> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): InlineOutputItemAddedEventItemX42bdeb8d {
    val jsonDecoder = decoder.requireJsonDecoder("InlineOutputItemAddedEventItemX42bdeb8d")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineOutputItemAddedEventItemX42bdeb8dNoMatchException("InlineOutputItemAddedEventItemX42bdeb8d matched 0 branches: expected JSON object")
    val matches = inspectInlineOutputItemAddedEventItemX42bdeb8d(rawObject)
    if (matches.size == 0) {
      throw InlineOutputItemAddedEventItemX42bdeb8dNoMatchException("InlineOutputItemAddedEventItemX42bdeb8d matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw InlineOutputItemAddedEventItemX42bdeb8dAmbiguityException("InlineOutputItemAddedEventItemX42bdeb8d matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.outputMessageMatches -> InlineOutputItemAddedEventItemX42bdeb8d.OutputMessage(content = requireNotNull(matches.content), id = requireNotNull(matches.id), role = requireNotNull(matches.role), type = requireNotNull(matches.typeState15), raw = rawObject)
      matches.outputItemReasoningMatches -> InlineOutputItemAddedEventItemX42bdeb8d.OutputItemReasoning(id = requireNotNull(matches.id), summary = requireNotNull(matches.summary), type = requireNotNull(matches.typeState11), raw = rawObject)
      matches.outputItemFunctionCallMatches -> InlineOutputItemAddedEventItemX42bdeb8d.OutputItemFunctionCall(arguments = requireNotNull(matches.arguments), callId = requireNotNull(matches.callId), name = requireNotNull(matches.name), type = requireNotNull(matches.typeState7), raw = rawObject)
      matches.outputItemCustomToolCallMatches -> InlineOutputItemAddedEventItemX42bdeb8d.OutputItemCustomToolCall(callId = requireNotNull(matches.callId), input = requireNotNull(matches.input), name = requireNotNull(matches.name), type = requireNotNull(matches.typeState3), raw = rawObject)
      matches.outputItemWebSearchCallMatches -> InlineOutputItemAddedEventItemX42bdeb8d.OutputItemWebSearchCall(id = requireNotNull(matches.id), status = requireNotNull(matches.statusState3), type = requireNotNull(matches.typeState13), raw = rawObject)
      matches.outputItemFileSearchCallMatches -> InlineOutputItemAddedEventItemX42bdeb8d.OutputItemFileSearchCall(id = requireNotNull(matches.id), queries = requireNotNull(matches.queries), status = requireNotNull(matches.statusState3), type = requireNotNull(matches.typeState5), raw = rawObject)
      matches.outputItemImageGenerationCallMatches -> InlineOutputItemAddedEventItemX42bdeb8d.OutputItemImageGenerationCall(id = requireNotNull(matches.id), status = requireNotNull(matches.statusState1), type = requireNotNull(matches.typeState9), raw = rawObject)
      matches.outputItemApplyPatchCallMatches -> InlineOutputItemAddedEventItemX42bdeb8d.OutputItemApplyPatchCall(callId = requireNotNull(matches.callId), id = requireNotNull(matches.id), operation = requireNotNull(matches.operation), status = requireNotNull(matches.statusState2), type = requireNotNull(matches.typeState1), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: InlineOutputItemAddedEventItemX42bdeb8d) {
    encoder.requireJsonEncoder("InlineOutputItemAddedEventItemX42bdeb8d").encodeJsonElement(value.raw)
  }
}

internal data class InlineOutputItemAddedEventItemX42bdeb8dInspection(
  public val typeState15: InlineOutputMessageTypeXba66a1d6?,
  public val typeState15Decoded: Boolean,
  public val typeState15Matches: Boolean,
  public val content: List<InlineOutputMessageContentItemX9f591485>?,
  public val contentDecoded: Boolean,
  public val id: String?,
  public val idDecoded: Boolean,
  public val role: InlineOutputMessageRoleXe91a3401?,
  public val roleDecoded: Boolean,
  public val roleMatches: Boolean,
  public val typeState16: InlineOutputMessageTypeXba66a1d6?,
  public val typeState16Decoded: Boolean,
  public val typeState16Matches: Boolean,
  public val typeState11: InlineOutputItemReasoningTypeX9f535a4f?,
  public val typeState11Decoded: Boolean,
  public val typeState11Matches: Boolean,
  public val summary: List<ReasoningSummaryText>?,
  public val summaryDecoded: Boolean,
  public val typeState12: InlineOutputItemReasoningTypeX9f535a4f?,
  public val typeState12Decoded: Boolean,
  public val typeState12Matches: Boolean,
  public val typeState7: InlineOutputItemFunctionCallTypeX494d8eba?,
  public val typeState7Decoded: Boolean,
  public val typeState7Matches: Boolean,
  public val arguments: String?,
  public val argumentsDecoded: Boolean,
  public val callId: String?,
  public val callIdDecoded: Boolean,
  public val name: String?,
  public val nameDecoded: Boolean,
  public val typeState8: InlineOutputItemFunctionCallTypeX494d8eba?,
  public val typeState8Decoded: Boolean,
  public val typeState8Matches: Boolean,
  public val typeState3: InlineOutputItemCustomToolCallTypeX9265eb82?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val input: String?,
  public val inputDecoded: Boolean,
  public val typeState4: InlineOutputItemCustomToolCallTypeX9265eb82?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val typeState13: InlineOutputItemWebSearchCallTypeX70b2c197?,
  public val typeState13Decoded: Boolean,
  public val typeState13Matches: Boolean,
  public val statusState3: WebSearchStatus?,
  public val statusState3Decoded: Boolean,
  public val statusState3Matches: Boolean,
  public val typeState14: InlineOutputItemWebSearchCallTypeX70b2c197?,
  public val typeState14Decoded: Boolean,
  public val typeState14Matches: Boolean,
  public val typeState5: InlineOutputItemFileSearchCallTypeX69a7137a?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val queries: List<String>?,
  public val queriesDecoded: Boolean,
  public val typeState6: InlineOutputItemFileSearchCallTypeX69a7137a?,
  public val typeState6Decoded: Boolean,
  public val typeState6Matches: Boolean,
  public val typeState9: InlineOutputItemImageGenerationCallTypeX8aee14b8?,
  public val typeState9Decoded: Boolean,
  public val typeState9Matches: Boolean,
  public val statusState1: ImageGenerationStatus?,
  public val statusState1Decoded: Boolean,
  public val statusState1Matches: Boolean,
  public val typeState10: InlineOutputItemImageGenerationCallTypeX8aee14b8?,
  public val typeState10Decoded: Boolean,
  public val typeState10Matches: Boolean,
  public val typeState1: InlineOutputItemApplyPatchCallTypeX29e31f9b?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val operation: InlineOutputItemApplyPatchCallOperationX930906f6?,
  public val operationDecoded: Boolean,
  public val statusState2: InlineOutputItemApplyPatchCallStatusX79afd49e?,
  public val statusState2Decoded: Boolean,
  public val statusState2Matches: Boolean,
  public val typeState2: InlineOutputItemApplyPatchCallTypeX29e31f9b?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val outputMessageMatches: Boolean,
  public val outputItemReasoningMatches: Boolean,
  public val outputItemFunctionCallMatches: Boolean,
  public val outputItemCustomToolCallMatches: Boolean,
  public val outputItemWebSearchCallMatches: Boolean,
  public val outputItemFileSearchCallMatches: Boolean,
  public val outputItemImageGenerationCallMatches: Boolean,
  public val outputItemApplyPatchCallMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (outputMessageMatches) add("OutputMessage")
      if (outputItemReasoningMatches) add("OutputItemReasoning")
      if (outputItemFunctionCallMatches) add("OutputItemFunctionCall")
      if (outputItemCustomToolCallMatches) add("OutputItemCustomToolCall")
      if (outputItemWebSearchCallMatches) add("OutputItemWebSearchCall")
      if (outputItemFileSearchCallMatches) add("OutputItemFileSearchCall")
      if (outputItemImageGenerationCallMatches) add("OutputItemImageGenerationCall")
      if (outputItemApplyPatchCallMatches) add("OutputItemApplyPatchCall")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineOutputItemAddedEventItemX42bdeb8d(rawObject: JsonObject): InlineOutputItemAddedEventItemX42bdeb8dInspection {
  val typeState15Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputMessageTypeXba66a1d6>(element) } }
  val typeState15 = typeState15Result?.getOrNull()
  val typeState15Decoded = typeState15Result?.isSuccess == true
  val typeState15Matches = (rawObject.stringValue("type") == "message") && typeState15Decoded
  val contentResult = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<InlineOutputMessageContentItemX9f591485>>(element) } }
  val content = contentResult?.getOrNull()
  val contentDecoded = contentResult?.isSuccess == true
  val idResult = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
  val roleResult = rawObject["role"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputMessageRoleXe91a3401>(element) } }
  val role = roleResult?.getOrNull()
  val roleDecoded = roleResult?.isSuccess == true
  val roleMatches = (rawObject.stringValue("role") == "assistant") && roleDecoded
  val typeState16Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputMessageTypeXba66a1d6>(element) } }
  val typeState16 = typeState16Result?.getOrNull()
  val typeState16Decoded = typeState16Result?.isSuccess == true
  val typeState16Matches = (rawObject.stringValue("type") == "message") && typeState16Decoded
  val typeState11Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemReasoningTypeX9f535a4f>(element) } }
  val typeState11 = typeState11Result?.getOrNull()
  val typeState11Decoded = typeState11Result?.isSuccess == true
  val typeState11Matches = (rawObject.stringValue("type") == "reasoning") && typeState11Decoded
  val summaryResult = rawObject["summary"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<ReasoningSummaryText>>(element) } }
  val summary = summaryResult?.getOrNull()
  val summaryDecoded = summaryResult?.isSuccess == true
  val typeState12Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemReasoningTypeX9f535a4f>(element) } }
  val typeState12 = typeState12Result?.getOrNull()
  val typeState12Decoded = typeState12Result?.isSuccess == true
  val typeState12Matches = (rawObject.stringValue("type") == "reasoning") && typeState12Decoded
  val typeState7Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemFunctionCallTypeX494d8eba>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = (rawObject.stringValue("type") == "function_call") && typeState7Decoded
  val argumentsResult = rawObject["arguments"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val arguments = argumentsResult?.getOrNull()
  val argumentsDecoded = argumentsResult?.isSuccess == true
  val callIdResult = rawObject["call_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val callId = callIdResult?.getOrNull()
  val callIdDecoded = callIdResult?.isSuccess == true
  val nameResult = rawObject["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val name = nameResult?.getOrNull()
  val nameDecoded = nameResult?.isSuccess == true
  val typeState8Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemFunctionCallTypeX494d8eba>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = (rawObject.stringValue("type") == "function_call") && typeState8Decoded
  val typeState3Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemCustomToolCallTypeX9265eb82>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = (rawObject.stringValue("type") == "custom_tool_call") && typeState3Decoded
  val inputResult = rawObject["input"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val input = inputResult?.getOrNull()
  val inputDecoded = inputResult?.isSuccess == true
  val typeState4Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemCustomToolCallTypeX9265eb82>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = (rawObject.stringValue("type") == "custom_tool_call") && typeState4Decoded
  val typeState13Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemWebSearchCallTypeX70b2c197>(element) } }
  val typeState13 = typeState13Result?.getOrNull()
  val typeState13Decoded = typeState13Result?.isSuccess == true
  val typeState13Matches = (rawObject.stringValue("type") == "web_search_call") && typeState13Decoded
  val statusState3Result = rawObject["status"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<WebSearchStatus>(element) } }
  val statusState3 = statusState3Result?.getOrNull()
  val statusState3Decoded = statusState3Result?.isSuccess == true
  val statusState3Matches = (rawObject.stringValue("status") == "completed" || rawObject.stringValue("status") == "failed" || rawObject.stringValue("status") == "in_progress" || rawObject.stringValue("status") == "searching") && statusState3Decoded
  val typeState14Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemWebSearchCallTypeX70b2c197>(element) } }
  val typeState14 = typeState14Result?.getOrNull()
  val typeState14Decoded = typeState14Result?.isSuccess == true
  val typeState14Matches = (rawObject.stringValue("type") == "web_search_call") && typeState14Decoded
  val typeState5Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemFileSearchCallTypeX69a7137a>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = (rawObject.stringValue("type") == "file_search_call") && typeState5Decoded
  val queriesResult = rawObject["queries"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<String>>(element) } }
  val queries = queriesResult?.getOrNull()
  val queriesDecoded = queriesResult?.isSuccess == true
  val typeState6Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemFileSearchCallTypeX69a7137a>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = (rawObject.stringValue("type") == "file_search_call") && typeState6Decoded
  val typeState9Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemImageGenerationCallTypeX8aee14b8>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState9Matches = (rawObject.stringValue("type") == "image_generation_call") && typeState9Decoded
  val statusState1Result = rawObject["status"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<ImageGenerationStatus>(element) } }
  val statusState1 = statusState1Result?.getOrNull()
  val statusState1Decoded = statusState1Result?.isSuccess == true
  val statusState1Matches = (rawObject.stringValue("status") == "completed" || rawObject.stringValue("status") == "failed" || rawObject.stringValue("status") == "generating" || rawObject.stringValue("status") == "in_progress") && statusState1Decoded
  val typeState10Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemImageGenerationCallTypeX8aee14b8>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState10Matches = (rawObject.stringValue("type") == "image_generation_call") && typeState10Decoded
  val typeState1Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemApplyPatchCallTypeX29e31f9b>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = (rawObject.stringValue("type") == "apply_patch_call") && typeState1Decoded
  val operationResult = rawObject["operation"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemApplyPatchCallOperationX930906f6>(element) } }
  val operation = operationResult?.getOrNull()
  val operationDecoded = operationResult?.isSuccess == true
  val statusState2Result = rawObject["status"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemApplyPatchCallStatusX79afd49e>(element) } }
  val statusState2 = statusState2Result?.getOrNull()
  val statusState2Decoded = statusState2Result?.isSuccess == true
  val statusState2Matches = (rawObject.stringValue("status") == "completed" || rawObject.stringValue("status") == "in_progress") && statusState2Decoded
  val typeState2Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemApplyPatchCallTypeX29e31f9b>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = (rawObject.stringValue("type") == "apply_patch_call") && typeState2Decoded
  val rawEmpty = rawObject.isEmpty()
  val outputMessageMatches = matchesInlineOutputItemAddedEventItemX42bdeb8dOutputMessageBranch(rawObject) && (typeState15Matches)
  val outputItemReasoningMatches = matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemReasoningBranch(rawObject) && (typeState11Matches)
  val outputItemFunctionCallMatches = matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemFunctionCallBranch(rawObject) && (typeState7Matches)
  val outputItemCustomToolCallMatches = matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemCustomToolCallBranch(rawObject) && (typeState3Matches)
  val outputItemWebSearchCallMatches = matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemWebSearchCallBranch(rawObject) && (typeState13Matches)
  val outputItemFileSearchCallMatches = matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemFileSearchCallBranch(rawObject) && (typeState5Matches)
  val outputItemImageGenerationCallMatches = matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemImageGenerationCallBranch(rawObject) && (typeState9Matches)
  val outputItemApplyPatchCallMatches = matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemApplyPatchCallBranch(rawObject) && (typeState1Matches)
  return InlineOutputItemAddedEventItemX42bdeb8dInspection(
    typeState15 = typeState15,
    typeState15Decoded = typeState15Decoded,
    typeState15Matches = typeState15Matches,
    content = content,
    contentDecoded = contentDecoded,
    id = id,
    idDecoded = idDecoded,
    role = role,
    roleDecoded = roleDecoded,
    roleMatches = roleMatches,
    typeState16 = typeState16,
    typeState16Decoded = typeState16Decoded,
    typeState16Matches = typeState16Matches,
    typeState11 = typeState11,
    typeState11Decoded = typeState11Decoded,
    typeState11Matches = typeState11Matches,
    summary = summary,
    summaryDecoded = summaryDecoded,
    typeState12 = typeState12,
    typeState12Decoded = typeState12Decoded,
    typeState12Matches = typeState12Matches,
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    typeState7Matches = typeState7Matches,
    arguments = arguments,
    argumentsDecoded = argumentsDecoded,
    callId = callId,
    callIdDecoded = callIdDecoded,
    name = name,
    nameDecoded = nameDecoded,
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    typeState8Matches = typeState8Matches,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    input = input,
    inputDecoded = inputDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    typeState13 = typeState13,
    typeState13Decoded = typeState13Decoded,
    typeState13Matches = typeState13Matches,
    statusState3 = statusState3,
    statusState3Decoded = statusState3Decoded,
    statusState3Matches = statusState3Matches,
    typeState14 = typeState14,
    typeState14Decoded = typeState14Decoded,
    typeState14Matches = typeState14Matches,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    queries = queries,
    queriesDecoded = queriesDecoded,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    typeState6Matches = typeState6Matches,
    typeState9 = typeState9,
    typeState9Decoded = typeState9Decoded,
    typeState9Matches = typeState9Matches,
    statusState1 = statusState1,
    statusState1Decoded = statusState1Decoded,
    statusState1Matches = statusState1Matches,
    typeState10 = typeState10,
    typeState10Decoded = typeState10Decoded,
    typeState10Matches = typeState10Matches,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    operation = operation,
    operationDecoded = operationDecoded,
    statusState2 = statusState2,
    statusState2Decoded = statusState2Decoded,
    statusState2Matches = statusState2Matches,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    outputMessageMatches = outputMessageMatches,
    outputItemReasoningMatches = outputItemReasoningMatches,
    outputItemFunctionCallMatches = outputItemFunctionCallMatches,
    outputItemCustomToolCallMatches = outputItemCustomToolCallMatches,
    outputItemWebSearchCallMatches = outputItemWebSearchCallMatches,
    outputItemFileSearchCallMatches = outputItemFileSearchCallMatches,
    outputItemImageGenerationCallMatches = outputItemImageGenerationCallMatches,
    outputItemApplyPatchCallMatches = outputItemApplyPatchCallMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!outputMessageMatches) add("OutputMessage: branch predicate did not match properties 'type'")
      if (!outputItemReasoningMatches) add("OutputItemReasoning: branch predicate did not match properties 'type'")
      if (!outputItemFunctionCallMatches) add("OutputItemFunctionCall: branch predicate did not match properties 'type'")
      if (!outputItemCustomToolCallMatches) add("OutputItemCustomToolCall: branch predicate did not match properties 'type'")
      if (!outputItemWebSearchCallMatches) add("OutputItemWebSearchCall: branch predicate did not match properties 'type'")
      if (!outputItemFileSearchCallMatches) add("OutputItemFileSearchCall: branch predicate did not match properties 'type'")
      if (!outputItemImageGenerationCallMatches) add("OutputItemImageGenerationCall: branch predicate did not match properties 'type'")
      if (!outputItemApplyPatchCallMatches) add("OutputItemApplyPatchCall: branch predicate did not match properties 'type'")
    },
  )
}

private fun matchesInlineOutputItemAddedEventItemX42bdeb8dOutputMessageBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemReasoningBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemFunctionCallBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemCustomToolCallBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("call_id") && (rawObject as JsonObject).containsKey("input") && (rawObject as JsonObject).containsKey("name") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["call_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["input"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["namespace"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"custom_tool_call\"")))) } ?: true))))

private fun matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemWebSearchCallBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemFileSearchCallBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("id") && (rawObject as JsonObject).containsKey("queries") && (rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["queries"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"searching\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"failed\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"file_search_call\"")))) } ?: true))))

private fun matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemImageGenerationCallBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("id") && (rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["result"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"generating\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"failed\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"image_generation_call\"")))) } ?: true))))

private fun matchesInlineOutputItemAddedEventItemX42bdeb8dOutputItemApplyPatchCallBranch(rawObject: JsonObject): Boolean = true

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
