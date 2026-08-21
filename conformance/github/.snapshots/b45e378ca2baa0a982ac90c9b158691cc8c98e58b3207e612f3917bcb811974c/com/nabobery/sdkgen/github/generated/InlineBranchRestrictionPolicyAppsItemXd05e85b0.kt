package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/branch-restriction-policy/properties/apps/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/branch-restriction-policy/properties/apps/items
 */
@Serializable(with = InlineBranchRestrictionPolicyAppsItemXd05e85b0.Serializer::class)
public class InlineBranchRestrictionPolicyAppsItemXd05e85b0(
  public val clientId: String? = null,
  public val createdAt: String? = null,
  public val description: String? = null,
  events: List<String>? = null,
  public val externalUrl: String? = null,
  public val htmlUrl: String? = null,
  public val id: Int? = null,
  public val name: String? = null,
  public val nodeId: String? = null,
  public val owner: InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085? = null,
  public val permissions: InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c? = null,
  public val slug: String? = null,
  public val updatedAt: String? = null,
) {
  public val events: List<String>? = events?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var clientId: String? = null

    public var createdAt: String? = null

    public var description: String? = null

    private var eventsValue: List<String>? = null

    public var events: List<String>?
      get() = eventsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        eventsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var externalUrl: String? = null

    public var htmlUrl: String? = null

    public var id: Int? = null

    public var name: String? = null

    public var nodeId: String? = null

    public var owner: InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085? = null

    public var permissions: InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c? = null

    public var slug: String? = null

    public var updatedAt: String? = null

    public fun build(): InlineBranchRestrictionPolicyAppsItemXd05e85b0 = InlineBranchRestrictionPolicyAppsItemXd05e85b0(
      clientId = clientId,
      createdAt = createdAt,
      description = description,
      events = events,
      externalUrl = externalUrl,
      htmlUrl = htmlUrl,
      id = id,
      name = name,
      nodeId = nodeId,
      owner = owner,
      permissions = permissions,
      slug = slug,
      updatedAt = updatedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBranchRestrictionPolicyAppsItemXd05e85b0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBranchRestrictionPolicyAppsItemXd05e85b0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBranchRestrictionPolicyAppsItemXd05e85b0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBranchRestrictionPolicyAppsItemXd05e85b0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBranchRestrictionPolicyAppsItemXd05e85b0 must be a JSON object")
      return InlineBranchRestrictionPolicyAppsItemXd05e85b0(
        clientId = rawObject["client_id"]?.let { json.decodeFromJsonElement<String>(it) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        events = rawObject["events"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        externalUrl = rawObject["external_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c>(it) },
        slug = rawObject["slug"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBranchRestrictionPolicyAppsItemXd05e85b0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBranchRestrictionPolicyAppsItemXd05e85b0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.clientId?.let { put("client_id", it) }
        value.createdAt?.let { put("created_at", it) }
        value.description?.let { put("description", it) }
        value.events?.let { put("events", json.encodeToJsonElement(it)) }
        value.externalUrl?.let { put("external_url", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.nodeId?.let { put("node_id", it) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
        value.slug?.let { put("slug", it) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBranchRestrictionPolicyAppsItemXd05e85b0(block: InlineBranchRestrictionPolicyAppsItemXd05e85b0.Builder.() -> Unit): InlineBranchRestrictionPolicyAppsItemXd05e85b0 = InlineBranchRestrictionPolicyAppsItemXd05e85b0.build(block)
