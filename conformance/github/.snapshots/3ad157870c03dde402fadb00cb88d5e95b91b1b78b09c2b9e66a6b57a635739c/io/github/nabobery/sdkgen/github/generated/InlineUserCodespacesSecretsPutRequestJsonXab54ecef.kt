package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1secrets~1{secret_name}/put/requestBody/content/application~1j
 * son/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1secrets~1{secret_name}/put/requestBody/content/application~1j
 * son/schema
 */
@Serializable(with = InlineUserCodespacesSecretsPutRequestJsonXab54ecef.Serializer::class)
public class InlineUserCodespacesSecretsPutRequestJsonXab54ecef(
  /**
   * ID of the key you used to encrypt the secret.
   */
  public val keyId: String,
  /**
   * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages)
   * using the public key retrieved from the [Get the public key for the authenticated
   * user](https://docs.github.com/rest/codespaces/secrets#get-public-key-for-the-authenticated-user) endpoint.
   */
  public val encryptedValue: String? = null,
  selectedRepositoryIds: List<InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e>? = null,
) {
  /**
   * An array of repository ids that can access the user secret. You can manage the list of selected repositories using
   * the [List selected repositories for a user
   * secret](https://docs.github.com/rest/codespaces/secrets#list-selected-repositories-for-a-user-secret), [Set
   * selected repositories for a user
   * secret](https://docs.github.com/rest/codespaces/secrets#set-selected-repositories-for-a-user-secret), and [Remove a
   * selected repository from a user
   * secret](https://docs.github.com/rest/codespaces/secrets#remove-a-selected-repository-from-a-user-secret) endpoints.
   */
  public val selectedRepositoryIds:
      List<InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e>? =
      selectedRepositoryIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var keyIdValue: String? = null

    public var keyId: String
      get() = requireNotNull(keyIdValue) { "keyId is required" }
      set(`value`) {
        keyIdValue = value
      }

    /**
     * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages)
     * using the public key retrieved from the [Get the public key for the authenticated
     * user](https://docs.github.com/rest/codespaces/secrets#get-public-key-for-the-authenticated-user) endpoint.
     */
    public var encryptedValue: String? = null

    private var selectedRepositoryIdsValue:
        List<InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e>? = null

    /**
     * An array of repository ids that can access the user secret. You can manage the list of selected repositories
     * using the [List selected repositories for a user
     * secret](https://docs.github.com/rest/codespaces/secrets#list-selected-repositories-for-a-user-secret), [Set
     * selected repositories for a user
     * secret](https://docs.github.com/rest/codespaces/secrets#set-selected-repositories-for-a-user-secret), and [Remove
     * a selected repository from a user
     * secret](https://docs.github.com/rest/codespaces/secrets#remove-a-selected-repository-from-a-user-secret)
     * endpoints.
     */
    public var selectedRepositoryIds:
        List<InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e>?
      get() = selectedRepositoryIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        selectedRepositoryIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineUserCodespacesSecretsPutRequestJsonXab54ecef {
      check(keyIdValue != null) { "keyId is required" }
      return InlineUserCodespacesSecretsPutRequestJsonXab54ecef(
        keyId = keyId,
        encryptedValue = encryptedValue,
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserCodespacesSecretsPutRequestJsonXab54ecef = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUserCodespacesSecretsPutRequestJsonXab54ecef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserCodespacesSecretsPutRequestJsonXab54ecef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserCodespacesSecretsPutRequestJsonXab54ecef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserCodespacesSecretsPutRequestJsonXab54ecef must be a JSON object")
      val keyId = json.decodeRequired<String>(rawObject, "key_id")
      return InlineUserCodespacesSecretsPutRequestJsonXab54ecef(
        keyId = keyId,
        encryptedValue = rawObject["encrypted_value"]?.let { json.decodeFromJsonElement<String>(it) },
        selectedRepositoryIds = rawObject["selected_repository_ids"]?.let { json.decodeFromJsonElement<List<InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserCodespacesSecretsPutRequestJsonXab54ecef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserCodespacesSecretsPutRequestJsonXab54ecef")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key_id", value.keyId)
        value.encryptedValue?.let { put("encrypted_value", it) }
        value.selectedRepositoryIds?.let { put("selected_repository_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserCodespacesSecretsPutRequestJsonXab54ecef(block: InlineUserCodespacesSecretsPutRequestJsonXab54ecef.Builder.() -> Unit): InlineUserCodespacesSecretsPutRequestJsonXab54ecef = InlineUserCodespacesSecretsPutRequestJsonXab54ecef.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserCodespacesSecretsPutRequestJsonXab54ecef is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
