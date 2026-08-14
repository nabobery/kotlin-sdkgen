package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_mode/properties/flexible.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_mode/properties/flexible
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad(
  public val prorationDiscounts:
      InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsX7c74ee40? = null,
) {
  public class Builder {
    public var prorationDiscounts:
        InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsX7c74ee40? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad(
      prorationDiscounts = prorationDiscounts,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad must be a JSON object")
      return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad(
        prorationDiscounts = rawObject["proration_discounts"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsX7c74ee40>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.prorationDiscounts?.let { put("proration_discounts", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad(block: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsFlexibleX94955cad.build(block)
