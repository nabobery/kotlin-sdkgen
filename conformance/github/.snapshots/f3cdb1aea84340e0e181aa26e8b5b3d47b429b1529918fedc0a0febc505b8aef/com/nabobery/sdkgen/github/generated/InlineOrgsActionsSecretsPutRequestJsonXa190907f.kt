package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1secrets~1{secret_name}/put/requestBody/content/applicatio
 * n~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1secrets~1{secret_name}/put/requestBody/content/applicatio
 * n~1json/schema
 */
@Serializable(with = InlineOrgsActionsSecretsPutRequestJsonXa190907f.Serializer::class)
public class InlineOrgsActionsSecretsPutRequestJsonXa190907f(
  /**
   * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages)
   * using the public key retrieved from the [Get an organization public
   * key](https://docs.github.com/rest/actions/secrets#get-an-organization-public-key) endpoint.
   */
  public val encryptedValue: String,
  /**
   * ID of the key you used to encrypt the secret.
   */
  public val keyId: String,
  /**
   * Which type of organization repositories have access to the organization secret. `selected` means only the
   * repositories specified by `selected_repository_ids` can access the secret.
   */
  public val visibility: InlineOrgsActionsSecretsPutRequestJsonVisibilityX2dfadc63,
  selectedRepositoryIds: List<Int>? = null,
) {
  /**
   * An array of repository ids that can access the organization secret. You can only provide a list of repository ids
   * when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List
   * selected repositories for an organization
   * secret](https://docs.github.com/rest/actions/secrets#list-selected-repositories-for-an-organization-secret), [Set
   * selected repositories for an organization
   * secret](https://docs.github.com/rest/actions/secrets#set-selected-repositories-for-an-organization-secret), and
   * [Remove selected repository from an organization
   * secret](https://docs.github.com/rest/actions/secrets#remove-selected-repository-from-an-organization-secret)
   * endpoints.
   */
  public val selectedRepositoryIds: List<Int>? =
      selectedRepositoryIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var encryptedValueValue: String? = null

    public var encryptedValue: String
      get() = requireNotNull(encryptedValueValue) { "encryptedValue is required" }
      set(`value`) {
        encryptedValueValue = value
      }

    private var keyIdValue: String? = null

    public var keyId: String
      get() = requireNotNull(keyIdValue) { "keyId is required" }
      set(`value`) {
        keyIdValue = value
      }

    private var visibilityValue: InlineOrgsActionsSecretsPutRequestJsonVisibilityX2dfadc63? = null

    public var visibility: InlineOrgsActionsSecretsPutRequestJsonVisibilityX2dfadc63
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    private var selectedRepositoryIdsValue: List<Int>? = null

    /**
     * An array of repository ids that can access the organization secret. You can only provide a list of repository ids
     * when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List
     * selected repositories for an organization
     * secret](https://docs.github.com/rest/actions/secrets#list-selected-repositories-for-an-organization-secret), [Set
     * selected repositories for an organization
     * secret](https://docs.github.com/rest/actions/secrets#set-selected-repositories-for-an-organization-secret), and
     * [Remove selected repository from an organization
     * secret](https://docs.github.com/rest/actions/secrets#remove-selected-repository-from-an-organization-secret)
     * endpoints.
     */
    public var selectedRepositoryIds: List<Int>?
      get() = selectedRepositoryIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        selectedRepositoryIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsActionsSecretsPutRequestJsonXa190907f {
      check(encryptedValueValue != null) { "encryptedValue is required" }
      check(keyIdValue != null) { "keyId is required" }
      check(visibilityValue != null) { "visibility is required" }
      return InlineOrgsActionsSecretsPutRequestJsonXa190907f(
        encryptedValue = encryptedValue,
        keyId = keyId,
        visibility = visibility,
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsSecretsPutRequestJsonXa190907f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsSecretsPutRequestJsonXa190907f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsSecretsPutRequestJsonXa190907f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsSecretsPutRequestJsonXa190907f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsSecretsPutRequestJsonXa190907f must be a JSON object")
      val encryptedValue = json.decodeRequired<String>(rawObject, "encrypted_value")
      val keyId = json.decodeRequired<String>(rawObject, "key_id")
      val visibility = json.decodeRequired<InlineOrgsActionsSecretsPutRequestJsonVisibilityX2dfadc63>(rawObject, "visibility")
      return InlineOrgsActionsSecretsPutRequestJsonXa190907f(
        encryptedValue = encryptedValue,
        keyId = keyId,
        visibility = visibility,
        selectedRepositoryIds = rawObject["selected_repository_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsSecretsPutRequestJsonXa190907f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsSecretsPutRequestJsonXa190907f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("encrypted_value", value.encryptedValue)
        put("key_id", value.keyId)
        put("visibility", json.encodeToJsonElement(value.visibility))
        value.selectedRepositoryIds?.let { put("selected_repository_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsSecretsPutRequestJsonXa190907f(block: InlineOrgsActionsSecretsPutRequestJsonXa190907f.Builder.() -> Unit): InlineOrgsActionsSecretsPutRequestJsonXa190907f = InlineOrgsActionsSecretsPutRequestJsonXa190907f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsSecretsPutRequestJsonXa190907f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
