package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.Long
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A GitHub Copilot Space represents an interactive AI workspace where users can ask questions and get assistance.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-space
 */
@Serializable(with = CopilotSpace.Serializer::class)
public class CopilotSpace(
  /**
   * The API URL of the space.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val apiUrl: String,
  /**
   * The base role that determines default permissions.
   * - `no_access`: No default access
   * - `reader`: Default read permissions
   * - `writer`: Default write permissions (organization spaces only)
   * - `admin`: Default admin permissions (organization spaces only)
   */
  public val baseRole: InlineCopilotSpaceBaseRoleXd8ebe5ee,
  /**
   * The date and time the space was created.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val creator: SimpleUser,
  /**
   * The HTML URL of the space.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * The unique identifier of the space.
   */
  public val id: Long,
  /**
   * The display name of the space.
   */
  public val name: String,
  /**
   * The number that identifies the space within its owner.
   */
  public val number: Int,
  /**
   * The user or organization that owns this space.
   */
  public val owner: InlineCopilotSpaceOwnerX5cb2e116,
  /**
   * The date and time the space was last updated.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * A description of the space.
   */
  public val description: String? = null,
  /**
   * General instructions for the Copilot Space.
   */
  public val generalInstructions: String? = null,
  resourcesAttributes: List<InlineCopilotSpaceResourcesAttributesItemX369f870a>? = null,
) {
  /**
   * Resources attached to the space.
   */
  public val resourcesAttributes: List<InlineCopilotSpaceResourcesAttributesItemX369f870a>? =
      resourcesAttributes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var apiUrlValue: String? = null

    public var apiUrl: String
      get() = requireNotNull(apiUrlValue) { "apiUrl is required" }
      set(`value`) {
        apiUrlValue = value
      }

    private var baseRoleValue: InlineCopilotSpaceBaseRoleXd8ebe5ee? = null

    public var baseRole: InlineCopilotSpaceBaseRoleXd8ebe5ee
      get() = requireNotNull(baseRoleValue) { "baseRole is required" }
      set(`value`) {
        baseRoleValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var creatorValue: SimpleUser? = null

    public var creator: SimpleUser
      get() = requireNotNull(creatorValue) { "creator is required" }
      set(`value`) {
        creatorValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var ownerValue: InlineCopilotSpaceOwnerX5cb2e116? = null

    public var owner: InlineCopilotSpaceOwnerX5cb2e116
      get() = requireNotNull(ownerValue) { "owner is required" }
      set(`value`) {
        ownerValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    /**
     * A description of the space.
     */
    public var description: String? = null

    /**
     * General instructions for the Copilot Space.
     */
    public var generalInstructions: String? = null

    private var resourcesAttributesValue: List<InlineCopilotSpaceResourcesAttributesItemX369f870a>?
        = null

    /**
     * Resources attached to the space.
     */
    public var resourcesAttributes: List<InlineCopilotSpaceResourcesAttributesItemX369f870a>?
      get() = resourcesAttributesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        resourcesAttributesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): CopilotSpace {
      check(apiUrlValue != null) { "apiUrl is required" }
      check(baseRoleValue != null) { "baseRole is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(creatorValue != null) { "creator is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(numberValue != null) { "number is required" }
      check(ownerValue != null) { "owner is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      return CopilotSpace(
        apiUrl = apiUrl,
        baseRole = baseRole,
        createdAt = createdAt,
        creator = creator,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        number = number,
        owner = owner,
        updatedAt = updatedAt,
        description = description,
        generalInstructions = generalInstructions,
        resourcesAttributes = resourcesAttributes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CopilotSpace = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CopilotSpace> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CopilotSpace {
      val jsonDecoder = decoder.requireJsonDecoder("CopilotSpace")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CopilotSpace must be a JSON object")
      val apiUrl = json.decodeRequired<String>(rawObject, "api_url")
      val baseRole = json.decodeRequired<InlineCopilotSpaceBaseRoleXd8ebe5ee>(rawObject, "base_role")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val creator = json.decodeRequired<SimpleUser>(rawObject, "creator")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val owner = json.decodeRequired<InlineCopilotSpaceOwnerX5cb2e116>(rawObject, "owner")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      return CopilotSpace(
        apiUrl = apiUrl,
        baseRole = baseRole,
        createdAt = createdAt,
        creator = creator,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        number = number,
        owner = owner,
        updatedAt = updatedAt,
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        generalInstructions = rawObject["general_instructions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        resourcesAttributes = rawObject["resources_attributes"]?.let { json.decodeFromJsonElement<List<InlineCopilotSpaceResourcesAttributesItemX369f870a>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CopilotSpace) {
      val jsonEncoder = encoder.requireJsonEncoder("CopilotSpace")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("api_url", value.apiUrl)
        put("base_role", json.encodeToJsonElement(value.baseRole))
        put("created_at", value.createdAt)
        put("creator", json.encodeToJsonElement(value.creator))
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("number", json.encodeToJsonElement(value.number))
        put("owner", json.encodeToJsonElement(value.owner))
        put("updated_at", value.updatedAt)
        value.description?.let { put("description", it) }
        value.generalInstructions?.let { put("general_instructions", it) }
        value.resourcesAttributes?.let { put("resources_attributes", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun copilotSpace(block: CopilotSpace.Builder.() -> Unit): CopilotSpace = CopilotSpace.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CopilotSpace is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
