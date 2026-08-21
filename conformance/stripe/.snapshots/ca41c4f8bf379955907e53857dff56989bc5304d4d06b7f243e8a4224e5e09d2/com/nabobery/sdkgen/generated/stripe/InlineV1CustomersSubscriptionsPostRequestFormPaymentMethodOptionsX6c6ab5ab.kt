package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab(
  public val acssDebit:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb? = null,
  public val bancontact:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc? = null,
  public val card:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d? = null,
  public val customerBalance:
      InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d? = null,
  public val konbini:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e? = null,
  public val payto:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899? = null,
  public val pix: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1? = null,
  public val sepaDebit:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3? = null,
  public val upi: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiXf9c3b904? = null,
  public val usBankAccount:
      InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5? = null,
) {
  public class Builder {
    public var acssDebit:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb? = null

    public var bancontact:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc? = null

    public var card: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d? =
        null

    public var customerBalance:
        InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d? = null

    public var konbini:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e? = null

    public var payto: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899? =
        null

    public var pix: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1? = null

    public var sepaDebit:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3? = null

    public var upi: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiXf9c3b904? = null

    public var usBankAccount: InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5? =
        null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab = InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab(
      acssDebit = acssDebit,
      bancontact = bancontact,
      card = card,
      customerBalance = customerBalance,
      konbini = konbini,
      payto = payto,
      pix = pix,
      sepaDebit = sepaDebit,
      upi = upi,
      usBankAccount = usBankAccount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab(
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d>(it) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiXf9c3b904>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
        value.bancontact?.let { put("bancontact", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.customerBalance?.let { put("customer_balance", json.encodeToJsonElement(it)) }
        value.konbini?.let { put("konbini", json.encodeToJsonElement(it)) }
        value.payto?.let { put("payto", json.encodeToJsonElement(it)) }
        value.pix?.let { put("pix", json.encodeToJsonElement(it)) }
        value.sepaDebit?.let { put("sepa_debit", json.encodeToJsonElement(it)) }
        value.upi?.let { put("upi", json.encodeToJsonElement(it)) }
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab(block: InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab = InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab.build(block)
