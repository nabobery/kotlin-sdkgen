package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
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
public data class InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf1Xfd5a8d77View(
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val description: String? = null,
  @SerialName("input_schema")
  public val inputSchema: InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0,
  public val name: String,
  public val type: InlineMessagesRequestToolsItemAnyOf1TypeXef0cc66d? = null,
)

@Serializable
public data class InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf2X59919e35View(
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val name: InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2,
  public val type: InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab,
)

@Serializable
public data class InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf3Xf8ded557View(
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val name: InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0,
  public val type: InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82,
)

@ConsistentCopyVisibility
@Serializable
public data class InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf4X4318960bView internal constructor(
  @SerialName("allowed_domains")
  public val allowedDomains: List<String>? = null,
  @SerialName("blocked_domains")
  public val blockedDomains: List<String>? = null,
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  @SerialName("max_uses")
  public val maxUses: Int? = null,
  public val name: InlineMessagesRequestToolsItemAnyOf4NameXdf203565,
  public val type: InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9,
  @SerialName("user_location")
  public val userLocation: AnthropicWebSearchToolUserLocation? = null,
)

@ConsistentCopyVisibility
@Serializable
public data class InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf5X277f1d1cView internal constructor(
  @SerialName("allowed_callers")
  public val allowedCallers: List<InlineAnthropicAllowedCallersItemX2d2fed45>? = null,
  @SerialName("allowed_domains")
  public val allowedDomains: List<String>? = null,
  @SerialName("blocked_domains")
  public val blockedDomains: List<String>? = null,
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  @SerialName("max_uses")
  public val maxUses: Int? = null,
  public val name: InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1,
  public val type: InlineMessagesRequestToolsItemAnyOf5TypeXb6301416,
  @SerialName("user_location")
  public val userLocation: AnthropicWebSearchToolUserLocation? = null,
)

@ConsistentCopyVisibility
@Serializable
public data class InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf6X04b8deffView internal constructor(
  @SerialName("allowed_callers")
  public val allowedCallers: List<InlineAnthropicAllowedCallersItemX2d2fed45>? = null,
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val caching: AnthropicCacheControlDirective? = null,
  @SerialName("defer_loading")
  public val deferLoading: Boolean? = null,
  @SerialName("max_uses")
  public val maxUses: Int? = null,
  public val model: String,
  public val name: InlineMessagesRequestToolsItemAnyOf6NameX83a61fda,
  public val type: InlineMessagesRequestToolsItemAnyOf6TypeX24072203,
)

@Serializable
public data class InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf13X5cdf6a64View(
  public val type: String,
)

public enum class InlineMessagesRequestToolsItemX1e9ae42bBranch {
  InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77,
  InlineMessagesRequestToolsItemAnyOf2X59919e35,
  InlineMessagesRequestToolsItemAnyOf3Xf8ded557,
  InlineMessagesRequestToolsItemAnyOf4X4318960b,
  InlineMessagesRequestToolsItemAnyOf5X277f1d1c,
  InlineMessagesRequestToolsItemAnyOf6X04b8deff,
  BashServerTool,
  DatetimeServerTool,
  ImageGenerationServerToolOpenRouter,
  MessagesSearchModelsServerTool,
  WebFetchServerTool,
  OpenRouterWebSearchServerTool,
  InlineMessagesRequestToolsItemAnyOf13X5cdf6a64,
}

public sealed class InlineMessagesRequestToolsItemX1e9ae42bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineMessagesRequestToolsItemX1e9ae42bNoMatchException(
  message: String,
) : InlineMessagesRequestToolsItemX1e9ae42bDecodingException(message)

internal data class InlineMessagesRequestToolsItemX1e9ae42bInspection(
  public val matchesInlineMessagesRequestToolsItemAnyOf1Xfd5a8d77: Boolean,
  public val matchesInlineMessagesRequestToolsItemAnyOf2X59919e35: Boolean,
  public val matchesInlineMessagesRequestToolsItemAnyOf3Xf8ded557: Boolean,
  public val matchesInlineMessagesRequestToolsItemAnyOf4X4318960b: Boolean,
  public val matchesInlineMessagesRequestToolsItemAnyOf5X277f1d1c: Boolean,
  public val matchesInlineMessagesRequestToolsItemAnyOf6X04b8deff: Boolean,
  public val matchesBashServerTool: Boolean,
  public val matchesDatetimeServerTool: Boolean,
  public val matchesImageGenerationServerToolOpenRouter: Boolean,
  public val matchesMessagesSearchModelsServerTool: Boolean,
  public val matchesWebFetchServerTool: Boolean,
  public val matchesOpenRouterWebSearchServerTool: Boolean,
  public val matchesInlineMessagesRequestToolsItemAnyOf13X5cdf6a64: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineMessagesRequestToolsItemAnyOf1Xfd5a8d77, matchesInlineMessagesRequestToolsItemAnyOf2X59919e35, matchesInlineMessagesRequestToolsItemAnyOf3Xf8ded557, matchesInlineMessagesRequestToolsItemAnyOf4X4318960b, matchesInlineMessagesRequestToolsItemAnyOf5X277f1d1c, matchesInlineMessagesRequestToolsItemAnyOf6X04b8deff, matchesBashServerTool, matchesDatetimeServerTool, matchesImageGenerationServerToolOpenRouter, matchesMessagesSearchModelsServerTool, matchesWebFetchServerTool, matchesOpenRouterWebSearchServerTool, matchesInlineMessagesRequestToolsItemAnyOf13X5cdf6a64).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items
 */
@Serializable(with = InlineMessagesRequestToolsItemX1e9ae42b.Serializer::class)
public class InlineMessagesRequestToolsItemX1e9ae42b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineMessagesRequestToolsItemX1e9ae42bInspection,
) {
  public val inlineMessagesRequestToolsItemAnyOf1Xfd5a8d77:
      InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf1Xfd5a8d77View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMessagesRequestToolsItemAnyOf1Xfd5a8d77) json.decodeFromJsonElement<InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf1Xfd5a8d77View>(raw) else null }

  public val inlineMessagesRequestToolsItemAnyOf2X59919e35:
      InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf2X59919e35View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMessagesRequestToolsItemAnyOf2X59919e35) json.decodeFromJsonElement<InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf2X59919e35View>(raw) else null }

  public val inlineMessagesRequestToolsItemAnyOf3Xf8ded557:
      InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf3Xf8ded557View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMessagesRequestToolsItemAnyOf3Xf8ded557) json.decodeFromJsonElement<InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf3Xf8ded557View>(raw) else null }

  public val inlineMessagesRequestToolsItemAnyOf4X4318960b:
      InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf4X4318960bView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMessagesRequestToolsItemAnyOf4X4318960b) json.decodeFromJsonElement<InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf4X4318960bView>(raw) else null }

  public val inlineMessagesRequestToolsItemAnyOf5X277f1d1c:
      InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf5X277f1d1cView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMessagesRequestToolsItemAnyOf5X277f1d1c) json.decodeFromJsonElement<InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf5X277f1d1cView>(raw) else null }

  public val inlineMessagesRequestToolsItemAnyOf6X04b8deff:
      InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf6X04b8deffView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMessagesRequestToolsItemAnyOf6X04b8deff) json.decodeFromJsonElement<InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf6X04b8deffView>(raw) else null }

  public val bashServerTool: BashServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBashServerTool) json.decodeFromJsonElement<BashServerToolView>(raw) else null }

  public val datetimeServerTool: DatetimeServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDatetimeServerTool) json.decodeFromJsonElement<DatetimeServerToolView>(raw) else null }

  public val imageGenerationServerToolOpenRouter: ImageGenerationServerToolOpenRouterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesImageGenerationServerToolOpenRouter) json.decodeFromJsonElement<ImageGenerationServerToolOpenRouterView>(raw) else null }

  public val messagesSearchModelsServerTool: MessagesSearchModelsServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesMessagesSearchModelsServerTool) json.decodeFromJsonElement<MessagesSearchModelsServerToolView>(raw) else null }

  public val webFetchServerTool: WebFetchServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesWebFetchServerTool) json.decodeFromJsonElement<WebFetchServerToolView>(raw) else null }

  public val openRouterWebSearchServerTool: OpenRouterWebSearchServerToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenRouterWebSearchServerTool) json.decodeFromJsonElement<OpenRouterWebSearchServerToolView>(raw) else null }

  public val inlineMessagesRequestToolsItemAnyOf13X5cdf6a64:
      InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf13X5cdf6a64View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMessagesRequestToolsItemAnyOf13X5cdf6a64) json.decodeFromJsonElement<InlineMessagesRequestToolsItemX1e9ae42bInlineMessagesRequestToolsItemAnyOf13X5cdf6a64View>(raw) else null }

  public val matchedBranches: Set<InlineMessagesRequestToolsItemX1e9ae42bBranch>
    get() = buildSet {
      if (inspection.matchesInlineMessagesRequestToolsItemAnyOf1Xfd5a8d77) add(InlineMessagesRequestToolsItemX1e9ae42bBranch.InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77)
      if (inspection.matchesInlineMessagesRequestToolsItemAnyOf2X59919e35) add(InlineMessagesRequestToolsItemX1e9ae42bBranch.InlineMessagesRequestToolsItemAnyOf2X59919e35)
      if (inspection.matchesInlineMessagesRequestToolsItemAnyOf3Xf8ded557) add(InlineMessagesRequestToolsItemX1e9ae42bBranch.InlineMessagesRequestToolsItemAnyOf3Xf8ded557)
      if (inspection.matchesInlineMessagesRequestToolsItemAnyOf4X4318960b) add(InlineMessagesRequestToolsItemX1e9ae42bBranch.InlineMessagesRequestToolsItemAnyOf4X4318960b)
      if (inspection.matchesInlineMessagesRequestToolsItemAnyOf5X277f1d1c) add(InlineMessagesRequestToolsItemX1e9ae42bBranch.InlineMessagesRequestToolsItemAnyOf5X277f1d1c)
      if (inspection.matchesInlineMessagesRequestToolsItemAnyOf6X04b8deff) add(InlineMessagesRequestToolsItemX1e9ae42bBranch.InlineMessagesRequestToolsItemAnyOf6X04b8deff)
      if (inspection.matchesBashServerTool) add(InlineMessagesRequestToolsItemX1e9ae42bBranch.BashServerTool)
      if (inspection.matchesDatetimeServerTool) add(InlineMessagesRequestToolsItemX1e9ae42bBranch.DatetimeServerTool)
      if (inspection.matchesImageGenerationServerToolOpenRouter) add(InlineMessagesRequestToolsItemX1e9ae42bBranch.ImageGenerationServerToolOpenRouter)
      if (inspection.matchesMessagesSearchModelsServerTool) add(InlineMessagesRequestToolsItemX1e9ae42bBranch.MessagesSearchModelsServerTool)
      if (inspection.matchesWebFetchServerTool) add(InlineMessagesRequestToolsItemX1e9ae42bBranch.WebFetchServerTool)
      if (inspection.matchesOpenRouterWebSearchServerTool) add(InlineMessagesRequestToolsItemX1e9ae42bBranch.OpenRouterWebSearchServerTool)
      if (inspection.matchesInlineMessagesRequestToolsItemAnyOf13X5cdf6a64) add(InlineMessagesRequestToolsItemX1e9ae42bBranch.InlineMessagesRequestToolsItemAnyOf13X5cdf6a64)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineMessagesRequestToolsItemX1e9ae42b {
      val inspection = inspectInlineMessagesRequestToolsItemX1e9ae42b(raw)
      if (inspection.matchCount == 0) {
        throw InlineMessagesRequestToolsItemX1e9ae42bNoMatchException("InlineMessagesRequestToolsItemX1e9ae42b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineMessagesRequestToolsItemX1e9ae42b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemX1e9ae42b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemX1e9ae42b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestToolsItemX1e9ae42b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemX1e9ae42b) {
      encoder.requireJsonEncoder("InlineMessagesRequestToolsItemX1e9ae42b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineMessagesRequestToolsItemX1e9ae42b(element: JsonElement): InlineMessagesRequestToolsItemX1e9ae42bInspection {
  val raw = element as? JsonObject ?: return InlineMessagesRequestToolsItemX1e9ae42bInspection(
    matchesInlineMessagesRequestToolsItemAnyOf1Xfd5a8d77 = false,
    matchesInlineMessagesRequestToolsItemAnyOf2X59919e35 = false,
    matchesInlineMessagesRequestToolsItemAnyOf3Xf8ded557 = false,
    matchesInlineMessagesRequestToolsItemAnyOf4X4318960b = false,
    matchesInlineMessagesRequestToolsItemAnyOf5X277f1d1c = false,
    matchesInlineMessagesRequestToolsItemAnyOf6X04b8deff = false,
    matchesBashServerTool = false,
    matchesDatetimeServerTool = false,
    matchesImageGenerationServerToolOpenRouter = false,
    matchesMessagesSearchModelsServerTool = false,
    matchesWebFetchServerTool = false,
    matchesOpenRouterWebSearchServerTool = false,
    matchesInlineMessagesRequestToolsItemAnyOf13X5cdf6a64 = false,
    failures = listOf("InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77: expected JSON object", "InlineMessagesRequestToolsItemAnyOf2X59919e35: expected JSON object", "InlineMessagesRequestToolsItemAnyOf3Xf8ded557: expected JSON object", "InlineMessagesRequestToolsItemAnyOf4X4318960b: expected JSON object", "InlineMessagesRequestToolsItemAnyOf5X277f1d1c: expected JSON object", "InlineMessagesRequestToolsItemAnyOf6X04b8deff: expected JSON object", "BashServerTool: expected JSON object", "DatetimeServerTool: expected JSON object", "ImageGenerationServerToolOpenRouter: expected JSON object", "MessagesSearchModelsServerTool: expected JSON object", "WebFetchServerTool: expected JSON object", "OpenRouterWebSearchServerTool: expected JSON object", "InlineMessagesRequestToolsItemAnyOf13X5cdf6a64: expected JSON object"),
  )
  val matchesInlineMessagesRequestToolsItemAnyOf1Xfd5a8d77 = raw["input_schema"] != null && raw["name"].isString()
  val matchesInlineMessagesRequestToolsItemAnyOf2X59919e35 = raw["name"] != null && raw["type"] != null
  val matchesInlineMessagesRequestToolsItemAnyOf3Xf8ded557 = raw["name"] != null && raw["type"] != null
  val matchesInlineMessagesRequestToolsItemAnyOf4X4318960b = raw["name"] != null && raw["type"] != null
  val matchesInlineMessagesRequestToolsItemAnyOf5X277f1d1c = raw["name"] != null && raw["type"] != null
  val matchesInlineMessagesRequestToolsItemAnyOf6X04b8deff = raw["model"].isString() && raw["name"] != null && raw["type"] != null
  val matchesBashServerTool = raw["type"] != null
  val matchesDatetimeServerTool = raw["type"] != null
  val matchesImageGenerationServerToolOpenRouter = raw["type"] != null
  val matchesMessagesSearchModelsServerTool = raw["type"] != null
  val matchesWebFetchServerTool = raw["type"] != null
  val matchesOpenRouterWebSearchServerTool = raw["type"] != null
  val matchesInlineMessagesRequestToolsItemAnyOf13X5cdf6a64 = raw["type"].isString()
  return InlineMessagesRequestToolsItemX1e9ae42bInspection(
    matchesInlineMessagesRequestToolsItemAnyOf1Xfd5a8d77 = matchesInlineMessagesRequestToolsItemAnyOf1Xfd5a8d77,
    matchesInlineMessagesRequestToolsItemAnyOf2X59919e35 = matchesInlineMessagesRequestToolsItemAnyOf2X59919e35,
    matchesInlineMessagesRequestToolsItemAnyOf3Xf8ded557 = matchesInlineMessagesRequestToolsItemAnyOf3Xf8ded557,
    matchesInlineMessagesRequestToolsItemAnyOf4X4318960b = matchesInlineMessagesRequestToolsItemAnyOf4X4318960b,
    matchesInlineMessagesRequestToolsItemAnyOf5X277f1d1c = matchesInlineMessagesRequestToolsItemAnyOf5X277f1d1c,
    matchesInlineMessagesRequestToolsItemAnyOf6X04b8deff = matchesInlineMessagesRequestToolsItemAnyOf6X04b8deff,
    matchesBashServerTool = matchesBashServerTool,
    matchesDatetimeServerTool = matchesDatetimeServerTool,
    matchesImageGenerationServerToolOpenRouter = matchesImageGenerationServerToolOpenRouter,
    matchesMessagesSearchModelsServerTool = matchesMessagesSearchModelsServerTool,
    matchesWebFetchServerTool = matchesWebFetchServerTool,
    matchesOpenRouterWebSearchServerTool = matchesOpenRouterWebSearchServerTool,
    matchesInlineMessagesRequestToolsItemAnyOf13X5cdf6a64 = matchesInlineMessagesRequestToolsItemAnyOf13X5cdf6a64,
    failures = buildList {
      if (!matchesInlineMessagesRequestToolsItemAnyOf1Xfd5a8d77) add("InlineMessagesRequestToolsItemAnyOf1Xfd5a8d77: required properties 'input_schema', 'name' do not match their declared types")
      if (!matchesInlineMessagesRequestToolsItemAnyOf2X59919e35) add("InlineMessagesRequestToolsItemAnyOf2X59919e35: required properties 'name', 'type' do not match their declared types")
      if (!matchesInlineMessagesRequestToolsItemAnyOf3Xf8ded557) add("InlineMessagesRequestToolsItemAnyOf3Xf8ded557: required properties 'name', 'type' do not match their declared types")
      if (!matchesInlineMessagesRequestToolsItemAnyOf4X4318960b) add("InlineMessagesRequestToolsItemAnyOf4X4318960b: required properties 'name', 'type' do not match their declared types")
      if (!matchesInlineMessagesRequestToolsItemAnyOf5X277f1d1c) add("InlineMessagesRequestToolsItemAnyOf5X277f1d1c: required properties 'name', 'type' do not match their declared types")
      if (!matchesInlineMessagesRequestToolsItemAnyOf6X04b8deff) add("InlineMessagesRequestToolsItemAnyOf6X04b8deff: required properties 'model', 'name', 'type' do not match their declared types")
      if (!matchesBashServerTool) add("BashServerTool: required properties 'type' do not match their declared types")
      if (!matchesDatetimeServerTool) add("DatetimeServerTool: required properties 'type' do not match their declared types")
      if (!matchesImageGenerationServerToolOpenRouter) add("ImageGenerationServerToolOpenRouter: required properties 'type' do not match their declared types")
      if (!matchesMessagesSearchModelsServerTool) add("MessagesSearchModelsServerTool: required properties 'type' do not match their declared types")
      if (!matchesWebFetchServerTool) add("WebFetchServerTool: required properties 'type' do not match their declared types")
      if (!matchesOpenRouterWebSearchServerTool) add("OpenRouterWebSearchServerTool: required properties 'type' do not match their declared types")
      if (!matchesInlineMessagesRequestToolsItemAnyOf13X5cdf6a64) add("InlineMessagesRequestToolsItemAnyOf13X5cdf6a64: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
