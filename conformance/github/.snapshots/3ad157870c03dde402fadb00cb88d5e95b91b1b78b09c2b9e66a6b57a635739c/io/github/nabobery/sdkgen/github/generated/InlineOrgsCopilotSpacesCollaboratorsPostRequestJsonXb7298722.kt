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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1collaborators/post/requestBody/con
 * tent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1collaborators/post/requestBody/con
 * tent/application~1json/schema
 */
@Serializable(with = InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722.Serializer::class)
public class InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722(
  /**
   * The username (for users) or team slug (for teams). The numeric ID of a user or team is also accepted.
   */
  public val actorIdentifier: String,
  /**
   * The type of actor (user or team).
   */
  public val actorType: InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3,
  /**
   * The role to grant to the collaborator.
   */
  public val role: InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11,
) {
  public class Builder {
    private var actorIdentifierValue: String? = null

    public var actorIdentifier: String
      get() = requireNotNull(actorIdentifierValue) { "actorIdentifier is required" }
      set(`value`) {
        actorIdentifierValue = value
      }

    private var actorTypeValue:
        InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3? = null

    public var actorType: InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3
      get() = requireNotNull(actorTypeValue) { "actorType is required" }
      set(`value`) {
        actorTypeValue = value
      }

    private var roleValue: InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11? = null

    public var role: InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    public fun build(): InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722 {
      check(actorIdentifierValue != null) { "actorIdentifier is required" }
      check(actorTypeValue != null) { "actorType is required" }
      check(roleValue != null) { "role is required" }
      return InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722(
        actorIdentifier = actorIdentifier,
        actorType = actorType,
        role = role,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722 must be a JSON object")
      val actorIdentifier = json.decodeRequired<String>(rawObject, "actor_identifier")
      val actorType = json.decodeRequired<InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonActorTypeXe974b2e3>(rawObject, "actor_type")
      val role = json.decodeRequired<InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11>(rawObject, "role")
      return InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722(
        actorIdentifier = actorIdentifier,
        actorType = actorType,
        role = role,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722")
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

public fun inlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722(block: InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722.Builder.() -> Unit): InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722 = InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
