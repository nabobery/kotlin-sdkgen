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
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1oidc~1customization~1sub/put/requestBody/conte
 * nt/application~1json/schema
 */
@Serializable(with = InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263.Serializer::class)
public class InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263(
  /**
   * Whether to use the default template or not. If `true`, the `include_claim_keys` field is ignored.
   */
  public val useDefault: Boolean,
  /**
   * Array of unique strings. Each claim key can only contain alphanumeric characters and underscores.
   */
  public val includeClaimKeys: List<String>? = null,
  /**
   * Whether to opt in to the immutable OIDC subject claim format for this repository. When `true`, OIDC tokens will use
   * a stable, repository-ID-based `sub` claim.
   */
  public val useImmutableSubject: Boolean? = null,
) {
  public class Builder {
    private var useDefaultValue: Boolean? = null

    public var useDefault: Boolean
      get() = requireNotNull(useDefaultValue) { "useDefault is required" }
      set(`value`) {
        useDefaultValue = value
      }

    /**
     * Array of unique strings. Each claim key can only contain alphanumeric characters and underscores.
     */
    public var includeClaimKeys: List<String>? = null

    /**
     * Whether to opt in to the immutable OIDC subject claim format for this repository. When `true`, OIDC tokens will
     * use a stable, repository-ID-based `sub` claim.
     */
    public var useImmutableSubject: Boolean? = null

    public fun build(): InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263 {
      check(useDefaultValue != null) { "useDefault is required" }
      return InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263(
        useDefault = useDefault,
        includeClaimKeys = includeClaimKeys,
        useImmutableSubject = useImmutableSubject,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263 must be a JSON object")
      val useDefault = json.decodeRequired<Boolean>(rawObject, "use_default")
      return InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263(
        useDefault = useDefault,
        includeClaimKeys = rawObject["include_claim_keys"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        useImmutableSubject = rawObject["use_immutable_subject"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("use_default", json.encodeToJsonElement(value.useDefault))
        value.includeClaimKeys?.let { put("include_claim_keys", json.encodeToJsonElement(it)) }
        value.useImmutableSubject?.let { put("use_immutable_subject", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263(block: InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263.Builder.() -> Unit): InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263 = InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsOidcCustomizationSubPutRequestJsonX84b66263 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
