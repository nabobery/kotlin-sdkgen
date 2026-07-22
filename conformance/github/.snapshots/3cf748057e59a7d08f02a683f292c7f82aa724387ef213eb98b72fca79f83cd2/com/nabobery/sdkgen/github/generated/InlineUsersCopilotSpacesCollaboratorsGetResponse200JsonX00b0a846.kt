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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1collaborators/get/responses/
 * 200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1collaborators/get/responses/
 * 200/content/application~1json/schema
 */
@Serializable(with = InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846.Serializer::class)
public class InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846(
  collaborators: List<CopilotSpaceCollaborator>,
) {
  /**
   * The list of collaborators for this Copilot Space.
   */
  public val collaborators: List<CopilotSpaceCollaborator> = collaborators.toList()

  public class Builder {
    private var collaboratorsValue: List<CopilotSpaceCollaborator>? = null

    public var collaborators: List<CopilotSpaceCollaborator>
      get() = requireNotNull(collaboratorsValue) { "collaborators is required" }
      set(`value`) {
        collaboratorsValue = value
      }

    public fun build(): InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846 {
      check(collaboratorsValue != null) { "collaborators is required" }
      return InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846(
        collaborators = collaborators,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846 must be a JSON object")
      val collaborators = json.decodeRequired<List<CopilotSpaceCollaborator>>(rawObject, "collaborators")
      return InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846(
        collaborators = collaborators,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("collaborators", json.encodeToJsonElement(value.collaborators))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846(block: InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846.Builder.() -> Unit): InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846 = InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
