package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_project.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_project
 */
@Serializable(with = WebhooksProject.Serializer::class)
public class WebhooksProject(
  /**
   * Body of the project
   */
  public val body: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val columnsUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val creator: InlineWebhooksProjectCreatorX4ce312ad?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  /**
   * Name of the project
   */
  public val name: String,
  public val nodeId: String,
  public val number: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val ownerUrl: String,
  /**
   * State of the project; either 'open' or 'closed'
   */
  public val state: InlineWebhooksProjectStateX9ace20ca,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var columnsUrlValue: String? = null

    public var columnsUrl: String
      get() = requireNotNull(columnsUrlValue) { "columnsUrl is required" }
      set(`value`) {
        columnsUrlValue = value
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

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var ownerUrlValue: String? = null

    public var ownerUrl: String
      get() = requireNotNull(ownerUrlValue) { "ownerUrl is required" }
      set(`value`) {
        ownerUrlValue = value
      }

    private var stateValue: InlineWebhooksProjectStateX9ace20ca? = null

    public var state: InlineWebhooksProjectStateX9ace20ca
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

    private var bodyState: FieldState<String?> = FieldState.Absent

    /**
     * Body of the project
     * Required nullable field; assigning `null` records present-null.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        bodyState = value.toNullableFieldState()
      }

    private var creatorState: FieldState<InlineWebhooksProjectCreatorX4ce312ad?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var creator: InlineWebhooksProjectCreatorX4ce312ad?
      get() = creatorState.valueOrNull()
      set(`value`) {
        creatorState = value.toNullableFieldState()
      }

    public fun build(): WebhooksProject {
      check(columnsUrlValue != null) { "columnsUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(numberValue != null) { "number is required" }
      check(ownerUrlValue != null) { "ownerUrl is required" }
      check(stateValue != null) { "state is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(bodyState !== FieldState.Absent) { "body is required, even when null" }
      check(creatorState !== FieldState.Absent) { "creator is required, even when null" }
      return WebhooksProject(
        body = bodyState.valueOrNull(),
        columnsUrl = columnsUrl,
        createdAt = createdAt,
        creator = creatorState.valueOrNull(),
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        number = number,
        ownerUrl = ownerUrl,
        state = state,
        updatedAt = updatedAt,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksProject = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhooksProject> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksProject {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksProject")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksProject must be a JSON object")
      val columnsUrl = json.decodeRequired<String>(rawObject, "columns_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val ownerUrl = json.decodeRequired<String>(rawObject, "owner_url")
      val state = json.decodeRequired<InlineWebhooksProjectStateX9ace20ca>(rawObject, "state")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("body")) {
        throw SerializationException("WebhooksProject is missing required property 'body'")
      }
      val body = rawObject["body"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("creator")) {
        throw SerializationException("WebhooksProject is missing required property 'creator'")
      }
      val creator = rawObject["creator"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhooksProjectCreatorX4ce312ad?>(requireNotNull(element)) }
      return WebhooksProject(
        body = body,
        columnsUrl = columnsUrl,
        createdAt = createdAt,
        creator = creator,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        number = number,
        ownerUrl = ownerUrl,
        state = state,
        updatedAt = updatedAt,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksProject) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksProject")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("columns_url", value.columnsUrl)
        put("created_at", value.createdAt)
        put("creator", value.creator?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("number", json.encodeToJsonElement(value.number))
        put("owner_url", value.ownerUrl)
        put("state", json.encodeToJsonElement(value.state))
        put("updated_at", value.updatedAt)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksProject(block: WebhooksProject.Builder.() -> Unit): WebhooksProject = WebhooksProject.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksProject is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("WebhooksProject property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
