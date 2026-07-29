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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_mode
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5(
  public val type: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392,
  public val flexible:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392? = null

    public var type: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var flexible:
        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5 {
      check(typeValue != null) { "type is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5(
        type = type,
        flexible = flexible,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5 must be a JSON object")
      val type = json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392>(rawObject, "type")
      return InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5(
        type = type,
        flexible = rawObject["flexible"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.flexible?.let { put("flexible", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5(block: InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5 = InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
