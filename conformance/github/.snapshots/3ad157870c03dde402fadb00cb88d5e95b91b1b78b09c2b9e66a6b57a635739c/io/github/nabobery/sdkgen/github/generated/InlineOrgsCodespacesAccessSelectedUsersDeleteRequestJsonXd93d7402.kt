package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1access~1selected_users/delete/requestBody/content/appl
 * ication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1access~1selected_users/delete/requestBody/content/appl
 * ication~1json/schema
 */
@Serializable(with = InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402.Serializer::class)
public class InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402(
  selectedUsernames: List<String>,
) {
  /**
   * The usernames of the organization members and outside collaborators whose codespaces should not be billed to the
   * organization.
   */
  public val selectedUsernames: List<String> = selectedUsernames.toList()

  public class Builder {
    private var selectedUsernamesValue: List<String>? = null

    public var selectedUsernames: List<String>
      get() = requireNotNull(selectedUsernamesValue) { "selectedUsernames is required" }.toList()
      set(`value`) {
        selectedUsernamesValue = value.toList()
      }

    public fun build(): InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402 {
      check(selectedUsernamesValue != null) { "selectedUsernames is required" }
      return InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402(
        selectedUsernames = selectedUsernames,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402 must be a JSON object")
      val selectedUsernames = json.decodeRequired<List<String>>(rawObject, "selected_usernames")
      return InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402(
        selectedUsernames = selectedUsernames,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_usernames", json.encodeToJsonElement(value.selectedUsernames))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402(block: InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402.Builder.() -> Unit): InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402 = InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
