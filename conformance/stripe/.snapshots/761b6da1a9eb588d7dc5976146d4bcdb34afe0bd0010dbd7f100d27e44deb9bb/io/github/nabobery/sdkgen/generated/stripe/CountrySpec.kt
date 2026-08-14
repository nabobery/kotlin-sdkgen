package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
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

/**
 * Stripe needs to collect certain pieces of information about each account
 * created. These requirements can differ depending on the account's country. The
 * Country Specs API makes these rules available to your integration.
 *
 * You can also view the information from this API call as [an online
 * guide](/docs/connect/required-verification-information).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/country_spec
 */
@Serializable(with = CountrySpec.Serializer::class)
public class CountrySpec(
  /**
   * The default currency for this country. This applies to both payment methods and bank accounts.
   */
  public val defaultCurrency: String,
  /**
   * Unique identifier for the object. Represented as the ISO country code for this country.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineCountrySpecObjectValueXd84f508b,
  supportedBankAccountCurrencies: Map<String, List<String>>,
  supportedPaymentCurrencies: List<String>,
  supportedPaymentMethods: List<String>,
  supportedTransferCountries: List<String>,
  public val verificationFields: CountrySpecVerificationFields,
) {
  /**
   * Currencies that can be accepted in the specific country (for transfers).
   */
  public val supportedBankAccountCurrencies: Map<String, List<String>> =
      supportedBankAccountCurrencies.entries.associate { (key0, mapValue0) -> key0 to mapValue0.toList() }

  /**
   * Currencies that can be accepted in the specified country (for payments).
   */
  public val supportedPaymentCurrencies: List<String> = supportedPaymentCurrencies.toList()

  /**
   * Payment methods available in the specified country. You may need to enable some payment methods (e.g.,
   * [ACH](https://stripe.com/docs/ach)) on your account before they appear in this list. The `stripe` payment method
   * refers to [charging through your platform](https://stripe.com/docs/connect/destination-charges).
   */
  public val supportedPaymentMethods: List<String> = supportedPaymentMethods.toList()

  /**
   * Countries that can accept transfers from the specified country.
   */
  public val supportedTransferCountries: List<String> = supportedTransferCountries.toList()

  public class Builder {
    private var defaultCurrencyValue: String? = null

    public var defaultCurrency: String
      get() = requireNotNull(defaultCurrencyValue) { "defaultCurrency is required" }
      set(`value`) {
        defaultCurrencyValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineCountrySpecObjectValueXd84f508b? = null

    public var objectValue: InlineCountrySpecObjectValueXd84f508b
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var supportedBankAccountCurrenciesValue: Map<String, List<String>>? = null

    public var supportedBankAccountCurrencies: Map<String, List<String>>
      get() = requireNotNull(supportedBankAccountCurrenciesValue) { "supportedBankAccountCurrencies is required" }.entries.associate { (key0, mapValue0) -> key0 to mapValue0.toList() }
      set(`value`) {
        supportedBankAccountCurrenciesValue = value.entries.associate { (key0, mapValue0) -> key0 to mapValue0.toList() }
      }

    private var supportedPaymentCurrenciesValue: List<String>? = null

    public var supportedPaymentCurrencies: List<String>
      get() = requireNotNull(supportedPaymentCurrenciesValue) { "supportedPaymentCurrencies is required" }.toList()
      set(`value`) {
        supportedPaymentCurrenciesValue = value.toList()
      }

    private var supportedPaymentMethodsValue: List<String>? = null

    public var supportedPaymentMethods: List<String>
      get() = requireNotNull(supportedPaymentMethodsValue) { "supportedPaymentMethods is required" }.toList()
      set(`value`) {
        supportedPaymentMethodsValue = value.toList()
      }

    private var supportedTransferCountriesValue: List<String>? = null

    public var supportedTransferCountries: List<String>
      get() = requireNotNull(supportedTransferCountriesValue) { "supportedTransferCountries is required" }.toList()
      set(`value`) {
        supportedTransferCountriesValue = value.toList()
      }

    private var verificationFieldsValue: CountrySpecVerificationFields? = null

    public var verificationFields: CountrySpecVerificationFields
      get() = requireNotNull(verificationFieldsValue) { "verificationFields is required" }
      set(`value`) {
        verificationFieldsValue = value
      }

    public fun build(): CountrySpec {
      check(defaultCurrencyValue != null) { "defaultCurrency is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(supportedBankAccountCurrenciesValue != null) { "supportedBankAccountCurrencies is required" }
      check(supportedPaymentCurrenciesValue != null) { "supportedPaymentCurrencies is required" }
      check(supportedPaymentMethodsValue != null) { "supportedPaymentMethods is required" }
      check(supportedTransferCountriesValue != null) { "supportedTransferCountries is required" }
      check(verificationFieldsValue != null) { "verificationFields is required" }
      return CountrySpec(
        defaultCurrency = defaultCurrency,
        id = id,
        objectValue = objectValue,
        supportedBankAccountCurrencies = supportedBankAccountCurrencies,
        supportedPaymentCurrencies = supportedPaymentCurrencies,
        supportedPaymentMethods = supportedPaymentMethods,
        supportedTransferCountries = supportedTransferCountries,
        verificationFields = verificationFields,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CountrySpec = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CountrySpec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CountrySpec {
      val jsonDecoder = decoder.requireJsonDecoder("CountrySpec")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CountrySpec must be a JSON object")
      val defaultCurrency = json.decodeRequired<String>(rawObject, "default_currency")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineCountrySpecObjectValueXd84f508b>(rawObject, "object")
      val supportedBankAccountCurrencies = json.decodeRequired<Map<String, List<String>>>(rawObject, "supported_bank_account_currencies")
      val supportedPaymentCurrencies = json.decodeRequired<List<String>>(rawObject, "supported_payment_currencies")
      val supportedPaymentMethods = json.decodeRequired<List<String>>(rawObject, "supported_payment_methods")
      val supportedTransferCountries = json.decodeRequired<List<String>>(rawObject, "supported_transfer_countries")
      val verificationFields = json.decodeRequired<CountrySpecVerificationFields>(rawObject, "verification_fields")
      return CountrySpec(
        defaultCurrency = defaultCurrency,
        id = id,
        objectValue = objectValue,
        supportedBankAccountCurrencies = supportedBankAccountCurrencies,
        supportedPaymentCurrencies = supportedPaymentCurrencies,
        supportedPaymentMethods = supportedPaymentMethods,
        supportedTransferCountries = supportedTransferCountries,
        verificationFields = verificationFields,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CountrySpec) {
      val jsonEncoder = encoder.requireJsonEncoder("CountrySpec")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("default_currency", value.defaultCurrency)
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("supported_bank_account_currencies", json.encodeToJsonElement(value.supportedBankAccountCurrencies))
        put("supported_payment_currencies", json.encodeToJsonElement(value.supportedPaymentCurrencies))
        put("supported_payment_methods", json.encodeToJsonElement(value.supportedPaymentMethods))
        put("supported_transfer_countries", json.encodeToJsonElement(value.supportedTransferCountries))
        put("verification_fields", json.encodeToJsonElement(value.verificationFields))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun countrySpec(block: CountrySpec.Builder.() -> Unit): CountrySpec = CountrySpec.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CountrySpec is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
