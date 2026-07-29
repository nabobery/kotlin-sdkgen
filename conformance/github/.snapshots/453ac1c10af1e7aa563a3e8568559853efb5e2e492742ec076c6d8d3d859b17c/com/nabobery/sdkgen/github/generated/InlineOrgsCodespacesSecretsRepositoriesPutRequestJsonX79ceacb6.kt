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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1secrets~1{secret_name}~1repositories/put/requestBody/c
 * ontent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1secrets~1{secret_name}~1repositories/put/requestBody/c
 * ontent/application~1json/schema
 */
@Serializable(with = InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6.Serializer::class)
public class InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6(
  selectedRepositoryIds: List<Int>,
) {
  /**
   * An array of repository ids that can access the organization secret. You can only provide a list of repository ids
   * when the `visibility` is set to `selected`. You can add and remove individual repositories using the [Set selected
   * repositories for an organization
   * secret](https://docs.github.com/rest/codespaces/organization-secrets#set-selected-repositories-for-an-organization-
   * secret) and [Remove selected repository from an organization
   * secret](https://docs.github.com/rest/codespaces/organization-secrets#remove-selected-repository-from-an-organizatio
   * n-secret) endpoints.
   */
  public val selectedRepositoryIds: List<Int> = selectedRepositoryIds.toList()

  public class Builder {
    private var selectedRepositoryIdsValue: List<Int>? = null

    public var selectedRepositoryIds: List<Int>
      get() = requireNotNull(selectedRepositoryIdsValue) { "selectedRepositoryIds is required" }.toList()
      set(`value`) {
        selectedRepositoryIdsValue = value.toList()
      }

    public fun build(): InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6 {
      check(selectedRepositoryIdsValue != null) { "selectedRepositoryIds is required" }
      return InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6 must be a JSON object")
      val selectedRepositoryIds = json.decodeRequired<List<Int>>(rawObject, "selected_repository_ids")
      return InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_repository_ids", json.encodeToJsonElement(value.selectedRepositoryIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6(block: InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6.Builder.() -> Unit): InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6 = InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
