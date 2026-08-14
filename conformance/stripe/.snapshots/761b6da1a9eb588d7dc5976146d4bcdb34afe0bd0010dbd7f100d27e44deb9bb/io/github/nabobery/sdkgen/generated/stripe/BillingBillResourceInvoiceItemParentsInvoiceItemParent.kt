package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class BillingBillResourceInvoiceItemParentsInvoiceItemParentView(
  @SerialName("subscription_details")
  public val subscriptionDetails:
      InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a? = null,
  public val type: InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoice_item_parents_invoice_item_parent
 */
@Serializable(with = BillingBillResourceInvoiceItemParentsInvoiceItemParent.Serializer::class)
public class BillingBillResourceInvoiceItemParentsInvoiceItemParent(
  /**
   * The type of parent that generated this invoice item
   */
  public val type: InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4,
  /**
   * Details about the subscription that generated this invoice item
   */
  public val subscriptionDetails:
      InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a? = null,
) {
  public class Builder {
    private var typeValue:
        InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4? = null

    public var type: InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Details about the subscription that generated this invoice item
     */
    public var subscriptionDetails: InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a? =
        null

    public fun build(): BillingBillResourceInvoiceItemParentsInvoiceItemParent {
      check(typeValue != null) { "type is required" }
      return BillingBillResourceInvoiceItemParentsInvoiceItemParent(
        type = type,
        subscriptionDetails = subscriptionDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingBillResourceInvoiceItemParentsInvoiceItemParent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingBillResourceInvoiceItemParentsInvoiceItemParent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingBillResourceInvoiceItemParentsInvoiceItemParent {
      val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoiceItemParentsInvoiceItemParent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingBillResourceInvoiceItemParentsInvoiceItemParent must be a JSON object")
      val type = json.decodeRequired<InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4>(rawObject, "type")
      return BillingBillResourceInvoiceItemParentsInvoiceItemParent(
        type = type,
        subscriptionDetails = rawObject["subscription_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingBillResourceInvoiceItemParentsInvoiceItemParent) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoiceItemParentsInvoiceItemParent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.subscriptionDetails?.let { put("subscription_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingBillResourceInvoiceItemParentsInvoiceItemParent(block: BillingBillResourceInvoiceItemParentsInvoiceItemParent.Builder.() -> Unit): BillingBillResourceInvoiceItemParentsInvoiceItemParent = BillingBillResourceInvoiceItemParentsInvoiceItemParent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingBillResourceInvoiceItemParentsInvoiceItemParent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
