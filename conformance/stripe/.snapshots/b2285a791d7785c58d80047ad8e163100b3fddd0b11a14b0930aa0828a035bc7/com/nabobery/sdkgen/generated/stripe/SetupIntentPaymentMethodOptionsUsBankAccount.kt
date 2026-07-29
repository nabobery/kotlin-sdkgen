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
public data class SetupIntentPaymentMethodOptionsUsBankAccountView(
  @SerialName("financial_connections")
  public val financialConnections: LinkedAccountOptionsCommon? = null,
  @SerialName("mandate_options")
  public val mandateOptions: PaymentMethodOptionsUsBankAccountMandateOptions? = null,
  @SerialName("verification_method")
  public val verificationMethod:
      InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_us_bank_account
 */
@Serializable(with = SetupIntentPaymentMethodOptionsUsBankAccount.Serializer::class)
public class SetupIntentPaymentMethodOptionsUsBankAccount(
  public val financialConnections: LinkedAccountOptionsCommon? = null,
  public val mandateOptions: PaymentMethodOptionsUsBankAccountMandateOptions? = null,
  /**
   * Bank account verification method. The default value is `automatic`.
   */
  public val verificationMethod:
      InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5? = null,
) {
  public class Builder {
    public var financialConnections: LinkedAccountOptionsCommon? = null

    public var mandateOptions: PaymentMethodOptionsUsBankAccountMandateOptions? = null

    /**
     * Bank account verification method. The default value is `automatic`.
     */
    public var verificationMethod:
        InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5? = null

    public fun build(): SetupIntentPaymentMethodOptionsUsBankAccount = SetupIntentPaymentMethodOptionsUsBankAccount(
      financialConnections = financialConnections,
      mandateOptions = mandateOptions,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentPaymentMethodOptionsUsBankAccount = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SetupIntentPaymentMethodOptionsUsBankAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentPaymentMethodOptionsUsBankAccount {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentPaymentMethodOptionsUsBankAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentPaymentMethodOptionsUsBankAccount must be a JSON object")
      return SetupIntentPaymentMethodOptionsUsBankAccount(
        financialConnections = rawObject["financial_connections"]?.let { json.decodeFromJsonElement<LinkedAccountOptionsCommon>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<PaymentMethodOptionsUsBankAccountMandateOptions>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentPaymentMethodOptionsUsBankAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentPaymentMethodOptionsUsBankAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.financialConnections?.let { put("financial_connections", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntentPaymentMethodOptionsUsBankAccount(block: SetupIntentPaymentMethodOptionsUsBankAccount.Builder.() -> Unit): SetupIntentPaymentMethodOptionsUsBankAccount = SetupIntentPaymentMethodOptionsUsBankAccount.build(block)
