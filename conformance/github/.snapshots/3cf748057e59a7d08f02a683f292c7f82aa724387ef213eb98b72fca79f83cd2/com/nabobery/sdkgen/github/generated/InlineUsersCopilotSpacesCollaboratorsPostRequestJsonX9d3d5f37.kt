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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1collaborators/post/requestBo
 * dy/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1collaborators/post/requestBo
 * dy/content/application~1json/schema
 */
@Serializable(with = InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37.Serializer::class)
public class InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37(
  /**
   * The username of the collaborator. The numeric user ID is also accepted.
   */
  public val actorIdentifier: String,
  /**
   * The type of actor (must be `User` for user-owned spaces; `Team` will be rejected).
   */
  public val actorType: InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177,
  /**
   * The role to grant to the collaborator.
   */
  public val role: InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064,
) {
  public class Builder {
    private var actorIdentifierValue: String? = null

    public var actorIdentifier: String
      get() = requireNotNull(actorIdentifierValue) { "actorIdentifier is required" }
      set(`value`) {
        actorIdentifierValue = value
      }

    private var actorTypeValue:
        InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177? = null

    public var actorType: InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177
      get() = requireNotNull(actorTypeValue) { "actorType is required" }
      set(`value`) {
        actorTypeValue = value
      }

    private var roleValue: InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064? = null

    public var role: InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    public fun build(): InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37 {
      check(actorIdentifierValue != null) { "actorIdentifier is required" }
      check(actorTypeValue != null) { "actorType is required" }
      check(roleValue != null) { "role is required" }
      return InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37(
        actorIdentifier = actorIdentifier,
        actorType = actorType,
        role = role,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37 must be a JSON object")
      val actorIdentifier = json.decodeRequired<String>(rawObject, "actor_identifier")
      val actorType = json.decodeRequired<InlineUsersCopilotSpacesCollaboratorsPostRequestJsonActorTypeX2bb5a177>(rawObject, "actor_type")
      val role = json.decodeRequired<InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064>(rawObject, "role")
      return InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37(
        actorIdentifier = actorIdentifier,
        actorType = actorType,
        role = role,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actor_identifier", value.actorIdentifier)
        put("actor_type", json.encodeToJsonElement(value.actorType))
        put("role", json.encodeToJsonElement(value.role))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37(block: InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37.Builder.() -> Unit): InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37 = InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
