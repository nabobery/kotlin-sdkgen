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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups~1{runner_group_id}~1repositories/put/reques
 * tBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups~1{runner_group_id}~1repositories/put/reques
 * tBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1.Serializer::class)
public class InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1(
  selectedRepositoryIds: List<Int>,
) {
  /**
   * List of repository IDs that can access the runner group.
   */
  public val selectedRepositoryIds: List<Int> = selectedRepositoryIds.toList()

  public class Builder {
    private var selectedRepositoryIdsValue: List<Int>? = null

    public var selectedRepositoryIds: List<Int>
      get() = requireNotNull(selectedRepositoryIdsValue) { "selectedRepositoryIds is required" }.toList()
      set(`value`) {
        selectedRepositoryIdsValue = value.toList()
      }

    public fun build(): InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1 {
      check(selectedRepositoryIdsValue != null) { "selectedRepositoryIds is required" }
      return InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1 must be a JSON object")
      val selectedRepositoryIds = json.decodeRequired<List<Int>>(rawObject, "selected_repository_ids")
      return InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_repository_ids", json.encodeToJsonElement(value.selectedRepositoryIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1(block: InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1.Builder.() -> Unit): InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1 = InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsRunnerGroupsRepositoriesPutRequestJsonX43156fd1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
