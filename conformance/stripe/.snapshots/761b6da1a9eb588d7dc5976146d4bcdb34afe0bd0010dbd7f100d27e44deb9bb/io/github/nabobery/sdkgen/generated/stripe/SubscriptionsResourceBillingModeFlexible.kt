package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class SubscriptionsResourceBillingModeFlexibleView(
  @SerialName("proration_discounts")
  public val prorationDiscounts:
      InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_mode_flexible
 */
@Serializable(with = SubscriptionsResourceBillingModeFlexible.Serializer::class)
public class SubscriptionsResourceBillingModeFlexible(
  /**
   * Controls how invoices and invoice items display proration amounts and discount amounts.
   */
  public val prorationDiscounts:
      InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f? = null,
) {
  public class Builder {
    /**
     * Controls how invoices and invoice items display proration amounts and discount amounts.
     */
    public var prorationDiscounts:
        InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f? = null

    public fun build(): SubscriptionsResourceBillingModeFlexible = SubscriptionsResourceBillingModeFlexible(
      prorationDiscounts = prorationDiscounts,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionsResourceBillingModeFlexible = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionsResourceBillingModeFlexible> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionsResourceBillingModeFlexible {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsResourceBillingModeFlexible")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionsResourceBillingModeFlexible must be a JSON object")
      return SubscriptionsResourceBillingModeFlexible(
        prorationDiscounts = rawObject["proration_discounts"]?.let { json.decodeFromJsonElement<InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionsResourceBillingModeFlexible) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsResourceBillingModeFlexible")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.prorationDiscounts?.let { put("proration_discounts", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionsResourceBillingModeFlexible(block: SubscriptionsResourceBillingModeFlexible.Builder.() -> Unit): SubscriptionsResourceBillingModeFlexible = SubscriptionsResourceBillingModeFlexible.build(block)
