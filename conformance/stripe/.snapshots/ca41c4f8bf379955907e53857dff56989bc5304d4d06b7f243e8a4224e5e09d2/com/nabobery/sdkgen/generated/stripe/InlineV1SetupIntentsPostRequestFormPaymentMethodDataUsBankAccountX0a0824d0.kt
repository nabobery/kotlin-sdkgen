package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/us_bank_account
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0(
  public val accountHolderType:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountHolderTypeXe426b69f? = null,
  public val accountNumber: String? = null,
  public val accountType:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountTypeX7459691d? = null,
  public val financialConnectionsAccount: String? = null,
  public val routingNumber: String? = null,
) {
  public class Builder {
    public var accountHolderType:
        InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountHolderTypeXe426b69f? = null

    public var accountNumber: String? = null

    public var accountType:
        InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountTypeX7459691d? = null

    public var financialConnectionsAccount: String? = null

    public var routingNumber: String? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0(
      accountHolderType = accountHolderType,
      accountNumber = accountNumber,
      accountType = accountType,
      financialConnectionsAccount = financialConnectionsAccount,
      routingNumber = routingNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0(
        accountHolderType = rawObject["account_holder_type"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountHolderTypeXe426b69f>(it) },
        accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
        accountType = rawObject["account_type"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountTypeX7459691d>(it) },
        financialConnectionsAccount = rawObject["financial_connections_account"]?.let { json.decodeFromJsonElement<String>(it) },
        routingNumber = rawObject["routing_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountHolderType?.let { put("account_holder_type", json.encodeToJsonElement(it)) }
        value.accountNumber?.let { put("account_number", it) }
        value.accountType?.let { put("account_type", json.encodeToJsonElement(it)) }
        value.financialConnectionsAccount?.let { put("financial_connections_account", it) }
        value.routingNumber?.let { put("routing_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataUsBankAccountX0a0824d0.build(block)
