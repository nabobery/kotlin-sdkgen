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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/404/content/application~1json/schema
 */
@Serializable(with = InlineAgentsTasksGetResponse404JsonXdd9058db.Serializer::class)
public class InlineAgentsTasksGetResponse404JsonXdd9058db(
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
  public val errors: List<InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d>? = null,
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
    public var errors: List<InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d>? = null

    public fun build(): InlineAgentsTasksGetResponse404JsonXdd9058db {
      check(documentationUrlValue != null) { "documentationUrl is required" }
      check(messageValue != null) { "message is required" }
      return InlineAgentsTasksGetResponse404JsonXdd9058db(
        documentationUrl = documentationUrl,
        message = message,
        errors = errors,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse404JsonXdd9058db = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse404JsonXdd9058db> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse404JsonXdd9058db {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse404JsonXdd9058db")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse404JsonXdd9058db must be a JSON object")
      val documentationUrl = json.decodeRequired<String>(rawObject, "documentation_url")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineAgentsTasksGetResponse404JsonXdd9058db(
        documentationUrl = documentationUrl,
        message = message,
        errors = rawObject["errors"]?.let { json.decodeFromJsonElement<List<InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse404JsonXdd9058db) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse404JsonXdd9058db")
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

public fun inlineAgentsTasksGetResponse404JsonXdd9058db(block: InlineAgentsTasksGetResponse404JsonXdd9058db.Builder.() -> Unit): InlineAgentsTasksGetResponse404JsonXdd9058db = InlineAgentsTasksGetResponse404JsonXdd9058db.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse404JsonXdd9058db is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
