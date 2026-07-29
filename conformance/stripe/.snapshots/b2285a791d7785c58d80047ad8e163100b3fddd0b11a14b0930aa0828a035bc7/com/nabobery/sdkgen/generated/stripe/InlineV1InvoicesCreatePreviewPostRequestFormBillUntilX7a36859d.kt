package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules/anyOf/0/items/properties/bill_until.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules/anyOf/0/items/properties/bill_until
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d(
  public val type: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917,
  public val duration:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb? = null,
  public val timestamp: Int? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917? = null

    public var type: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var duration:
        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb? = null

    public var timestamp: Int? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d {
      check(typeValue != null) { "type is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d(
        type = type,
        duration = duration,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d must be a JSON object")
      val type = json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917>(rawObject, "type")
      return InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d(
        type = type,
        duration = rawObject["duration"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb>(it) },
        timestamp = rawObject["timestamp"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.duration?.let { put("duration", json.encodeToJsonElement(it)) }
        value.timestamp?.let { put("timestamp", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d(block: InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d = InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
