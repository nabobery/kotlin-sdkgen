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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_redirect_flow
 */
@Serializable(with = SourceRedirectFlow.Serializer::class)
public class SourceRedirectFlow(
  /**
   * The URL you provide to redirect the customer to after they authenticated their payment.
   */
  public val returnUrl: String,
  /**
   * The status of the redirect, either `pending` (ready to be used by your customer to authenticate the transaction),
   * `succeeded` (successful authentication, cannot be reused) or `not_required` (redirect should not be used) or
   * `failed` (failed authentication, cannot be reused).
   */
  public val status: String,
  /**
   * The URL provided to you to redirect a customer to as part of a `redirect` authentication flow.
   */
  public val url: String,
  /**
   * The failure reason for the redirect, either `user_abort` (the customer aborted or dropped out of the redirect
   * flow), `declined` (the authentication failed or the transaction was declined), or `processing_error` (the redirect
   * failed due to a technical error). Present only if the redirect status is `failed`.
   */
  public val failureReason: String? = null,
) {
  public class Builder {
    private var returnUrlValue: String? = null

    public var returnUrl: String
      get() = requireNotNull(returnUrlValue) { "returnUrl is required" }
      set(`value`) {
        returnUrlValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    /**
     * The failure reason for the redirect, either `user_abort` (the customer aborted or dropped out of the redirect
     * flow), `declined` (the authentication failed or the transaction was declined), or `processing_error` (the
     * redirect failed due to a technical error). Present only if the redirect status is `failed`.
     */
    public var failureReason: String? = null

    public fun build(): SourceRedirectFlow {
      check(returnUrlValue != null) { "returnUrl is required" }
      check(statusValue != null) { "status is required" }
      check(urlValue != null) { "url is required" }
      return SourceRedirectFlow(
        returnUrl = returnUrl,
        status = status,
        url = url,
        failureReason = failureReason,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceRedirectFlow = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceRedirectFlow> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceRedirectFlow {
      val jsonDecoder = decoder.requireJsonDecoder("SourceRedirectFlow")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceRedirectFlow must be a JSON object")
      val returnUrl = json.decodeRequired<String>(rawObject, "return_url")
      val status = json.decodeRequired<String>(rawObject, "status")
      val url = json.decodeRequired<String>(rawObject, "url")
      return SourceRedirectFlow(
        returnUrl = returnUrl,
        status = status,
        url = url,
        failureReason = rawObject["failure_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceRedirectFlow) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceRedirectFlow")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("return_url", value.returnUrl)
        put("status", value.status)
        put("url", value.url)
        value.failureReason?.let { put("failure_reason", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceRedirectFlow(block: SourceRedirectFlow.Builder.() -> Unit): SourceRedirectFlow = SourceRedirectFlow.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SourceRedirectFlow is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
