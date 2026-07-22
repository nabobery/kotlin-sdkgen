package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = OutputFusionServerToolItem.Serializer::class)
public class OutputFusionServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineComponentsSchemasOutputFusionServerToolItemPropertiesType,
  public val analysis: FusionAnalysisResult? = null,
  /**
   * Error message when the fusion run did not produce an analysis result.
   */
  public val error: String? = null,
  /**
   * Models that were requested as part of the analysis panel but did not produce a response. Present when at least one
   * requested analysis model failed. The fusion result is still usable but was produced from a degraded panel.
   */
  public val failedModels:
      List<InlineComponentsSchemasOutputFusionServerToolItemPropertiesFailedModelsItems>? = null,
  /**
   * Typed failure reason when the fusion run failed. Possible values include: all_panels_failed, insufficient_credits,
   * rate_limited, judge_not_valid_json, judge_schema_mismatch, judge_upstream_error, judge_empty_completion.
   */
  public val failureReason: String? = null,
  public val id: String? = null,
  /**
   * Analysis models that produced a response in this fusion run, with each model's full panel content.
   */
  public val responses:
      List<InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems>? = null,
  /**
   * Web pages the analysis panels and judge retrieved via web search during this fusion run, deduplicated by URL across
   * the whole run. Present when at least one model cited a source.
   */
  public val sources: List<FusionSource>? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineComponentsSchemasOutputFusionServerToolItemPropertiesType? = null

    public var type: InlineComponentsSchemasOutputFusionServerToolItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var analysis: FusionAnalysisResult? = null

    /**
     * Error message when the fusion run did not produce an analysis result.
     */
    public var error: String? = null

    /**
     * Models that were requested as part of the analysis panel but did not produce a response. Present when at least
     * one requested analysis model failed. The fusion result is still usable but was produced from a degraded panel.
     */
    public var failedModels:
        List<InlineComponentsSchemasOutputFusionServerToolItemPropertiesFailedModelsItems>? = null

    /**
     * Typed failure reason when the fusion run failed. Possible values include: all_panels_failed,
     * insufficient_credits, rate_limited, judge_not_valid_json, judge_schema_mismatch, judge_upstream_error,
     * judge_empty_completion.
     */
    public var failureReason: String? = null

    public var id: String? = null

    /**
     * Analysis models that produced a response in this fusion run, with each model's full panel content.
     */
    public var responses:
        List<InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems>? = null

    /**
     * Web pages the analysis panels and judge retrieved via web search during this fusion run, deduplicated by URL
     * across the whole run. Present when at least one model cited a source.
     */
    public var sources: List<FusionSource>? = null

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

  public object Serializer : KSerializer<OutputFusionServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputFusionServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputFusionServerToolItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OutputFusionServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(raw, "status")
      val type = json.decodeRequired<InlineComponentsSchemasOutputFusionServerToolItemPropertiesType>(raw, "type")
      return OutputFusionServerToolItem(
        status = status,
        type = type,
        analysis = raw["analysis"]?.let { json.decodeFromJsonElement<FusionAnalysisResult>(it) },
        error = raw["error"]?.let { json.decodeFromJsonElement<String>(it) },
        failedModels = raw["failed_models"]?.let { json
          .decodeFromJsonElement<List<InlineComponentsSchemasOutputFusionServerToolItemPropertiesFailedModelsItems>>(it) },
        failureReason = raw["failure_reason"]?.let { json.decodeFromJsonElement<String>(it) },
        id = raw["id"]?.let { json.decodeFromJsonElement<String>(it) },
        responses = raw["responses"]?.let { json
          .decodeFromJsonElement<List<InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems>>(it) },
        sources = raw["sources"]?.let { json.decodeFromJsonElement<List<FusionSource>>(it) },
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

public fun outputFusionServerToolItem(block: OutputFusionServerToolItem.Builder.() ->
  Unit): OutputFusionServerToolItem = OutputFusionServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputFusionServerToolItem is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
