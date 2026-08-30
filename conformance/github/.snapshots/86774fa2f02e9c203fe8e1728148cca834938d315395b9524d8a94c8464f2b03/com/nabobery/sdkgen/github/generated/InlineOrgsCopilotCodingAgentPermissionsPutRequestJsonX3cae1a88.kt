package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1coding-agent~1permissions/put/requestBody/content/applica
 * tion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1coding-agent~1permissions/put/requestBody/content/applica
 * tion~1json/schema
 */
@Serializable(with = InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88.Serializer::class)
public class InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88(
  /**
   * The policy for which repositories can use Copilot cloud agent. Can be one of `all`, `selected`, or `none`.
   */
  public val enabledRepositories:
      InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c,
) {
  public class Builder {
    private var enabledRepositoriesValue:
        InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c? = null

    public var enabledRepositories:
        InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c
      get() = requireNotNull(enabledRepositoriesValue) { "enabledRepositories is required" }
      set(`value`) {
        enabledRepositoriesValue = value
      }

    public fun build(): InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88 {
      check(enabledRepositoriesValue != null) { "enabledRepositories is required" }
      return InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88(
        enabledRepositories = enabledRepositories,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88 must be a JSON object")
      val enabledRepositories = json.decodeRequired<InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c>(rawObject, "enabled_repositories")
      return InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88(
        enabledRepositories = enabledRepositories,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled_repositories", json.encodeToJsonElement(value.enabledRepositories))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88(block: InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88.Builder.() -> Unit): InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88 = InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
