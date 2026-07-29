package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/sigma_scheduled_query_run_error
 */
@Serializable(with = SigmaScheduledQueryRunError.Serializer::class)
public class SigmaScheduledQueryRunError(
  /**
   * Information about the run failure.
   */
  public val message: String,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    public fun build(): SigmaScheduledQueryRunError {
      check(messageValue != null) { "message is required" }
      return SigmaScheduledQueryRunError(
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SigmaScheduledQueryRunError = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SigmaScheduledQueryRunError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SigmaScheduledQueryRunError {
      val jsonDecoder = decoder.requireJsonDecoder("SigmaScheduledQueryRunError")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SigmaScheduledQueryRunError must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      return SigmaScheduledQueryRunError(
        message = message,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SigmaScheduledQueryRunError) {
      val jsonEncoder = encoder.requireJsonEncoder("SigmaScheduledQueryRunError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sigmaScheduledQueryRunError(block: SigmaScheduledQueryRunError.Builder.() -> Unit): SigmaScheduledQueryRunError = SigmaScheduledQueryRunError.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SigmaScheduledQueryRunError is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
