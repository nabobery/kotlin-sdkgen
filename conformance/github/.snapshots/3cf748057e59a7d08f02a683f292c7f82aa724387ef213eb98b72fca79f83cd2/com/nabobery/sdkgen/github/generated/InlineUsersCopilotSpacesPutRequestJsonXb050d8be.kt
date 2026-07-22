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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}/put/requestBody/content/appli
 * cation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}/put/requestBody/content/appli
 * cation~1json/schema
 */
@Serializable(with = InlineUsersCopilotSpacesPutRequestJsonXb050d8be.Serializer::class)
public class InlineUsersCopilotSpacesPutRequestJsonXb050d8be(
  /**
   * The base role that determines default permissions for the space. Changing this field requires admin permissions.
   * - `no_access`: No default access (default)
   * - `reader`: Makes the space publicly readable
   * Note: User spaces do not support writer or admin base roles.
   */
  public val baseRole: InlineUsersCopilotSpacesPutRequestJsonBaseRoleXfecf274f? = null,
  /**
   * A description of the Copilot Space.
   */
  public val description: String? = null,
  /**
   * General instructions for the Copilot Space.
   */
  public val generalInstructions: String? = null,
  /**
   * The name of the Copilot Space.
   */
  public val name: String? = null,
  /**
   * Resources to attach to the space.
   */
  public val resourcesAttributes:
      List<InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731>? = null,
) {
  public class Builder {
    /**
     * The base role that determines default permissions for the space. Changing this field requires admin permissions.
     * - `no_access`: No default access (default)
     * - `reader`: Makes the space publicly readable
     * Note: User spaces do not support writer or admin base roles.
     */
    public var baseRole: InlineUsersCopilotSpacesPutRequestJsonBaseRoleXfecf274f? = null

    /**
     * A description of the Copilot Space.
     */
    public var description: String? = null

    /**
     * General instructions for the Copilot Space.
     */
    public var generalInstructions: String? = null

    /**
     * The name of the Copilot Space.
     */
    public var name: String? = null

    /**
     * Resources to attach to the space.
     */
    public var resourcesAttributes:
        List<InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731>? = null

    public fun build(): InlineUsersCopilotSpacesPutRequestJsonXb050d8be = InlineUsersCopilotSpacesPutRequestJsonXb050d8be(
      baseRole = baseRole,
      description = description,
      generalInstructions = generalInstructions,
      name = name,
      resourcesAttributes = resourcesAttributes,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersCopilotSpacesPutRequestJsonXb050d8be = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUsersCopilotSpacesPutRequestJsonXb050d8be> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesPutRequestJsonXb050d8be {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersCopilotSpacesPutRequestJsonXb050d8be")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersCopilotSpacesPutRequestJsonXb050d8be must be a JSON object")
      return InlineUsersCopilotSpacesPutRequestJsonXb050d8be(
        baseRole = rawObject["base_role"]?.let { json.decodeFromJsonElement<InlineUsersCopilotSpacesPutRequestJsonBaseRoleXfecf274f>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        generalInstructions = rawObject["general_instructions"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        resourcesAttributes = rawObject["resources_attributes"]?.let { json.decodeFromJsonElement<List<InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesPutRequestJsonXb050d8be) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersCopilotSpacesPutRequestJsonXb050d8be")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.baseRole?.let { put("base_role", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.generalInstructions?.let { put("general_instructions", it) }
        value.name?.let { put("name", it) }
        value.resourcesAttributes?.let { put("resources_attributes", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersCopilotSpacesPutRequestJsonXb050d8be(block: InlineUsersCopilotSpacesPutRequestJsonXb050d8be.Builder.() -> Unit): InlineUsersCopilotSpacesPutRequestJsonXb050d8be = InlineUsersCopilotSpacesPutRequestJsonXb050d8be.build(block)
