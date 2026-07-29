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
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1secrets~1{secret_name}~1repositories/put/requestBody/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1secrets~1{secret_name}~1repositories/put/requestBody/content/
 * application~1json/schema
 */
@Serializable(with = InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8.Serializer::class)
public class InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8(
  selectedRepositoryIds: List<Int>,
) {
  /**
   * An array of repository ids for which a codespace can access the secret. You can manage the list of selected
   * repositories using the [List selected repositories for a user
   * secret](https://docs.github.com/rest/codespaces/secrets#list-selected-repositories-for-a-user-secret), [Add a
   * selected repository to a user
   * secret](https://docs.github.com/rest/codespaces/secrets#add-a-selected-repository-to-a-user-secret), and [Remove a
   * selected repository from a user
   * secret](https://docs.github.com/rest/codespaces/secrets#remove-a-selected-repository-from-a-user-secret) endpoints.
   */
  public val selectedRepositoryIds: List<Int> = selectedRepositoryIds.toList()

  public class Builder {
    private var selectedRepositoryIdsValue: List<Int>? = null

    public var selectedRepositoryIds: List<Int>
      get() = requireNotNull(selectedRepositoryIdsValue) { "selectedRepositoryIds is required" }.toList()
      set(`value`) {
        selectedRepositoryIdsValue = value.toList()
      }

    public fun build(): InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8 {
      check(selectedRepositoryIdsValue != null) { "selectedRepositoryIds is required" }
      return InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8 must be a JSON object")
      val selectedRepositoryIds = json.decodeRequired<List<Int>>(rawObject, "selected_repository_ids")
      return InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_repository_ids", json.encodeToJsonElement(value.selectedRepositoryIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8(block: InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8.Builder.() -> Unit): InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8 = InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
