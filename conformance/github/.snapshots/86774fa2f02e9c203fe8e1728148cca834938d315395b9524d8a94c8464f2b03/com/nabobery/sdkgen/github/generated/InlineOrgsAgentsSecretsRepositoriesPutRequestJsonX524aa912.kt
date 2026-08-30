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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1secrets~1{secret_name}~1repositories/put/requestBody/conte
 * nt/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1secrets~1{secret_name}~1repositories/put/requestBody/conte
 * nt/application~1json/schema
 */
@Serializable(with = InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912.Serializer::class)
public class InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912(
  selectedRepositoryIds: List<Int>,
) {
  /**
   * An array of repository ids that can access the organization secret. You can only provide a list of repository ids
   * when the `visibility` is set to `selected`. You can add and remove individual repositories using the [Add selected
   * repository to an organization
   * secret](https://docs.github.com/rest/agents/secrets#add-selected-repository-to-an-organization-secret) and [Remove
   * selected repository from an organization
   * secret](https://docs.github.com/rest/agents/secrets#remove-selected-repository-from-an-organization-secret)
   * endpoints.
   */
  public val selectedRepositoryIds: List<Int> = selectedRepositoryIds.toList()

  public class Builder {
    private var selectedRepositoryIdsValue: List<Int>? = null

    public var selectedRepositoryIds: List<Int>
      get() = requireNotNull(selectedRepositoryIdsValue) { "selectedRepositoryIds is required" }.toList()
      set(`value`) {
        selectedRepositoryIdsValue = value.toList()
      }

    public fun build(): InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912 {
      check(selectedRepositoryIdsValue != null) { "selectedRepositoryIds is required" }
      return InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912 must be a JSON object")
      val selectedRepositoryIds = json.decodeRequired<List<Int>>(rawObject, "selected_repository_ids")
      return InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_repository_ids", json.encodeToJsonElement(value.selectedRepositoryIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912(block: InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912.Builder.() -> Unit): InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912 = InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
