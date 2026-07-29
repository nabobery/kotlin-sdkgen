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
 * A Customer Session allows you to grant Stripe's frontend SDKs (like Stripe.js) client-side access
 * control over a Customer.
 *
 * Related guides: [Customer Session with the Payment
 * Element](/payments/accept-a-payment-deferred?platform=web&type=payment#save-payment-methods),
 * [Customer Session with the Pricing Table](/payments/checkout/pricing-table#customer-session),
 * [Customer Session with the Buy Button](/payment-links/buy-button#pass-an-existing-customer).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_session
 */
@Serializable(with = CustomerSession.Serializer::class)
public class CustomerSession(
  /**
   * The client secret of this Customer Session. Used on the client to set up secure access to the given `customer`.
   *
   * The client secret can be used to provide access to `customer` from your frontend. It should not be stored, logged,
   * or exposed to anyone other than the relevant customer. Make sure that you have TLS enabled on any page that
   * includes the client secret.
   */
  public val clientSecret: String,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * The Customer the Customer Session was created for.
   */
  public val customer: InlineCustomerSessionCustomerX1fb2c39c,
  /**
   * The timestamp at which this Customer Session will expire.
   */
  public val expiresAt: Int,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineCustomerSessionObjectValueXa4c482ab,
  public val components: CustomerSessionResourceComponents? = null,
  /**
   * The Account that the Customer Session was created for.
   */
  public val customerAccount: String? = null,
) {
  public class Builder {
    private var clientSecretValue: String? = null

    public var clientSecret: String
      get() = requireNotNull(clientSecretValue) { "clientSecret is required" }
      set(`value`) {
        clientSecretValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var customerValue: InlineCustomerSessionCustomerX1fb2c39c? = null

    public var customer: InlineCustomerSessionCustomerX1fb2c39c
      get() = requireNotNull(customerValue) { "customer is required" }
      set(`value`) {
        customerValue = value
      }

    private var expiresAtValue: Int? = null

    public var expiresAt: Int
      get() = requireNotNull(expiresAtValue) { "expiresAt is required" }
      set(`value`) {
        expiresAtValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineCustomerSessionObjectValueXa4c482ab? = null

    public var objectValue: InlineCustomerSessionObjectValueXa4c482ab
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public var components: CustomerSessionResourceComponents? = null

    /**
     * The Account that the Customer Session was created for.
     */
    public var customerAccount: String? = null

    public fun build(): CustomerSession {
      check(clientSecretValue != null) { "clientSecret is required" }
      check(createdValue != null) { "created is required" }
      check(customerValue != null) { "customer is required" }
      check(expiresAtValue != null) { "expiresAt is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return CustomerSession(
        clientSecret = clientSecret,
        created = created,
        customer = customer,
        expiresAt = expiresAt,
        livemode = livemode,
        objectValue = objectValue,
        components = components,
        customerAccount = customerAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerSession = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CustomerSession> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerSession {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerSession")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerSession must be a JSON object")
      val clientSecret = json.decodeRequired<String>(rawObject, "client_secret")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val customer = json.decodeRequired<InlineCustomerSessionCustomerX1fb2c39c>(rawObject, "customer")
      val expiresAt = json.decodeRequired<Int>(rawObject, "expires_at")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineCustomerSessionObjectValueXa4c482ab>(rawObject, "object")
      return CustomerSession(
        clientSecret = clientSecret,
        created = created,
        customer = customer,
        expiresAt = expiresAt,
        livemode = livemode,
        objectValue = objectValue,
        components = rawObject["components"]?.let { json.decodeFromJsonElement<CustomerSessionResourceComponents>(it) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerSession) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerSession")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("client_secret", value.clientSecret)
        put("created", json.encodeToJsonElement(value.created))
        put("customer", json.encodeToJsonElement(value.customer))
        put("expires_at", json.encodeToJsonElement(value.expiresAt))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        value.components?.let { put("components", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerSession(block: CustomerSession.Builder.() -> Unit): CustomerSession = CustomerSession.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerSession is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
