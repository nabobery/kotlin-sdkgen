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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~1{acto
 * r_identifier}/put/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~1{acto
 * r_identifier}/put/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa.Serializer::class)
public class InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa(
  /**
   * The new role to grant to the collaborator. Use `no_access` to remove the collaborator.
   */
  public val role: InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e,
) {
  public class Builder {
    private var roleValue: InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e? = null

    public var role: InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    public fun build(): InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa {
      check(roleValue != null) { "role is required" }
      return InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa(
        role = role,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa must be a JSON object")
      val role = json.decodeRequired<InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e>(rawObject, "role")
      return InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa(
        role = role,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("role", json.encodeToJsonElement(value.role))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa(block: InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa.Builder.() -> Unit): InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa = InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
