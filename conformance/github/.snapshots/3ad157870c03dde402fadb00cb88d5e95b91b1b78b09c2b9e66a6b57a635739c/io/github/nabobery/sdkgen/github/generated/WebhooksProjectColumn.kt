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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_project_column.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_project_column
 */
@Serializable(with = WebhooksProjectColumn.Serializer::class)
public class WebhooksProjectColumn(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val cardsUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The unique identifier of the project column
   */
  public val id: Int,
  /**
   * Name of the project column
   */
  public val name: String,
  public val nodeId: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val projectUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val afterId: Int? = null,
) {
  public class Builder {
    private var cardsUrlValue: String? = null

    public var cardsUrl: String
      get() = requireNotNull(cardsUrlValue) { "cardsUrl is required" }
      set(`value`) {
        cardsUrlValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
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

    private var projectUrlValue: String? = null

    public var projectUrl: String
      get() = requireNotNull(projectUrlValue) { "projectUrl is required" }
      set(`value`) {
        projectUrlValue = value
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

    public var afterId: Int? = null

    public fun build(): WebhooksProjectColumn {
      check(cardsUrlValue != null) { "cardsUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(projectUrlValue != null) { "projectUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      return WebhooksProjectColumn(
        cardsUrl = cardsUrl,
        createdAt = createdAt,
        id = id,
        name = name,
        nodeId = nodeId,
        projectUrl = projectUrl,
        updatedAt = updatedAt,
        url = url,
        afterId = afterId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksProjectColumn = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhooksProjectColumn> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksProjectColumn {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksProjectColumn")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksProjectColumn must be a JSON object")
      val cardsUrl = json.decodeRequired<String>(rawObject, "cards_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val projectUrl = json.decodeRequired<String>(rawObject, "project_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      return WebhooksProjectColumn(
        cardsUrl = cardsUrl,
        createdAt = createdAt,
        id = id,
        name = name,
        nodeId = nodeId,
        projectUrl = projectUrl,
        updatedAt = updatedAt,
        url = url,
        afterId = rawObject["after_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksProjectColumn) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksProjectColumn")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cards_url", value.cardsUrl)
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("project_url", value.projectUrl)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        value.afterId?.let { put("after_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksProjectColumn(block: WebhooksProjectColumn.Builder.() -> Unit): WebhooksProjectColumn = WebhooksProjectColumn.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksProjectColumn is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
