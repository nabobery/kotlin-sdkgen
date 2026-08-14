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
public data class InvoicePaymentMethodOptionsAcssDebitView(
  @SerialName("mandate_options")
  public val mandateOptions: InvoicePaymentMethodOptionsAcssDebitMandateOptions? = null,
  @SerialName("verification_method")
  public val verificationMethod:
      InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_acss_debit
 */
@Serializable(with = InvoicePaymentMethodOptionsAcssDebit.Serializer::class)
public class InvoicePaymentMethodOptionsAcssDebit(
  public val mandateOptions: InvoicePaymentMethodOptionsAcssDebitMandateOptions? = null,
  /**
   * Bank account verification method. The default value is `automatic`.
   */
  public val verificationMethod:
      InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38? = null,
) {
  public class Builder {
    public var mandateOptions: InvoicePaymentMethodOptionsAcssDebitMandateOptions? = null

    /**
     * Bank account verification method. The default value is `automatic`.
     */
    public var verificationMethod:
        InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38? = null

    public fun build(): InvoicePaymentMethodOptionsAcssDebit = InvoicePaymentMethodOptionsAcssDebit(
      mandateOptions = mandateOptions,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicePaymentMethodOptionsAcssDebit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoicePaymentMethodOptionsAcssDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicePaymentMethodOptionsAcssDebit {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicePaymentMethodOptionsAcssDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicePaymentMethodOptionsAcssDebit must be a JSON object")
      return InvoicePaymentMethodOptionsAcssDebit(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InvoicePaymentMethodOptionsAcssDebitMandateOptions>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicePaymentMethodOptionsAcssDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicePaymentMethodOptionsAcssDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicePaymentMethodOptionsAcssDebit(block: InvoicePaymentMethodOptionsAcssDebit.Builder.() -> Unit): InvoicePaymentMethodOptionsAcssDebit = InvoicePaymentMethodOptionsAcssDebit.build(block)
