package io.github.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.Int
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

@ConsistentCopyVisibility
@Serializable
public data class ForwardedResponseDetailsView internal constructor(
  public val body: String,
  public val headers: List<ForwardedRequestHeader>,
  public val status: Int,
)

/**
 * Details about the response from the destination endpoint.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/forwarded_response_details
 */
@Serializable(with = ForwardedResponseDetails.Serializer::class)
public class ForwardedResponseDetails(
  /**
   * The response body from the destination endpoint to Stripe.
   */
  public val body: String,
  headers: List<ForwardedRequestHeader>,
  /**
   * The HTTP status code that the destination endpoint returned.
   */
  public val status: Int,
) {
  /**
   * HTTP headers that the destination endpoint returned.
   */
  public val headers: List<ForwardedRequestHeader> = headers.toList()

  public class Builder {
    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    private var headersValue: List<ForwardedRequestHeader>? = null

    public var headers: List<ForwardedRequestHeader>
      get() = requireNotNull(headersValue) { "headers is required" }.toList()
      set(`value`) {
        headersValue = value.toList()
      }

    private var statusValue: Int? = null

    public var status: Int
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public fun build(): ForwardedResponseDetails {
      check(bodyValue != null) { "body is required" }
      check(headersValue != null) { "headers is required" }
      check(statusValue != null) { "status is required" }
      return ForwardedResponseDetails(
        body = body,
        headers = headers,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ForwardedResponseDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ForwardedResponseDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ForwardedResponseDetails {
      val jsonDecoder = decoder.requireJsonDecoder("ForwardedResponseDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ForwardedResponseDetails must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      val headers = json.decodeRequired<List<ForwardedRequestHeader>>(rawObject, "headers")
      val status = json.decodeRequired<Int>(rawObject, "status")
      return ForwardedResponseDetails(
        body = body,
        headers = headers,
        status = status,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ForwardedResponseDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("ForwardedResponseDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body)
        put("headers", json.encodeToJsonElement(value.headers))
        put("status", json.encodeToJsonElement(value.status))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun forwardedResponseDetails(block: ForwardedResponseDetails.Builder.() -> Unit): ForwardedResponseDetails = ForwardedResponseDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ForwardedResponseDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
