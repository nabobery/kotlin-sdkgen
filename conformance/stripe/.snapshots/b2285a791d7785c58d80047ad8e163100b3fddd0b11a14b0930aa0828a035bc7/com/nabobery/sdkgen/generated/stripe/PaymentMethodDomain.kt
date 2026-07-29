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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A payment method domain represents a web domain that you have registered with Stripe.
 * Stripe Elements use registered payment method domains to control where certain payment methods are shown.
 *
 * Related guide: [Payment method domains](https://docs.stripe.com/payments/payment-methods/pmd-registration).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_domain
 */
@Serializable(with = PaymentMethodDomain.Serializer::class)
public class PaymentMethodDomain(
  public val amazonPay: PaymentMethodDomainResourcePaymentMethodStatus,
  public val applePay: PaymentMethodDomainResourcePaymentMethodStatus,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * The domain name that this payment method domain object represents.
   */
  public val domainName: String,
  /**
   * Whether this payment method domain is enabled. If the domain is not enabled, payment methods that require a payment
   * method domain will not appear in Elements.
   */
  public val enabled: Boolean,
  public val googlePay: PaymentMethodDomainResourcePaymentMethodStatus,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  public val klarna: PaymentMethodDomainResourcePaymentMethodStatus,
  public val link: PaymentMethodDomainResourcePaymentMethodStatus,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlinePaymentMethodDomainObjectValueXd889161a,
  public val paypal: PaymentMethodDomainResourcePaymentMethodStatus,
) {
  public class Builder {
    private var amazonPayValue: PaymentMethodDomainResourcePaymentMethodStatus? = null

    public var amazonPay: PaymentMethodDomainResourcePaymentMethodStatus
      get() = requireNotNull(amazonPayValue) { "amazonPay is required" }
      set(`value`) {
        amazonPayValue = value
      }

    private var applePayValue: PaymentMethodDomainResourcePaymentMethodStatus? = null

    public var applePay: PaymentMethodDomainResourcePaymentMethodStatus
      get() = requireNotNull(applePayValue) { "applePay is required" }
      set(`value`) {
        applePayValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var domainNameValue: String? = null

    public var domainName: String
      get() = requireNotNull(domainNameValue) { "domainName is required" }
      set(`value`) {
        domainNameValue = value
      }

    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var googlePayValue: PaymentMethodDomainResourcePaymentMethodStatus? = null

    public var googlePay: PaymentMethodDomainResourcePaymentMethodStatus
      get() = requireNotNull(googlePayValue) { "googlePay is required" }
      set(`value`) {
        googlePayValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var klarnaValue: PaymentMethodDomainResourcePaymentMethodStatus? = null

    public var klarna: PaymentMethodDomainResourcePaymentMethodStatus
      get() = requireNotNull(klarnaValue) { "klarna is required" }
      set(`value`) {
        klarnaValue = value
      }

    private var linkValue: PaymentMethodDomainResourcePaymentMethodStatus? = null

    public var link: PaymentMethodDomainResourcePaymentMethodStatus
      get() = requireNotNull(linkValue) { "link is required" }
      set(`value`) {
        linkValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlinePaymentMethodDomainObjectValueXd889161a? = null

    public var objectValue: InlinePaymentMethodDomainObjectValueXd889161a
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var paypalValue: PaymentMethodDomainResourcePaymentMethodStatus? = null

    public var paypal: PaymentMethodDomainResourcePaymentMethodStatus
      get() = requireNotNull(paypalValue) { "paypal is required" }
      set(`value`) {
        paypalValue = value
      }

    public fun build(): PaymentMethodDomain {
      check(amazonPayValue != null) { "amazonPay is required" }
      check(applePayValue != null) { "applePay is required" }
      check(createdValue != null) { "created is required" }
      check(domainNameValue != null) { "domainName is required" }
      check(enabledValue != null) { "enabled is required" }
      check(googlePayValue != null) { "googlePay is required" }
      check(idValue != null) { "id is required" }
      check(klarnaValue != null) { "klarna is required" }
      check(linkValue != null) { "link is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(paypalValue != null) { "paypal is required" }
      return PaymentMethodDomain(
        amazonPay = amazonPay,
        applePay = applePay,
        created = created,
        domainName = domainName,
        enabled = enabled,
        googlePay = googlePay,
        id = id,
        klarna = klarna,
        link = link,
        livemode = livemode,
        objectValue = objectValue,
        paypal = paypal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDomain = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDomain> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDomain {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDomain")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDomain must be a JSON object")
      val amazonPay = json.decodeRequired<PaymentMethodDomainResourcePaymentMethodStatus>(rawObject, "amazon_pay")
      val applePay = json.decodeRequired<PaymentMethodDomainResourcePaymentMethodStatus>(rawObject, "apple_pay")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val domainName = json.decodeRequired<String>(rawObject, "domain_name")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val googlePay = json.decodeRequired<PaymentMethodDomainResourcePaymentMethodStatus>(rawObject, "google_pay")
      val id = json.decodeRequired<String>(rawObject, "id")
      val klarna = json.decodeRequired<PaymentMethodDomainResourcePaymentMethodStatus>(rawObject, "klarna")
      val link = json.decodeRequired<PaymentMethodDomainResourcePaymentMethodStatus>(rawObject, "link")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlinePaymentMethodDomainObjectValueXd889161a>(rawObject, "object")
      val paypal = json.decodeRequired<PaymentMethodDomainResourcePaymentMethodStatus>(rawObject, "paypal")
      return PaymentMethodDomain(
        amazonPay = amazonPay,
        applePay = applePay,
        created = created,
        domainName = domainName,
        enabled = enabled,
        googlePay = googlePay,
        id = id,
        klarna = klarna,
        link = link,
        livemode = livemode,
        objectValue = objectValue,
        paypal = paypal,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDomain) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDomain")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amazon_pay", json.encodeToJsonElement(value.amazonPay))
        put("apple_pay", json.encodeToJsonElement(value.applePay))
        put("created", json.encodeToJsonElement(value.created))
        put("domain_name", value.domainName)
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("google_pay", json.encodeToJsonElement(value.googlePay))
        put("id", value.id)
        put("klarna", json.encodeToJsonElement(value.klarna))
        put("link", json.encodeToJsonElement(value.link))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("paypal", json.encodeToJsonElement(value.paypal))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDomain(block: PaymentMethodDomain.Builder.() -> Unit): PaymentMethodDomain = PaymentMethodDomain.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodDomain is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
