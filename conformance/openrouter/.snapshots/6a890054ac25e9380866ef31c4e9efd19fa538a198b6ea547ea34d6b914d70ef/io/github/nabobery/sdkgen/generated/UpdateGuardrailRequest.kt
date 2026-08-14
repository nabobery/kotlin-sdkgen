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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UpdateGuardrailRequest.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UpdateGuardrailRequest
 */
@Serializable(with = UpdateGuardrailRequest.Serializer::class)
public class UpdateGuardrailRequest internal constructor(
  allowedModelsState: FieldState<List<String>?>,
  allowedProvidersState: FieldState<List<String>?>,
  contentFilterBuiltinsState: FieldState<List<ContentFilterBuiltinEntryInput>?>,
  contentFiltersState: FieldState<List<ContentFilterEntry>?>,
  private val descriptionState: FieldState<String?>,
  private val enforceZdrState: FieldState<Boolean?>,
  private val enforceZdrAnthropicState: FieldState<Boolean?>,
  private val enforceZdrGoogleState: FieldState<Boolean?>,
  private val enforceZdrOpenaiState: FieldState<Boolean?>,
  private val enforceZdrOtherState: FieldState<Boolean?>,
  private val enforceZdrXaiState: FieldState<Boolean?>,
  ignoredModelsState: FieldState<List<String>?>,
  ignoredProvidersState: FieldState<List<String>?>,
  private val limitUsdState: FieldState<Double?>,
  private val nameState: FieldState<String>,
  private val resetIntervalState: FieldState<GuardrailInterval?>,
) {
  private val allowedModelsState: FieldState<List<String>?> =
      allowedModelsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val allowedProvidersState: FieldState<List<String>?> =
      allowedProvidersState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val contentFilterBuiltinsState: FieldState<List<ContentFilterBuiltinEntryInput>?> =
      contentFilterBuiltinsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val contentFiltersState: FieldState<List<ContentFilterEntry>?> =
      contentFiltersState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val ignoredModelsState: FieldState<List<String>?> =
      ignoredModelsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val ignoredProvidersState: FieldState<List<String>?> =
      ignoredProvidersState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  /**
   * Array of model identifiers (slug or canonical_slug accepted)
   */
  public val allowedModels: List<String>?
    get() = allowedModelsState.valueOrNull()

  /**
   * New list of allowed provider IDs
   */
  public val allowedProviders: List<String>?
    get() = allowedProvidersState.valueOrNull()

  /**
   * Builtin content filters to apply. Set to null to remove. The "flag" action is only supported for
   * "regex-prompt-injection"; PII slugs (email, phone, ssn, credit-card, ip-address, person-name, address) accept
   * "block" or "redact" only.
   */
  public val contentFilterBuiltins: List<ContentFilterBuiltinEntryInput>?
    get() = contentFilterBuiltinsState.valueOrNull()

  /**
   * Custom regex content filters to apply. Set to null to remove.
   */
  public val contentFilters: List<ContentFilterEntry>?
    get() = contentFiltersState.valueOrNull()

  /**
   * New description for the guardrail
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * Deprecated. Use enforce_zdr_anthropic, enforce_zdr_openai, enforce_zdr_google, enforce_zdr_xai, and
   * enforce_zdr_other instead. When provided, its value is copied into any of those per-provider fields that are not
   * explicitly specified on the request.
   */
  public val enforceZdr: Boolean?
    get() = enforceZdrState.valueOrNull()

  /**
   * Whether to enforce zero data retention for Anthropic models. Falls back to enforce_zdr when not provided.
   */
  public val enforceZdrAnthropic: Boolean?
    get() = enforceZdrAnthropicState.valueOrNull()

  /**
   * Whether to enforce zero data retention for Google models. Falls back to enforce_zdr when not provided.
   */
  public val enforceZdrGoogle: Boolean?
    get() = enforceZdrGoogleState.valueOrNull()

  /**
   * Whether to enforce zero data retention for OpenAI models. Falls back to enforce_zdr when not provided.
   */
  public val enforceZdrOpenai: Boolean?
    get() = enforceZdrOpenaiState.valueOrNull()

  /**
   * Whether to enforce zero data retention for models that are not from Anthropic, OpenAI, Google, or xAI. Falls back
   * to enforce_zdr when not provided.
   */
  public val enforceZdrOther: Boolean?
    get() = enforceZdrOtherState.valueOrNull()

  /**
   * Whether to enforce zero data retention for xAI models. Falls back to enforce_zdr when not provided.
   */
  public val enforceZdrXai: Boolean?
    get() = enforceZdrXaiState.valueOrNull()

  /**
   * Array of model identifiers to exclude from routing (slug or canonical_slug accepted)
   */
  public val ignoredModels: List<String>?
    get() = ignoredModelsState.valueOrNull()

  /**
   * List of provider IDs to exclude from routing
   */
  public val ignoredProviders: List<String>?
    get() = ignoredProvidersState.valueOrNull()

  /**
   * New spending limit in USD
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val limitUsd: Double?
    get() = limitUsdState.valueOrNull()

  /**
   * New name for the guardrail
   */
  public val name: String?
    get() = nameState.valueOrNull()

  public val resetInterval: GuardrailInterval?
    get() = resetIntervalState.valueOrNull()

  public constructor() : this(allowedModelsState = FieldState.Absent,
  allowedProvidersState = FieldState.Absent,
  contentFilterBuiltinsState = FieldState.Absent,
  contentFiltersState = FieldState.Absent,
  descriptionState = FieldState.Absent,
  enforceZdrState = FieldState.Absent,
  enforceZdrAnthropicState = FieldState.Absent,
  enforceZdrGoogleState = FieldState.Absent,
  enforceZdrOpenaiState = FieldState.Absent,
  enforceZdrOtherState = FieldState.Absent,
  enforceZdrXaiState = FieldState.Absent,
  ignoredModelsState = FieldState.Absent,
  ignoredProvidersState = FieldState.Absent,
  limitUsdState = FieldState.Absent,
  nameState = FieldState.Absent,
  resetIntervalState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `allowed_models`.
   */
  public fun allowedModelsPresence(): FieldPresence = allowedModelsState.presence

  /**
   * Returns the wire presence of `allowed_providers`.
   */
  public fun allowedProvidersPresence(): FieldPresence = allowedProvidersState.presence

  /**
   * Returns the wire presence of `content_filter_builtins`.
   */
  public fun contentFilterBuiltinsPresence(): FieldPresence = contentFilterBuiltinsState.presence

  /**
   * Returns the wire presence of `content_filters`.
   */
  public fun contentFiltersPresence(): FieldPresence = contentFiltersState.presence

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `enforce_zdr`.
   */
  public fun enforceZdrPresence(): FieldPresence = enforceZdrState.presence

  /**
   * Returns the wire presence of `enforce_zdr_anthropic`.
   */
  public fun enforceZdrAnthropicPresence(): FieldPresence = enforceZdrAnthropicState.presence

  /**
   * Returns the wire presence of `enforce_zdr_google`.
   */
  public fun enforceZdrGooglePresence(): FieldPresence = enforceZdrGoogleState.presence

  /**
   * Returns the wire presence of `enforce_zdr_openai`.
   */
  public fun enforceZdrOpenaiPresence(): FieldPresence = enforceZdrOpenaiState.presence

  /**
   * Returns the wire presence of `enforce_zdr_other`.
   */
  public fun enforceZdrOtherPresence(): FieldPresence = enforceZdrOtherState.presence

  /**
   * Returns the wire presence of `enforce_zdr_xai`.
   */
  public fun enforceZdrXaiPresence(): FieldPresence = enforceZdrXaiState.presence

  /**
   * Returns the wire presence of `ignored_models`.
   */
  public fun ignoredModelsPresence(): FieldPresence = ignoredModelsState.presence

  /**
   * Returns the wire presence of `ignored_providers`.
   */
  public fun ignoredProvidersPresence(): FieldPresence = ignoredProvidersState.presence

  /**
   * Returns the wire presence of `limit_usd`.
   */
  public fun limitUsdPresence(): FieldPresence = limitUsdState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `reset_interval`.
   */
  public fun resetIntervalPresence(): FieldPresence = resetIntervalState.presence

  public class Builder {
    private var allowedModelsState: FieldState<List<String>?> = FieldState.Absent

    /**
     * Array of model identifiers (slug or canonical_slug accepted)
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var allowedModels: List<String>?
      get() = allowedModelsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedModelsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var allowedProvidersState: FieldState<List<String>?> = FieldState.Absent

    /**
     * New list of allowed provider IDs
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var allowedProviders: List<String>?
      get() = allowedProvidersState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedProvidersState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var contentFilterBuiltinsState: FieldState<List<ContentFilterBuiltinEntryInput>?> =
        FieldState.Absent

    /**
     * Builtin content filters to apply. Set to null to remove. The "flag" action is only supported for
     * "regex-prompt-injection"; PII slugs (email, phone, ssn, credit-card, ip-address, person-name, address) accept
     * "block" or "redact" only.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var contentFilterBuiltins: List<ContentFilterBuiltinEntryInput>?
      get() = contentFilterBuiltinsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        contentFilterBuiltinsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var contentFiltersState: FieldState<List<ContentFilterEntry>?> = FieldState.Absent

    /**
     * Custom regex content filters to apply. Set to null to remove.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var contentFilters: List<ContentFilterEntry>?
      get() = contentFiltersState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        contentFiltersState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * New description for the guardrail
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var enforceZdrState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Deprecated. Use enforce_zdr_anthropic, enforce_zdr_openai, enforce_zdr_google, enforce_zdr_xai, and
     * enforce_zdr_other instead. When provided, its value is copied into any of those per-provider fields that are not
     * explicitly specified on the request.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var enforceZdr: Boolean?
      get() = enforceZdrState.valueOrNull()
      set(`value`) {
        enforceZdrState = value.toNullableFieldState()
      }

    private var enforceZdrAnthropicState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Whether to enforce zero data retention for Anthropic models. Falls back to enforce_zdr when not provided.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var enforceZdrAnthropic: Boolean?
      get() = enforceZdrAnthropicState.valueOrNull()
      set(`value`) {
        enforceZdrAnthropicState = value.toNullableFieldState()
      }

    private var enforceZdrGoogleState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Whether to enforce zero data retention for Google models. Falls back to enforce_zdr when not provided.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var enforceZdrGoogle: Boolean?
      get() = enforceZdrGoogleState.valueOrNull()
      set(`value`) {
        enforceZdrGoogleState = value.toNullableFieldState()
      }

    private var enforceZdrOpenaiState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Whether to enforce zero data retention for OpenAI models. Falls back to enforce_zdr when not provided.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var enforceZdrOpenai: Boolean?
      get() = enforceZdrOpenaiState.valueOrNull()
      set(`value`) {
        enforceZdrOpenaiState = value.toNullableFieldState()
      }

    private var enforceZdrOtherState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Whether to enforce zero data retention for models that are not from Anthropic, OpenAI, Google, or xAI. Falls back
     * to enforce_zdr when not provided.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var enforceZdrOther: Boolean?
      get() = enforceZdrOtherState.valueOrNull()
      set(`value`) {
        enforceZdrOtherState = value.toNullableFieldState()
      }

    private var enforceZdrXaiState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Whether to enforce zero data retention for xAI models. Falls back to enforce_zdr when not provided.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var enforceZdrXai: Boolean?
      get() = enforceZdrXaiState.valueOrNull()
      set(`value`) {
        enforceZdrXaiState = value.toNullableFieldState()
      }

    private var ignoredModelsState: FieldState<List<String>?> = FieldState.Absent

    /**
     * Array of model identifiers to exclude from routing (slug or canonical_slug accepted)
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var ignoredModels: List<String>?
      get() = ignoredModelsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        ignoredModelsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var ignoredProvidersState: FieldState<List<String>?> = FieldState.Absent

    /**
     * List of provider IDs to exclude from routing
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var ignoredProviders: List<String>?
      get() = ignoredProvidersState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        ignoredProvidersState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var limitUsdState: FieldState<Double?> = FieldState.Absent

    /**
     * New spending limit in USD
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var limitUsd: Double?
      get() = limitUsdState.valueOrNull()
      set(`value`) {
        limitUsdState = value.toNullableFieldState()
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * New name for the guardrail
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var resetIntervalState: FieldState<GuardrailInterval?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var resetInterval: GuardrailInterval?
      get() = resetIntervalState.valueOrNull()
      set(`value`) {
        resetIntervalState = value.toNullableFieldState()
      }

    /**
     * Omits `allowed_models` from serialized output.
     */
    public fun unsetAllowedModels() {
      allowedModelsState = FieldState.Absent
    }

    /**
     * Omits `allowed_providers` from serialized output.
     */
    public fun unsetAllowedProviders() {
      allowedProvidersState = FieldState.Absent
    }

    /**
     * Omits `content_filter_builtins` from serialized output.
     */
    public fun unsetContentFilterBuiltins() {
      contentFilterBuiltinsState = FieldState.Absent
    }

    /**
     * Omits `content_filters` from serialized output.
     */
    public fun unsetContentFilters() {
      contentFiltersState = FieldState.Absent
    }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `enforce_zdr` from serialized output.
     */
    public fun unsetEnforceZdr() {
      enforceZdrState = FieldState.Absent
    }

    /**
     * Omits `enforce_zdr_anthropic` from serialized output.
     */
    public fun unsetEnforceZdrAnthropic() {
      enforceZdrAnthropicState = FieldState.Absent
    }

    /**
     * Omits `enforce_zdr_google` from serialized output.
     */
    public fun unsetEnforceZdrGoogle() {
      enforceZdrGoogleState = FieldState.Absent
    }

    /**
     * Omits `enforce_zdr_openai` from serialized output.
     */
    public fun unsetEnforceZdrOpenai() {
      enforceZdrOpenaiState = FieldState.Absent
    }

    /**
     * Omits `enforce_zdr_other` from serialized output.
     */
    public fun unsetEnforceZdrOther() {
      enforceZdrOtherState = FieldState.Absent
    }

    /**
     * Omits `enforce_zdr_xai` from serialized output.
     */
    public fun unsetEnforceZdrXai() {
      enforceZdrXaiState = FieldState.Absent
    }

    /**
     * Omits `ignored_models` from serialized output.
     */
    public fun unsetIgnoredModels() {
      ignoredModelsState = FieldState.Absent
    }

    /**
     * Omits `ignored_providers` from serialized output.
     */
    public fun unsetIgnoredProviders() {
      ignoredProvidersState = FieldState.Absent
    }

    /**
     * Omits `limit_usd` from serialized output.
     */
    public fun unsetLimitUsd() {
      limitUsdState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `reset_interval` from serialized output.
     */
    public fun unsetResetInterval() {
      resetIntervalState = FieldState.Absent
    }

    public fun build(): UpdateGuardrailRequest = UpdateGuardrailRequest(
      allowedModelsState = allowedModelsState,
      allowedProvidersState = allowedProvidersState,
      contentFilterBuiltinsState = contentFilterBuiltinsState,
      contentFiltersState = contentFiltersState,
      descriptionState = descriptionState,
      enforceZdrState = enforceZdrState,
      enforceZdrAnthropicState = enforceZdrAnthropicState,
      enforceZdrGoogleState = enforceZdrGoogleState,
      enforceZdrOpenaiState = enforceZdrOpenaiState,
      enforceZdrOtherState = enforceZdrOtherState,
      enforceZdrXaiState = enforceZdrXaiState,
      ignoredModelsState = ignoredModelsState,
      ignoredProvidersState = ignoredProvidersState,
      limitUsdState = limitUsdState,
      nameState = nameState,
      resetIntervalState = resetIntervalState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UpdateGuardrailRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UpdateGuardrailRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UpdateGuardrailRequest {
      val jsonDecoder = decoder.requireJsonDecoder("UpdateGuardrailRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UpdateGuardrailRequest must be a JSON object")
      return UpdateGuardrailRequest(
        allowedModelsState = json.decodeOptional(rawObject, "allowed_models", nullable = true),
        allowedProvidersState = json.decodeOptional(rawObject, "allowed_providers", nullable = true),
        contentFilterBuiltinsState = json.decodeOptional(rawObject, "content_filter_builtins", nullable = true),
        contentFiltersState = json.decodeOptional(rawObject, "content_filters", nullable = true),
        descriptionState = json.decodeOptional(rawObject, "description", nullable = true),
        enforceZdrState = json.decodeOptional(rawObject, "enforce_zdr", nullable = true),
        enforceZdrAnthropicState = json.decodeOptional(rawObject, "enforce_zdr_anthropic", nullable = true),
        enforceZdrGoogleState = json.decodeOptional(rawObject, "enforce_zdr_google", nullable = true),
        enforceZdrOpenaiState = json.decodeOptional(rawObject, "enforce_zdr_openai", nullable = true),
        enforceZdrOtherState = json.decodeOptional(rawObject, "enforce_zdr_other", nullable = true),
        enforceZdrXaiState = json.decodeOptional(rawObject, "enforce_zdr_xai", nullable = true),
        ignoredModelsState = json.decodeOptional(rawObject, "ignored_models", nullable = true),
        ignoredProvidersState = json.decodeOptional(rawObject, "ignored_providers", nullable = true),
        limitUsdState = json.decodeOptional(rawObject, "limit_usd", nullable = true),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        resetIntervalState = json.decodeOptional(rawObject, "reset_interval", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: UpdateGuardrailRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("UpdateGuardrailRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("allowed_models", value.allowedModelsState, json::encodeToJsonElement)
        putState("allowed_providers", value.allowedProvidersState, json::encodeToJsonElement)
        putState("content_filter_builtins", value.contentFilterBuiltinsState, json::encodeToJsonElement)
        putState("content_filters", value.contentFiltersState, json::encodeToJsonElement)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("enforce_zdr", value.enforceZdrState, json::encodeToJsonElement)
        putState("enforce_zdr_anthropic", value.enforceZdrAnthropicState, json::encodeToJsonElement)
        putState("enforce_zdr_google", value.enforceZdrGoogleState, json::encodeToJsonElement)
        putState("enforce_zdr_openai", value.enforceZdrOpenaiState, json::encodeToJsonElement)
        putState("enforce_zdr_other", value.enforceZdrOtherState, json::encodeToJsonElement)
        putState("enforce_zdr_xai", value.enforceZdrXaiState, json::encodeToJsonElement)
        putState("ignored_models", value.ignoredModelsState, json::encodeToJsonElement)
        putState("ignored_providers", value.ignoredProvidersState, json::encodeToJsonElement)
        putState("limit_usd", value.limitUsdState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("reset_interval", value.resetIntervalState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun updateGuardrailRequest(block: UpdateGuardrailRequest.Builder.() -> Unit): UpdateGuardrailRequest = UpdateGuardrailRequest.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("UpdateGuardrailRequest property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
