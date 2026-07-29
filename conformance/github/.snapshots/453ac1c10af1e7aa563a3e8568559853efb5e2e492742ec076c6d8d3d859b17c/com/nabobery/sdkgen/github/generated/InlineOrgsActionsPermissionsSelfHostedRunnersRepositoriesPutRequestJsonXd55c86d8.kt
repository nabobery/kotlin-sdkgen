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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1permissions~1self-hosted-runners~1repositories/put/reques
 * tBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1permissions~1self-hosted-runners~1repositories/put/reques
 * tBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8.Serializer::class)
public class InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8(
  selectedRepositoryIds: List<Int>,
) {
  /**
   * IDs of repositories that can use repository-level self-hosted runners
   */
  public val selectedRepositoryIds: List<Int> = selectedRepositoryIds.toList()

  public class Builder {
    private var selectedRepositoryIdsValue: List<Int>? = null

    public var selectedRepositoryIds: List<Int>
      get() = requireNotNull(selectedRepositoryIdsValue) { "selectedRepositoryIds is required" }.toList()
      set(`value`) {
        selectedRepositoryIdsValue = value.toList()
      }

    public fun build(): InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8 {
      check(selectedRepositoryIdsValue != null) { "selectedRepositoryIds is required" }
      return InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8 must be a JSON object")
      val selectedRepositoryIds = json.decodeRequired<List<Int>>(rawObject, "selected_repository_ids")
      return InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_repository_ids", json.encodeToJsonElement(value.selectedRepositoryIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8(block: InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8.Builder.() -> Unit): InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8 = InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsPermissionsSelfHostedRunnersRepositoriesPutRequestJsonXd55c86d8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
