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
 * Source: sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/422/content/application~1json/schema
 */
@Serializable(with = InlineAgentsTasksGetResponse422JsonX7cde791f.Serializer::class)
public class InlineAgentsTasksGetResponse422JsonX7cde791f(
  /**
   * URL to relevant API documentation
   */
  public val documentationUrl: String,
  /**
   * Summary message (e.g. "Validation Failed", "Not Found")
   */
  public val message: String,
  errors: List<InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46>? = null,
) {
  /**
   * List of validation errors (present only for 422 responses)
   */
  public val errors: List<InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46>? =
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

    private var errorsValue: List<InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46>? = null

    /**
     * List of validation errors (present only for 422 responses)
     */
    public var errors: List<InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46>?
      get() = errorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        errorsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineAgentsTasksGetResponse422JsonX7cde791f {
      check(documentationUrlValue != null) { "documentationUrl is required" }
      check(messageValue != null) { "message is required" }
      return InlineAgentsTasksGetResponse422JsonX7cde791f(
        documentationUrl = documentationUrl,
        message = message,
        errors = errors,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse422JsonX7cde791f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse422JsonX7cde791f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse422JsonX7cde791f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse422JsonX7cde791f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse422JsonX7cde791f must be a JSON object")
      val documentationUrl = json.decodeRequired<String>(rawObject, "documentation_url")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineAgentsTasksGetResponse422JsonX7cde791f(
        documentationUrl = documentationUrl,
        message = message,
        errors = rawObject["errors"]?.let { json.decodeFromJsonElement<List<InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse422JsonX7cde791f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse422JsonX7cde791f")
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

public fun inlineAgentsTasksGetResponse422JsonX7cde791f(block: InlineAgentsTasksGetResponse422JsonX7cde791f.Builder.() -> Unit): InlineAgentsTasksGetResponse422JsonX7cde791f = InlineAgentsTasksGetResponse422JsonX7cde791f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse422JsonX7cde791f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
