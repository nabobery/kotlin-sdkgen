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
public data class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0View(
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val description: String? = null,
  @SerialName("input_schema")
  public val inputSchema:
      InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema,
  public val name: String,
  public val type:
      InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesType? = null,
)

@Serializable
public data class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1View(
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val name: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1PropertiesName,
  public val type: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1PropertiesType,
)

@Serializable
public data class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2View(
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val name: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesName,
  public val type: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesType,
)

@Serializable
public data class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3View(
  @SerialName("allowed_domains")
  public val allowedDomains: List<String>? = null,
  @SerialName("blocked_domains")
  public val blockedDomains: List<String>? = null,
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  @SerialName("max_uses")
  public val maxUses: Int? = null,
  public val name: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3PropertiesName,
  public val type: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3PropertiesType,
  @SerialName("user_location")
  public val userLocation: AnthropicWebSearchToolUserLocation? = null,
)

@Serializable
public data class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4View(
  @SerialName("allowed_callers")
  public val allowedCallers: List<InlineComponentsSchemasAnthropicAllowedCallersItems>? = null,
  @SerialName("allowed_domains")
  public val allowedDomains: List<String>? = null,
  @SerialName("blocked_domains")
  public val blockedDomains: List<String>? = null,
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  @SerialName("max_uses")
  public val maxUses: Int? = null,
  public val name: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4PropertiesName,
  public val type: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4PropertiesType,
  @SerialName("user_location")
  public val userLocation: AnthropicWebSearchToolUserLocation? = null,
)

@Serializable
public data class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5View(
  @SerialName("allowed_callers")
  public val allowedCallers: List<InlineComponentsSchemasAnthropicAllowedCallersItems>? = null,
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val caching: AnthropicCacheControlDirective? = null,
  @SerialName("defer_loading")
  public val deferLoading: Boolean? = null,
  @SerialName("max_uses")
  public val maxUses: Int? = null,
  public val model: String,
  public val name: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesName,
  public val type: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesType,
)

@Serializable
public data class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12View(
  public val type: String,
)

public enum class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch {
  InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0,
  InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1,
  InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2,
  InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3,
  InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4,
  InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5,
  BashServerTool,
  DatetimeServerTool,
  ImageGenerationServerToolOpenRouter,
  MessagesSearchModelsServerTool,
  WebFetchServerTool,
  OpenRouterWebSearchServerTool,
  InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12,
}

public sealed class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasMessagesRequestPropertiesToolsItemsDecodingException(message)

internal data class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsInspection(
  public val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1: Boolean,
  public val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2: Boolean,
  public val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3: Boolean,
  public val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4: Boolean,
  public val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5: Boolean,
  public val matchesBashServerTool: Boolean,
  public val matchesDatetimeServerTool: Boolean,
  public val matchesImageGenerationServerToolOpenRouter: Boolean,
  public val matchesMessagesSearchModelsServerTool: Boolean,
  public val matchesWebFetchServerTool: Boolean,
  public val matchesOpenRouterWebSearchServerTool: Boolean,
  public val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0,
      matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1,
        matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2,
          matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3,
            matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4,
              matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5, matchesBashServerTool,
                matchesDatetimeServerTool, matchesImageGenerationServerToolOpenRouter,
                  matchesMessagesSearchModelsServerTool, matchesWebFetchServerTool,
                    matchesOpenRouterWebSearchServerTool,
                      matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolsItems.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesToolsItems internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsInspection,
) {
  public val inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0:
      InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0View>(raw) else null }

  public val inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1:
      InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1View>(raw) else null }

  public val inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2:
      InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2) json
          .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2View>(raw) else null }

  public val inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3:
      InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3) json
          .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3View>(raw) else null }

  public val inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4:
      InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4) json
          .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4View>(raw) else null }

  public val inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5:
      InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5) json
          .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5View>(raw) else null }

  public val bashServerTool: BashServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBashServerTool) json
        .decodeFromJsonElement<BashServerToolView>(raw) else null }

  public val datetimeServerTool: DatetimeServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDatetimeServerTool) json
        .decodeFromJsonElement<DatetimeServerToolView>(raw) else null }

  public val imageGenerationServerToolOpenRouter: ImageGenerationServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesImageGenerationServerToolOpenRouter) json
        .decodeFromJsonElement<ImageGenerationServerToolOpenRouterView>(raw) else null }

  public val messagesSearchModelsServerTool: MessagesSearchModelsServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesMessagesSearchModelsServerTool) json
        .decodeFromJsonElement<MessagesSearchModelsServerToolView>(raw) else null }

  public val webFetchServerTool: WebFetchServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesWebFetchServerTool) json
        .decodeFromJsonElement<WebFetchServerToolView>(raw) else null }

  public val openRouterWebSearchServerTool: OpenRouterWebSearchServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenRouterWebSearchServerTool) json
        .decodeFromJsonElement<OpenRouterWebSearchServerToolView>(raw) else null }

  public val inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12:
      InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12) json
          .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12View>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0) add(InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch.InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1) add(InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch.InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2) add(InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch.InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3) add(InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch.InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4) add(InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch.InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5) add(InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch.InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5)
      if (inspection.matchesBashServerTool) add(InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch
        .BashServerTool)
      if (inspection.matchesDatetimeServerTool) add(InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch
        .DatetimeServerTool)
      if (inspection
























































                                                                                                                        .matchesImageGenerationServerToolOpenRouter) add(InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch.ImageGenerationServerToolOpenRouter)
      if (inspection
        .matchesMessagesSearchModelsServerTool) add(InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch
          .MessagesSearchModelsServerTool)
      if (inspection.matchesWebFetchServerTool) add(InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch
        .WebFetchServerTool)
      if (inspection
        .matchesOpenRouterWebSearchServerTool) add(InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch
          .OpenRouterWebSearchServerTool)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12) add(InlineComponentsSchemasMessagesRequestPropertiesToolsItemsBranch.InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasMessagesRequestPropertiesToolsItems {
      val inspection = inspectInlineComponentsSchemasMessagesRequestPropertiesToolsItems(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasMessagesRequestPropertiesToolsItemsNoMatchException("InlineComponentsSchemasMessagesRequestPropertiesToolsItems " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItems(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolsItems {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItems")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesRequestPropertiesToolsItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItems").encodeJsonElement(value
        .raw)
    }
  }
}

private fun inspectInlineComponentsSchemasMessagesRequestPropertiesToolsItems(element: JsonElement): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsInspection {
  val raw = element as? JsonObject ?: return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsInspection(
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0 = false,
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1 = false,
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2 = false,
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3 = false,
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4 = false,
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5 = false,
    matchesBashServerTool = false,
    matchesDatetimeServerTool = false,
    matchesImageGenerationServerToolOpenRouter = false,
    matchesMessagesSearchModelsServerTool = false,
    matchesWebFetchServerTool = false,
    matchesOpenRouterWebSearchServerTool = false,
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12 = false,
    failures = listOf("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0: expected JSON object",
      "InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1: expected JSON object",
        "InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2: expected JSON object",
          "InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3: expected JSON object",
            "InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4: expected JSON object",
              "InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5: expected JSON object",
                "BashServerTool: expected JSON object", "DatetimeServerTool: expected JSON object",
                  "ImageGenerationServerToolOpenRouter: expected JSON object",
                    "MessagesSearchModelsServerTool: expected JSON object", "WebFetchServerTool: expected JSON object",
                      "OpenRouterWebSearchServerTool: expected JSON object",
                        "InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12: expected JSON object"),
  )
  val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0 = raw["input_schema"] != null &&
    raw["name"].isString()
  val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1 = raw["name"] != null &&
    raw["type"] != null
  val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2 = raw["name"] != null &&
    raw["type"] != null
  val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3 = raw["name"] != null &&
    raw["type"] != null
  val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4 = raw["name"] != null &&
    raw["type"] != null
  val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5 = raw["model"].isString() &&
    raw["name"] != null && raw["type"] != null
  val matchesBashServerTool = raw["type"] != null
  val matchesDatetimeServerTool = raw["type"] != null
  val matchesImageGenerationServerToolOpenRouter = raw["type"] != null
  val matchesMessagesSearchModelsServerTool = raw["type"] != null
  val matchesWebFetchServerTool = raw["type"] != null
  val matchesOpenRouterWebSearchServerTool = raw["type"] != null
  val matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12 = raw["type"].isString()
  return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsInspection(
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0 =
      matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0,
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1 =
      matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1,
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2 =
      matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2,
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3 =
      matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3,
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4 =
      matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4,
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5 =
      matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5,
    matchesBashServerTool = matchesBashServerTool,
    matchesDatetimeServerTool = matchesDatetimeServerTool,
    matchesImageGenerationServerToolOpenRouter = matchesImageGenerationServerToolOpenRouter,
    matchesMessagesSearchModelsServerTool = matchesMessagesSearchModelsServerTool,
    matchesWebFetchServerTool = matchesWebFetchServerTool,
    matchesOpenRouterWebSearchServerTool = matchesOpenRouterWebSearchServerTool,
    matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12 =
      matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12,
    failures = buildList {
      if (!matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0) add("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0: " +
        "required properties 'input_schema', 'name' do not match their declared types")
      if (!matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1) add("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1: " +
        "required properties 'name', 'type' do not match their declared types")
      if (!matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2) add("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2: " +
        "required properties 'name', 'type' do not match their declared types")
      if (!matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3) add("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3: " +
        "required properties 'name', 'type' do not match their declared types")
      if (!matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4) add("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf4: " +
        "required properties 'name', 'type' do not match their declared types")
      if (!matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5) add("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5: " +
        "required properties 'model', 'name', 'type' do not match their declared types")
      if (!matchesBashServerTool) add("BashServerTool: required properties 'type' do not match their declared types")
      if (!matchesDatetimeServerTool) add("DatetimeServerTool: required properties 'type' do not match their declared " +
        "types")
      if (!matchesImageGenerationServerToolOpenRouter) add("ImageGenerationServerToolOpenRouter: required properties " +
        "'type' do not match their declared types")
      if (!matchesMessagesSearchModelsServerTool) add("MessagesSearchModelsServerTool: required properties 'type' do " +
        "not match their declared types")
      if (!matchesWebFetchServerTool) add("WebFetchServerTool: required properties 'type' do not match their declared " +
        "types")
      if (!matchesOpenRouterWebSearchServerTool) add("OpenRouterWebSearchServerTool: required properties 'type' do " +
        "not match their declared types")
      if (!matchesInlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12) add("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12: " +
        "required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
