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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23(
  public val acssDebit: InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d? = null,
  public val bancontact: InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d? = null,
  public val card:
      InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038? = null,
  public val customerBalance:
      InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46? = null,
  public val konbini: InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41? = null,
  public val payto:
      InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6? = null,
  public val pix:
      InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512? = null,
  public val sepaDebit: InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565? = null,
  public val upi:
      InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331? = null,
  public val usBankAccount:
      InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f? = null,
) {
  public class Builder {
    public var acssDebit: InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d? = null

    public var bancontact: InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d? = null

    public var card:
        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038? = null

    public var customerBalance:
        InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46? = null

    public var konbini: InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41? = null

    public var payto:
        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6? = null

    public var pix: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512?
        = null

    public var sepaDebit: InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565? = null

    public var upi: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331?
        = null

    public var usBankAccount: InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f?
        = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23 = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23(
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
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23 must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23(
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038>(it) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23")
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

public fun inlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23(block: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23 = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23.build(block)
