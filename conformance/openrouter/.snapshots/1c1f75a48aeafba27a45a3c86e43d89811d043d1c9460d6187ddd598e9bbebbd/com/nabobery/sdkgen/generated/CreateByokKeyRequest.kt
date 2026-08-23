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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/CreateBYOKKeyRequest.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CreateBYOKKeyRequest
 */
@Serializable(with = CreateByokKeyRequest.Serializer::class)
public class CreateByokKeyRequest(
  /**
   * The raw provider API key or credential. This value is encrypted at rest and never returned in API responses.
   */
  public val key: String,
  public val provider: ByokProviderSlug,
  allowedModels: List<String>? = null,
  allowedUserIds: List<String>? = null,
  /**
   * Whether this credential should be created in a disabled state.
   */
  public val disabled: Boolean? = null,
  /**
   * Whether this credential is treated as a fallback — used only after non-fallback keys for the same provider have
   * been tried.
   */
  public val isFallback: Boolean? = null,
  /**
   * Optional human-readable name for the credential.
   */
  public val name: String? = null,
  /**
   * Optional workspace ID. Defaults to the authenticated entity's default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val workspaceId: String? = null,
) {
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

  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var providerValue: ByokProviderSlug? = null

    public var provider: ByokProviderSlug
      get() = requireNotNull(providerValue) { "provider is required" }
      set(`value`) {
        providerValue = value
      }

    private var allowedModelsValue: List<String>? = null

    /**
     * Optional allowlist of model slugs this credential may be used for. `null` means no restriction.
     */
    public var allowedModels: List<String>?
      get() = allowedModelsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedModelsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var allowedUserIdsValue: List<String>? = null

    /**
     * Optional allowlist of user IDs that may use this credential. `null` means no restriction.
     */
    public var allowedUserIds: List<String>?
      get() = allowedUserIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedUserIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Whether this credential should be created in a disabled state.
     */
    public var disabled: Boolean? = null

    /**
     * Whether this credential is treated as a fallback — used only after non-fallback keys for the same provider have
     * been tried.
     */
    public var isFallback: Boolean? = null

    /**
     * Optional human-readable name for the credential.
     */
    public var name: String? = null

    /**
     * Optional workspace ID. Defaults to the authenticated entity's default workspace.
     *
     * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var workspaceId: String? = null

    public fun build(): CreateByokKeyRequest {
      check(keyValue != null) { "key is required" }
      check(providerValue != null) { "provider is required" }
      return CreateByokKeyRequest(
        key = key,
        provider = provider,
        allowedModels = allowedModels,
        allowedUserIds = allowedUserIds,
        disabled = disabled,
        isFallback = isFallback,
        name = name,
        workspaceId = workspaceId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreateByokKeyRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CreateByokKeyRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreateByokKeyRequest {
      val jsonDecoder = decoder.requireJsonDecoder("CreateByokKeyRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CreateByokKeyRequest must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val provider = json.decodeRequired<ByokProviderSlug>(rawObject, "provider")
      return CreateByokKeyRequest(
        key = key,
        provider = provider,
        allowedModels = rawObject["allowed_models"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        allowedUserIds = rawObject["allowed_user_ids"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        disabled = rawObject["disabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        isFallback = rawObject["is_fallback"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        workspaceId = rawObject["workspace_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreateByokKeyRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("CreateByokKeyRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        put("provider", json.encodeToJsonElement(value.provider))
        value.allowedModels?.let { put("allowed_models", json.encodeToJsonElement(it)) }
        value.allowedUserIds?.let { put("allowed_user_ids", json.encodeToJsonElement(it)) }
        value.disabled?.let { put("disabled", json.encodeToJsonElement(it)) }
        value.isFallback?.let { put("is_fallback", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.workspaceId?.let { put("workspace_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun createByokKeyRequest(block: CreateByokKeyRequest.Builder.() -> Unit): CreateByokKeyRequest = CreateByokKeyRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreateByokKeyRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
