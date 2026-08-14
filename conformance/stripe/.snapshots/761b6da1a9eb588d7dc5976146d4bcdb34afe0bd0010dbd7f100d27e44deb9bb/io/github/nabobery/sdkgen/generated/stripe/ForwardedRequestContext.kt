package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class ForwardedRequestContextView(
  @SerialName("destination_duration")
  public val destinationDuration: Int,
  @SerialName("destination_ip_address")
  public val destinationIpAddress: String,
)

/**
 * Metadata about the forwarded request.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/forwarded_request_context
 */
@Serializable(with = ForwardedRequestContext.Serializer::class)
public class ForwardedRequestContext(
  /**
   * The time it took in milliseconds for the destination endpoint to respond.
   */
  public val destinationDuration: Int,
  /**
   * The IP address of the destination.
   */
  public val destinationIpAddress: String,
) {
  public class Builder {
    private var destinationDurationValue: Int? = null

    public var destinationDuration: Int
      get() = requireNotNull(destinationDurationValue) { "destinationDuration is required" }
      set(`value`) {
        destinationDurationValue = value
      }

    private var destinationIpAddressValue: String? = null

    public var destinationIpAddress: String
      get() = requireNotNull(destinationIpAddressValue) { "destinationIpAddress is required" }
      set(`value`) {
        destinationIpAddressValue = value
      }

    public fun build(): ForwardedRequestContext {
      check(destinationDurationValue != null) { "destinationDuration is required" }
      check(destinationIpAddressValue != null) { "destinationIpAddress is required" }
      return ForwardedRequestContext(
        destinationDuration = destinationDuration,
        destinationIpAddress = destinationIpAddress,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ForwardedRequestContext = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ForwardedRequestContext> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ForwardedRequestContext {
      val jsonDecoder = decoder.requireJsonDecoder("ForwardedRequestContext")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ForwardedRequestContext must be a JSON object")
      val destinationDuration = json.decodeRequired<Int>(rawObject, "destination_duration")
      val destinationIpAddress = json.decodeRequired<String>(rawObject, "destination_ip_address")
      return ForwardedRequestContext(
        destinationDuration = destinationDuration,
        destinationIpAddress = destinationIpAddress,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ForwardedRequestContext) {
      val jsonEncoder = encoder.requireJsonEncoder("ForwardedRequestContext")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination_duration", json.encodeToJsonElement(value.destinationDuration))
        put("destination_ip_address", value.destinationIpAddress)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun forwardedRequestContext(block: ForwardedRequestContext.Builder.() -> Unit): ForwardedRequestContext = ForwardedRequestContext.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ForwardedRequestContext is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
