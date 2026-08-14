package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * An openrouter:fusion server tool output item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputFusionServerToolItem
 */
@Serializable(with = OutputFusionServerToolItem.Serializer::class)
public class OutputFusionServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineOutputFusionServerToolItemTypeX66d6265a,
  public val analysis: FusionAnalysisResult? = null,
  /**
   * Error message when the fusion run did not produce an analysis result.
   */
  public val error: String? = null,
  failedModels: List<InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8>? = null,
  /**
   * Typed failure reason when the fusion run failed. Possible values include: all_panels_failed, insufficient_credits,
   * rate_limited, judge_not_valid_json, judge_schema_mismatch, judge_upstream_error, judge_empty_completion.
   */
  public val failureReason: String? = null,
  public val id: String? = null,
  responses: List<InlineOutputFusionServerToolItemResponsesItemX9b83c13c>? = null,
  sources: List<FusionSource>? = null,
) {
  /**
   * Models that were requested as part of the analysis panel but did not produce a response. Present when at least one
   * requested analysis model failed. The fusion result is still usable but was produced from a degraded panel.
   */
  public val failedModels: List<InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8>? =
      failedModels?.let { collection0 -> collection0.toList() }

  /**
   * Analysis models that produced a response in this fusion run, with each model's full panel content.
   */
  public val responses: List<InlineOutputFusionServerToolItemResponsesItemX9b83c13c>? =
      responses?.let { collection0 -> collection0.toList() }

  /**
   * Web pages the analysis panels and judge retrieved via web search during this fusion run, deduplicated by URL across
   * the whole run. Present when at least one model cited a source.
   */
  public val sources: List<FusionSource>? = sources?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputFusionServerToolItemTypeX66d6265a? = null

    public var type: InlineOutputFusionServerToolItemTypeX66d6265a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var analysis: FusionAnalysisResult? = null

    /**
     * Error message when the fusion run did not produce an analysis result.
     */
    public var error: String? = null

    private var failedModelsValue: List<InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8>?
        = null

    /**
     * Models that were requested as part of the analysis panel but did not produce a response. Present when at least
     * one requested analysis model failed. The fusion result is still usable but was produced from a degraded panel.
     */
    public var failedModels: List<InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8>?
      get() = failedModelsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        failedModelsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Typed failure reason when the fusion run failed. Possible values include: all_panels_failed,
     * insufficient_credits, rate_limited, judge_not_valid_json, judge_schema_mismatch, judge_upstream_error,
     * judge_empty_completion.
     */
    public var failureReason: String? = null

    public var id: String? = null

    private var responsesValue: List<InlineOutputFusionServerToolItemResponsesItemX9b83c13c>? = null

    /**
     * Analysis models that produced a response in this fusion run, with each model's full panel content.
     */
    public var responses: List<InlineOutputFusionServerToolItemResponsesItemX9b83c13c>?
      get() = responsesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        responsesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var sourcesValue: List<FusionSource>? = null

    /**
     * Web pages the analysis panels and judge retrieved via web search during this fusion run, deduplicated by URL
     * across the whole run. Present when at least one model cited a source.
     */
    public var sources: List<FusionSource>?
      get() = sourcesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        sourcesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): OutputFusionServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputFusionServerToolItem(
        status = status,
        type = type,
        analysis = analysis,
        error = error,
        failedModels = failedModels,
        failureReason = failureReason,
        id = id,
        responses = responses,
        sources = sources,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputFusionServerToolItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputFusionServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputFusionServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputFusionServerToolItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputFusionServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputFusionServerToolItemTypeX66d6265a>(rawObject, "type")
      return OutputFusionServerToolItem(
        status = status,
        type = type,
        analysis = rawObject["analysis"]?.let { json.decodeFromJsonElement<FusionAnalysisResult>(it) },
        error = rawObject["error"]?.let { json.decodeFromJsonElement<String>(it) },
        failedModels = rawObject["failed_models"]?.let { json.decodeFromJsonElement<List<InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8>>(it) },
        failureReason = rawObject["failure_reason"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        responses = rawObject["responses"]?.let { json.decodeFromJsonElement<List<InlineOutputFusionServerToolItemResponsesItemX9b83c13c>>(it) },
        sources = rawObject["sources"]?.let { json.decodeFromJsonElement<List<FusionSource>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputFusionServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputFusionServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.analysis?.let { put("analysis", json.encodeToJsonElement(it)) }
        value.error?.let { put("error", it) }
        value.failedModels?.let { put("failed_models", json.encodeToJsonElement(it)) }
        value.failureReason?.let { put("failure_reason", it) }
        value.id?.let { put("id", it) }
        value.responses?.let { put("responses", json.encodeToJsonElement(it)) }
        value.sources?.let { put("sources", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputFusionServerToolItem(block: OutputFusionServerToolItem.Builder.() -> Unit): OutputFusionServerToolItem = OutputFusionServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputFusionServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
