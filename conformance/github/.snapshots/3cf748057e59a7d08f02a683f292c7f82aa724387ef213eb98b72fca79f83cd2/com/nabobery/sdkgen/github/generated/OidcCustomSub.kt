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
 * Actions OIDC Subject customization
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/oidc-custom-sub
 */
@Serializable(with = OidcCustomSub.Serializer::class)
public class OidcCustomSub(
  includeClaimKeys: List<String>,
  /**
   * Whether to opt in to the immutable OIDC subject claim format for the organization. When `true`, new OIDC tokens
   * will use a stable, repository-ID-based `sub` claim instead of the name-based format.
   */
  public val useImmutableSubject: Boolean? = null,
) {
  /**
   * Array of unique strings. Each claim key can only contain alphanumeric characters and underscores.
   */
  public val includeClaimKeys: List<String> = includeClaimKeys.toList()

  public class Builder {
    private var includeClaimKeysValue: List<String>? = null

    public var includeClaimKeys: List<String>
      get() = requireNotNull(includeClaimKeysValue) { "includeClaimKeys is required" }
      set(`value`) {
        includeClaimKeysValue = value
      }

    /**
     * Whether to opt in to the immutable OIDC subject claim format for the organization. When `true`, new OIDC tokens
     * will use a stable, repository-ID-based `sub` claim instead of the name-based format.
     */
    public var useImmutableSubject: Boolean? = null

    public fun build(): OidcCustomSub {
      check(includeClaimKeysValue != null) { "includeClaimKeys is required" }
      return OidcCustomSub(
        includeClaimKeys = includeClaimKeys,
        useImmutableSubject = useImmutableSubject,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OidcCustomSub = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OidcCustomSub> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OidcCustomSub {
      val jsonDecoder = decoder.requireJsonDecoder("OidcCustomSub")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OidcCustomSub must be a JSON object")
      val includeClaimKeys = json.decodeRequired<List<String>>(rawObject, "include_claim_keys")
      return OidcCustomSub(
        includeClaimKeys = includeClaimKeys,
        useImmutableSubject = rawObject["use_immutable_subject"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OidcCustomSub) {
      val jsonEncoder = encoder.requireJsonEncoder("OidcCustomSub")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("include_claim_keys", json.encodeToJsonElement(value.includeClaimKeys))
        value.useImmutableSubject?.let { put("use_immutable_subject", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun oidcCustomSub(block: OidcCustomSub.Builder.() -> Unit): OidcCustomSub = OidcCustomSub.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OidcCustomSub is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
