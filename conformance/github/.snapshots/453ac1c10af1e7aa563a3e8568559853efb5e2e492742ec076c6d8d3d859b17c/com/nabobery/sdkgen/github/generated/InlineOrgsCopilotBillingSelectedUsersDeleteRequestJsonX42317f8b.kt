package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1selected_users/delete/requestBody/content/applic
 * ation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1selected_users/delete/requestBody/content/applic
 * ation~1json/schema
 */
@Serializable(with = InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b.Serializer::class)
public class InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b(
  selectedUsernames: List<String>,
) {
  /**
   * The usernames of the organization members for which to revoke access to GitHub Copilot.
   */
  public val selectedUsernames: List<String> = selectedUsernames.toList()

  public class Builder {
    private var selectedUsernamesValue: List<String>? = null

    public var selectedUsernames: List<String>
      get() = requireNotNull(selectedUsernamesValue) { "selectedUsernames is required" }.toList()
      set(`value`) {
        selectedUsernamesValue = value.toList()
      }

    public fun build(): InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b {
      check(selectedUsernamesValue != null) { "selectedUsernames is required" }
      return InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b(
        selectedUsernames = selectedUsernames,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b must be a JSON object")
      val selectedUsernames = json.decodeRequired<List<String>>(rawObject, "selected_usernames")
      return InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b(
        selectedUsernames = selectedUsernames,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_usernames", json.encodeToJsonElement(value.selectedUsernames))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b(block: InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b.Builder.() -> Unit): InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b = InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
