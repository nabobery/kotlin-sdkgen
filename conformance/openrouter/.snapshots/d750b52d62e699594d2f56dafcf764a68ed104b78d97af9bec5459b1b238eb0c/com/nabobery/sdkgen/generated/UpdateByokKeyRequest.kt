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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UpdateBYOKKeyRequest.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UpdateBYOKKeyRequest
 */
@Serializable(with = UpdateByokKeyRequest.Serializer::class)
public class UpdateByokKeyRequest internal constructor(
  allowedModelsState: FieldState<List<String>?>,
  allowedUserIdsState: FieldState<List<String>?>,
  private val disabledState: FieldState<Boolean>,
  private val isFallbackState: FieldState<Boolean>,
  private val keyState: FieldState<String>,
  private val nameState: FieldState<String?>,
) {
  private val allowedModelsState: FieldState<List<String>?> =
      allowedModelsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val allowedUserIdsState: FieldState<List<String>?> =
      allowedUserIdsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  /**
   * Optional allowlist of model slugs this credential may be used for. `null` means no restriction.
   */
  public val allowedModels: List<String>?
    get() = allowedModelsState.valueOrNull()

  /**
   * Optional allowlist of user IDs that may use this credential. `null` means no restriction.
   */
  public val allowedUserIds: List<String>?
    get() = allowedUserIdsState.valueOrNull()

  /**
   * Whether this credential is disabled.
   */
  public val disabled: Boolean?
    get() = disabledState.valueOrNull()

  /**
   * Whether this credential is treated as a fallback — used only after non-fallback keys for the same provider have
   * been tried.
   */
  public val isFallback: Boolean?
    get() = isFallbackState.valueOrNull()

  /**
   * A new raw provider API key to rotate the credential in-place. The previous key material is overwritten and the
   * masked label is regenerated. Encrypted at rest and never returned in API responses.
   */
  public val key: String?
    get() = keyState.valueOrNull()

  /**
   * Optional human-readable name for the credential.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  public constructor() : this(allowedModelsState = FieldState.Absent,
  allowedUserIdsState = FieldState.Absent,
  disabledState = FieldState.Absent,
  isFallbackState = FieldState.Absent,
  keyState = FieldState.Absent,
  nameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `allowed_models`.
   */
  public fun allowedModelsPresence(): FieldPresence = allowedModelsState.presence

  /**
   * Returns the wire presence of `allowed_user_ids`.
   */
  public fun allowedUserIdsPresence(): FieldPresence = allowedUserIdsState.presence

  /**
   * Returns the wire presence of `disabled`.
   */
  public fun disabledPresence(): FieldPresence = disabledState.presence

  /**
   * Returns the wire presence of `is_fallback`.
   */
  public fun isFallbackPresence(): FieldPresence = isFallbackState.presence

  /**
   * Returns the wire presence of `key`.
   */
  public fun keyPresence(): FieldPresence = keyState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  public class Builder {
    private var allowedModelsState: FieldState<List<String>?> = FieldState.Absent

    /**
     * Optional allowlist of model slugs this credential may be used for. `null` means no restriction.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var allowedModels: List<String>?
      get() = allowedModelsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedModelsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var allowedUserIdsState: FieldState<List<String>?> = FieldState.Absent

    /**
     * Optional allowlist of user IDs that may use this credential. `null` means no restriction.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var allowedUserIds: List<String>?
      get() = allowedUserIdsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedUserIdsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var disabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether this credential is disabled.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var disabled: Boolean?
      get() = disabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "disabled is not nullable; call unsetDisabled() to omit it" }
        disabledState = FieldState.Value(present)
      }

    private var isFallbackState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether this credential is treated as a fallback — used only after non-fallback keys for the same provider have
     * been tried.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var isFallback: Boolean?
      get() = isFallbackState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "isFallback is not nullable; call unsetIsFallback() to omit it" }
        isFallbackState = FieldState.Value(present)
      }

    private var keyState: FieldState<String> = FieldState.Absent

    /**
     * A new raw provider API key to rotate the credential in-place. The previous key material is overwritten and the
     * masked label is regenerated. Encrypted at rest and never returned in API responses.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var key: String?
      get() = keyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "key is not nullable; call unsetKey() to omit it" }
        keyState = FieldState.Value(present)
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
     * Omits `allowed_models` from serialized output.
     */
    public fun unsetAllowedModels() {
      allowedModelsState = FieldState.Absent
    }

    /**
     * Omits `allowed_user_ids` from serialized output.
     */
    public fun unsetAllowedUserIds() {
      allowedUserIdsState = FieldState.Absent
    }

    /**
     * Omits `disabled` from serialized output.
     */
    public fun unsetDisabled() {
      disabledState = FieldState.Absent
    }

    /**
     * Omits `is_fallback` from serialized output.
     */
    public fun unsetIsFallback() {
      isFallbackState = FieldState.Absent
    }

    /**
     * Omits `key` from serialized output.
     */
    public fun unsetKey() {
      keyState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    public fun build(): UpdateByokKeyRequest = UpdateByokKeyRequest(
      allowedModelsState = allowedModelsState,
      allowedUserIdsState = allowedUserIdsState,
      disabledState = disabledState,
      isFallbackState = isFallbackState,
      keyState = keyState,
      nameState = nameState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UpdateByokKeyRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UpdateByokKeyRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UpdateByokKeyRequest {
      val jsonDecoder = decoder.requireJsonDecoder("UpdateByokKeyRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UpdateByokKeyRequest must be a JSON object")
      return UpdateByokKeyRequest(
        allowedModelsState = json.decodeOptional(rawObject, "allowed_models", nullable = true),
        allowedUserIdsState = json.decodeOptional(rawObject, "allowed_user_ids", nullable = true),
        disabledState = json.decodeOptional(rawObject, "disabled", nullable = false),
        isFallbackState = json.decodeOptional(rawObject, "is_fallback", nullable = false),
        keyState = json.decodeOptional(rawObject, "key", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: UpdateByokKeyRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("UpdateByokKeyRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("allowed_models", value.allowedModelsState, json::encodeToJsonElement)
        putState("allowed_user_ids", value.allowedUserIdsState, json::encodeToJsonElement)
        putState("disabled", value.disabledState, json::encodeToJsonElement)
        putState("is_fallback", value.isFallbackState, json::encodeToJsonElement)
        putState("key", value.keyState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun updateByokKeyRequest(block: UpdateByokKeyRequest.Builder.() -> Unit): UpdateByokKeyRequest = UpdateByokKeyRequest.build(block)

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
    if (!nullable) throw SerializationException("UpdateByokKeyRequest property '" + name + "' is not nullable")
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
