package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_acss_debit_mandate_options
 */
@Serializable(with = InvoicePaymentMethodOptionsAcssDebitMandateOptions.Serializer::class)
public class InvoicePaymentMethodOptionsAcssDebitMandateOptions(
  /**
   * Transaction type of the mandate.
   */
  public val transactionType:
      InlineInvoicePaymentMethodOptionsAcssDebitMandateOptionsTransactionTypeX4aa9edc9? = null,
) {
  public class Builder {
    /**
     * Transaction type of the mandate.
     */
    public var transactionType:
        InlineInvoicePaymentMethodOptionsAcssDebitMandateOptionsTransactionTypeX4aa9edc9? = null

    public fun build(): InvoicePaymentMethodOptionsAcssDebitMandateOptions = InvoicePaymentMethodOptionsAcssDebitMandateOptions(
      transactionType = transactionType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicePaymentMethodOptionsAcssDebitMandateOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoicePaymentMethodOptionsAcssDebitMandateOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicePaymentMethodOptionsAcssDebitMandateOptions {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicePaymentMethodOptionsAcssDebitMandateOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicePaymentMethodOptionsAcssDebitMandateOptions must be a JSON object")
      return InvoicePaymentMethodOptionsAcssDebitMandateOptions(
        transactionType = rawObject["transaction_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicePaymentMethodOptionsAcssDebitMandateOptionsTransactionTypeX4aa9edc9?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicePaymentMethodOptionsAcssDebitMandateOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicePaymentMethodOptionsAcssDebitMandateOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.transactionType?.let { put("transaction_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicePaymentMethodOptionsAcssDebitMandateOptions(block: InvoicePaymentMethodOptionsAcssDebitMandateOptions.Builder.() -> Unit): InvoicePaymentMethodOptionsAcssDebitMandateOptions = InvoicePaymentMethodOptionsAcssDebitMandateOptions.build(block)
