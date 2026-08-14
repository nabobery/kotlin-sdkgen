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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/actions-repository-permissions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-repository-permissions
 */
@Serializable(with = ActionsRepositoryPermissions.Serializer::class)
public class ActionsRepositoryPermissions(
  public val enabled: Boolean,
  public val allowedActions: AllowedActions? = null,
  public val selectedActionsUrl: String? = null,
  public val shaPinningRequired: Boolean? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var allowedActions: AllowedActions? = null

    public var selectedActionsUrl: String? = null

    public var shaPinningRequired: Boolean? = null

    public fun build(): ActionsRepositoryPermissions {
      check(enabledValue != null) { "enabled is required" }
      return ActionsRepositoryPermissions(
        enabled = enabled,
        allowedActions = allowedActions,
        selectedActionsUrl = selectedActionsUrl,
        shaPinningRequired = shaPinningRequired,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsRepositoryPermissions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsRepositoryPermissions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsRepositoryPermissions {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsRepositoryPermissions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsRepositoryPermissions must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return ActionsRepositoryPermissions(
        enabled = enabled,
        allowedActions = rawObject["allowed_actions"]?.let { json.decodeFromJsonElement<AllowedActions>(it) },
        selectedActionsUrl = rawObject["selected_actions_url"]?.let { json.decodeFromJsonElement<String>(it) },
        shaPinningRequired = rawObject["sha_pinning_required"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsRepositoryPermissions) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsRepositoryPermissions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.allowedActions?.let { put("allowed_actions", json.encodeToJsonElement(it)) }
        value.selectedActionsUrl?.let { put("selected_actions_url", it) }
        value.shaPinningRequired?.let { put("sha_pinning_required", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsRepositoryPermissions(block: ActionsRepositoryPermissions.Builder.() -> Unit): ActionsRepositoryPermissions = ActionsRepositoryPermissions.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsRepositoryPermissions is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
