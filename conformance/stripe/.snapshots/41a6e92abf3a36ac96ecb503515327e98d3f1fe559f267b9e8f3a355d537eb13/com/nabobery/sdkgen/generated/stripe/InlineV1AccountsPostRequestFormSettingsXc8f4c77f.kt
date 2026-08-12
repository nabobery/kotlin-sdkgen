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
 * Options for customizing how the account functions within Stripe.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsXc8f4c77f.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsXc8f4c77f(
  public val bacsDebitPayments:
      InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1? = null,
  public val branding: InlineV1AccountsPostRequestFormSettingsBrandingX94f3a8a1? = null,
  public val cardIssuing: InlineV1AccountsPostRequestFormSettingsCardIssuingX5bbf26b8? = null,
  public val cardPayments: InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762? = null,
  public val invoices: InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1? = null,
  public val payments: InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b? = null,
  public val payouts: InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8? = null,
  public val treasury: InlineV1AccountsPostRequestFormSettingsTreasuryXa85fd053? = null,
) {
  public class Builder {
    public var bacsDebitPayments: InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1?
        = null

    public var branding: InlineV1AccountsPostRequestFormSettingsBrandingX94f3a8a1? = null

    public var cardIssuing: InlineV1AccountsPostRequestFormSettingsCardIssuingX5bbf26b8? = null

    public var cardPayments: InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762? = null

    public var invoices: InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1? = null

    public var payments: InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b? = null

    public var payouts: InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8? = null

    public var treasury: InlineV1AccountsPostRequestFormSettingsTreasuryXa85fd053? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsXc8f4c77f = InlineV1AccountsPostRequestFormSettingsXc8f4c77f(
      bacsDebitPayments = bacsDebitPayments,
      branding = branding,
      cardIssuing = cardIssuing,
      cardPayments = cardPayments,
      invoices = invoices,
      payments = payments,
      payouts = payouts,
      treasury = treasury,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsXc8f4c77f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsXc8f4c77f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsXc8f4c77f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsXc8f4c77f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsXc8f4c77f must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsXc8f4c77f(
        bacsDebitPayments = rawObject["bacs_debit_payments"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1>(it) },
        branding = rawObject["branding"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsBrandingX94f3a8a1>(it) },
        cardIssuing = rawObject["card_issuing"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardIssuingX5bbf26b8>(it) },
        cardPayments = rawObject["card_payments"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762>(it) },
        invoices = rawObject["invoices"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1>(it) },
        payments = rawObject["payments"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b>(it) },
        payouts = rawObject["payouts"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8>(it) },
        treasury = rawObject["treasury"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsTreasuryXa85fd053>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsXc8f4c77f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsXc8f4c77f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bacsDebitPayments?.let { put("bacs_debit_payments", json.encodeToJsonElement(it)) }
        value.branding?.let { put("branding", json.encodeToJsonElement(it)) }
        value.cardIssuing?.let { put("card_issuing", json.encodeToJsonElement(it)) }
        value.cardPayments?.let { put("card_payments", json.encodeToJsonElement(it)) }
        value.invoices?.let { put("invoices", json.encodeToJsonElement(it)) }
        value.payments?.let { put("payments", json.encodeToJsonElement(it)) }
        value.payouts?.let { put("payouts", json.encodeToJsonElement(it)) }
        value.treasury?.let { put("treasury", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsXc8f4c77f(block: InlineV1AccountsPostRequestFormSettingsXc8f4c77f.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsXc8f4c77f = InlineV1AccountsPostRequestFormSettingsXc8f4c77f.build(block)
