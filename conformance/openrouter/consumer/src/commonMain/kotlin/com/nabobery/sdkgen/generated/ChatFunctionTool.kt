package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

@Serializable
public data class InlineComponentsSchemasChatFunctionToolAnyOf0View(
  @SerialName("cache_control")
  public val cacheControl: ChatContentCacheControl? = null,
  public val function: InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction,
  public val type: InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType,
)

public enum class ChatFunctionToolBranch {
  InlineComponentsSchemasChatFunctionToolAnyOf0,
  AdvisorServerToolOpenRouter,
  BashServerTool,
  DatetimeServerTool,
  FilesServerTool,
  FusionServerToolOpenRouter,
  ImageGenerationServerToolOpenRouter,
  ChatSearchModelsServerTool,
  SubagentServerToolOpenRouter,
  WebFetchServerTool,
  OpenRouterWebSearchServerTool,
  ChatWebSearchShorthand,
}

public sealed class ChatFunctionToolDecodingException(
  message: String,
) : SerializationException(message)

public class ChatFunctionToolNoMatchException(
  message: String,
) : ChatFunctionToolDecodingException(message)

internal data class ChatFunctionToolInspection(
  public val matchesInlineComponentsSchemasChatFunctionToolAnyOf0: Boolean,
  public val matchesAdvisorServerToolOpenRouter: Boolean,
  public val matchesBashServerTool: Boolean,
  public val matchesDatetimeServerTool: Boolean,
  public val matchesFilesServerTool: Boolean,
  public val matchesFusionServerToolOpenRouter: Boolean,
  public val matchesImageGenerationServerToolOpenRouter: Boolean,
  public val matchesChatSearchModelsServerTool: Boolean,
  public val matchesSubagentServerToolOpenRouter: Boolean,
  public val matchesWebFetchServerTool: Boolean,
  public val matchesOpenRouterWebSearchServerTool: Boolean,
  public val matchesChatWebSearchShorthand: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasChatFunctionToolAnyOf0, matchesAdvisorServerToolOpenRouter,
      matchesBashServerTool, matchesDatetimeServerTool, matchesFilesServerTool, matchesFusionServerToolOpenRouter,
        matchesImageGenerationServerToolOpenRouter, matchesChatSearchModelsServerTool,
          matchesSubagentServerToolOpenRouter, matchesWebFetchServerTool, matchesOpenRouterWebSearchServerTool,
            matchesChatWebSearchShorthand).count { it }
}

/**
 * Tool definition for function calling (regular function or OpenRouter built-in server tool)
 */
@Serializable(with = ChatFunctionTool.Serializer::class)
public class ChatFunctionTool internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: ChatFunctionToolInspection,
) {
  public val inlineComponentsSchemasChatFunctionToolAnyOf0:
      InlineComponentsSchemasChatFunctionToolAnyOf0View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineComponentsSchemasChatFunctionToolAnyOf0) json
        .decodeFromJsonElement<InlineComponentsSchemasChatFunctionToolAnyOf0View>(raw) else null }

  public val advisorServerToolOpenRouter: AdvisorServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAdvisorServerToolOpenRouter) json
        .decodeFromJsonElement<AdvisorServerToolOpenRouterView>(raw) else null }

  public val bashServerTool: BashServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBashServerTool) json
        .decodeFromJsonElement<BashServerToolView>(raw) else null }

  public val datetimeServerTool: DatetimeServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDatetimeServerTool) json
        .decodeFromJsonElement<DatetimeServerToolView>(raw) else null }

  public val filesServerTool: FilesServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFilesServerTool) json
        .decodeFromJsonElement<FilesServerToolView>(raw) else null }

  public val fusionServerToolOpenRouter: FusionServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFusionServerToolOpenRouter) json
        .decodeFromJsonElement<FusionServerToolOpenRouterView>(raw) else null }

  public val imageGenerationServerToolOpenRouter: ImageGenerationServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesImageGenerationServerToolOpenRouter) json
        .decodeFromJsonElement<ImageGenerationServerToolOpenRouterView>(raw) else null }

  public val chatSearchModelsServerTool: ChatSearchModelsServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesChatSearchModelsServerTool) json
        .decodeFromJsonElement<ChatSearchModelsServerToolView>(raw) else null }

  public val subagentServerToolOpenRouter: SubagentServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubagentServerToolOpenRouter) json
        .decodeFromJsonElement<SubagentServerToolOpenRouterView>(raw) else null }

  public val webFetchServerTool: WebFetchServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesWebFetchServerTool) json
        .decodeFromJsonElement<WebFetchServerToolView>(raw) else null }

  public val openRouterWebSearchServerTool: OpenRouterWebSearchServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenRouterWebSearchServerTool) json
        .decodeFromJsonElement<OpenRouterWebSearchServerToolView>(raw) else null }

  public val chatWebSearchShorthand: ChatWebSearchShorthandView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesChatWebSearchShorthand) json
        .decodeFromJsonElement<ChatWebSearchShorthandView>(raw) else null }

  public val matchedBranches: Set<ChatFunctionToolBranch>
    get() = buildSet {
      if (inspection.matchesInlineComponentsSchemasChatFunctionToolAnyOf0) add(ChatFunctionToolBranch
        .InlineComponentsSchemasChatFunctionToolAnyOf0)
      if (inspection.matchesAdvisorServerToolOpenRouter) add(ChatFunctionToolBranch.AdvisorServerToolOpenRouter)
      if (inspection.matchesBashServerTool) add(ChatFunctionToolBranch.BashServerTool)
      if (inspection.matchesDatetimeServerTool) add(ChatFunctionToolBranch.DatetimeServerTool)
      if (inspection.matchesFilesServerTool) add(ChatFunctionToolBranch.FilesServerTool)
      if (inspection.matchesFusionServerToolOpenRouter) add(ChatFunctionToolBranch.FusionServerToolOpenRouter)
      if (inspection.matchesImageGenerationServerToolOpenRouter) add(ChatFunctionToolBranch
        .ImageGenerationServerToolOpenRouter)
      if (inspection.matchesChatSearchModelsServerTool) add(ChatFunctionToolBranch.ChatSearchModelsServerTool)
      if (inspection.matchesSubagentServerToolOpenRouter) add(ChatFunctionToolBranch.SubagentServerToolOpenRouter)
      if (inspection.matchesWebFetchServerTool) add(ChatFunctionToolBranch.WebFetchServerTool)
      if (inspection.matchesOpenRouterWebSearchServerTool) add(ChatFunctionToolBranch.OpenRouterWebSearchServerTool)
      if (inspection.matchesChatWebSearchShorthand) add(ChatFunctionToolBranch.ChatWebSearchShorthand)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): ChatFunctionTool {
      val inspection = inspectChatFunctionTool(raw)
      if (inspection.matchCount == 0) {
        throw ChatFunctionToolNoMatchException("ChatFunctionTool matched 0 branches: " + inspection.failures
          .joinToString("; "))
      }
      return ChatFunctionTool(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<ChatFunctionTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatFunctionTool {
      val jsonDecoder = decoder.requireJsonDecoder("ChatFunctionTool")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: ChatFunctionTool) {
      encoder.requireJsonEncoder("ChatFunctionTool").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectChatFunctionTool(element: JsonElement): ChatFunctionToolInspection {
  val raw = element as? JsonObject ?: return ChatFunctionToolInspection(
    matchesInlineComponentsSchemasChatFunctionToolAnyOf0 = false,
    matchesAdvisorServerToolOpenRouter = false,
    matchesBashServerTool = false,
    matchesDatetimeServerTool = false,
    matchesFilesServerTool = false,
    matchesFusionServerToolOpenRouter = false,
    matchesImageGenerationServerToolOpenRouter = false,
    matchesChatSearchModelsServerTool = false,
    matchesSubagentServerToolOpenRouter = false,
    matchesWebFetchServerTool = false,
    matchesOpenRouterWebSearchServerTool = false,
    matchesChatWebSearchShorthand = false,
    failures = listOf("InlineComponentsSchemasChatFunctionToolAnyOf0: expected JSON object",
      "AdvisorServerToolOpenRouter: expected JSON object", "BashServerTool: expected JSON object",
        "DatetimeServerTool: expected JSON object", "FilesServerTool: expected JSON object",
          "FusionServerToolOpenRouter: expected JSON object",
            "ImageGenerationServerToolOpenRouter: expected JSON object",
              "ChatSearchModelsServerTool: expected JSON object", "SubagentServerToolOpenRouter: expected JSON object",
                "WebFetchServerTool: expected JSON object", "OpenRouterWebSearchServerTool: expected JSON object",
                  "ChatWebSearchShorthand: expected JSON object"),
  )
  val matchesInlineComponentsSchemasChatFunctionToolAnyOf0 = raw["function"] != null && raw["type"] != null
  val matchesAdvisorServerToolOpenRouter = raw["type"] != null
  val matchesBashServerTool = raw["type"] != null
  val matchesDatetimeServerTool = raw["type"] != null
  val matchesFilesServerTool = raw["type"] != null
  val matchesFusionServerToolOpenRouter = raw["type"] != null
  val matchesImageGenerationServerToolOpenRouter = raw["type"] != null
  val matchesChatSearchModelsServerTool = raw["type"] != null
  val matchesSubagentServerToolOpenRouter = raw["type"] != null
  val matchesWebFetchServerTool = raw["type"] != null
  val matchesOpenRouterWebSearchServerTool = raw["type"] != null
  val matchesChatWebSearchShorthand = raw["type"] != null
  return ChatFunctionToolInspection(
    matchesInlineComponentsSchemasChatFunctionToolAnyOf0 = matchesInlineComponentsSchemasChatFunctionToolAnyOf0,
    matchesAdvisorServerToolOpenRouter = matchesAdvisorServerToolOpenRouter,
    matchesBashServerTool = matchesBashServerTool,
    matchesDatetimeServerTool = matchesDatetimeServerTool,
    matchesFilesServerTool = matchesFilesServerTool,
    matchesFusionServerToolOpenRouter = matchesFusionServerToolOpenRouter,
    matchesImageGenerationServerToolOpenRouter = matchesImageGenerationServerToolOpenRouter,
    matchesChatSearchModelsServerTool = matchesChatSearchModelsServerTool,
    matchesSubagentServerToolOpenRouter = matchesSubagentServerToolOpenRouter,
    matchesWebFetchServerTool = matchesWebFetchServerTool,
    matchesOpenRouterWebSearchServerTool = matchesOpenRouterWebSearchServerTool,
    matchesChatWebSearchShorthand = matchesChatWebSearchShorthand,
    failures = buildList {
      if (!matchesInlineComponentsSchemasChatFunctionToolAnyOf0) add("InlineComponentsSchemasChatFunctionToolAnyOf0: " +
        "required properties 'function', 'type' do not match their declared types")
      if (!matchesAdvisorServerToolOpenRouter) add("AdvisorServerToolOpenRouter: required properties 'type' do not " +
        "match their declared types")
      if (!matchesBashServerTool) add("BashServerTool: required properties 'type' do not match their declared types")
      if (!matchesDatetimeServerTool) add("DatetimeServerTool: required properties 'type' do not match their declared " +
        "types")
      if (!matchesFilesServerTool) add("FilesServerTool: required properties 'type' do not match their declared types")
      if (!matchesFusionServerToolOpenRouter) add("FusionServerToolOpenRouter: required properties 'type' do not " +
        "match their declared types")
      if (!matchesImageGenerationServerToolOpenRouter) add("ImageGenerationServerToolOpenRouter: required properties " +
        "'type' do not match their declared types")
      if (!matchesChatSearchModelsServerTool) add("ChatSearchModelsServerTool: required properties 'type' do not " +
        "match their declared types")
      if (!matchesSubagentServerToolOpenRouter) add("SubagentServerToolOpenRouter: required properties 'type' do not " +
        "match their declared types")
      if (!matchesWebFetchServerTool) add("WebFetchServerTool: required properties 'type' do not match their declared " +
        "types")
      if (!matchesOpenRouterWebSearchServerTool) add("OpenRouterWebSearchServerTool: required properties 'type' do " +
        "not match their declared types")
      if (!matchesChatWebSearchShorthand) add("ChatWebSearchShorthand: required properties 'type' do not match their " +
        "declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
