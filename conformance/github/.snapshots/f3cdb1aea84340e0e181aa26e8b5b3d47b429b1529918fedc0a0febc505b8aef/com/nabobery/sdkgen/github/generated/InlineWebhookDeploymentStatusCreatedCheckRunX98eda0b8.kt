package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/check_run.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/check_run
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8.Serializer::class)
public class InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val completedAt: String?,
  /**
   * The result of the completed check run. This value will be `null` until the check run has completed.
   */
  public val conclusion: InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val detailsUrl: String,
  public val externalId: String,
  /**
   * The SHA of the commit that is being checked.
   */
  public val headSha: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * The id of the check.
   */
  public val id: Int,
  /**
   * The name of the check run.
   */
  public val name: String,
  public val nodeId: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val startedAt: String,
  /**
   * The current status of the check run. Can be `queued`, `in_progress`, or `completed`.
   */
  public val status: InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var detailsUrlValue: String? = null

    public var detailsUrl: String
      get() = requireNotNull(detailsUrlValue) { "detailsUrl is required" }
      set(`value`) {
        detailsUrlValue = value
      }

    private var externalIdValue: String? = null

    public var externalId: String
      get() = requireNotNull(externalIdValue) { "externalId is required" }
      set(`value`) {
        externalIdValue = value
      }

    private var headShaValue: String? = null

    public var headSha: String
      get() = requireNotNull(headShaValue) { "headSha is required" }
      set(`value`) {
        headShaValue = value
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

    private var startedAtValue: String? = null

    public var startedAt: String
      get() = requireNotNull(startedAtValue) { "startedAt is required" }
      set(`value`) {
        startedAtValue = value
      }

    private var statusValue: InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362? = null

    public var status: InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var completedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var completedAt: String?
      get() = completedAtState.valueOrNull()
      set(`value`) {
        completedAtState = value.toNullableFieldState()
      }

    private var conclusionState:
        FieldState<InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9?> =
        FieldState.Absent

    /**
     * The result of the completed check run. This value will be `null` until the check run has completed.
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion: InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9?
      get() = conclusionState.valueOrNull()
      set(`value`) {
        conclusionState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8 {
      check(detailsUrlValue != null) { "detailsUrl is required" }
      check(externalIdValue != null) { "externalId is required" }
      check(headShaValue != null) { "headSha is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(startedAtValue != null) { "startedAt is required" }
      check(statusValue != null) { "status is required" }
      check(urlValue != null) { "url is required" }
      check(completedAtState !== FieldState.Absent) { "completedAt is required, even when null" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      return InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8(
        completedAt = completedAtState.valueOrNull(),
        conclusion = conclusionState.valueOrNull(),
        detailsUrl = detailsUrl,
        externalId = externalId,
        headSha = headSha,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        startedAt = startedAt,
        status = status,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8 must be a JSON object")
      val detailsUrl = json.decodeRequired<String>(rawObject, "details_url")
      val externalId = json.decodeRequired<String>(rawObject, "external_id")
      val headSha = json.decodeRequired<String>(rawObject, "head_sha")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val startedAt = json.decodeRequired<String>(rawObject, "started_at")
      val status = json.decodeRequired<InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362>(rawObject, "status")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("completed_at")) {
        throw SerializationException("InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8 is missing required property 'completed_at'")
      }
      val completedAt = rawObject["completed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8 is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9?>(requireNotNull(element)) }
      return InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8(
        completedAt = completedAt,
        conclusion = conclusion,
        detailsUrl = detailsUrl,
        externalId = externalId,
        headSha = headSha,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        startedAt = startedAt,
        status = status,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completed_at", value.completedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("conclusion", value.conclusion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("details_url", value.detailsUrl)
        put("external_id", value.externalId)
        put("head_sha", value.headSha)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("started_at", value.startedAt)
        put("status", json.encodeToJsonElement(value.status))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8(block: InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8.Builder.() -> Unit): InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8 = InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8 property '" + name + "' is not nullable")
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
