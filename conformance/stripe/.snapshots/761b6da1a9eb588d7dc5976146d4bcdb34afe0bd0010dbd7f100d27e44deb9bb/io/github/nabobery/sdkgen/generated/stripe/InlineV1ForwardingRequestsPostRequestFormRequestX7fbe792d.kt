package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The request body and headers to be sent to the destination endpoint.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1forwarding~1requests/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/request
 */
@Serializable(with = InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d.Serializer::class)
public class InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d(
  public val body: String? = null,
  headers: List<InlineV1ForwardingRequestsPostRequestFormRequestHeadersItemXea6137c7>? = null,
) {
  public val headers: List<InlineV1ForwardingRequestsPostRequestFormRequestHeadersItemXea6137c7>? =
      headers?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var body: String? = null

    private var headersValue:
        List<InlineV1ForwardingRequestsPostRequestFormRequestHeadersItemXea6137c7>? = null

    public var headers: List<InlineV1ForwardingRequestsPostRequestFormRequestHeadersItemXea6137c7>?
      get() = headersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d = InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d(
      body = body,
      headers = headers,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d must be a JSON object")
      return InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d(
        body = rawObject["body"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<List<InlineV1ForwardingRequestsPostRequestFormRequestHeadersItemXea6137c7>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.body?.let { put("body", it) }
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d(block: InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d.Builder.() -> Unit): InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d = InlineV1ForwardingRequestsPostRequestFormRequestX7fbe792d.build(block)
