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
public data class SetupIntentPaymentMethodOptionsView(
  @SerialName("acss_debit")
  public val acssDebit: InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff? = null,
  @SerialName("amazon_pay")
  public val amazonPay: InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc? = null,
  @SerialName("bacs_debit")
  public val bacsDebit: InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee? = null,
  public val bizum: InlineSetupIntentPaymentMethodOptionsBizumXc2426f62? = null,
  public val card: InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7? = null,
  @SerialName("card_present")
  public val cardPresent: InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732? = null,
  public val klarna: InlineSetupIntentPaymentMethodOptionsKlarnaX26380683? = null,
  public val link: InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1? = null,
  public val paypal: InlineSetupIntentPaymentMethodOptionsPaypalX322a769b? = null,
  public val payto: InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91? = null,
  public val pix: InlineSetupIntentPaymentMethodOptionsPixXc852d205? = null,
  @SerialName("sepa_debit")
  public val sepaDebit: InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829? = null,
  public val upi: InlineSetupIntentPaymentMethodOptionsUpiXc80d642e? = null,
  @SerialName("us_bank_account")
  public val usBankAccount: InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options
 */
@Serializable(with = SetupIntentPaymentMethodOptions.Serializer::class)
public class SetupIntentPaymentMethodOptions(
  public val acssDebit: InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff? = null,
  public val amazonPay: InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc? = null,
  public val bacsDebit: InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee? = null,
  public val bizum: InlineSetupIntentPaymentMethodOptionsBizumXc2426f62? = null,
  public val card: InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7? = null,
  public val cardPresent: InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732? = null,
  public val klarna: InlineSetupIntentPaymentMethodOptionsKlarnaX26380683? = null,
  public val link: InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1? = null,
  public val paypal: InlineSetupIntentPaymentMethodOptionsPaypalX322a769b? = null,
  public val payto: InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91? = null,
  public val pix: InlineSetupIntentPaymentMethodOptionsPixXc852d205? = null,
  public val sepaDebit: InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829? = null,
  public val upi: InlineSetupIntentPaymentMethodOptionsUpiXc80d642e? = null,
  public val usBankAccount: InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554? = null,
) {
  public class Builder {
    public var acssDebit: InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff? = null

    public var amazonPay: InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc? = null

    public var bacsDebit: InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee? = null

    public var bizum: InlineSetupIntentPaymentMethodOptionsBizumXc2426f62? = null

    public var card: InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7? = null

    public var cardPresent: InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732? = null

    public var klarna: InlineSetupIntentPaymentMethodOptionsKlarnaX26380683? = null

    public var link: InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1? = null

    public var paypal: InlineSetupIntentPaymentMethodOptionsPaypalX322a769b? = null

    public var payto: InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91? = null

    public var pix: InlineSetupIntentPaymentMethodOptionsPixXc852d205? = null

    public var sepaDebit: InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829? = null

    public var upi: InlineSetupIntentPaymentMethodOptionsUpiXc80d642e? = null

    public var usBankAccount: InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554? = null

    public fun build(): SetupIntentPaymentMethodOptions = SetupIntentPaymentMethodOptions(
      acssDebit = acssDebit,
      amazonPay = amazonPay,
      bacsDebit = bacsDebit,
      bizum = bizum,
      card = card,
      cardPresent = cardPresent,
      klarna = klarna,
      link = link,
      paypal = paypal,
      payto = payto,
      pix = pix,
      sepaDebit = sepaDebit,
      upi = upi,
      usBankAccount = usBankAccount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SetupIntentPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentPaymentMethodOptions must be a JSON object")
      return SetupIntentPaymentMethodOptions(
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee>(it) },
        bizum = rawObject["bizum"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsBizumXc2426f62>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsKlarnaX26380683>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsPaypalX322a769b>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsPixXc852d205>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsUpiXc80d642e>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
        value.amazonPay?.let { put("amazon_pay", json.encodeToJsonElement(it)) }
        value.bacsDebit?.let { put("bacs_debit", json.encodeToJsonElement(it)) }
        value.bizum?.let { put("bizum", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cardPresent?.let { put("card_present", json.encodeToJsonElement(it)) }
        value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
        value.link?.let { put("link", json.encodeToJsonElement(it)) }
        value.paypal?.let { put("paypal", json.encodeToJsonElement(it)) }
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

public fun setupIntentPaymentMethodOptions(block: SetupIntentPaymentMethodOptions.Builder.() -> Unit): SetupIntentPaymentMethodOptions = SetupIntentPaymentMethodOptions.build(block)
