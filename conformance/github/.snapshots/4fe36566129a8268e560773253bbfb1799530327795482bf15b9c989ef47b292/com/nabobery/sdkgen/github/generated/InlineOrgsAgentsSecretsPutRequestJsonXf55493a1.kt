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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1secrets~1{secret_name}/put/requestBody/content/application
 * ~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1secrets~1{secret_name}/put/requestBody/content/application
 * ~1json/schema
 */
@Serializable(with = InlineOrgsAgentsSecretsPutRequestJsonXf55493a1.Serializer::class)
public class InlineOrgsAgentsSecretsPutRequestJsonXf55493a1(
  /**
   * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages)
   * using the public key retrieved from the [Get an organization public
   * key](https://docs.github.com/rest/agents/secrets#get-an-organization-public-key) endpoint.
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
  public val visibility: InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a,
  selectedRepositoryIds: List<Int>? = null,
) {
  /**
   * An array of repository ids that can access the organization secret. You can only provide a list of repository ids
   * when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List
   * selected repositories for an organization
   * secret](https://docs.github.com/rest/agents/secrets#list-selected-repositories-for-an-organization-secret), [Set
   * selected repositories for an organization
   * secret](https://docs.github.com/rest/agents/secrets#set-selected-repositories-for-an-organization-secret), and
   * [Remove selected repository from an organization
   * secret](https://docs.github.com/rest/agents/secrets#remove-selected-repository-from-an-organization-secret)
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

    private var visibilityValue: InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a? = null

    public var visibility: InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    private var selectedRepositoryIdsValue: List<Int>? = null

    /**
     * An array of repository ids that can access the organization secret. You can only provide a list of repository ids
     * when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List
     * selected repositories for an organization
     * secret](https://docs.github.com/rest/agents/secrets#list-selected-repositories-for-an-organization-secret), [Set
     * selected repositories for an organization
     * secret](https://docs.github.com/rest/agents/secrets#set-selected-repositories-for-an-organization-secret), and
     * [Remove selected repository from an organization
     * secret](https://docs.github.com/rest/agents/secrets#remove-selected-repository-from-an-organization-secret)
     * endpoints.
     */
    public var selectedRepositoryIds: List<Int>?
      get() = selectedRepositoryIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        selectedRepositoryIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsAgentsSecretsPutRequestJsonXf55493a1 {
      check(encryptedValueValue != null) { "encryptedValue is required" }
      check(keyIdValue != null) { "keyId is required" }
      check(visibilityValue != null) { "visibility is required" }
      return InlineOrgsAgentsSecretsPutRequestJsonXf55493a1(
        encryptedValue = encryptedValue,
        keyId = keyId,
        visibility = visibility,
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAgentsSecretsPutRequestJsonXf55493a1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsAgentsSecretsPutRequestJsonXf55493a1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAgentsSecretsPutRequestJsonXf55493a1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAgentsSecretsPutRequestJsonXf55493a1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAgentsSecretsPutRequestJsonXf55493a1 must be a JSON object")
      val encryptedValue = json.decodeRequired<String>(rawObject, "encrypted_value")
      val keyId = json.decodeRequired<String>(rawObject, "key_id")
      val visibility = json.decodeRequired<InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a>(rawObject, "visibility")
      return InlineOrgsAgentsSecretsPutRequestJsonXf55493a1(
        encryptedValue = encryptedValue,
        keyId = keyId,
        visibility = visibility,
        selectedRepositoryIds = rawObject["selected_repository_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAgentsSecretsPutRequestJsonXf55493a1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAgentsSecretsPutRequestJsonXf55493a1")
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

public fun inlineOrgsAgentsSecretsPutRequestJsonXf55493a1(block: InlineOrgsAgentsSecretsPutRequestJsonXf55493a1.Builder.() -> Unit): InlineOrgsAgentsSecretsPutRequestJsonXf55493a1 = InlineOrgsAgentsSecretsPutRequestJsonXf55493a1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsAgentsSecretsPutRequestJsonXf55493a1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
