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

public sealed class InlineComponentsSchemasOutputItemAddedEventPropertiesItemDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasOutputItemAddedEventPropertiesItemNoMatchException(
  message: String,
) : InlineComponentsSchemasOutputItemAddedEventPropertiesItemDecodingException(message)

public class InlineComponentsSchemasOutputItemAddedEventPropertiesItemAmbiguityException(
  message: String,
) : InlineComponentsSchemasOutputItemAddedEventPropertiesItemDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/OutputItemAddedEvent/properties/item.
 */
@Serializable(with = InlineComponentsSchemasOutputItemAddedEventPropertiesItem.Serializer::class)
public sealed interface InlineComponentsSchemasOutputItemAddedEventPropertiesItem {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class OutputMessage internal constructor(
    public val content: List<InlineComponentsSchemasOutputMessagePropertiesContentItems>,
    public val id: String,
    public val role: InlineComponentsSchemasOutputMessagePropertiesRole,
    public val type: InlineComponentsSchemasOutputMessagePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOutputItemAddedEventPropertiesItem {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: List<InlineComponentsSchemasOutputMessagePropertiesContentItems>,
        id: String,
        role: InlineComponentsSchemasOutputMessagePropertiesRole,
        type: InlineComponentsSchemasOutputMessagePropertiesType,
      ): OutputMessage = OutputMessage(
        content = content,
        id = id,
        role = role,
        type = type,
        raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("id", id)
          put("role", SdkJson.encodeToJsonElement(role))
          put("type", "message")
        },
      )
    }
  }

  public class OutputItemReasoning internal constructor(
    public val id: String,
    public val summary: List<ReasoningSummaryText>,
    public val type: InlineComponentsSchemasOutputItemReasoningPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOutputItemAddedEventPropertiesItem {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        summary: List<ReasoningSummaryText>,
        type: InlineComponentsSchemasOutputItemReasoningPropertiesType,
      ): OutputItemReasoning = OutputItemReasoning(
        id = id,
        summary = summary,
        type = type,
        raw = buildJsonObject {
          put("id", id)
          put("summary", SdkJson.encodeToJsonElement(summary))
          put("type", "reasoning")
        },
      )
    }
  }

  public class OutputItemFunctionCall internal constructor(
    public val arguments: String,
    public val callId: String,
    public val name: String,
    public val type: InlineComponentsSchemasOutputItemFunctionCallPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOutputItemAddedEventPropertiesItem {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        arguments: String,
        callId: String,
        name: String,
        type: InlineComponentsSchemasOutputItemFunctionCallPropertiesType,
      ): OutputItemFunctionCall = OutputItemFunctionCall(
        arguments = arguments,
        callId = callId,
        name = name,
        type = type,
        raw = buildJsonObject {
          put("arguments", arguments)
          put("call_id", callId)
          put("name", name)
          put("type", "function_call")
        },
      )
    }
  }

  public class OutputItemCustomToolCall internal constructor(
    public val callId: String,
    public val input: String,
    public val name: String,
    public val type: InlineComponentsSchemasOutputItemCustomToolCallPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOutputItemAddedEventPropertiesItem {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        callId: String,
        input: String,
        name: String,
        type: InlineComponentsSchemasOutputItemCustomToolCallPropertiesType,
      ): OutputItemCustomToolCall = OutputItemCustomToolCall(
        callId = callId,
        input = input,
        name = name,
        type = type,
        raw = buildJsonObject {
          put("call_id", callId)
          put("input", input)
          put("name", name)
          put("type", "custom_tool_call")
        },
      )
    }
  }

  public class OutputItemWebSearchCall internal constructor(
    public val id: String,
    public val status: WebSearchStatus,
    public val type: InlineComponentsSchemasOutputItemWebSearchCallPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOutputItemAddedEventPropertiesItem {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        status: WebSearchStatus,
        type: InlineComponentsSchemasOutputItemWebSearchCallPropertiesType,
      ): OutputItemWebSearchCall = OutputItemWebSearchCall(
        id = id,
        status = status,
        type = type,
        raw = buildJsonObject {
          put("id", id)
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", "web_search_call")
        },
      )
    }
  }

  public class OutputItemFileSearchCall internal constructor(
    public val id: String,
    public val queries: List<String>,
    public val status: WebSearchStatus,
    public val type: InlineComponentsSchemasOutputItemFileSearchCallPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOutputItemAddedEventPropertiesItem {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        queries: List<String>,
        status: WebSearchStatus,
        type: InlineComponentsSchemasOutputItemFileSearchCallPropertiesType,
      ): OutputItemFileSearchCall = OutputItemFileSearchCall(
        id = id,
        queries = queries,
        status = status,
        type = type,
        raw = buildJsonObject {
          put("id", id)
          put("queries", SdkJson.encodeToJsonElement(queries))
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", "file_search_call")
        },
      )
    }
  }

  public class OutputItemImageGenerationCall internal constructor(
    public val id: String,
    public val status: ImageGenerationStatus,
    public val type: InlineComponentsSchemasOutputItemImageGenerationCallPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOutputItemAddedEventPropertiesItem {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        status: ImageGenerationStatus,
        type: InlineComponentsSchemasOutputItemImageGenerationCallPropertiesType,
      ): OutputItemImageGenerationCall = OutputItemImageGenerationCall(
        id = id,
        status = status,
        type = type,
        raw = buildJsonObject {
          put("id", id)
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", "image_generation_call")
        },
      )
    }
  }

  public class OutputItemApplyPatchCall internal constructor(
    public val callId: String,
    public val id: String,
    public val operation: InlineComponentsSchemasOutputItemApplyPatchCallPropertiesOperation,
    public val status: InlineComponentsSchemasOutputItemApplyPatchCallPropertiesStatus,
    public val type: InlineComponentsSchemasOutputItemApplyPatchCallPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOutputItemAddedEventPropertiesItem {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        callId: String,
        id: String,
        operation: InlineComponentsSchemasOutputItemApplyPatchCallPropertiesOperation,
        status: InlineComponentsSchemasOutputItemApplyPatchCallPropertiesStatus,
        type: InlineComponentsSchemasOutputItemApplyPatchCallPropertiesType,
      ): OutputItemApplyPatchCall = OutputItemApplyPatchCall(
        callId = callId,
        id = id,
        operation = operation,
        status = status,
        type = type,
        raw = buildJsonObject {
          put("call_id", callId)
          put("id", id)
          put("operation", SdkJson.encodeToJsonElement(operation))
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", "apply_patch_call")
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemAddedEventPropertiesItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemAddedEventPropertiesItem {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasOutputItemAddedEventPropertiesItem")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasOutputItemAddedEventPropertiesItemNoMatchException("InlineComponentsSchemasOutputItemAddedEventPropertiesItem " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasOutputItemAddedEventPropertiesItem(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasOutputItemAddedEventPropertiesItemNoMatchException("InlineComponentsSchemasOutputItemAddedEventPropertiesItem " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasOutputItemAddedEventPropertiesItemAmbiguityException("InlineComponentsSchemasOutputItemAddedEventPropertiesItem " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState8Matches && matches.contentDecoded && matches.idDecoded && matches.roleDecoded ->
          OutputMessage(content = requireNotNull(matches.content), id = requireNotNull(matches.id), role =
            requireNotNull(matches.role), type = requireNotNull(matches.typeState8), raw = raw)
        matches.typeState6Matches && matches.idDecoded && matches.summaryDecoded -> OutputItemReasoning(id =
          requireNotNull(matches.id), summary = requireNotNull(matches.summary), type = requireNotNull(matches
            .typeState6), raw = raw)
        matches.typeState4Matches && matches.argumentsDecoded && matches.callIdDecoded && matches.nameDecoded ->
          OutputItemFunctionCall(arguments = requireNotNull(matches.arguments), callId = requireNotNull(matches
            .callId), name = requireNotNull(matches.name), type = requireNotNull(matches.typeState4), raw = raw)
        matches.typeState2Matches && matches.callIdDecoded && matches.inputDecoded && matches.nameDecoded ->
          OutputItemCustomToolCall(callId = requireNotNull(matches.callId), input = requireNotNull(matches.input),
            name = requireNotNull(matches.name), type = requireNotNull(matches.typeState2), raw = raw)
        matches.typeState7Matches && matches.idDecoded && matches.statusState3Decoded -> OutputItemWebSearchCall(id =
          requireNotNull(matches.id), status = requireNotNull(matches.statusState3), type = requireNotNull(matches
            .typeState7), raw = raw)
        matches.typeState3Matches && matches.idDecoded && matches.queriesDecoded && matches.statusState3Decoded ->
          OutputItemFileSearchCall(id = requireNotNull(matches.id), queries = requireNotNull(matches.queries), status =
            requireNotNull(matches.statusState3), type = requireNotNull(matches.typeState3), raw = raw)
        matches.typeState5Matches && matches.idDecoded && matches.statusState1Decoded ->
          OutputItemImageGenerationCall(id = requireNotNull(matches.id), status = requireNotNull(matches.statusState1),
            type = requireNotNull(matches.typeState5), raw = raw)
        matches.typeState1Matches && matches.callIdDecoded && matches.idDecoded && matches.operationDecoded && matches
          .statusState2Decoded -> OutputItemApplyPatchCall(callId = requireNotNull(matches.callId), id =
            requireNotNull(matches.id), operation = requireNotNull(matches.operation), status = requireNotNull(matches
              .statusState2), type = requireNotNull(matches.typeState1), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputItemAddedEventPropertiesItem) {
      encoder.requireJsonEncoder("InlineComponentsSchemasOutputItemAddedEventPropertiesItem").encodeJsonElement(value
        .raw)
    }
  }
}

private data class InlineComponentsSchemasOutputItemAddedEventPropertiesItemInspection(
  public val typeState8: InlineComponentsSchemasOutputMessagePropertiesType?,
  public val typeState8Decoded: Boolean,
  public val typeState8Matches: Boolean,
  public val content: List<InlineComponentsSchemasOutputMessagePropertiesContentItems>?,
  public val contentDecoded: Boolean,
  public val id: String?,
  public val idDecoded: Boolean,
  public val role: InlineComponentsSchemasOutputMessagePropertiesRole?,
  public val roleDecoded: Boolean,
  public val typeState6: InlineComponentsSchemasOutputItemReasoningPropertiesType?,
  public val typeState6Decoded: Boolean,
  public val typeState6Matches: Boolean,
  public val summary: List<ReasoningSummaryText>?,
  public val summaryDecoded: Boolean,
  public val typeState4: InlineComponentsSchemasOutputItemFunctionCallPropertiesType?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val arguments: String?,
  public val argumentsDecoded: Boolean,
  public val callId: String?,
  public val callIdDecoded: Boolean,
  public val name: String?,
  public val nameDecoded: Boolean,
  public val typeState2: InlineComponentsSchemasOutputItemCustomToolCallPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val input: String?,
  public val inputDecoded: Boolean,
  public val typeState7: InlineComponentsSchemasOutputItemWebSearchCallPropertiesType?,
  public val typeState7Decoded: Boolean,
  public val typeState7Matches: Boolean,
  public val statusState3: WebSearchStatus?,
  public val statusState3Decoded: Boolean,
  public val typeState3: InlineComponentsSchemasOutputItemFileSearchCallPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val queries: List<String>?,
  public val queriesDecoded: Boolean,
  public val typeState5: InlineComponentsSchemasOutputItemImageGenerationCallPropertiesType?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val statusState1: ImageGenerationStatus?,
  public val statusState1Decoded: Boolean,
  public val typeState1: InlineComponentsSchemasOutputItemApplyPatchCallPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val operation: InlineComponentsSchemasOutputItemApplyPatchCallPropertiesOperation?,
  public val operationDecoded: Boolean,
  public val statusState2: InlineComponentsSchemasOutputItemApplyPatchCallPropertiesStatus?,
  public val statusState2Decoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState8Matches && contentDecoded && idDecoded && roleDecoded) add("OutputMessage")
      if (typeState6Matches && idDecoded && summaryDecoded) add("OutputItemReasoning")
      if (typeState4Matches && argumentsDecoded && callIdDecoded && nameDecoded) add("OutputItemFunctionCall")
      if (typeState2Matches && callIdDecoded && inputDecoded && nameDecoded) add("OutputItemCustomToolCall")
      if (typeState7Matches && idDecoded && statusState3Decoded) add("OutputItemWebSearchCall")
      if (typeState3Matches && idDecoded && queriesDecoded && statusState3Decoded) add("OutputItemFileSearchCall")
      if (typeState5Matches && idDecoded && statusState1Decoded) add("OutputItemImageGenerationCall")
      if (typeState1Matches && callIdDecoded && idDecoded && operationDecoded &&
        statusState2Decoded) add("OutputItemApplyPatchCall")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasOutputItemAddedEventPropertiesItem(raw: JsonObject): InlineComponentsSchemasOutputItemAddedEventPropertiesItemInspection {
  val typeState8Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputMessagePropertiesType>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = raw.stringValue("type") == "message" && typeState8Decoded
  val contentResult = raw["content"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<List<InlineComponentsSchemasOutputMessagePropertiesContentItems>>(element) } }
  val content = contentResult?.getOrNull()
  val contentDecoded = contentResult?.isSuccess == true
  val idResult = raw["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
  val roleResult = raw["role"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputMessagePropertiesRole>(element) } }
  val role = roleResult?.getOrNull()
  val roleDecoded = roleResult?.isSuccess == true
  val typeState6Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputItemReasoningPropertiesType>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = raw.stringValue("type") == "reasoning" && typeState6Decoded
  val summaryResult = raw["summary"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<List<ReasoningSummaryText>>(element) } }
  val summary = summaryResult?.getOrNull()
  val summaryDecoded = summaryResult?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputItemFunctionCallPropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = raw.stringValue("type") == "function_call" && typeState4Decoded
  val argumentsResult = raw["arguments"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val arguments = argumentsResult?.getOrNull()
  val argumentsDecoded = argumentsResult?.isSuccess == true
  val callIdResult = raw["call_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val callId = callIdResult?.getOrNull()
  val callIdDecoded = callIdResult?.isSuccess == true
  val nameResult = raw["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val name = nameResult?.getOrNull()
  val nameDecoded = nameResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputItemCustomToolCallPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "custom_tool_call" && typeState2Decoded
  val inputResult = raw["input"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val input = inputResult?.getOrNull()
  val inputDecoded = inputResult?.isSuccess == true
  val typeState7Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputItemWebSearchCallPropertiesType>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = raw.stringValue("type") == "web_search_call" && typeState7Decoded
  val statusState3Result = raw["status"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<WebSearchStatus>(element) } }
  val statusState3 = statusState3Result?.getOrNull()
  val statusState3Decoded = statusState3Result?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputItemFileSearchCallPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "file_search_call" && typeState3Decoded
  val queriesResult = raw["queries"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<List<String>>(element) } }
  val queries = queriesResult?.getOrNull()
  val queriesDecoded = queriesResult?.isSuccess == true
  val typeState5Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputItemImageGenerationCallPropertiesType>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = raw.stringValue("type") == "image_generation_call" && typeState5Decoded
  val statusState1Result = raw["status"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<ImageGenerationStatus>(element) } }
  val statusState1 = statusState1Result?.getOrNull()
  val statusState1Decoded = statusState1Result?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputItemApplyPatchCallPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "apply_patch_call" && typeState1Decoded
  val operationResult = raw["operation"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputItemApplyPatchCallPropertiesOperation>(element) } }
  val operation = operationResult?.getOrNull()
  val operationDecoded = operationResult?.isSuccess == true
  val statusState2Result = raw["status"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputItemApplyPatchCallPropertiesStatus>(element) } }
  val statusState2 = statusState2Result?.getOrNull()
  val statusState2Decoded = statusState2Result?.isSuccess == true
  return InlineComponentsSchemasOutputItemAddedEventPropertiesItemInspection(
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    typeState8Matches = typeState8Matches,
    content = content,
    contentDecoded = contentDecoded,
    id = id,
    idDecoded = idDecoded,
    role = role,
    roleDecoded = roleDecoded,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    typeState6Matches = typeState6Matches,
    summary = summary,
    summaryDecoded = summaryDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    arguments = arguments,
    argumentsDecoded = argumentsDecoded,
    callId = callId,
    callIdDecoded = callIdDecoded,
    name = name,
    nameDecoded = nameDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    input = input,
    inputDecoded = inputDecoded,
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    typeState7Matches = typeState7Matches,
    statusState3 = statusState3,
    statusState3Decoded = statusState3Decoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    queries = queries,
    queriesDecoded = queriesDecoded,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    statusState1 = statusState1,
    statusState1Decoded = statusState1Decoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    operation = operation,
    operationDecoded = operationDecoded,
    statusState2 = statusState2,
    statusState2Decoded = statusState2Decoded,
    failures = buildList {
      if (!typeState8Matches || !contentDecoded || !idDecoded ||
        !roleDecoded) add("OutputMessage: required properties 'type' and 'content' and 'id' and 'role' do not match " +
          "their declared types")
      if (!typeState6Matches || !idDecoded ||
        !summaryDecoded) add("OutputItemReasoning: required properties 'type' and 'id' and 'summary' do not match " +
          "their declared types")
      if (!typeState4Matches || !argumentsDecoded || !callIdDecoded ||
        !nameDecoded) add("OutputItemFunctionCall: required properties 'type' and 'arguments' and 'call_id' and " +
          "'name' do not match their declared types")
      if (!typeState2Matches || !callIdDecoded || !inputDecoded ||
        !nameDecoded) add("OutputItemCustomToolCall: required properties 'type' and 'call_id' and 'input' and 'name' " +
          "do not match their declared types")
      if (!typeState7Matches || !idDecoded ||
        !statusState3Decoded) add("OutputItemWebSearchCall: required properties 'type' and 'id' and 'status' do not " +
          "match their declared types")
      if (!typeState3Matches || !idDecoded || !queriesDecoded ||
        !statusState3Decoded) add("OutputItemFileSearchCall: required properties 'type' and 'id' and 'queries' and " +
          "'status' do not match their declared types")
      if (!typeState5Matches || !idDecoded ||
        !statusState1Decoded) add("OutputItemImageGenerationCall: required properties 'type' and 'id' and 'status' do " +
          "not match their declared types")
      if (!typeState1Matches || !callIdDecoded || !idDecoded || !operationDecoded ||
        !statusState2Decoded) add("OutputItemApplyPatchCall: required properties 'type' and 'call_id' and 'id' and " +
          "'operation' and 'status' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
