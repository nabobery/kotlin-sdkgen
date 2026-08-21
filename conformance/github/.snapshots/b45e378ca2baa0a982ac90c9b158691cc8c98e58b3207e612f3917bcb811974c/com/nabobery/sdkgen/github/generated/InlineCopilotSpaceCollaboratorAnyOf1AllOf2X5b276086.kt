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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/copilot-space-collaborator/anyOf/0/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-space-collaborator/anyOf/0/allOf/1
 */
@Serializable(with = InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086.Serializer::class)
public class InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086(
  /**
   * The collaborator actor type.
   */
  public val actorType: InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4,
  /**
   * The role granted to the collaborator
   */
  public val role: InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803,
) {
  public class Builder {
    private var actorTypeValue: InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4? = null

    public var actorType: InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4
      get() = requireNotNull(actorTypeValue) { "actorType is required" }
      set(`value`) {
        actorTypeValue = value
      }

    private var roleValue: InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803? = null

    public var role: InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    public fun build(): InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086 {
      check(actorTypeValue != null) { "actorType is required" }
      check(roleValue != null) { "role is required" }
      return InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086(
        actorType = actorType,
        role = role,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086 must be a JSON object")
      val actorType = json.decodeRequired<InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4>(rawObject, "actor_type")
      val role = json.decodeRequired<InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803>(rawObject, "role")
      return InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086(
        actorType = actorType,
        role = role,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actor_type", json.encodeToJsonElement(value.actorType))
        put("role", json.encodeToJsonElement(value.role))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086(block: InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086.Builder.() -> Unit): InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086 = InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCopilotSpaceCollaboratorAnyOf1AllOf2X5b276086 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
