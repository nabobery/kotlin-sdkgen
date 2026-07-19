package com.nabobery.sdkgen.generated

import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ActivityItem.
 */
@Serializable(with = ActivityItem.Serializer::class)
public class ActivityItem(
  /**
   * BYOK inference cost in USD (external credits spent)
   */
  public val byokUsageInference: Double,
  /**
   * Total completion tokens generated
   */
  public val completionTokens: Int,
  /**
   * Date of the activity (YYYY-MM-DD format)
   */
  public val date: String,
  /**
   * Unique identifier for the endpoint
   */
  public val endpointId: String,
  /**
   * Model slug (e.g., "openai/gpt-4.1")
   */
  public val model: String,
  /**
   * Model permaslug (e.g., "openai/gpt-4.1-2025-04-14")
   */
  public val modelPermaslug: String,
  /**
   * Total prompt tokens used
   */
  public val promptTokens: Int,
  /**
   * Name of the provider serving this endpoint
   */
  public val providerName: String,
  /**
   * Total reasoning tokens used
   */
  public val reasoningTokens: Int,
  /**
   * Number of requests made
   */
  public val requests: Int,
  /**
   * Total cost in USD (OpenRouter credits spent)
   */
  public val usage: Double,
) {
  public class Builder {
    private var byokUsageInferenceValue: Double? = null

    public var byokUsageInference: Double
      get() = requireNotNull(byokUsageInferenceValue) { "byokUsageInference is required" }
      set(`value`) {
        byokUsageInferenceValue = value
      }

    private var completionTokensValue: Int? = null

    public var completionTokens: Int
      get() = requireNotNull(completionTokensValue) { "completionTokens is required" }
      set(`value`) {
        completionTokensValue = value
      }

    private var dateValue: String? = null

    public var date: String
      get() = requireNotNull(dateValue) { "date is required" }
      set(`value`) {
        dateValue = value
      }

    private var endpointIdValue: String? = null

    public var endpointId: String
      get() = requireNotNull(endpointIdValue) { "endpointId is required" }
      set(`value`) {
        endpointIdValue = value
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var modelPermaslugValue: String? = null

    public var modelPermaslug: String
      get() = requireNotNull(modelPermaslugValue) { "modelPermaslug is required" }
      set(`value`) {
        modelPermaslugValue = value
      }

    private var promptTokensValue: Int? = null

    public var promptTokens: Int
      get() = requireNotNull(promptTokensValue) { "promptTokens is required" }
      set(`value`) {
        promptTokensValue = value
      }

    private var providerNameValue: String? = null

    public var providerName: String
      get() = requireNotNull(providerNameValue) { "providerName is required" }
      set(`value`) {
        providerNameValue = value
      }

    private var reasoningTokensValue: Int? = null

    public var reasoningTokens: Int
      get() = requireNotNull(reasoningTokensValue) { "reasoningTokens is required" }
      set(`value`) {
        reasoningTokensValue = value
      }

    private var requestsValue: Int? = null

    public var requests: Int
      get() = requireNotNull(requestsValue) { "requests is required" }
      set(`value`) {
        requestsValue = value
      }

    private var usageValue: Double? = null

    public var usage: Double
      get() = requireNotNull(usageValue) { "usage is required" }
      set(`value`) {
        usageValue = value
      }

    public fun build(): ActivityItem {
      check(byokUsageInferenceValue != null) { "byokUsageInference is required" }
      check(completionTokensValue != null) { "completionTokens is required" }
      check(dateValue != null) { "date is required" }
      check(endpointIdValue != null) { "endpointId is required" }
      check(modelValue != null) { "model is required" }
      check(modelPermaslugValue != null) { "modelPermaslug is required" }
      check(promptTokensValue != null) { "promptTokens is required" }
      check(providerNameValue != null) { "providerName is required" }
      check(reasoningTokensValue != null) { "reasoningTokens is required" }
      check(requestsValue != null) { "requests is required" }
      check(usageValue != null) { "usage is required" }
      return ActivityItem(
        byokUsageInference = byokUsageInference,
        completionTokens = completionTokens,
        date = date,
        endpointId = endpointId,
        model = model,
        modelPermaslug = modelPermaslug,
        promptTokens = promptTokens,
        providerName = providerName,
        reasoningTokens = reasoningTokens,
        requests = requests,
        usage = usage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActivityItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ActivityItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActivityItem {
      val jsonDecoder = decoder.requireJsonDecoder("ActivityItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ActivityItem must be a JSON object")
      val byokUsageInference = json.decodeRequired<Double>(raw, "byok_usage_inference")
      val completionTokens = json.decodeRequired<Int>(raw, "completion_tokens")
      val date = json.decodeRequired<String>(raw, "date")
      val endpointId = json.decodeRequired<String>(raw, "endpoint_id")
      val model = json.decodeRequired<String>(raw, "model")
      val modelPermaslug = json.decodeRequired<String>(raw, "model_permaslug")
      val promptTokens = json.decodeRequired<Int>(raw, "prompt_tokens")
      val providerName = json.decodeRequired<String>(raw, "provider_name")
      val reasoningTokens = json.decodeRequired<Int>(raw, "reasoning_tokens")
      val requests = json.decodeRequired<Int>(raw, "requests")
      val usage = json.decodeRequired<Double>(raw, "usage")
      return ActivityItem(
        byokUsageInference = byokUsageInference,
        completionTokens = completionTokens,
        date = date,
        endpointId = endpointId,
        model = model,
        modelPermaslug = modelPermaslug,
        promptTokens = promptTokens,
        providerName = providerName,
        reasoningTokens = reasoningTokens,
        requests = requests,
        usage = usage,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActivityItem) {
      val jsonEncoder = encoder.requireJsonEncoder("ActivityItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("byok_usage_inference", json.encodeToJsonElement(value.byokUsageInference))
        put("completion_tokens", json.encodeToJsonElement(value.completionTokens))
        put("date", value.date)
        put("endpoint_id", value.endpointId)
        put("model", value.model)
        put("model_permaslug", value.modelPermaslug)
        put("prompt_tokens", json.encodeToJsonElement(value.promptTokens))
        put("provider_name", value.providerName)
        put("reasoning_tokens", json.encodeToJsonElement(value.reasoningTokens))
        put("requests", json.encodeToJsonElement(value.requests))
        put("usage", json.encodeToJsonElement(value.usage))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun activityItem(block: ActivityItem.Builder.() -> Unit): ActivityItem = ActivityItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActivityItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
