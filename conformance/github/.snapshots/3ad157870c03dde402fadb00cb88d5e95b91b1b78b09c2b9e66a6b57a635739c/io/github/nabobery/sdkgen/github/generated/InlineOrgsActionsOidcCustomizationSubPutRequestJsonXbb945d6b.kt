package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Actions OIDC Subject customization
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1oidc~1customization~1sub/put/requestBody/content/applicat
 * ion~1json/schema
 */
@Serializable(with = InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b.Serializer::class)
public class InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b(
  includeClaimKeys: List<String>? = null,
  /**
   * Whether to opt in to the immutable OIDC subject claim format for the organization. When `true`, new OIDC tokens
   * will use a stable, repository-ID-based `sub` claim instead of the name-based format.
   */
  public val useImmutableSubject: Boolean? = null,
) {
  /**
   * Array of unique strings. Each claim key can only contain alphanumeric characters and underscores.
   */
  public val includeClaimKeys: List<String>? =
      includeClaimKeys?.let { collection0 -> collection0.toList() }

  public class Builder {
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
     * Whether to opt in to the immutable OIDC subject claim format for the organization. When `true`, new OIDC tokens
     * will use a stable, repository-ID-based `sub` claim instead of the name-based format.
     */
    public var useImmutableSubject: Boolean? = null

    public fun build(): InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b = InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b(
      includeClaimKeys = includeClaimKeys,
      useImmutableSubject = useImmutableSubject,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b must be a JSON object")
      return InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b(
        includeClaimKeys = rawObject["include_claim_keys"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        useImmutableSubject = rawObject["use_immutable_subject"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.includeClaimKeys?.let { put("include_claim_keys", json.encodeToJsonElement(it)) }
        value.useImmutableSubject?.let { put("use_immutable_subject", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b(block: InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b.Builder.() -> Unit): InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b = InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b.build(block)
