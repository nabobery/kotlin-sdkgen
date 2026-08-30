package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A GitHub Actions workflow
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow
 */
@Serializable(with = Workflow.Serializer::class)
public class Workflow(
  public val badgeUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val htmlUrl: String,
  public val id: Int,
  public val name: String,
  public val nodeId: String,
  public val path: String,
  public val state: InlineWorkflowStateXe0665e25,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  public val url: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val deletedAt: String? = null,
) {
  public class Builder {
    private var badgeUrlValue: String? = null

    public var badgeUrl: String
      get() = requireNotNull(badgeUrlValue) { "badgeUrl is required" }
      set(`value`) {
        badgeUrlValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
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

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var stateValue: InlineWorkflowStateXe0665e25? = null

    public var state: InlineWorkflowStateXe0665e25
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var deletedAt: String? = null

    public fun build(): Workflow {
      check(badgeUrlValue != null) { "badgeUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(pathValue != null) { "path is required" }
      check(stateValue != null) { "state is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      return Workflow(
        badgeUrl = badgeUrl,
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        path = path,
        state = state,
        updatedAt = updatedAt,
        url = url,
        deletedAt = deletedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Workflow = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Workflow> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Workflow {
      val jsonDecoder = decoder.requireJsonDecoder("Workflow")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Workflow must be a JSON object")
      val badgeUrl = json.decodeRequired<String>(rawObject, "badge_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val path = json.decodeRequired<String>(rawObject, "path")
      val state = json.decodeRequired<InlineWorkflowStateXe0665e25>(rawObject, "state")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      return Workflow(
        badgeUrl = badgeUrl,
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        path = path,
        state = state,
        updatedAt = updatedAt,
        url = url,
        deletedAt = rawObject["deleted_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Workflow) {
      val jsonEncoder = encoder.requireJsonEncoder("Workflow")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("badge_url", value.badgeUrl)
        put("created_at", value.createdAt)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("path", value.path)
        put("state", json.encodeToJsonElement(value.state))
        put("updated_at", value.updatedAt)
        put("url", value.url)
        value.deletedAt?.let { put("deleted_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun workflow(block: Workflow.Builder.() -> Unit): Workflow = Workflow.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Workflow is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
