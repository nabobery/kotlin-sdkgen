package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/GetGuardrailResponse/properties/data.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GetGuardrailResponse/properties/data
 */
@Serializable(with = InlineGetGuardrailResponseDataXde16990e.Serializer::class)
public class InlineGetGuardrailResponseDataXde16990e(
  /**
   * ISO 8601 timestamp of when the guardrail was created
   */
  public val createdAt: String,
  /**
   * Unique identifier for the guardrail
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
  allowedModels: List<String>? = null,
  allowedProviders: List<String>? = null,
  contentFilterBuiltins: List<ContentFilterBuiltinEntry>? = null,
  contentFilters: List<ContentFilterEntry>? = null,
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
  ignoredModels: List<String>? = null,
  ignoredProviders: List<String>? = null,
  /**
   * Spending limit in USD
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val limitUsd: Double? = null,
  public val resetInterval: GuardrailInterval? = null,
  /**
   * ISO 8601 timestamp of when the guardrail was last updated
   */
  public val updatedAt: String? = null,
) {
  /**
   * Array of model canonical_slugs (immutable identifiers)
   */
  public val allowedModels: List<String>? =
      allowedModels?.let { collection0 -> collection0.toList() }

  /**
   * List of allowed provider IDs
   */
  public val allowedProviders: List<String>? =
      allowedProviders?.let { collection0 -> collection0.toList() }

  /**
   * Builtin content filters applied to requests. Includes PII detectors and the regex-based prompt injection detector.
   */
  public val contentFilterBuiltins: List<ContentFilterBuiltinEntry>? =
      contentFilterBuiltins?.let { collection0 -> collection0.toList() }

  /**
   * Custom regex content filters applied to request messages
   */
  public val contentFilters: List<ContentFilterEntry>? =
      contentFilters?.let { collection0 -> collection0.toList() }

  /**
   * Array of model canonical_slugs to exclude from routing
   */
  public val ignoredModels: List<String>? =
      ignoredModels?.let { collection0 -> collection0.toList() }

  /**
   * List of provider IDs to exclude from routing
   */
  public val ignoredProviders: List<String>? =
      ignoredProviders?.let { collection0 -> collection0.toList() }

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

    private var allowedModelsValue: List<String>? = null

    /**
     * Array of model canonical_slugs (immutable identifiers)
     */
    public var allowedModels: List<String>?
      get() = allowedModelsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedModelsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var allowedProvidersValue: List<String>? = null

    /**
     * List of allowed provider IDs
     */
    public var allowedProviders: List<String>?
      get() = allowedProvidersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedProvidersValue = value?.let { collection0 -> collection0.toList() }
      }

    private var contentFilterBuiltinsValue: List<ContentFilterBuiltinEntry>? = null

    /**
     * Builtin content filters applied to requests. Includes PII detectors and the regex-based prompt injection
     * detector.
     */
    public var contentFilterBuiltins: List<ContentFilterBuiltinEntry>?
      get() = contentFilterBuiltinsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        contentFilterBuiltinsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var contentFiltersValue: List<ContentFilterEntry>? = null

    /**
     * Custom regex content filters applied to request messages
     */
    public var contentFilters: List<ContentFilterEntry>?
      get() = contentFiltersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        contentFiltersValue = value?.let { collection0 -> collection0.toList() }
      }

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

    private var ignoredModelsValue: List<String>? = null

    /**
     * Array of model canonical_slugs to exclude from routing
     */
    public var ignoredModels: List<String>?
      get() = ignoredModelsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        ignoredModelsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var ignoredProvidersValue: List<String>? = null

    /**
     * List of provider IDs to exclude from routing
     */
    public var ignoredProviders: List<String>?
      get() = ignoredProvidersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        ignoredProvidersValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Spending limit in USD
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var limitUsd: Double? = null

    public var resetInterval: GuardrailInterval? = null

    /**
     * ISO 8601 timestamp of when the guardrail was last updated
     */
    public var updatedAt: String? = null

    public fun build(): InlineGetGuardrailResponseDataXde16990e {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(workspaceIdValue != null) { "workspaceId is required" }
      return InlineGetGuardrailResponseDataXde16990e(
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
    public fun build(block: Builder.() -> Unit): InlineGetGuardrailResponseDataXde16990e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGetGuardrailResponseDataXde16990e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGetGuardrailResponseDataXde16990e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGetGuardrailResponseDataXde16990e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGetGuardrailResponseDataXde16990e must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val workspaceId = json.decodeRequired<String>(rawObject, "workspace_id")
      return InlineGetGuardrailResponseDataXde16990e(
        createdAt = createdAt,
        id = id,
        name = name,
        workspaceId = workspaceId,
        allowedModels = rawObject["allowed_models"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        allowedProviders = rawObject["allowed_providers"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        contentFilterBuiltins = rawObject["content_filter_builtins"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<ContentFilterBuiltinEntry>?>(element) },
        contentFilters = rawObject["content_filters"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<ContentFilterEntry>?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        enforceZdr = rawObject["enforce_zdr"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        enforceZdrAnthropic = rawObject["enforce_zdr_anthropic"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        enforceZdrGoogle = rawObject["enforce_zdr_google"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        enforceZdrOpenai = rawObject["enforce_zdr_openai"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        enforceZdrOther = rawObject["enforce_zdr_other"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        enforceZdrXai = rawObject["enforce_zdr_xai"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        ignoredModels = rawObject["ignored_models"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        ignoredProviders = rawObject["ignored_providers"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        limitUsd = rawObject["limit_usd"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        resetInterval = rawObject["reset_interval"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<GuardrailInterval?>(element) },
        updatedAt = rawObject["updated_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGetGuardrailResponseDataXde16990e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGetGuardrailResponseDataXde16990e")
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

public fun inlineGetGuardrailResponseDataXde16990e(block: InlineGetGuardrailResponseDataXde16990e.Builder.() -> Unit): InlineGetGuardrailResponseDataXde16990e = InlineGetGuardrailResponseDataXde16990e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGetGuardrailResponseDataXde16990e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
