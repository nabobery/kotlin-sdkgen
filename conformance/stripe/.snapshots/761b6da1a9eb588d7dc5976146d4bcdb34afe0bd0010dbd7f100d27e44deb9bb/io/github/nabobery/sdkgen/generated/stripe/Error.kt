package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * An error response from the Stripe API
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/error
 */
@Serializable(with = Error.Serializer::class)
public class Error(
  public val error: ApiErrors,
) {
  public class Builder {
    private var errorValue: ApiErrors? = null

    public var error: ApiErrors
      get() = requireNotNull(errorValue) { "error is required" }
      set(`value`) {
        errorValue = value
      }

    public fun build(): Error {
      check(errorValue != null) { "error is required" }
      return Error(
        error = error,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Error = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Error> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Error {
      val jsonDecoder = decoder.requireJsonDecoder("Error")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Error must be a JSON object")
      val error = json.decodeRequired<ApiErrors>(rawObject, "error")
      return Error(
        error = error,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Error) {
      val jsonEncoder = encoder.requireJsonEncoder("Error")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error", json.encodeToJsonElement(value.error))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun error(block: Error.Builder.() -> Unit): Error = Error.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Error is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
