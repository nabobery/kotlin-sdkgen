package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A Tax `Registration` lets us know that your business is registered to collect tax on payments within a region,
 * enabling you to [automatically collect tax](https://docs.stripe.com/tax).
 *
 * Stripe doesn't register on your behalf with the relevant authorities when you create a Tax `Registration` object. For
 * more information on how to register to collect tax, see [our guide](https://docs.stripe.com/tax/registering).
 *
 * Related guide: [Using the Registrations API](https://docs.stripe.com/tax/registrations-api)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.registration
 */
@Serializable(with = TaxRegistration.Serializer::class)
public class TaxRegistration(
  /**
   * Time at which the registration becomes active. Measured in seconds since the Unix epoch.
   */
  public val activeFrom: Int,
  /**
   * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
   */
  public val country: String,
  public val countryOptions: TaxProductRegistrationsResourceCountryOptions,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTaxRegistrationObjectValueX3419786d,
  /**
   * The status of the registration. This field is present for convenience and can be deduced from `active_from` and
   * `expires_at`.
   */
  public val status: InlineTaxRegistrationStatusX0281a401,
  /**
   * If set, the registration stops being active at this time. If not set, the registration will be active indefinitely.
   * Measured in seconds since the Unix epoch.
   */
  public val expiresAt: Int? = null,
) {
  public class Builder {
    private var activeFromValue: Int? = null

    public var activeFrom: Int
      get() = requireNotNull(activeFromValue) { "activeFrom is required" }
      set(`value`) {
        activeFromValue = value
      }

    private var countryValue: String? = null

    public var country: String
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    private var countryOptionsValue: TaxProductRegistrationsResourceCountryOptions? = null

    public var countryOptions: TaxProductRegistrationsResourceCountryOptions
      get() = requireNotNull(countryOptionsValue) { "countryOptions is required" }
      set(`value`) {
        countryOptionsValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineTaxRegistrationObjectValueX3419786d? = null

    public var objectValue: InlineTaxRegistrationObjectValueX3419786d
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: InlineTaxRegistrationStatusX0281a401? = null

    public var status: InlineTaxRegistrationStatusX0281a401
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * If set, the registration stops being active at this time. If not set, the registration will be active
     * indefinitely. Measured in seconds since the Unix epoch.
     */
    public var expiresAt: Int? = null

    public fun build(): TaxRegistration {
      check(activeFromValue != null) { "activeFrom is required" }
      check(countryValue != null) { "country is required" }
      check(countryOptionsValue != null) { "countryOptions is required" }
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      return TaxRegistration(
        activeFrom = activeFrom,
        country = country,
        countryOptions = countryOptions,
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        expiresAt = expiresAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxRegistration = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxRegistration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxRegistration {
      val jsonDecoder = decoder.requireJsonDecoder("TaxRegistration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxRegistration must be a JSON object")
      val activeFrom = json.decodeRequired<Int>(rawObject, "active_from")
      val country = json.decodeRequired<String>(rawObject, "country")
      val countryOptions = json.decodeRequired<TaxProductRegistrationsResourceCountryOptions>(rawObject, "country_options")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineTaxRegistrationObjectValueX3419786d>(rawObject, "object")
      val status = json.decodeRequired<InlineTaxRegistrationStatusX0281a401>(rawObject, "status")
      return TaxRegistration(
        activeFrom = activeFrom,
        country = country,
        countryOptions = countryOptions,
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        expiresAt = rawObject["expires_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxRegistration) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxRegistration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active_from", json.encodeToJsonElement(value.activeFrom))
        put("country", value.country)
        put("country_options", json.encodeToJsonElement(value.countryOptions))
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", json.encodeToJsonElement(value.status))
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxRegistration(block: TaxRegistration.Builder.() -> Unit): TaxRegistration = TaxRegistration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxRegistration is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
