package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class InvoicePaymentMethodOptionsBancontactView(
  @SerialName("preferred_language")
  public val preferredLanguage:
      InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_bancontact
 */
@Serializable(with = InvoicePaymentMethodOptionsBancontact.Serializer::class)
public class InvoicePaymentMethodOptionsBancontact(
  /**
   * Preferred language of the Bancontact authorization page that the customer is redirected to.
   */
  public val preferredLanguage:
      InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518,
) {
  public class Builder {
    private var preferredLanguageValue:
        InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518? = null

    public var preferredLanguage:
        InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518
      get() = requireNotNull(preferredLanguageValue) { "preferredLanguage is required" }
      set(`value`) {
        preferredLanguageValue = value
      }

    public fun build(): InvoicePaymentMethodOptionsBancontact {
      check(preferredLanguageValue != null) { "preferredLanguage is required" }
      return InvoicePaymentMethodOptionsBancontact(
        preferredLanguage = preferredLanguage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicePaymentMethodOptionsBancontact = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InvoicePaymentMethodOptionsBancontact> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicePaymentMethodOptionsBancontact {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicePaymentMethodOptionsBancontact")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicePaymentMethodOptionsBancontact must be a JSON object")
      val preferredLanguage = json.decodeRequired<InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518>(rawObject, "preferred_language")
      return InvoicePaymentMethodOptionsBancontact(
        preferredLanguage = preferredLanguage,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicePaymentMethodOptionsBancontact) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicePaymentMethodOptionsBancontact")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("preferred_language", json.encodeToJsonElement(value.preferredLanguage))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicePaymentMethodOptionsBancontact(block: InvoicePaymentMethodOptionsBancontact.Builder.() -> Unit): InvoicePaymentMethodOptionsBancontact = InvoicePaymentMethodOptionsBancontact.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InvoicePaymentMethodOptionsBancontact is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
