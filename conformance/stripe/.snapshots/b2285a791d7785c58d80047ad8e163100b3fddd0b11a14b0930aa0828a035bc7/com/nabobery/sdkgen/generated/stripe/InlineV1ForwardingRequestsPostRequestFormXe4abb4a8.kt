package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1forwarding~1requests/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1forwarding~1requests/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema
 */
@Serializable(with = InlineV1ForwardingRequestsPostRequestFormXe4abb4a8.Serializer::class)
public class InlineV1ForwardingRequestsPostRequestFormXe4abb4a8(
  /**
   * The PaymentMethod to insert into the forwarded request. Forwarding previously consumed PaymentMethods is allowed.
   */
  public val paymentMethod: String,
  replacements: List<InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da>,
  /**
   * The destination URL for the forwarded request. Must be supported by the config.
   */
  public val url: String,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
  /**
   * The request body and headers to be sent to the destination endpoint.
   */
  public val request: InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d? = null,
) {
  /**
   * The field kinds to be replaced in the forwarded request.
   */
  public val replacements: List<InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da>
      = replacements.toList()

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var paymentMethodValue: String? = null

    public var paymentMethod: String
      get() = requireNotNull(paymentMethodValue) { "paymentMethod is required" }
      set(`value`) {
        paymentMethodValue = value
      }

    private var replacementsValue:
        List<InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da>? = null

    public var replacements:
        List<InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da>
      get() = requireNotNull(replacementsValue) { "replacements is required" }.toList()
      set(`value`) {
        replacementsValue = value.toList()
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The request body and headers to be sent to the destination endpoint.
     */
    public var request: InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d? = null

    public fun build(): InlineV1ForwardingRequestsPostRequestFormXe4abb4a8 {
      check(paymentMethodValue != null) { "paymentMethod is required" }
      check(replacementsValue != null) { "replacements is required" }
      check(urlValue != null) { "url is required" }
      return InlineV1ForwardingRequestsPostRequestFormXe4abb4a8(
        paymentMethod = paymentMethod,
        replacements = replacements,
        url = url,
        expand = expand,
        metadata = metadata,
        request = request,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ForwardingRequestsPostRequestFormXe4abb4a8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1ForwardingRequestsPostRequestFormXe4abb4a8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ForwardingRequestsPostRequestFormXe4abb4a8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ForwardingRequestsPostRequestFormXe4abb4a8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ForwardingRequestsPostRequestFormXe4abb4a8 must be a JSON object")
      val paymentMethod = json.decodeRequired<String>(rawObject, "payment_method")
      val replacements = json.decodeRequired<List<InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da>>(rawObject, "replacements")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineV1ForwardingRequestsPostRequestFormXe4abb4a8(
        paymentMethod = paymentMethod,
        replacements = replacements,
        url = url,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        request = rawObject["request"]?.let { json.decodeFromJsonElement<InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ForwardingRequestsPostRequestFormXe4abb4a8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ForwardingRequestsPostRequestFormXe4abb4a8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_method", value.paymentMethod)
        put("replacements", json.encodeToJsonElement(value.replacements))
        put("url", value.url)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.request?.let { put("request", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ForwardingRequestsPostRequestFormXe4abb4a8(block: InlineV1ForwardingRequestsPostRequestFormXe4abb4a8.Builder.() -> Unit): InlineV1ForwardingRequestsPostRequestFormXe4abb4a8 = InlineV1ForwardingRequestsPostRequestFormXe4abb4a8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1ForwardingRequestsPostRequestFormXe4abb4a8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
