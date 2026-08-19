package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/GetBYOKKeyResponse/properties/data.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GetBYOKKeyResponse/properties/data
 */
@Serializable(with = InlineGetByokKeyResponseDataX59c22991.Serializer::class)
public class InlineGetByokKeyResponseDataX59c22991 internal constructor(
  allowedApiKeyHashes: List<String>?,
  allowedModels: List<String>?,
  allowedUserIds: List<String>?,
  /**
   * ISO timestamp of when the credential was created.
   */
  public val createdAt: String,
  /**
   * Whether this credential is currently disabled.
   */
  public val disabled: Boolean,
  /**
   * Stable public identifier for this BYOK credential.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val id: String,
  /**
   * Whether this credential is treated as a fallback — used only after non-fallback keys for the same provider have
   * been tried.
   */
  public val isFallback: Boolean,
  /**
   * Short masked snippet of the key (e.g. the first/last few characters) used to identify it in the UI.
   */
  public val label: String,
  public val provider: ByokProviderSlug,
  /**
   * Position within the provider — credentials are tried in ascending sort order.
   */
  public val sortOrder: Int,
  /**
   * ID of the workspace this credential belongs to.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val workspaceId: String,
  private val nameState: FieldState<String?>,
) {
  /**
   * Optional allowlist of OpenRouter API key hashes (`api_keys.hash`) that may use this credential. `null` means no
   * restriction.
   */
  public val allowedApiKeyHashes: List<String>? =
      allowedApiKeyHashes?.let { collection0 -> collection0.toList() }

  /**
   * Optional allowlist of model slugs this credential may be used for. `null` means no restriction.
   */
  public val allowedModels: List<String>? =
      allowedModels?.let { collection0 -> collection0.toList() }

  /**
   * Optional allowlist of user IDs that may use this credential. `null` means no restriction.
   */
  public val allowedUserIds: List<String>? =
      allowedUserIds?.let { collection0 -> collection0.toList() }

  /**
   * Optional human-readable name for the credential.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  public constructor(
    allowedApiKeyHashes: List<String>?,
    allowedModels: List<String>?,
    allowedUserIds: List<String>?,
    createdAt: String,
    disabled: Boolean,
    id: String,
    isFallback: Boolean,
    label: String,
    provider: ByokProviderSlug,
    sortOrder: Int,
    workspaceId: String,
  ) : this(allowedApiKeyHashes = allowedApiKeyHashes,
  allowedModels = allowedModels,
  allowedUserIds = allowedUserIds,
  createdAt = createdAt,
  disabled = disabled,
  id = id,
  isFallback = isFallback,
  label = label,
  provider = provider,
  sortOrder = sortOrder,
  workspaceId = workspaceId,
  nameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var disabledValue: Boolean? = null

    public var disabled: Boolean
      get() = requireNotNull(disabledValue) { "disabled is required" }
      set(`value`) {
        disabledValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var isFallbackValue: Boolean? = null

    public var isFallback: Boolean
      get() = requireNotNull(isFallbackValue) { "isFallback is required" }
      set(`value`) {
        isFallbackValue = value
      }

    private var labelValue: String? = null

    public var label: String
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
      }

    private var providerValue: ByokProviderSlug? = null

    public var provider: ByokProviderSlug
      get() = requireNotNull(providerValue) { "provider is required" }
      set(`value`) {
        providerValue = value
      }

    private var sortOrderValue: Int? = null

    public var sortOrder: Int
      get() = requireNotNull(sortOrderValue) { "sortOrder is required" }
      set(`value`) {
        sortOrderValue = value
      }

    private var workspaceIdValue: String? = null

    public var workspaceId: String
      get() = requireNotNull(workspaceIdValue) { "workspaceId is required" }
      set(`value`) {
        workspaceIdValue = value
      }

    private var allowedApiKeyHashesState: FieldState<List<String>?> = FieldState.Absent

    /**
     * Optional allowlist of OpenRouter API key hashes (`api_keys.hash`) that may use this credential. `null` means no
     * restriction.
     * Required nullable field; assigning `null` records present-null.
     */
    public var allowedApiKeyHashes: List<String>?
      get() = allowedApiKeyHashesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedApiKeyHashesState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var allowedModelsState: FieldState<List<String>?> = FieldState.Absent

    /**
     * Optional allowlist of model slugs this credential may be used for. `null` means no restriction.
     * Required nullable field; assigning `null` records present-null.
     */
    public var allowedModels: List<String>?
      get() = allowedModelsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedModelsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var allowedUserIdsState: FieldState<List<String>?> = FieldState.Absent

    /**
     * Optional allowlist of user IDs that may use this credential. `null` means no restriction.
     * Required nullable field; assigning `null` records present-null.
     */
    public var allowedUserIds: List<String>?
      get() = allowedUserIdsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedUserIdsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * Optional human-readable name for the credential.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    public fun build(): InlineGetByokKeyResponseDataX59c22991 {
      check(createdAtValue != null) { "createdAt is required" }
      check(disabledValue != null) { "disabled is required" }
      check(idValue != null) { "id is required" }
      check(isFallbackValue != null) { "isFallback is required" }
      check(labelValue != null) { "label is required" }
      check(providerValue != null) { "provider is required" }
      check(sortOrderValue != null) { "sortOrder is required" }
      check(workspaceIdValue != null) { "workspaceId is required" }
      check(allowedApiKeyHashesState !== FieldState.Absent) { "allowedApiKeyHashes is required, even when null" }
      check(allowedModelsState !== FieldState.Absent) { "allowedModels is required, even when null" }
      check(allowedUserIdsState !== FieldState.Absent) { "allowedUserIds is required, even when null" }
      return InlineGetByokKeyResponseDataX59c22991(
        allowedApiKeyHashes = allowedApiKeyHashesState.valueOrNull(),
        allowedModels = allowedModelsState.valueOrNull(),
        allowedUserIds = allowedUserIdsState.valueOrNull(),
        createdAt = createdAt,
        disabled = disabled,
        id = id,
        isFallback = isFallback,
        label = label,
        provider = provider,
        sortOrder = sortOrder,
        workspaceId = workspaceId,
        nameState = nameState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGetByokKeyResponseDataX59c22991 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGetByokKeyResponseDataX59c22991> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGetByokKeyResponseDataX59c22991 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGetByokKeyResponseDataX59c22991")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGetByokKeyResponseDataX59c22991 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val disabled = json.decodeRequired<Boolean>(rawObject, "disabled")
      val id = json.decodeRequired<String>(rawObject, "id")
      val isFallback = json.decodeRequired<Boolean>(rawObject, "is_fallback")
      val label = json.decodeRequired<String>(rawObject, "label")
      val provider = json.decodeRequired<ByokProviderSlug>(rawObject, "provider")
      val sortOrder = json.decodeRequired<Int>(rawObject, "sort_order")
      val workspaceId = json.decodeRequired<String>(rawObject, "workspace_id")
      if (!rawObject.containsKey("allowed_api_key_hashes")) {
        throw SerializationException("InlineGetByokKeyResponseDataX59c22991 is missing required property 'allowed_api_key_hashes'")
      }
      val allowedApiKeyHashes = rawObject["allowed_api_key_hashes"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("allowed_models")) {
        throw SerializationException("InlineGetByokKeyResponseDataX59c22991 is missing required property 'allowed_models'")
      }
      val allowedModels = rawObject["allowed_models"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("allowed_user_ids")) {
        throw SerializationException("InlineGetByokKeyResponseDataX59c22991 is missing required property 'allowed_user_ids'")
      }
      val allowedUserIds = rawObject["allowed_user_ids"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(requireNotNull(element)) }
      return InlineGetByokKeyResponseDataX59c22991(
        allowedApiKeyHashes = allowedApiKeyHashes,
        allowedModels = allowedModels,
        allowedUserIds = allowedUserIds,
        createdAt = createdAt,
        disabled = disabled,
        id = id,
        isFallback = isFallback,
        label = label,
        provider = provider,
        sortOrder = sortOrder,
        workspaceId = workspaceId,
        nameState = json.decodeOptional(rawObject, "name", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGetByokKeyResponseDataX59c22991) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGetByokKeyResponseDataX59c22991")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("allowed_api_key_hashes", value.allowedApiKeyHashes?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("allowed_models", value.allowedModels?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("allowed_user_ids", value.allowedUserIds?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("disabled", json.encodeToJsonElement(value.disabled))
        put("id", value.id)
        put("is_fallback", json.encodeToJsonElement(value.isFallback))
        put("label", value.label)
        put("provider", json.encodeToJsonElement(value.provider))
        put("sort_order", json.encodeToJsonElement(value.sortOrder))
        put("workspace_id", value.workspaceId)
        putState("name", value.nameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGetByokKeyResponseDataX59c22991(block: InlineGetByokKeyResponseDataX59c22991.Builder.() -> Unit): InlineGetByokKeyResponseDataX59c22991 = InlineGetByokKeyResponseDataX59c22991.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGetByokKeyResponseDataX59c22991 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
    if (!nullable) throw SerializationException("InlineGetByokKeyResponseDataX59c22991 property '" + name + "' is not nullable")
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
