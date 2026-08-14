package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@ConsistentCopyVisibility
@Serializable
public data class SetupAttemptView internal constructor(
  public val application: InlineSetupAttemptApplicationXaec8dc26? = null,
  @SerialName("attach_to_self")
  public val attachToSelf: Boolean? = null,
  public val created: Int,
  public val customer: InlineSetupAttemptCustomerX4f3b3f84? = null,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  @SerialName("flow_directions")
  public val flowDirections: List<InlineSetupAttemptFlowDirectionsItemXcbd0f944>? = null,
  public val id: String,
  public val livemode: Boolean,
  @SerialName("object")
  public val objectValue: InlineSetupAttemptObjectValueX942b9149,
  @SerialName("on_behalf_of")
  public val onBehalfOf: InlineSetupAttemptOnBehalfOfXe2975a98? = null,
  @SerialName("payment_method")
  public val paymentMethod: InlineSetupAttemptPaymentMethodXdc9167e6,
  @SerialName("payment_method_details")
  public val paymentMethodDetails: SetupAttemptPaymentMethodDetails,
  @SerialName("setup_error")
  public val setupError: InlineSetupAttemptSetupErrorXedd0b9b5? = null,
  @SerialName("setup_intent")
  public val setupIntent: InlineSetupAttemptSetupIntentX315ddd4f,
  public val status: String,
  public val usage: String,
)

/**
 * A SetupAttempt describes one attempted confirmation of a SetupIntent,
 * whether that confirmation is successful or unsuccessful. You can use
 * SetupAttempts to inspect details of a specific attempt at setting up a
 * payment method using a SetupIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt
 */
@Serializable(with = SetupAttempt.Serializer::class)
public class SetupAttempt(
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
  public val objectValue: InlineSetupAttemptObjectValueX942b9149,
  /**
   * ID of the payment method used with this SetupAttempt.
   */
  public val paymentMethod: InlineSetupAttemptPaymentMethodXdc9167e6,
  public val paymentMethodDetails: SetupAttemptPaymentMethodDetails,
  /**
   * ID of the SetupIntent that this attempt belongs to.
   */
  public val setupIntent: InlineSetupAttemptSetupIntentX315ddd4f,
  /**
   * Status of this SetupAttempt, one of `requires_confirmation`, `requires_action`, `processing`, `succeeded`,
   * `failed`, or `abandoned`.
   */
  public val status: String,
  /**
   * The value of [usage](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-usage) on the SetupIntent
   * at the time of this confirmation, one of `off_session` or `on_session`.
   */
  public val usage: String,
  /**
   * The value of [application](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-application) on the
   * SetupIntent at the time of this confirmation.
   */
  public val application: InlineSetupAttemptApplicationXaec8dc26? = null,
  /**
   * If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
   *
   * It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and OutboundTransfers.
   * It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false when attaching a
   * PaymentMethod to a Customer.
   */
  public val attachToSelf: Boolean? = null,
  /**
   * The value of [customer](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-customer) on the
   * SetupIntent at the time of this confirmation.
   */
  public val customer: InlineSetupAttemptCustomerX4f3b3f84? = null,
  /**
   * The value of
   * [customer_account](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-customer_account) on the
   * SetupIntent at the time of this confirmation.
   */
  public val customerAccount: String? = null,
  flowDirections: List<InlineSetupAttemptFlowDirectionsItemXcbd0f944>? = null,
  /**
   * The value of [on_behalf_of](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-on_behalf_of) on
   * the SetupIntent at the time of this confirmation.
   */
  public val onBehalfOf: InlineSetupAttemptOnBehalfOfXe2975a98? = null,
  /**
   * The error encountered during this attempt to confirm the SetupIntent, if any.
   */
  public val setupError: InlineSetupAttemptSetupErrorXedd0b9b5? = null,
) {
  /**
   * Indicates the directions of money movement for which this payment method is intended to be used.
   *
   * Include `inbound` if you intend to use the payment method as the origin to pull funds from. Include `outbound` if
   * you intend to use the payment method as the destination to send funds to. You can include both if you intend to use
   * the payment method for both purposes.
   */
  public val flowDirections: List<InlineSetupAttemptFlowDirectionsItemXcbd0f944>? =
      flowDirections?.let { collection0 -> collection0.toList() }

  public class Builder {
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

    private var objectValueValue: InlineSetupAttemptObjectValueX942b9149? = null

    public var objectValue: InlineSetupAttemptObjectValueX942b9149
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var paymentMethodValue: InlineSetupAttemptPaymentMethodXdc9167e6? = null

    public var paymentMethod: InlineSetupAttemptPaymentMethodXdc9167e6
      get() = requireNotNull(paymentMethodValue) { "paymentMethod is required" }
      set(`value`) {
        paymentMethodValue = value
      }

    private var paymentMethodDetailsValue: SetupAttemptPaymentMethodDetails? = null

    public var paymentMethodDetails: SetupAttemptPaymentMethodDetails
      get() = requireNotNull(paymentMethodDetailsValue) { "paymentMethodDetails is required" }
      set(`value`) {
        paymentMethodDetailsValue = value
      }

    private var setupIntentValue: InlineSetupAttemptSetupIntentX315ddd4f? = null

    public var setupIntent: InlineSetupAttemptSetupIntentX315ddd4f
      get() = requireNotNull(setupIntentValue) { "setupIntent is required" }
      set(`value`) {
        setupIntentValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var usageValue: String? = null

    public var usage: String
      get() = requireNotNull(usageValue) { "usage is required" }
      set(`value`) {
        usageValue = value
      }

    /**
     * The value of [application](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-application) on
     * the SetupIntent at the time of this confirmation.
     */
    public var application: InlineSetupAttemptApplicationXaec8dc26? = null

    /**
     * If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
     *
     * It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and
     * OutboundTransfers. It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false
     * when attaching a PaymentMethod to a Customer.
     */
    public var attachToSelf: Boolean? = null

    /**
     * The value of [customer](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-customer) on the
     * SetupIntent at the time of this confirmation.
     */
    public var customer: InlineSetupAttemptCustomerX4f3b3f84? = null

    /**
     * The value of
     * [customer_account](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-customer_account) on the
     * SetupIntent at the time of this confirmation.
     */
    public var customerAccount: String? = null

    private var flowDirectionsValue: List<InlineSetupAttemptFlowDirectionsItemXcbd0f944>? = null

    /**
     * Indicates the directions of money movement for which this payment method is intended to be used.
     *
     * Include `inbound` if you intend to use the payment method as the origin to pull funds from. Include `outbound` if
     * you intend to use the payment method as the destination to send funds to. You can include both if you intend to
     * use the payment method for both purposes.
     */
    public var flowDirections: List<InlineSetupAttemptFlowDirectionsItemXcbd0f944>?
      get() = flowDirectionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        flowDirectionsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The value of [on_behalf_of](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-on_behalf_of) on
     * the SetupIntent at the time of this confirmation.
     */
    public var onBehalfOf: InlineSetupAttemptOnBehalfOfXe2975a98? = null

    /**
     * The error encountered during this attempt to confirm the SetupIntent, if any.
     */
    public var setupError: InlineSetupAttemptSetupErrorXedd0b9b5? = null

    public fun build(): SetupAttempt {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(paymentMethodValue != null) { "paymentMethod is required" }
      check(paymentMethodDetailsValue != null) { "paymentMethodDetails is required" }
      check(setupIntentValue != null) { "setupIntent is required" }
      check(statusValue != null) { "status is required" }
      check(usageValue != null) { "usage is required" }
      return SetupAttempt(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        paymentMethod = paymentMethod,
        paymentMethodDetails = paymentMethodDetails,
        setupIntent = setupIntent,
        status = status,
        usage = usage,
        application = application,
        attachToSelf = attachToSelf,
        customer = customer,
        customerAccount = customerAccount,
        flowDirections = flowDirections,
        onBehalfOf = onBehalfOf,
        setupError = setupError,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupAttempt = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SetupAttempt> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupAttempt {
      val jsonDecoder = decoder.requireJsonDecoder("SetupAttempt")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupAttempt must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineSetupAttemptObjectValueX942b9149>(rawObject, "object")
      val paymentMethod = json.decodeRequired<InlineSetupAttemptPaymentMethodXdc9167e6>(rawObject, "payment_method")
      val paymentMethodDetails = json.decodeRequired<SetupAttemptPaymentMethodDetails>(rawObject, "payment_method_details")
      val setupIntent = json.decodeRequired<InlineSetupAttemptSetupIntentX315ddd4f>(rawObject, "setup_intent")
      val status = json.decodeRequired<String>(rawObject, "status")
      val usage = json.decodeRequired<String>(rawObject, "usage")
      return SetupAttempt(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        paymentMethod = paymentMethod,
        paymentMethodDetails = paymentMethodDetails,
        setupIntent = setupIntent,
        status = status,
        usage = usage,
        application = rawObject["application"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupAttemptApplicationXaec8dc26?>(element) },
        attachToSelf = rawObject["attach_to_self"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupAttemptCustomerX4f3b3f84?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        flowDirections = rawObject["flow_directions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineSetupAttemptFlowDirectionsItemXcbd0f944>?>(element) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupAttemptOnBehalfOfXe2975a98?>(element) },
        setupError = rawObject["setup_error"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupAttemptSetupErrorXedd0b9b5?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupAttempt) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupAttempt")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("payment_method", json.encodeToJsonElement(value.paymentMethod))
        put("payment_method_details", json.encodeToJsonElement(value.paymentMethodDetails))
        put("setup_intent", json.encodeToJsonElement(value.setupIntent))
        put("status", value.status)
        put("usage", value.usage)
        value.application?.let { put("application", json.encodeToJsonElement(it)) }
        value.attachToSelf?.let { put("attach_to_self", json.encodeToJsonElement(it)) }
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.flowDirections?.let { put("flow_directions", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
        value.setupError?.let { put("setup_error", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupAttempt(block: SetupAttempt.Builder.() -> Unit): SetupAttempt = SetupAttempt.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SetupAttempt is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
