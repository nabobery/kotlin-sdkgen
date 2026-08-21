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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1coding-agent~1permissions~1repositories/put/requestBody/c
 * ontent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1coding-agent~1permissions~1repositories/put/requestBody/c
 * ontent/application~1json/schema
 */
@Serializable(with = InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177.Serializer::class)
public class InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177(
  selectedRepositoryIds: List<Int>,
) {
  /**
   * List of repository IDs to enable for Copilot cloud agent.
   */
  public val selectedRepositoryIds: List<Int> = selectedRepositoryIds.toList()

  public class Builder {
    private var selectedRepositoryIdsValue: List<Int>? = null

    public var selectedRepositoryIds: List<Int>
      get() = requireNotNull(selectedRepositoryIdsValue) { "selectedRepositoryIds is required" }.toList()
      set(`value`) {
        selectedRepositoryIdsValue = value.toList()
      }

    public fun build(): InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177 {
      check(selectedRepositoryIdsValue != null) { "selectedRepositoryIds is required" }
      return InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177 must be a JSON object")
      val selectedRepositoryIds = json.decodeRequired<List<Int>>(rawObject, "selected_repository_ids")
      return InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_repository_ids", json.encodeToJsonElement(value.selectedRepositoryIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177(block: InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177.Builder.() -> Unit): InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177 = InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
