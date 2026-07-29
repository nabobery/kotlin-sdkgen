package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
public data class PaymentLinksResourceInvoiceCreationView(
  public val enabled: Boolean,
  @SerialName("invoice_data")
  public val invoiceData: InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_invoice_creation
 */
@Serializable(with = PaymentLinksResourceInvoiceCreation.Serializer::class)
public class PaymentLinksResourceInvoiceCreation(
  /**
   * Enable creating an invoice on successful payment.
   */
  public val enabled: Boolean,
  /**
   * Configuration for the invoice. Default invoice values will be used if unspecified.
   */
  public val invoiceData: InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    /**
     * Configuration for the invoice. Default invoice values will be used if unspecified.
     */
    public var invoiceData: InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a? = null

    public fun build(): PaymentLinksResourceInvoiceCreation {
      check(enabledValue != null) { "enabled is required" }
      return PaymentLinksResourceInvoiceCreation(
        enabled = enabled,
        invoiceData = invoiceData,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceInvoiceCreation = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentLinksResourceInvoiceCreation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceInvoiceCreation {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceInvoiceCreation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceInvoiceCreation must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PaymentLinksResourceInvoiceCreation(
        enabled = enabled,
        invoiceData = rawObject["invoice_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceInvoiceCreation) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceInvoiceCreation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.invoiceData?.let { put("invoice_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceInvoiceCreation(block: PaymentLinksResourceInvoiceCreation.Builder.() -> Unit): PaymentLinksResourceInvoiceCreation = PaymentLinksResourceInvoiceCreation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceInvoiceCreation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
