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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1selected_users/post/requestBody/content/applicat
 * ion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1selected_users/post/requestBody/content/applicat
 * ion~1json/schema
 */
@Serializable(with = InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3.Serializer::class)
public class InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3(
  selectedUsernames: List<String>,
) {
  /**
   * The usernames of the organization members to be granted access to GitHub Copilot.
   */
  public val selectedUsernames: List<String> = selectedUsernames.toList()

  public class Builder {
    private var selectedUsernamesValue: List<String>? = null

    public var selectedUsernames: List<String>
      get() = requireNotNull(selectedUsernamesValue) { "selectedUsernames is required" }
      set(`value`) {
        selectedUsernamesValue = value
      }

    public fun build(): InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3 {
      check(selectedUsernamesValue != null) { "selectedUsernames is required" }
      return InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3(
        selectedUsernames = selectedUsernames,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3 must be a JSON object")
      val selectedUsernames = json.decodeRequired<List<String>>(rawObject, "selected_usernames")
      return InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3(
        selectedUsernames = selectedUsernames,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_usernames", json.encodeToJsonElement(value.selectedUsernames))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3(block: InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3.Builder.() -> Unit): InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3 = InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
