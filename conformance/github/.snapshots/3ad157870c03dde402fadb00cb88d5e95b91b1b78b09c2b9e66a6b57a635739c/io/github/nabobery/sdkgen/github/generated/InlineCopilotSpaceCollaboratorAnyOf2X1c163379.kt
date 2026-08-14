package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/copilot-space-collaborator/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-space-collaborator/anyOf/1
 */
@Serializable(with = InlineCopilotSpaceCollaboratorAnyOf2X1c163379.Serializer::class)
public class InlineCopilotSpaceCollaboratorAnyOf2X1c163379(
  /**
   * The collaborator actor type.
   */
  public val actorType: InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154,
  public val id: Int,
  public val name: String,
  public val nodeId: String,
  /**
   * The role granted to the collaborator
   */
  public val role: InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8,
  public val slug: String,
  public val type: InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8,
  public val description: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
  public val membersUrl: String? = null,
  public val notificationSetting: String? = null,
  public val organizationId: Int? = null,
  public val parent: JsonElement? = null,
  public val privacy: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoriesUrl: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
) {
  public class Builder {
    private var actorTypeValue: InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154? = null

    public var actorType: InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154
      get() = requireNotNull(actorTypeValue) { "actorType is required" }
      set(`value`) {
        actorTypeValue = value
      }

    private var idValue: Int? = null

    public var id: Int
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

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var roleValue: InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8? = null

    public var role: InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var slugValue: String? = null

    public var slug: String
      get() = requireNotNull(slugValue) { "slug is required" }
      set(`value`) {
        slugValue = value
      }

    private var typeValue: InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8? = null

    public var type: InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var description: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    public var membersUrl: String? = null

    public var notificationSetting: String? = null

    public var organizationId: Int? = null

    public var parent: JsonElement? = null

    public var privacy: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var repositoriesUrl: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public fun build(): InlineCopilotSpaceCollaboratorAnyOf2X1c163379 {
      check(actorTypeValue != null) { "actorType is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(roleValue != null) { "role is required" }
      check(slugValue != null) { "slug is required" }
      check(typeValue != null) { "type is required" }
      return InlineCopilotSpaceCollaboratorAnyOf2X1c163379(
        actorType = actorType,
        id = id,
        name = name,
        nodeId = nodeId,
        role = role,
        slug = slug,
        type = type,
        description = description,
        htmlUrl = htmlUrl,
        membersUrl = membersUrl,
        notificationSetting = notificationSetting,
        organizationId = organizationId,
        parent = parent,
        privacy = privacy,
        repositoriesUrl = repositoriesUrl,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCopilotSpaceCollaboratorAnyOf2X1c163379 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCopilotSpaceCollaboratorAnyOf2X1c163379> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCopilotSpaceCollaboratorAnyOf2X1c163379 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCopilotSpaceCollaboratorAnyOf2X1c163379")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCopilotSpaceCollaboratorAnyOf2X1c163379 must be a JSON object")
      val actorType = json.decodeRequired<InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154>(rawObject, "actor_type")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val role = json.decodeRequired<InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8>(rawObject, "role")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      val type = json.decodeRequired<InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8>(rawObject, "type")
      return InlineCopilotSpaceCollaboratorAnyOf2X1c163379(
        actorType = actorType,
        id = id,
        name = name,
        nodeId = nodeId,
        role = role,
        slug = slug,
        type = type,
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        membersUrl = rawObject["members_url"]?.let { json.decodeFromJsonElement<String>(it) },
        notificationSetting = rawObject["notification_setting"]?.let { json.decodeFromJsonElement<String>(it) },
        organizationId = rawObject["organization_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        parent = rawObject["parent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(element) },
        privacy = rawObject["privacy"]?.let { json.decodeFromJsonElement<String>(it) },
        repositoriesUrl = rawObject["repositories_url"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSpaceCollaboratorAnyOf2X1c163379) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCopilotSpaceCollaboratorAnyOf2X1c163379")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actor_type", json.encodeToJsonElement(value.actorType))
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("role", json.encodeToJsonElement(value.role))
        put("slug", value.slug)
        put("type", json.encodeToJsonElement(value.type))
        value.description?.let { put("description", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.membersUrl?.let { put("members_url", it) }
        value.notificationSetting?.let { put("notification_setting", it) }
        value.organizationId?.let { put("organization_id", json.encodeToJsonElement(it)) }
        value.parent?.let { put("parent", json.encodeToJsonElement(it)) }
        value.privacy?.let { put("privacy", it) }
        value.repositoriesUrl?.let { put("repositories_url", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCopilotSpaceCollaboratorAnyOf2X1c163379(block: InlineCopilotSpaceCollaboratorAnyOf2X1c163379.Builder.() -> Unit): InlineCopilotSpaceCollaboratorAnyOf2X1c163379 = InlineCopilotSpaceCollaboratorAnyOf2X1c163379.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCopilotSpaceCollaboratorAnyOf2X1c163379 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
