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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1dependabot~1secrets~1{secret_name}/put/requestBody/content/applica
 * tion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1dependabot~1secrets~1{secret_name}/put/requestBody/content/applica
 * tion~1json/schema
 */
@Serializable(with = InlineOrgsDependabotSecretsPutRequestJsonXbdff5024.Serializer::class)
public class InlineOrgsDependabotSecretsPutRequestJsonXbdff5024(
  /**
   * Which type of organization repositories have access to the organization secret. `selected` means only the
   * repositories specified by `selected_repository_ids` can access the secret.
   */
  public val visibility: InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72,
  /**
   * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages)
   * using the public key retrieved from the [Get an organization public
   * key](https://docs.github.com/rest/dependabot/secrets#get-an-organization-public-key) endpoint.
   */
  public val encryptedValue: String? = null,
  /**
   * ID of the key you used to encrypt the secret.
   */
  public val keyId: String? = null,
  selectedRepositoryIds: List<InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711>? = null,
) {
  /**
   * An array of repository ids that can access the organization secret. You can only provide a list of repository ids
   * when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List
   * selected repositories for an organization
   * secret](https://docs.github.com/rest/dependabot/secrets#list-selected-repositories-for-an-organization-secret),
   * [Set selected repositories for an organization
   * secret](https://docs.github.com/rest/dependabot/secrets#set-selected-repositories-for-an-organization-secret), and
   * [Remove selected repository from an organization
   * secret](https://docs.github.com/rest/dependabot/secrets#remove-selected-repository-from-an-organization-secret)
   * endpoints.
   */
  public val selectedRepositoryIds:
      List<InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711>? =
      selectedRepositoryIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var visibilityValue: InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72? =
        null

    public var visibility: InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    /**
     * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages)
     * using the public key retrieved from the [Get an organization public
     * key](https://docs.github.com/rest/dependabot/secrets#get-an-organization-public-key) endpoint.
     */
    public var encryptedValue: String? = null

    /**
     * ID of the key you used to encrypt the secret.
     */
    public var keyId: String? = null

    private var selectedRepositoryIdsValue:
        List<InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711>? = null

    /**
     * An array of repository ids that can access the organization secret. You can only provide a list of repository ids
     * when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List
     * selected repositories for an organization
     * secret](https://docs.github.com/rest/dependabot/secrets#list-selected-repositories-for-an-organization-secret),
     * [Set selected repositories for an organization
     * secret](https://docs.github.com/rest/dependabot/secrets#set-selected-repositories-for-an-organization-secret),
     * and [Remove selected repository from an organization
     * secret](https://docs.github.com/rest/dependabot/secrets#remove-selected-repository-from-an-organization-secret)
     * endpoints.
     */
    public var selectedRepositoryIds:
        List<InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711>?
      get() = selectedRepositoryIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        selectedRepositoryIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsDependabotSecretsPutRequestJsonXbdff5024 {
      check(visibilityValue != null) { "visibility is required" }
      return InlineOrgsDependabotSecretsPutRequestJsonXbdff5024(
        visibility = visibility,
        encryptedValue = encryptedValue,
        keyId = keyId,
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsDependabotSecretsPutRequestJsonXbdff5024 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsDependabotSecretsPutRequestJsonXbdff5024> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsDependabotSecretsPutRequestJsonXbdff5024 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsDependabotSecretsPutRequestJsonXbdff5024")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsDependabotSecretsPutRequestJsonXbdff5024 must be a JSON object")
      val visibility = json.decodeRequired<InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72>(rawObject, "visibility")
      return InlineOrgsDependabotSecretsPutRequestJsonXbdff5024(
        visibility = visibility,
        encryptedValue = rawObject["encrypted_value"]?.let { json.decodeFromJsonElement<String>(it) },
        keyId = rawObject["key_id"]?.let { json.decodeFromJsonElement<String>(it) },
        selectedRepositoryIds = rawObject["selected_repository_ids"]?.let { json.decodeFromJsonElement<List<InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsDependabotSecretsPutRequestJsonXbdff5024) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsDependabotSecretsPutRequestJsonXbdff5024")
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

public fun inlineOrgsDependabotSecretsPutRequestJsonXbdff5024(block: InlineOrgsDependabotSecretsPutRequestJsonXbdff5024.Builder.() -> Unit): InlineOrgsDependabotSecretsPutRequestJsonXbdff5024 = InlineOrgsDependabotSecretsPutRequestJsonXbdff5024.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsDependabotSecretsPutRequestJsonXbdff5024 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
