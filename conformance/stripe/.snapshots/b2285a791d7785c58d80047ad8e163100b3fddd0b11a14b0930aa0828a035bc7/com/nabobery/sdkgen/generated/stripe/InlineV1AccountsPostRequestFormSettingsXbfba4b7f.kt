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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsXbfba4b7f.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsXbfba4b7f(
  public val bacsDebitPayments:
      InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad? = null,
  public val branding: InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389? = null,
  public val cardIssuing: InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4? = null,
  public val cardPayments: InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c? = null,
  public val invoices: InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e? = null,
  public val payments: InlineV1AccountsPostRequestFormSettingsPaymentsXdedc68e4? = null,
  public val payouts: InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee? = null,
  public val treasury: InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2? = null,
) {
  public class Builder {
    public var bacsDebitPayments: InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad?
        = null

    public var branding: InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389? = null

    public var cardIssuing: InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4? = null

    public var cardPayments: InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c? = null

    public var invoices: InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e? = null

    public var payments: InlineV1AccountsPostRequestFormSettingsPaymentsXdedc68e4? = null

    public var payouts: InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee? = null

    public var treasury: InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsXbfba4b7f = InlineV1AccountsPostRequestFormSettingsXbfba4b7f(
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
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsXbfba4b7f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsXbfba4b7f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsXbfba4b7f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsXbfba4b7f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsXbfba4b7f must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsXbfba4b7f(
        bacsDebitPayments = rawObject["bacs_debit_payments"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad>(it) },
        branding = rawObject["branding"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389>(it) },
        cardIssuing = rawObject["card_issuing"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4>(it) },
        cardPayments = rawObject["card_payments"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c>(it) },
        invoices = rawObject["invoices"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e>(it) },
        payments = rawObject["payments"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPaymentsXdedc68e4>(it) },
        payouts = rawObject["payouts"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee>(it) },
        treasury = rawObject["treasury"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsXbfba4b7f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsXbfba4b7f")
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

public fun inlineV1AccountsPostRequestFormSettingsXbfba4b7f(block: InlineV1AccountsPostRequestFormSettingsXbfba4b7f.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsXbfba4b7f = InlineV1AccountsPostRequestFormSettingsXbfba4b7f.build(block)
