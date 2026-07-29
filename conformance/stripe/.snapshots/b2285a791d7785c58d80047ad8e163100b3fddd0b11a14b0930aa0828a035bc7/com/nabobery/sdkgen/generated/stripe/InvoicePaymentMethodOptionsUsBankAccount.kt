package com.nabobery.sdkgen.generated.stripe

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
public data class InvoicePaymentMethodOptionsUsBankAccountView(
  @SerialName("financial_connections")
  public val financialConnections:
      InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions? = null,
  @SerialName("verification_method")
  public val verificationMethod:
      InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_us_bank_account
 */
@Serializable(with = InvoicePaymentMethodOptionsUsBankAccount.Serializer::class)
public class InvoicePaymentMethodOptionsUsBankAccount(
  public val financialConnections:
      InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions? = null,
  /**
   * Bank account verification method. The default value is `automatic`.
   */
  public val verificationMethod:
      InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf? = null,
) {
  public class Builder {
    public var financialConnections: InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions? =
        null

    /**
     * Bank account verification method. The default value is `automatic`.
     */
    public var verificationMethod:
        InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf? = null

    public fun build(): InvoicePaymentMethodOptionsUsBankAccount = InvoicePaymentMethodOptionsUsBankAccount(
      financialConnections = financialConnections,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicePaymentMethodOptionsUsBankAccount = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InvoicePaymentMethodOptionsUsBankAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicePaymentMethodOptionsUsBankAccount {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicePaymentMethodOptionsUsBankAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicePaymentMethodOptionsUsBankAccount must be a JSON object")
      return InvoicePaymentMethodOptionsUsBankAccount(
        financialConnections = rawObject["financial_connections"]?.let { json.decodeFromJsonElement<InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicePaymentMethodOptionsUsBankAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicePaymentMethodOptionsUsBankAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.financialConnections?.let { put("financial_connections", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicePaymentMethodOptionsUsBankAccount(block: InvoicePaymentMethodOptionsUsBankAccount.Builder.() -> Unit): InvoicePaymentMethodOptionsUsBankAccount = InvoicePaymentMethodOptionsUsBankAccount.build(block)
