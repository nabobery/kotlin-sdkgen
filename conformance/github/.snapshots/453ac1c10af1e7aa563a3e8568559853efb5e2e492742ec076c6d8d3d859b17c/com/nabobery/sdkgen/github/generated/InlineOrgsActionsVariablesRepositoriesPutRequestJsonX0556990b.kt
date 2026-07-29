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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1variables~1{name}~1repositories/put/requestBody/content/a
 * pplication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1variables~1{name}~1repositories/put/requestBody/content/a
 * pplication~1json/schema
 */
@Serializable(with = InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b.Serializer::class)
public class InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b(
  selectedRepositoryIds: List<Int>,
) {
  /**
   * The IDs of the repositories that can access the organization variable.
   */
  public val selectedRepositoryIds: List<Int> = selectedRepositoryIds.toList()

  public class Builder {
    private var selectedRepositoryIdsValue: List<Int>? = null

    public var selectedRepositoryIds: List<Int>
      get() = requireNotNull(selectedRepositoryIdsValue) { "selectedRepositoryIds is required" }.toList()
      set(`value`) {
        selectedRepositoryIdsValue = value.toList()
      }

    public fun build(): InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b {
      check(selectedRepositoryIdsValue != null) { "selectedRepositoryIds is required" }
      return InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b must be a JSON object")
      val selectedRepositoryIds = json.decodeRequired<List<Int>>(rawObject, "selected_repository_ids")
      return InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_repository_ids", json.encodeToJsonElement(value.selectedRepositoryIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b(block: InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b.Builder.() -> Unit): InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b = InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsVariablesRepositoriesPutRequestJsonX0556990b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
