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
import kotlinx.serialization.json.put

/**
 * Header data.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/forwarded_request_header
 */
@Serializable(with = ForwardedRequestHeader.Serializer::class)
public class ForwardedRequestHeader(
  /**
   * The header name.
   */
  public val name: String,
  /**
   * The header value.
   */
  public val `value`: String,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): ForwardedRequestHeader {
      check(nameValue != null) { "name is required" }
      check(valueValue != null) { "value is required" }
      return ForwardedRequestHeader(
        name = name,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ForwardedRequestHeader = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ForwardedRequestHeader> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ForwardedRequestHeader {
      val jsonDecoder = decoder.requireJsonDecoder("ForwardedRequestHeader")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ForwardedRequestHeader must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val value = json.decodeRequired<String>(rawObject, "value")
      return ForwardedRequestHeader(
        name = name,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ForwardedRequestHeader) {
      val jsonEncoder = encoder.requireJsonEncoder("ForwardedRequestHeader")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun forwardedRequestHeader(block: ForwardedRequestHeader.Builder.() -> Unit): ForwardedRequestHeader = ForwardedRequestHeader.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ForwardedRequestHeader is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
