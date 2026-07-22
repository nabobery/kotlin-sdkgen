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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1secrets~1{secret_name}~1repositories/put/requestBody/cont
 * ent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1secrets~1{secret_name}~1repositories/put/requestBody/cont
 * ent/application~1json/schema
 */
@Serializable(with = InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4.Serializer::class)
public class InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4(
  selectedRepositoryIds: List<Int>,
) {
  /**
   * An array of repository ids that can access the organization secret. You can only provide a list of repository ids
   * when the `visibility` is set to `selected`. You can add and remove individual repositories using the [Add selected
   * repository to an organization
   * secret](https://docs.github.com/rest/actions/secrets#add-selected-repository-to-an-organization-secret) and [Remove
   * selected repository from an organization
   * secret](https://docs.github.com/rest/actions/secrets#remove-selected-repository-from-an-organization-secret)
   * endpoints.
   */
  public val selectedRepositoryIds: List<Int> = selectedRepositoryIds.toList()

  public class Builder {
    private var selectedRepositoryIdsValue: List<Int>? = null

    public var selectedRepositoryIds: List<Int>
      get() = requireNotNull(selectedRepositoryIdsValue) { "selectedRepositoryIds is required" }
      set(`value`) {
        selectedRepositoryIdsValue = value
      }

    public fun build(): InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4 {
      check(selectedRepositoryIdsValue != null) { "selectedRepositoryIds is required" }
      return InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4 must be a JSON object")
      val selectedRepositoryIds = json.decodeRequired<List<Int>>(rawObject, "selected_repository_ids")
      return InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_repository_ids", json.encodeToJsonElement(value.selectedRepositoryIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4(block: InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4.Builder.() -> Unit): InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4 = InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsSecretsRepositoriesPutRequestJsonXe7224ea4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
