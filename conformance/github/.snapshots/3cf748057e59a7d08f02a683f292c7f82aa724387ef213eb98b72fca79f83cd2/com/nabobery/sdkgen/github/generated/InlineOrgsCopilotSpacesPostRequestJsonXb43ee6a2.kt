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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces/post/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2.Serializer::class)
public class InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2(
  /**
   * The name of the Copilot Space.
   */
  public val name: String,
  /**
   * The base role that determines default permissions for organization members.
   * - `no_access`: No default access (default)
   * - `reader`: Organization members can read the space
   * - `writer`: Organization members can read and edit the space
   * - `admin`: Organization members have full admin access to the space
   */
  public val baseRole: InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c? = null,
  /**
   * A description of the Copilot Space.
   */
  public val description: String? = null,
  /**
   * General instructions for the Copilot Space.
   */
  public val generalInstructions: String? = null,
  /**
   * Resources to attach to the space.
   */
  public val resourcesAttributes:
      List<InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108>? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * The base role that determines default permissions for organization members.
     * - `no_access`: No default access (default)
     * - `reader`: Organization members can read the space
     * - `writer`: Organization members can read and edit the space
     * - `admin`: Organization members have full admin access to the space
     */
    public var baseRole: InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c? = null

    /**
     * A description of the Copilot Space.
     */
    public var description: String? = null

    /**
     * General instructions for the Copilot Space.
     */
    public var generalInstructions: String? = null

    /**
     * Resources to attach to the space.
     */
    public var resourcesAttributes:
        List<InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108>? = null

    public fun build(): InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2 {
      check(nameValue != null) { "name is required" }
      return InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2(
        name = name,
        baseRole = baseRole,
        description = description,
        generalInstructions = generalInstructions,
        resourcesAttributes = resourcesAttributes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2(
        name = name,
        baseRole = rawObject["base_role"]?.let { json.decodeFromJsonElement<InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        generalInstructions = rawObject["general_instructions"]?.let { json.decodeFromJsonElement<String>(it) },
        resourcesAttributes = rawObject["resources_attributes"]?.let { json.decodeFromJsonElement<List<InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.baseRole?.let { put("base_role", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.generalInstructions?.let { put("general_instructions", it) }
        value.resourcesAttributes?.let { put("resources_attributes", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2(block: InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2.Builder.() -> Unit): InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2 = InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
