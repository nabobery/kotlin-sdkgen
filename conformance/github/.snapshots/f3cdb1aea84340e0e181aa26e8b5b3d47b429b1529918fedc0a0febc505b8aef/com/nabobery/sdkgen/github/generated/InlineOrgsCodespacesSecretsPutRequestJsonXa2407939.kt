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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1secrets~1{secret_name}/put/requestBody/content/applica
 * tion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1secrets~1{secret_name}/put/requestBody/content/applica
 * tion~1json/schema
 */
@Serializable(with = InlineOrgsCodespacesSecretsPutRequestJsonXa2407939.Serializer::class)
public class InlineOrgsCodespacesSecretsPutRequestJsonXa2407939(
  /**
   * Which type of organization repositories have access to the organization secret. `selected` means only the
   * repositories specified by `selected_repository_ids` can access the secret.
   */
  public val visibility: InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb,
  /**
   * The value for your secret, encrypted with
   * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the
   * [Get an organization public
   * key](https://docs.github.com/rest/codespaces/organization-secrets#get-an-organization-public-key) endpoint.
   */
  public val encryptedValue: String? = null,
  /**
   * The ID of the key you used to encrypt the secret.
   */
  public val keyId: String? = null,
  selectedRepositoryIds: List<Int>? = null,
) {
  /**
   * An array of repository IDs that can access the organization secret. You can only provide a list of repository IDs
   * when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List
   * selected repositories for an organization
   * secret](https://docs.github.com/rest/codespaces/organization-secrets#list-selected-repositories-for-an-organization
   * -secret), [Set selected repositories for an organization
   * secret](https://docs.github.com/rest/codespaces/organization-secrets#set-selected-repositories-for-an-organization-
   * secret), and [Remove selected repository from an organization
   * secret](https://docs.github.com/rest/codespaces/organization-secrets#remove-selected-repository-from-an-organizatio
   * n-secret) endpoints.
   */
  public val selectedRepositoryIds: List<Int>? =
      selectedRepositoryIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var visibilityValue: InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb? =
        null

    public var visibility: InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    /**
     * The value for your secret, encrypted with
     * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from
     * the [Get an organization public
     * key](https://docs.github.com/rest/codespaces/organization-secrets#get-an-organization-public-key) endpoint.
     */
    public var encryptedValue: String? = null

    /**
     * The ID of the key you used to encrypt the secret.
     */
    public var keyId: String? = null

    private var selectedRepositoryIdsValue: List<Int>? = null

    /**
     * An array of repository IDs that can access the organization secret. You can only provide a list of repository IDs
     * when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List
     * selected repositories for an organization
     * secret](https://docs.github.com/rest/codespaces/organization-secrets#list-selected-repositories-for-an-organizati
     * on-secret), [Set selected repositories for an organization
     * secret](https://docs.github.com/rest/codespaces/organization-secrets#set-selected-repositories-for-an-organizatio
     * n-secret), and [Remove selected repository from an organization
     * secret](https://docs.github.com/rest/codespaces/organization-secrets#remove-selected-repository-from-an-organizat
     * ion-secret) endpoints.
     */
    public var selectedRepositoryIds: List<Int>?
      get() = selectedRepositoryIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        selectedRepositoryIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsCodespacesSecretsPutRequestJsonXa2407939 {
      check(visibilityValue != null) { "visibility is required" }
      return InlineOrgsCodespacesSecretsPutRequestJsonXa2407939(
        visibility = visibility,
        encryptedValue = encryptedValue,
        keyId = keyId,
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodespacesSecretsPutRequestJsonXa2407939 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCodespacesSecretsPutRequestJsonXa2407939> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodespacesSecretsPutRequestJsonXa2407939 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodespacesSecretsPutRequestJsonXa2407939")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodespacesSecretsPutRequestJsonXa2407939 must be a JSON object")
      val visibility = json.decodeRequired<InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb>(rawObject, "visibility")
      return InlineOrgsCodespacesSecretsPutRequestJsonXa2407939(
        visibility = visibility,
        encryptedValue = rawObject["encrypted_value"]?.let { json.decodeFromJsonElement<String>(it) },
        keyId = rawObject["key_id"]?.let { json.decodeFromJsonElement<String>(it) },
        selectedRepositoryIds = rawObject["selected_repository_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodespacesSecretsPutRequestJsonXa2407939) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodespacesSecretsPutRequestJsonXa2407939")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("visibility", json.encodeToJsonElement(value.visibility))
        value.encryptedValue?.let { put("encrypted_value", it) }
        value.keyId?.let { put("key_id", it) }
        value.selectedRepositoryIds?.let { put("selected_repository_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodespacesSecretsPutRequestJsonXa2407939(block: InlineOrgsCodespacesSecretsPutRequestJsonXa2407939.Builder.() -> Unit): InlineOrgsCodespacesSecretsPutRequestJsonXa2407939 = InlineOrgsCodespacesSecretsPutRequestJsonXa2407939.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCodespacesSecretsPutRequestJsonXa2407939 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
