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
 * Stripe users in New Zealand can accept Bulk Electronic Clearing System (BECS) direct debit payments from customers
 * with a New Zeland bank account. Check this [page](https://docs.stripe.com/payments/nz-bank-account) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/nz_bank_account
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX79f391c8? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX79f391c8? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a = InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX79f391c8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a(block: InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a = InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountXff771a8a.build(block)
