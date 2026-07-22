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
 * Source: sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/403/content/application~1json/schema
 */
@Serializable(with = InlineAgentsTasksGetResponse403JsonX66111592.Serializer::class)
public class InlineAgentsTasksGetResponse403JsonX66111592(
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
  public val errors: List<InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e>? = null,
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
    public var errors: List<InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e>? = null

    public fun build(): InlineAgentsTasksGetResponse403JsonX66111592 {
      check(documentationUrlValue != null) { "documentationUrl is required" }
      check(messageValue != null) { "message is required" }
      return InlineAgentsTasksGetResponse403JsonX66111592(
        documentationUrl = documentationUrl,
        message = message,
        errors = errors,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse403JsonX66111592 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse403JsonX66111592> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse403JsonX66111592 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse403JsonX66111592")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse403JsonX66111592 must be a JSON object")
      val documentationUrl = json.decodeRequired<String>(rawObject, "documentation_url")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineAgentsTasksGetResponse403JsonX66111592(
        documentationUrl = documentationUrl,
        message = message,
        errors = rawObject["errors"]?.let { json.decodeFromJsonElement<List<InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse403JsonX66111592) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse403JsonX66111592")
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

public fun inlineAgentsTasksGetResponse403JsonX66111592(block: InlineAgentsTasksGetResponse403JsonX66111592.Builder.() -> Unit): InlineAgentsTasksGetResponse403JsonX66111592 = InlineAgentsTasksGetResponse403JsonX66111592.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse403JsonX66111592 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
