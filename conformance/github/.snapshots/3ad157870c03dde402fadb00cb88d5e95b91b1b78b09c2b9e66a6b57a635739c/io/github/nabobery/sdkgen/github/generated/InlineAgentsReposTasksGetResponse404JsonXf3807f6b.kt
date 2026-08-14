package io.github.nabobery.sdkgen.github.generated

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
 * Structured error response following GitHub REST API conventions.
 * For 422 Unprocessable Entity the errors array contains validation
 * details; for other error status codes only message and
 * documentation_url are returned.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/404/content/appl
 * ication~1json/schema
 */
@Serializable(with = InlineAgentsReposTasksGetResponse404JsonXf3807f6b.Serializer::class)
public class InlineAgentsReposTasksGetResponse404JsonXf3807f6b(
  /**
   * URL to relevant API documentation
   */
  public val documentationUrl: String,
  /**
   * Summary message (e.g. "Validation Failed", "Not Found")
   */
  public val message: String,
  errors: List<InlineAgentsReposTasksGetResponse404JsonErrorsItemX63d04751>? = null,
) {
  /**
   * List of validation errors (present only for 422 responses)
   */
  public val errors: List<InlineAgentsReposTasksGetResponse404JsonErrorsItemX63d04751>? =
      errors?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var documentationUrlValue: String? = null

    public var documentationUrl: String
      get() = requireNotNull(documentationUrlValue) { "documentationUrl is required" }
      set(`value`) {
        documentationUrlValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var errorsValue: List<InlineAgentsReposTasksGetResponse404JsonErrorsItemX63d04751>? =
        null

    /**
     * List of validation errors (present only for 422 responses)
     */
    public var errors: List<InlineAgentsReposTasksGetResponse404JsonErrorsItemX63d04751>?
      get() = errorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        errorsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineAgentsReposTasksGetResponse404JsonXf3807f6b {
      check(documentationUrlValue != null) { "documentationUrl is required" }
      check(messageValue != null) { "message is required" }
      return InlineAgentsReposTasksGetResponse404JsonXf3807f6b(
        documentationUrl = documentationUrl,
        message = message,
        errors = errors,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse404JsonXf3807f6b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse404JsonXf3807f6b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse404JsonXf3807f6b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse404JsonXf3807f6b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse404JsonXf3807f6b must be a JSON object")
      val documentationUrl = json.decodeRequired<String>(rawObject, "documentation_url")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineAgentsReposTasksGetResponse404JsonXf3807f6b(
        documentationUrl = documentationUrl,
        message = message,
        errors = rawObject["errors"]?.let { json.decodeFromJsonElement<List<InlineAgentsReposTasksGetResponse404JsonErrorsItemX63d04751>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse404JsonXf3807f6b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse404JsonXf3807f6b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("documentation_url", value.documentationUrl)
        put("message", value.message)
        value.errors?.let { put("errors", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse404JsonXf3807f6b(block: InlineAgentsReposTasksGetResponse404JsonXf3807f6b.Builder.() -> Unit): InlineAgentsReposTasksGetResponse404JsonXf3807f6b = InlineAgentsReposTasksGetResponse404JsonXf3807f6b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksGetResponse404JsonXf3807f6b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
