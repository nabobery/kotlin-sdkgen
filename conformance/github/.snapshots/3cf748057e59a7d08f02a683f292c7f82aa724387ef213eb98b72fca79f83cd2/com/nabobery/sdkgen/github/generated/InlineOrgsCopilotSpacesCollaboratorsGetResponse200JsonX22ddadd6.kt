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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1collaborators/get/responses/200/co
 * ntent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1collaborators/get/responses/200/co
 * ntent/application~1json/schema
 */
@Serializable(with = InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6.Serializer::class)
public class InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6(
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

    public fun build(): InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6 {
      check(collaboratorsValue != null) { "collaborators is required" }
      return InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6(
        collaborators = collaborators,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6 must be a JSON object")
      val collaborators = json.decodeRequired<List<CopilotSpaceCollaborator>>(rawObject, "collaborators")
      return InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6(
        collaborators = collaborators,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("collaborators", json.encodeToJsonElement(value.collaborators))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6(block: InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6.Builder.() -> Unit): InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6 = InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
