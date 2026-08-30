package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Reasoning effort configuration. Omitted for non-reasoning models and dynamic router models.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ModelReasoning
 */
@Serializable(with = ModelReasoning.Serializer::class)
public class ModelReasoning(
  /**
   * When true, reasoning cannot be disabled and effort "none" is rejected.
   */
  public val mandatory: Boolean,
  public val defaultEffort: ReasoningEffort? = null,
  /**
   * Default reasoning enabled state when the client does not set `reasoning.enabled`.
   */
  public val defaultEnabled: Boolean? = null,
  supportedEfforts: List<ReasoningEffort?>? = null,
  /**
   * Present and `true` when the model accepts `reasoning.max_tokens` in requests (Anthropic-style) instead of or in
   * addition to `reasoning.effort`. Omitted otherwise.
   */
  public val supportsMaxTokens: Boolean? = null,
) {
  /**
   * Allowed reasoning effort values for this model, in descending effort order (highest first). Null means no allowlist
   * — all gateway effort values are accepted.
   */
  public val supportedEfforts: List<ReasoningEffort?>? =
      supportedEfforts?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var mandatoryValue: Boolean? = null

    public var mandatory: Boolean
      get() = requireNotNull(mandatoryValue) { "mandatory is required" }
      set(`value`) {
        mandatoryValue = value
      }

    public var defaultEffort: ReasoningEffort? = null

    /**
     * Default reasoning enabled state when the client does not set `reasoning.enabled`.
     */
    public var defaultEnabled: Boolean? = null

    private var supportedEffortsValue: List<ReasoningEffort?>? = null

    /**
     * Allowed reasoning effort values for this model, in descending effort order (highest first). Null means no
     * allowlist — all gateway effort values are accepted.
     */
    public var supportedEfforts: List<ReasoningEffort?>?
      get() = supportedEffortsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        supportedEffortsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Present and `true` when the model accepts `reasoning.max_tokens` in requests (Anthropic-style) instead of or in
     * addition to `reasoning.effort`. Omitted otherwise.
     */
    public var supportsMaxTokens: Boolean? = null

    public fun build(): ModelReasoning {
      check(mandatoryValue != null) { "mandatory is required" }
      return ModelReasoning(
        mandatory = mandatory,
        defaultEffort = defaultEffort,
        defaultEnabled = defaultEnabled,
        supportedEfforts = supportedEfforts,
        supportsMaxTokens = supportsMaxTokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ModelReasoning = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ModelReasoning> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ModelReasoning {
      val jsonDecoder = decoder.requireJsonDecoder("ModelReasoning")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ModelReasoning must be a JSON object")
      val mandatory = json.decodeRequired<Boolean>(rawObject, "mandatory")
      return ModelReasoning(
        mandatory = mandatory,
        defaultEffort = rawObject["default_effort"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ReasoningEffort?>(element) },
        defaultEnabled = rawObject["default_enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        supportedEfforts = rawObject["supported_efforts"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<ReasoningEffort?>?>(element) },
        supportsMaxTokens = rawObject["supports_max_tokens"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ModelReasoning) {
      val jsonEncoder = encoder.requireJsonEncoder("ModelReasoning")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("mandatory", json.encodeToJsonElement(value.mandatory))
        value.defaultEffort?.let { put("default_effort", json.encodeToJsonElement(it)) }
        value.defaultEnabled?.let { put("default_enabled", json.encodeToJsonElement(it)) }
        value.supportedEfforts?.let { put("supported_efforts", json.encodeToJsonElement(it)) }
        value.supportsMaxTokens?.let { put("supports_max_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun modelReasoning(block: ModelReasoning.Builder.() -> Unit): ModelReasoning = ModelReasoning.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ModelReasoning is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
