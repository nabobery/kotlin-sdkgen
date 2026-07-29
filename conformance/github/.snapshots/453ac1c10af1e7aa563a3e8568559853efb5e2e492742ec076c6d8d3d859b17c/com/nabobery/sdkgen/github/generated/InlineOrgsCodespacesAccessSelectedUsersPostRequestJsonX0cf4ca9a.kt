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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1access~1selected_users/post/requestBody/content/applic
 * ation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1access~1selected_users/post/requestBody/content/applic
 * ation~1json/schema
 */
@Serializable(with = InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a.Serializer::class)
public class InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a(
  selectedUsernames: List<String>,
) {
  /**
   * The usernames of the organization members and outside collaborators whose codespaces should be billed to the
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

    public fun build(): InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a {
      check(selectedUsernamesValue != null) { "selectedUsernames is required" }
      return InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a(
        selectedUsernames = selectedUsernames,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a must be a JSON object")
      val selectedUsernames = json.decodeRequired<List<String>>(rawObject, "selected_usernames")
      return InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a(
        selectedUsernames = selectedUsernames,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_usernames", json.encodeToJsonElement(value.selectedUsernames))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a(block: InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a.Builder.() -> Unit): InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a = InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
