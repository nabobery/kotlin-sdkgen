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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class SetupIntentPaymentMethodOptionsKlarnaView(
  public val currency: String? = null,
  @SerialName("preferred_locale")
  public val preferredLocale: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_klarna
 */
@Serializable(with = SetupIntentPaymentMethodOptionsKlarna.Serializer::class)
public class SetupIntentPaymentMethodOptionsKlarna(
  /**
   * The currency of the setup intent. Three letter ISO currency code.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  /**
   * Preferred locale of the Klarna checkout page that the customer is redirected to.
   */
  public val preferredLocale: String? = null,
) {
  public class Builder {
    /**
     * The currency of the setup intent. Three letter ISO currency code.
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    /**
     * Preferred locale of the Klarna checkout page that the customer is redirected to.
     */
    public var preferredLocale: String? = null

    public fun build(): SetupIntentPaymentMethodOptionsKlarna = SetupIntentPaymentMethodOptionsKlarna(
      currency = currency,
      preferredLocale = preferredLocale,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentPaymentMethodOptionsKlarna = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SetupIntentPaymentMethodOptionsKlarna> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentPaymentMethodOptionsKlarna {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentPaymentMethodOptionsKlarna")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentPaymentMethodOptionsKlarna must be a JSON object")
      return SetupIntentPaymentMethodOptionsKlarna(
        currency = rawObject["currency"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        preferredLocale = rawObject["preferred_locale"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentPaymentMethodOptionsKlarna) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentPaymentMethodOptionsKlarna")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.currency?.let { put("currency", it) }
        value.preferredLocale?.let { put("preferred_locale", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntentPaymentMethodOptionsKlarna(block: SetupIntentPaymentMethodOptionsKlarna.Builder.() -> Unit): SetupIntentPaymentMethodOptionsKlarna = SetupIntentPaymentMethodOptionsKlarna.build(block)
