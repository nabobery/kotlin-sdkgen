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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_workflow_job_run.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_workflow_job_run
 */
@Serializable(with = WebhooksWorkflowJobRun.Serializer::class)
public class WebhooksWorkflowJobRun(
  public val conclusion: JsonElement?,
  public val createdAt: String,
  public val environment: String,
  public val htmlUrl: String,
  public val id: Int,
  public val name: JsonElement?,
  public val status: String,
  public val updatedAt: String,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var environmentValue: String? = null

    public var environment: String
      get() = requireNotNull(environmentValue) { "environment is required" }
      set(`value`) {
        environmentValue = value
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

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var conclusionState: FieldState<JsonElement?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion: JsonElement?
      get() = conclusionState.valueOrNull()
      set(`value`) {
        conclusionState = value.toNullableFieldState()
      }

    private var nameState: FieldState<JsonElement?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var name: JsonElement?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    public fun build(): WebhooksWorkflowJobRun {
      check(createdAtValue != null) { "createdAt is required" }
      check(environmentValue != null) { "environment is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(statusValue != null) { "status is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      check(nameState !== FieldState.Absent) { "name is required, even when null" }
      return WebhooksWorkflowJobRun(
        conclusion = conclusionState.valueOrNull(),
        createdAt = createdAt,
        environment = environment,
        htmlUrl = htmlUrl,
        id = id,
        name = nameState.valueOrNull(),
        status = status,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksWorkflowJobRun = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhooksWorkflowJobRun> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksWorkflowJobRun {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksWorkflowJobRun")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksWorkflowJobRun must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val environment = json.decodeRequired<String>(rawObject, "environment")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val status = json.decodeRequired<String>(rawObject, "status")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("WebhooksWorkflowJobRun is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(requireNotNull(element)) }
      if (!rawObject.containsKey("name")) {
        throw SerializationException("WebhooksWorkflowJobRun is missing required property 'name'")
      }
      val name = rawObject["name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(requireNotNull(element)) }
      return WebhooksWorkflowJobRun(
        conclusion = conclusion,
        createdAt = createdAt,
        environment = environment,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        status = status,
        updatedAt = updatedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksWorkflowJobRun) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksWorkflowJobRun")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("conclusion", value.conclusion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("environment", value.environment)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("status", value.status)
        put("updated_at", value.updatedAt)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksWorkflowJobRun(block: WebhooksWorkflowJobRun.Builder.() -> Unit): WebhooksWorkflowJobRun = WebhooksWorkflowJobRun.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksWorkflowJobRun is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhooksWorkflowJobRun property '" + name + "' is not nullable")
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
