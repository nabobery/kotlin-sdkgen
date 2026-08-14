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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372(
  public val acssDebit:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733? = null,
  public val bancontact:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44? = null,
  public val card: InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa? = null,
  public val customerBalance:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1? = null,
  public val konbini: InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32? = null,
  public val payto: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be? = null,
  public val pix: InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b? = null,
  public val sepaDebit:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitX080f54d9? = null,
  public val upi: InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d? = null,
  public val usBankAccount:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea? = null,
) {
  public class Builder {
    public var acssDebit: InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733? =
        null

    public var bancontact: InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44? =
        null

    public var card: InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa? = null

    public var customerBalance:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1? = null

    public var konbini: InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32? = null

    public var payto: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be? = null

    public var pix: InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b? = null

    public var sepaDebit: InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitX080f54d9? =
        null

    public var upi: InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d? = null

    public var usBankAccount:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372 = InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372(
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
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372 must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372(
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa>(it) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitX080f54d9>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372")
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

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372(block: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372 = InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372.build(block)
