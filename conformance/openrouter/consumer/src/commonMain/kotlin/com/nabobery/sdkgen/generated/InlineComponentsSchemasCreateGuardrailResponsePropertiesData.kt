package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/CreateGuardrailResponse/properties/data.
 */
@Serializable(with = InlineComponentsSchemasCreateGuardrailResponsePropertiesData.Serializer::class)
public class InlineComponentsSchemasCreateGuardrailResponsePropertiesData(
  /**
   * ISO 8601 timestamp of when the guardrail was created
   */
  public val createdAt: String,
  /**
   * Unique identifier for the guardrail
   */
  public val id: String,
  /**
   * Name of the guardrail
   */
  public val name: String,
  /**
   * The workspace ID this guardrail belongs to.
   */
  public val workspaceId: String,
  /**
   * Array of model canonical_slugs (immutable identifiers)
   */
  public val allowedModels: List<String>? = null,
  /**
   * List of allowed provider IDs
   */
  public val allowedProviders: List<String>? = null,
  /**
   * Builtin content filters applied to requests. Includes PII detectors and the regex-based prompt injection detector.
   */
  public val contentFilterBuiltins: List<ContentFilterBuiltinEntry>? = null,
  /**
   * Custom regex content filters applied to request messages
   */
  public val contentFilters: List<ContentFilterEntry>? = null,
  /**
   * Description of the guardrail
   */
  public val description: String? = null,
  /**
   * Deprecated. Use enforce_zdr_anthropic, enforce_zdr_openai, enforce_zdr_google, enforce_zdr_xai, and
   * enforce_zdr_other instead. When provided, its value is copied into any of those per-provider fields that are not
   * explicitly specified on the request.
   */
  public val enforceZdr: Boolean? = null,
  /**
   * Whether to enforce zero data retention for Anthropic models. Falls back to enforce_zdr when not provided.
   */
  public val enforceZdrAnthropic: Boolean? = null,
  /**
   * Whether to enforce zero data retention for Google models. Falls back to enforce_zdr when not provided.
   */
  public val enforceZdrGoogle: Boolean? = null,
  /**
   * Whether to enforce zero data retention for OpenAI models. Falls back to enforce_zdr when not provided.
   */
  public val enforceZdrOpenai: Boolean? = null,
  /**
   * Whether to enforce zero data retention for models that are not from Anthropic, OpenAI, Google, or xAI. Falls back
   * to enforce_zdr when not provided.
   */
  public val enforceZdrOther: Boolean? = null,
  /**
   * Whether to enforce zero data retention for xAI models. Falls back to enforce_zdr when not provided.
   */
  public val enforceZdrXai: Boolean? = null,
  /**
   * Array of model canonical_slugs to exclude from routing
   */
  public val ignoredModels: List<String>? = null,
  /**
   * List of provider IDs to exclude from routing
   */
  public val ignoredProviders: List<String>? = null,
  /**
   * Spending limit in USD
   */
  public val limitUsd: Double? = null,
  public val resetInterval: GuardrailInterval? = null,
  /**
   * ISO 8601 timestamp of when the guardrail was last updated
   */
  public val updatedAt: String? = null,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var workspaceIdValue: String? = null

    public var workspaceId: String
      get() = requireNotNull(workspaceIdValue) { "workspaceId is required" }
      set(`value`) {
        workspaceIdValue = value
      }

    /**
     * Array of model canonical_slugs (immutable identifiers)
     */
    public var allowedModels: List<String>? = null

    /**
     * List of allowed provider IDs
     */
    public var allowedProviders: List<String>? = null

    /**
     * Builtin content filters applied to requests. Includes PII detectors and the regex-based prompt injection
     * detector.
     */
    public var contentFilterBuiltins: List<ContentFilterBuiltinEntry>? = null

    /**
     * Custom regex content filters applied to request messages
     */
    public var contentFilters: List<ContentFilterEntry>? = null

    /**
     * Description of the guardrail
     */
    public var description: String? = null

    /**
     * Deprecated. Use enforce_zdr_anthropic, enforce_zdr_openai, enforce_zdr_google, enforce_zdr_xai, and
     * enforce_zdr_other instead. When provided, its value is copied into any of those per-provider fields that are not
     * explicitly specified on the request.
     */
    public var enforceZdr: Boolean? = null

    /**
     * Whether to enforce zero data retention for Anthropic models. Falls back to enforce_zdr when not provided.
     */
    public var enforceZdrAnthropic: Boolean? = null

    /**
     * Whether to enforce zero data retention for Google models. Falls back to enforce_zdr when not provided.
     */
    public var enforceZdrGoogle: Boolean? = null

    /**
     * Whether to enforce zero data retention for OpenAI models. Falls back to enforce_zdr when not provided.
     */
    public var enforceZdrOpenai: Boolean? = null

    /**
     * Whether to enforce zero data retention for models that are not from Anthropic, OpenAI, Google, or xAI. Falls back
     * to enforce_zdr when not provided.
     */
    public var enforceZdrOther: Boolean? = null

    /**
     * Whether to enforce zero data retention for xAI models. Falls back to enforce_zdr when not provided.
     */
    public var enforceZdrXai: Boolean? = null

    /**
     * Array of model canonical_slugs to exclude from routing
     */
    public var ignoredModels: List<String>? = null

    /**
     * List of provider IDs to exclude from routing
     */
    public var ignoredProviders: List<String>? = null

    /**
     * Spending limit in USD
     */
    public var limitUsd: Double? = null

    public var resetInterval: GuardrailInterval? = null

    /**
     * ISO 8601 timestamp of when the guardrail was last updated
     */
    public var updatedAt: String? = null

    public fun build(): InlineComponentsSchemasCreateGuardrailResponsePropertiesData {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(workspaceIdValue != null) { "workspaceId is required" }
      return InlineComponentsSchemasCreateGuardrailResponsePropertiesData(
        createdAt = createdAt,
        id = id,
        name = name,
        workspaceId = workspaceId,
        allowedModels = allowedModels,
        allowedProviders = allowedProviders,
        contentFilterBuiltins = contentFilterBuiltins,
        contentFilters = contentFilters,
        description = description,
        enforceZdr = enforceZdr,
        enforceZdrAnthropic = enforceZdrAnthropic,
        enforceZdrGoogle = enforceZdrGoogle,
        enforceZdrOpenai = enforceZdrOpenai,
        enforceZdrOther = enforceZdrOther,
        enforceZdrXai = enforceZdrXai,
        ignoredModels = ignoredModels,
        ignoredProviders = ignoredProviders,
        limitUsd = limitUsd,
        resetInterval = resetInterval,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasCreateGuardrailResponsePropertiesData =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCreateGuardrailResponsePropertiesData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCreateGuardrailResponsePropertiesData {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasCreateGuardrailResponsePropertiesData")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasCreateGuardrailResponsePropertiesData must be a JSON " +
          "object")
      val createdAt = json.decodeRequired<String>(raw, "created_at")
      val id = json.decodeRequired<String>(raw, "id")
      val name = json.decodeRequired<String>(raw, "name")
      val workspaceId = json.decodeRequired<String>(raw, "workspace_id")
      return InlineComponentsSchemasCreateGuardrailResponsePropertiesData(
        createdAt = createdAt,
        id = id,
        name = name,
        workspaceId = workspaceId,
        allowedModels = raw["allowed_models"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<String>?>(element) },
        allowedProviders = raw["allowed_providers"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<String>?>(element) },
        contentFilterBuiltins = raw["content_filter_builtins"]?.let { element ->
          if (element == JsonNull) null else json.decodeFromJsonElement<List<ContentFilterBuiltinEntry>?>(element) },
        contentFilters = raw["content_filters"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<ContentFilterEntry>?>(element) },
        description = raw["description"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        enforceZdr = raw["enforce_zdr"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        enforceZdrAnthropic = raw["enforce_zdr_anthropic"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        enforceZdrGoogle = raw["enforce_zdr_google"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        enforceZdrOpenai = raw["enforce_zdr_openai"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        enforceZdrOther = raw["enforce_zdr_other"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        enforceZdrXai = raw["enforce_zdr_xai"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        ignoredModels = raw["ignored_models"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<String>?>(element) },
        ignoredProviders = raw["ignored_providers"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<String>?>(element) },
        limitUsd = raw["limit_usd"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        resetInterval = raw["reset_interval"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<GuardrailInterval?>(element) },
        updatedAt = raw["updated_at"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasCreateGuardrailResponsePropertiesData) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasCreateGuardrailResponsePropertiesData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", value.id)
        put("name", value.name)
        put("workspace_id", value.workspaceId)
        value.allowedModels?.let { put("allowed_models", json.encodeToJsonElement(it)) }
        value.allowedProviders?.let { put("allowed_providers", json.encodeToJsonElement(it)) }
        value.contentFilterBuiltins?.let { put("content_filter_builtins", json.encodeToJsonElement(it)) }
        value.contentFilters?.let { put("content_filters", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.enforceZdr?.let { put("enforce_zdr", json.encodeToJsonElement(it)) }
        value.enforceZdrAnthropic?.let { put("enforce_zdr_anthropic", json.encodeToJsonElement(it)) }
        value.enforceZdrGoogle?.let { put("enforce_zdr_google", json.encodeToJsonElement(it)) }
        value.enforceZdrOpenai?.let { put("enforce_zdr_openai", json.encodeToJsonElement(it)) }
        value.enforceZdrOther?.let { put("enforce_zdr_other", json.encodeToJsonElement(it)) }
        value.enforceZdrXai?.let { put("enforce_zdr_xai", json.encodeToJsonElement(it)) }
        value.ignoredModels?.let { put("ignored_models", json.encodeToJsonElement(it)) }
        value.ignoredProviders?.let { put("ignored_providers", json.encodeToJsonElement(it)) }
        value.limitUsd?.let { put("limit_usd", json.encodeToJsonElement(it)) }
        value.resetInterval?.let { put("reset_interval", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasCreateGuardrailResponsePropertiesData(block: InlineComponentsSchemasCreateGuardrailResponsePropertiesData.Builder.() -> Unit): InlineComponentsSchemasCreateGuardrailResponsePropertiesData = InlineComponentsSchemasCreateGuardrailResponsePropertiesData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasCreateGuardrailResponsePropertiesData is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
