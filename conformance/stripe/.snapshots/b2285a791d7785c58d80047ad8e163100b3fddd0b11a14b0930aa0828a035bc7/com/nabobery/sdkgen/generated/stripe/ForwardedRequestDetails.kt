package com.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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

@ConsistentCopyVisibility
@Serializable
public data class ForwardedRequestDetailsView internal constructor(
  public val body: String,
  public val headers: List<ForwardedRequestHeader>,
  @SerialName("http_method")
  public val httpMethod: InlineForwardedRequestDetailsHttpMethodXc5443c41,
)

/**
 * Details about the request forwarded to the destination endpoint.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/forwarded_request_details
 */
@Serializable(with = ForwardedRequestDetails.Serializer::class)
public class ForwardedRequestDetails(
  /**
   * The body payload to send to the destination endpoint.
   */
  public val body: String,
  headers: List<ForwardedRequestHeader>,
  /**
   * The HTTP method used to call the destination endpoint.
   */
  public val httpMethod: InlineForwardedRequestDetailsHttpMethodXc5443c41,
) {
  /**
   * The headers to include in the forwarded request. Can be omitted if no additional headers (excluding
   * Stripe-generated ones such as the Content-Type header) should be included.
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

    private var httpMethodValue: InlineForwardedRequestDetailsHttpMethodXc5443c41? = null

    public var httpMethod: InlineForwardedRequestDetailsHttpMethodXc5443c41
      get() = requireNotNull(httpMethodValue) { "httpMethod is required" }
      set(`value`) {
        httpMethodValue = value
      }

    public fun build(): ForwardedRequestDetails {
      check(bodyValue != null) { "body is required" }
      check(headersValue != null) { "headers is required" }
      check(httpMethodValue != null) { "httpMethod is required" }
      return ForwardedRequestDetails(
        body = body,
        headers = headers,
        httpMethod = httpMethod,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ForwardedRequestDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ForwardedRequestDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ForwardedRequestDetails {
      val jsonDecoder = decoder.requireJsonDecoder("ForwardedRequestDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ForwardedRequestDetails must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      val headers = json.decodeRequired<List<ForwardedRequestHeader>>(rawObject, "headers")
      val httpMethod = json.decodeRequired<InlineForwardedRequestDetailsHttpMethodXc5443c41>(rawObject, "http_method")
      return ForwardedRequestDetails(
        body = body,
        headers = headers,
        httpMethod = httpMethod,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ForwardedRequestDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("ForwardedRequestDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body)
        put("headers", json.encodeToJsonElement(value.headers))
        put("http_method", json.encodeToJsonElement(value.httpMethod))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun forwardedRequestDetails(block: ForwardedRequestDetails.Builder.() -> Unit): ForwardedRequestDetails = ForwardedRequestDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ForwardedRequestDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
