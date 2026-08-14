package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1coding-agent~1permissions/get/responses/200/content/appli
 * cation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1coding-agent~1permissions/get/responses/200/content/appli
 * cation~1json/schema
 */
@Serializable(with = InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951.Serializer::class)
public class InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951(
  /**
   * The policy for which repositories can use Copilot cloud agent. Can be one of `all`, `selected`, or `none`.
   */
  public val enabledRepositories:
      InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4,
  /**
   * The URL for the selected repositories endpoint. Only present when `enabled_repositories` is `selected`.
   */
  public val selectedRepositoriesUrl: String? = null,
) {
  public class Builder {
    private var enabledRepositoriesValue:
        InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4? = null

    public var enabledRepositories:
        InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4
      get() = requireNotNull(enabledRepositoriesValue) { "enabledRepositories is required" }
      set(`value`) {
        enabledRepositoriesValue = value
      }

    /**
     * The URL for the selected repositories endpoint. Only present when `enabled_repositories` is `selected`.
     */
    public var selectedRepositoriesUrl: String? = null

    public fun build(): InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951 {
      check(enabledRepositoriesValue != null) { "enabledRepositories is required" }
      return InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951(
        enabledRepositories = enabledRepositories,
        selectedRepositoriesUrl = selectedRepositoriesUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951 must be a JSON object")
      val enabledRepositories = json.decodeRequired<InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4>(rawObject, "enabled_repositories")
      return InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951(
        enabledRepositories = enabledRepositories,
        selectedRepositoriesUrl = rawObject["selected_repositories_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled_repositories", json.encodeToJsonElement(value.enabledRepositories))
        value.selectedRepositoriesUrl?.let { put("selected_repositories_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951(block: InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951.Builder.() -> Unit): InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951 = InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
