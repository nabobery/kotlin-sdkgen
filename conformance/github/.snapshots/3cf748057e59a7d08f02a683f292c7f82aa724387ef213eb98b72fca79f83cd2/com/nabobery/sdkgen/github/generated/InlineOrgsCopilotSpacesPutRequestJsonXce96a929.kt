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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}/put/requestBody/content/application
 * ~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}/put/requestBody/content/application
 * ~1json/schema
 */
@Serializable(with = InlineOrgsCopilotSpacesPutRequestJsonXce96a929.Serializer::class)
public class InlineOrgsCopilotSpacesPutRequestJsonXce96a929(
  /**
   * The base role that determines default permissions for organization members. Changing this field requires admin
   * permissions.
   * - `no_access`: No default access (default)
   * - `reader`: Organization members can read the space
   * - `writer`: Organization members can read and edit the space
   * - `admin`: Organization members have full admin access to the space
   */
  public val baseRole: InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d? = null,
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
      List<InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9>? = null,
) {
  public class Builder {
    /**
     * The base role that determines default permissions for organization members. Changing this field requires admin
     * permissions.
     * - `no_access`: No default access (default)
     * - `reader`: Organization members can read the space
     * - `writer`: Organization members can read and edit the space
     * - `admin`: Organization members have full admin access to the space
     */
    public var baseRole: InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d? = null

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
        List<InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9>? = null

    public fun build(): InlineOrgsCopilotSpacesPutRequestJsonXce96a929 = InlineOrgsCopilotSpacesPutRequestJsonXce96a929(
      baseRole = baseRole,
      description = description,
      generalInstructions = generalInstructions,
      name = name,
      resourcesAttributes = resourcesAttributes,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotSpacesPutRequestJsonXce96a929 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCopilotSpacesPutRequestJsonXce96a929> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesPutRequestJsonXce96a929 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotSpacesPutRequestJsonXce96a929")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotSpacesPutRequestJsonXce96a929 must be a JSON object")
      return InlineOrgsCopilotSpacesPutRequestJsonXce96a929(
        baseRole = rawObject["base_role"]?.let { json.decodeFromJsonElement<InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        generalInstructions = rawObject["general_instructions"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        resourcesAttributes = rawObject["resources_attributes"]?.let { json.decodeFromJsonElement<List<InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesPutRequestJsonXce96a929) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotSpacesPutRequestJsonXce96a929")
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

public fun inlineOrgsCopilotSpacesPutRequestJsonXce96a929(block: InlineOrgsCopilotSpacesPutRequestJsonXce96a929.Builder.() -> Unit): InlineOrgsCopilotSpacesPutRequestJsonXce96a929 = InlineOrgsCopilotSpacesPutRequestJsonXce96a929.build(block)
