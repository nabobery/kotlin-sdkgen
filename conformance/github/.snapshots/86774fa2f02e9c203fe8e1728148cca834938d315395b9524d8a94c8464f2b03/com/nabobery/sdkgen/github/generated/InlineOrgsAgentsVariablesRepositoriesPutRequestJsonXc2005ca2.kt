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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1variables~1{name}~1repositories/put/requestBody/content/ap
 * plication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1variables~1{name}~1repositories/put/requestBody/content/ap
 * plication~1json/schema
 */
@Serializable(with = InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2.Serializer::class)
public class InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2(
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

    public fun build(): InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2 {
      check(selectedRepositoryIdsValue != null) { "selectedRepositoryIds is required" }
      return InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2 must be a JSON object")
      val selectedRepositoryIds = json.decodeRequired<List<Int>>(rawObject, "selected_repository_ids")
      return InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_repository_ids", json.encodeToJsonElement(value.selectedRepositoryIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2(block: InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2.Builder.() -> Unit): InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2 = InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
