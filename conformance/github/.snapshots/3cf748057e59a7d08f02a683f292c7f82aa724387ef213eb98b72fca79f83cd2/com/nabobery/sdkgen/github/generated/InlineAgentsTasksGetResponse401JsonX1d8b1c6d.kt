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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/401/content/application~1json/schema
 */
@Serializable(with = InlineAgentsTasksGetResponse401JsonX1d8b1c6d.Serializer::class)
public class InlineAgentsTasksGetResponse401JsonX1d8b1c6d(
  /**
   * URL to relevant API documentation
   */
  public val documentationUrl: String,
  /**
   * Summary message (e.g. "Validation Failed", "Not Found")
   */
  public val message: String,
  /**
   * List of validation errors (present only for 422 responses)
   */
  public val errors: List<InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02>? = null,
) {
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

    /**
     * List of validation errors (present only for 422 responses)
     */
    public var errors: List<InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02>? = null

    public fun build(): InlineAgentsTasksGetResponse401JsonX1d8b1c6d {
      check(documentationUrlValue != null) { "documentationUrl is required" }
      check(messageValue != null) { "message is required" }
      return InlineAgentsTasksGetResponse401JsonX1d8b1c6d(
        documentationUrl = documentationUrl,
        message = message,
        errors = errors,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse401JsonX1d8b1c6d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse401JsonX1d8b1c6d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse401JsonX1d8b1c6d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse401JsonX1d8b1c6d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse401JsonX1d8b1c6d must be a JSON object")
      val documentationUrl = json.decodeRequired<String>(rawObject, "documentation_url")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineAgentsTasksGetResponse401JsonX1d8b1c6d(
        documentationUrl = documentationUrl,
        message = message,
        errors = rawObject["errors"]?.let { json.decodeFromJsonElement<List<InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse401JsonX1d8b1c6d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse401JsonX1d8b1c6d")
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

public fun inlineAgentsTasksGetResponse401JsonX1d8b1c6d(block: InlineAgentsTasksGetResponse401JsonX1d8b1c6d.Builder.() -> Unit): InlineAgentsTasksGetResponse401JsonX1d8b1c6d = InlineAgentsTasksGetResponse401JsonX1d8b1c6d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse401JsonX1d8b1c6d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
