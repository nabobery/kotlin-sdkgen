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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/401/content/application~1j
 * son/schema
 */
@Serializable(with = InlineAgentsReposTasksPostResponse401JsonXd6c225c6.Serializer::class)
public class InlineAgentsReposTasksPostResponse401JsonXd6c225c6(
  /**
   * URL to relevant API documentation
   */
  public val documentationUrl: String,
  /**
   * Summary message (e.g. "Validation Failed", "Not Found")
   */
  public val message: String,
  errors: List<InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033>? = null,
) {
  /**
   * List of validation errors (present only for 422 responses)
   */
  public val errors: List<InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033>? =
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

    private var errorsValue: List<InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033>? =
        null

    /**
     * List of validation errors (present only for 422 responses)
     */
    public var errors: List<InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033>?
      get() = errorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        errorsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineAgentsReposTasksPostResponse401JsonXd6c225c6 {
      check(documentationUrlValue != null) { "documentationUrl is required" }
      check(messageValue != null) { "message is required" }
      return InlineAgentsReposTasksPostResponse401JsonXd6c225c6(
        documentationUrl = documentationUrl,
        message = message,
        errors = errors,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksPostResponse401JsonXd6c225c6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksPostResponse401JsonXd6c225c6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse401JsonXd6c225c6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksPostResponse401JsonXd6c225c6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksPostResponse401JsonXd6c225c6 must be a JSON object")
      val documentationUrl = json.decodeRequired<String>(rawObject, "documentation_url")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineAgentsReposTasksPostResponse401JsonXd6c225c6(
        documentationUrl = documentationUrl,
        message = message,
        errors = rawObject["errors"]?.let { json.decodeFromJsonElement<List<InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse401JsonXd6c225c6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksPostResponse401JsonXd6c225c6")
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

public fun inlineAgentsReposTasksPostResponse401JsonXd6c225c6(block: InlineAgentsReposTasksPostResponse401JsonXd6c225c6.Builder.() -> Unit): InlineAgentsReposTasksPostResponse401JsonXd6c225c6 = InlineAgentsReposTasksPostResponse401JsonXd6c225c6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksPostResponse401JsonXd6c225c6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
