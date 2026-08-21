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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces/post/requestBody/content/application~1json/sc
 * hema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces/post/requestBody/content/application~1json/sc
 * hema
 */
@Serializable(with = InlineUsersCopilotSpacesPostRequestJsonX8861b605.Serializer::class)
public class InlineUsersCopilotSpacesPostRequestJsonX8861b605(
  /**
   * The name of the Copilot Space.
   */
  public val name: String,
  /**
   * The base role that determines default permissions for the space.
   * - `no_access`: No default access (default)
   * - `reader`: Makes the space publicly readable
   * Note: User spaces do not support writer or admin base roles.
   */
  public val baseRole: InlineUsersCopilotSpacesPostRequestJsonBaseRoleXe2ee32c6? = null,
  /**
   * A description of the Copilot Space.
   */
  public val description: String? = null,
  /**
   * General instructions for the Copilot Space.
   */
  public val generalInstructions: String? = null,
  resourcesAttributes: List<InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685>? = null,
) {
  /**
   * Resources to attach to the space.
   */
  public val resourcesAttributes:
      List<InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685>? =
      resourcesAttributes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * The base role that determines default permissions for the space.
     * - `no_access`: No default access (default)
     * - `reader`: Makes the space publicly readable
     * Note: User spaces do not support writer or admin base roles.
     */
    public var baseRole: InlineUsersCopilotSpacesPostRequestJsonBaseRoleXe2ee32c6? = null

    /**
     * A description of the Copilot Space.
     */
    public var description: String? = null

    /**
     * General instructions for the Copilot Space.
     */
    public var generalInstructions: String? = null

    private var resourcesAttributesValue:
        List<InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685>? = null

    /**
     * Resources to attach to the space.
     */
    public var resourcesAttributes:
        List<InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685>?
      get() = resourcesAttributesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        resourcesAttributesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineUsersCopilotSpacesPostRequestJsonX8861b605 {
      check(nameValue != null) { "name is required" }
      return InlineUsersCopilotSpacesPostRequestJsonX8861b605(
        name = name,
        baseRole = baseRole,
        description = description,
        generalInstructions = generalInstructions,
        resourcesAttributes = resourcesAttributes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersCopilotSpacesPostRequestJsonX8861b605 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesPostRequestJsonX8861b605> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesPostRequestJsonX8861b605 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersCopilotSpacesPostRequestJsonX8861b605")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersCopilotSpacesPostRequestJsonX8861b605 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineUsersCopilotSpacesPostRequestJsonX8861b605(
        name = name,
        baseRole = rawObject["base_role"]?.let { json.decodeFromJsonElement<InlineUsersCopilotSpacesPostRequestJsonBaseRoleXe2ee32c6>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        generalInstructions = rawObject["general_instructions"]?.let { json.decodeFromJsonElement<String>(it) },
        resourcesAttributes = rawObject["resources_attributes"]?.let { json.decodeFromJsonElement<List<InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesPostRequestJsonX8861b605) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersCopilotSpacesPostRequestJsonX8861b605")
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

public fun inlineUsersCopilotSpacesPostRequestJsonX8861b605(block: InlineUsersCopilotSpacesPostRequestJsonX8861b605.Builder.() -> Unit): InlineUsersCopilotSpacesPostRequestJsonX8861b605 = InlineUsersCopilotSpacesPostRequestJsonX8861b605.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersCopilotSpacesPostRequestJsonX8861b605 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
