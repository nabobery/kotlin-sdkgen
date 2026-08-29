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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1permissions~1repositories/put/requestBody/content/applica
 * tion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1permissions~1repositories/put/requestBody/content/applica
 * tion~1json/schema
 */
@Serializable(with = InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b.Serializer::class)
public class InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b(
  selectedRepositoryIds: List<Int>,
) {
  /**
   * List of repository IDs to enable for GitHub Actions.
   */
  public val selectedRepositoryIds: List<Int> = selectedRepositoryIds.toList()

  public class Builder {
    private var selectedRepositoryIdsValue: List<Int>? = null

    public var selectedRepositoryIds: List<Int>
      get() = requireNotNull(selectedRepositoryIdsValue) { "selectedRepositoryIds is required" }.toList()
      set(`value`) {
        selectedRepositoryIdsValue = value.toList()
      }

    public fun build(): InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b {
      check(selectedRepositoryIdsValue != null) { "selectedRepositoryIds is required" }
      return InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b must be a JSON object")
      val selectedRepositoryIds = json.decodeRequired<List<Int>>(rawObject, "selected_repository_ids")
      return InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_repository_ids", json.encodeToJsonElement(value.selectedRepositoryIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b(block: InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b.Builder.() -> Unit): InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b = InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsPermissionsRepositoriesPutRequestJsonXfe79ab7b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
