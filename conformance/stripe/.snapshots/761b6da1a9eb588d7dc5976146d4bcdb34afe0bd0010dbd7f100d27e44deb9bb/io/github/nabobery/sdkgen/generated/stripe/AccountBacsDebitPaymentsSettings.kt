package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_bacs_debit_payments_settings
 */
@Serializable(with = AccountBacsDebitPaymentsSettings.Serializer::class)
public class AccountBacsDebitPaymentsSettings(
  /**
   * The Bacs Direct Debit display name for this account. For payments made with Bacs Direct Debit, this name appears on
   * the mandate as the statement descriptor. Mobile banking apps display it as the name of the business. To use custom
   * branding, set the Bacs Direct Debit Display Name during or right after creation. Custom branding incurs an
   * additional monthly fee for the platform. The fee appears 5 business days after requesting Bacs. If you don't set
   * the display name before requesting Bacs capability, it's automatically set as "Stripe" and the account is onboarded
   * to Stripe branding, which is free.
   */
  public val displayName: String? = null,
  /**
   * The Bacs Direct Debit Service user number for this account. For payments made with Bacs Direct Debit, this number
   * is a unique identifier of the account with our banking partners.
   */
  public val serviceUserNumber: String? = null,
) {
  public class Builder {
    /**
     * The Bacs Direct Debit display name for this account. For payments made with Bacs Direct Debit, this name appears
     * on the mandate as the statement descriptor. Mobile banking apps display it as the name of the business. To use
     * custom branding, set the Bacs Direct Debit Display Name during or right after creation. Custom branding incurs an
     * additional monthly fee for the platform. The fee appears 5 business days after requesting Bacs. If you don't set
     * the display name before requesting Bacs capability, it's automatically set as "Stripe" and the account is
     * onboarded to Stripe branding, which is free.
     */
    public var displayName: String? = null

    /**
     * The Bacs Direct Debit Service user number for this account. For payments made with Bacs Direct Debit, this number
     * is a unique identifier of the account with our banking partners.
     */
    public var serviceUserNumber: String? = null

    public fun build(): AccountBacsDebitPaymentsSettings = AccountBacsDebitPaymentsSettings(
      displayName = displayName,
      serviceUserNumber = serviceUserNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountBacsDebitPaymentsSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountBacsDebitPaymentsSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountBacsDebitPaymentsSettings {
      val jsonDecoder = decoder.requireJsonDecoder("AccountBacsDebitPaymentsSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountBacsDebitPaymentsSettings must be a JSON object")
      return AccountBacsDebitPaymentsSettings(
        displayName = rawObject["display_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        serviceUserNumber = rawObject["service_user_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountBacsDebitPaymentsSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountBacsDebitPaymentsSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayName?.let { put("display_name", it) }
        value.serviceUserNumber?.let { put("service_user_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountBacsDebitPaymentsSettings(block: AccountBacsDebitPaymentsSettings.Builder.() -> Unit): AccountBacsDebitPaymentsSettings = AccountBacsDebitPaymentsSettings.build(block)
