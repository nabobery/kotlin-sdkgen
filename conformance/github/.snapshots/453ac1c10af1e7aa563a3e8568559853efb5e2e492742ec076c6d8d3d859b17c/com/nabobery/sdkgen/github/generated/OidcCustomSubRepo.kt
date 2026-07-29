package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Actions OIDC subject customization for a repository
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/oidc-custom-sub-repo
 */
@Serializable(with = OidcCustomSubRepo.Serializer::class)
public class OidcCustomSubRepo(
  /**
   * Whether to use the default template or not. If `true`, the `include_claim_keys` field is ignored.
   */
  public val useDefault: Boolean,
  includeClaimKeys: List<String>? = null,
  /**
   * The current `sub` claim prefix for this repository.
   */
  public val subClaimPrefix: String? = null,
  /**
   * Whether the repository has opted in to the immutable OIDC subject claim format. When `true`, OIDC tokens will use a
   * stable, repository-ID-based `sub` claim. If not set at the repository level, falls back to the organization-level
   * setting.
   */
  public val useImmutableSubject: Boolean? = null,
) {
  /**
   * Array of unique strings. Each claim key can only contain alphanumeric characters and underscores.
   */
  public val includeClaimKeys: List<String>? =
      includeClaimKeys?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var useDefaultValue: Boolean? = null

    public var useDefault: Boolean
      get() = requireNotNull(useDefaultValue) { "useDefault is required" }
      set(`value`) {
        useDefaultValue = value
      }

    private var includeClaimKeysValue: List<String>? = null

    /**
     * Array of unique strings. Each claim key can only contain alphanumeric characters and underscores.
     */
    public var includeClaimKeys: List<String>?
      get() = includeClaimKeysValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        includeClaimKeysValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The current `sub` claim prefix for this repository.
     */
    public var subClaimPrefix: String? = null

    /**
     * Whether the repository has opted in to the immutable OIDC subject claim format. When `true`, OIDC tokens will use
     * a stable, repository-ID-based `sub` claim. If not set at the repository level, falls back to the
     * organization-level setting.
     */
    public var useImmutableSubject: Boolean? = null

    public fun build(): OidcCustomSubRepo {
      check(useDefaultValue != null) { "useDefault is required" }
      return OidcCustomSubRepo(
        useDefault = useDefault,
        includeClaimKeys = includeClaimKeys,
        subClaimPrefix = subClaimPrefix,
        useImmutableSubject = useImmutableSubject,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OidcCustomSubRepo = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OidcCustomSubRepo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OidcCustomSubRepo {
      val jsonDecoder = decoder.requireJsonDecoder("OidcCustomSubRepo")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OidcCustomSubRepo must be a JSON object")
      val useDefault = json.decodeRequired<Boolean>(rawObject, "use_default")
      return OidcCustomSubRepo(
        useDefault = useDefault,
        includeClaimKeys = rawObject["include_claim_keys"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        subClaimPrefix = rawObject["sub_claim_prefix"]?.let { json.decodeFromJsonElement<String>(it) },
        useImmutableSubject = rawObject["use_immutable_subject"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OidcCustomSubRepo) {
      val jsonEncoder = encoder.requireJsonEncoder("OidcCustomSubRepo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("use_default", json.encodeToJsonElement(value.useDefault))
        value.includeClaimKeys?.let { put("include_claim_keys", json.encodeToJsonElement(it)) }
        value.subClaimPrefix?.let { put("sub_claim_prefix", it) }
        value.useImmutableSubject?.let { put("use_immutable_subject", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun oidcCustomSubRepo(block: OidcCustomSubRepo.Builder.() -> Unit): OidcCustomSubRepo = OidcCustomSubRepo.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OidcCustomSubRepo is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
