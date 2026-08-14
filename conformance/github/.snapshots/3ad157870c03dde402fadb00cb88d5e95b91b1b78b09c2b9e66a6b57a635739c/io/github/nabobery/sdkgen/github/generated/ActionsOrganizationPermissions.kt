package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/actions-organization-permissions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-organization-permissions
 */
@Serializable(with = ActionsOrganizationPermissions.Serializer::class)
public class ActionsOrganizationPermissions(
  public val enabledRepositories: EnabledRepositories,
  public val allowedActions: AllowedActions? = null,
  public val selectedActionsUrl: String? = null,
  /**
   * The API URL to use to get or set the selected repositories that are allowed to run GitHub Actions, when
   * `enabled_repositories` is set to `selected`.
   */
  public val selectedRepositoriesUrl: String? = null,
  public val shaPinningRequired: Boolean? = null,
) {
  public class Builder {
    private var enabledRepositoriesValue: EnabledRepositories? = null

    public var enabledRepositories: EnabledRepositories
      get() = requireNotNull(enabledRepositoriesValue) { "enabledRepositories is required" }
      set(`value`) {
        enabledRepositoriesValue = value
      }

    public var allowedActions: AllowedActions? = null

    public var selectedActionsUrl: String? = null

    /**
     * The API URL to use to get or set the selected repositories that are allowed to run GitHub Actions, when
     * `enabled_repositories` is set to `selected`.
     */
    public var selectedRepositoriesUrl: String? = null

    public var shaPinningRequired: Boolean? = null

    public fun build(): ActionsOrganizationPermissions {
      check(enabledRepositoriesValue != null) { "enabledRepositories is required" }
      return ActionsOrganizationPermissions(
        enabledRepositories = enabledRepositories,
        allowedActions = allowedActions,
        selectedActionsUrl = selectedActionsUrl,
        selectedRepositoriesUrl = selectedRepositoriesUrl,
        shaPinningRequired = shaPinningRequired,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsOrganizationPermissions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsOrganizationPermissions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsOrganizationPermissions {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsOrganizationPermissions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsOrganizationPermissions must be a JSON object")
      val enabledRepositories = json.decodeRequired<EnabledRepositories>(rawObject, "enabled_repositories")
      return ActionsOrganizationPermissions(
        enabledRepositories = enabledRepositories,
        allowedActions = rawObject["allowed_actions"]?.let { json.decodeFromJsonElement<AllowedActions>(it) },
        selectedActionsUrl = rawObject["selected_actions_url"]?.let { json.decodeFromJsonElement<String>(it) },
        selectedRepositoriesUrl = rawObject["selected_repositories_url"]?.let { json.decodeFromJsonElement<String>(it) },
        shaPinningRequired = rawObject["sha_pinning_required"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsOrganizationPermissions) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsOrganizationPermissions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled_repositories", json.encodeToJsonElement(value.enabledRepositories))
        value.allowedActions?.let { put("allowed_actions", json.encodeToJsonElement(it)) }
        value.selectedActionsUrl?.let { put("selected_actions_url", it) }
        value.selectedRepositoriesUrl?.let { put("selected_repositories_url", it) }
        value.shaPinningRequired?.let { put("sha_pinning_required", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsOrganizationPermissions(block: ActionsOrganizationPermissions.Builder.() -> Unit): ActionsOrganizationPermissions = ActionsOrganizationPermissions.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsOrganizationPermissions is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
