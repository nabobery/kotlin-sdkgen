package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/403/content/application~1j
 * son/schema
 */
@Serializable(with = InlineAgentsReposTasksPostResponse403JsonX676b3b50.Serializer::class)
public class InlineAgentsReposTasksPostResponse403JsonX676b3b50(
  /**
   * URL to relevant API documentation
   */
  public val documentationUrl: String,
  /**
   * Summary message (e.g. "Validation Failed", "Not Found")
   */
  public val message: String,
  errors: List<InlineAgentsReposTasksPostResponse403JsonErrorsItemX011e1e15>? = null,
) {
  /**
   * List of validation errors (present only for 422 responses)
   */
  public val errors: List<InlineAgentsReposTasksPostResponse403JsonErrorsItemX011e1e15>? =
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

    private var errorsValue: List<InlineAgentsReposTasksPostResponse403JsonErrorsItemX011e1e15>? =
        null

    /**
     * List of validation errors (present only for 422 responses)
     */
    public var errors: List<InlineAgentsReposTasksPostResponse403JsonErrorsItemX011e1e15>?
      get() = errorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        errorsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineAgentsReposTasksPostResponse403JsonX676b3b50 {
      check(documentationUrlValue != null) { "documentationUrl is required" }
      check(messageValue != null) { "message is required" }
      return InlineAgentsReposTasksPostResponse403JsonX676b3b50(
        documentationUrl = documentationUrl,
        message = message,
        errors = errors,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksPostResponse403JsonX676b3b50 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksPostResponse403JsonX676b3b50> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse403JsonX676b3b50 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksPostResponse403JsonX676b3b50")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksPostResponse403JsonX676b3b50 must be a JSON object")
      val documentationUrl = json.decodeRequired<String>(rawObject, "documentation_url")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineAgentsReposTasksPostResponse403JsonX676b3b50(
        documentationUrl = documentationUrl,
        message = message,
        errors = rawObject["errors"]?.let { json.decodeFromJsonElement<List<InlineAgentsReposTasksPostResponse403JsonErrorsItemX011e1e15>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse403JsonX676b3b50) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksPostResponse403JsonX676b3b50")
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

public fun inlineAgentsReposTasksPostResponse403JsonX676b3b50(block: InlineAgentsReposTasksPostResponse403JsonX676b3b50.Builder.() -> Unit): InlineAgentsReposTasksPostResponse403JsonX676b3b50 = InlineAgentsReposTasksPostResponse403JsonX676b3b50.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksPostResponse403JsonX676b3b50 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
