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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~
 * 1{actor_identifier}/put/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~
 * 1{actor_identifier}/put/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c.Serializer::class)
public class InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c(
  /**
   * The new role to grant to the collaborator. Use `no_access` to remove the collaborator.
   */
  public val role: InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089,
) {
  public class Builder {
    private var roleValue: InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089? = null

    public var role: InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    public fun build(): InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c {
      check(roleValue != null) { "role is required" }
      return InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c(
        role = role,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c must be a JSON object")
      val role = json.decodeRequired<InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089>(rawObject, "role")
      return InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c(
        role = role,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("role", json.encodeToJsonElement(value.role))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c(block: InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c.Builder.() -> Unit): InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c = InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
