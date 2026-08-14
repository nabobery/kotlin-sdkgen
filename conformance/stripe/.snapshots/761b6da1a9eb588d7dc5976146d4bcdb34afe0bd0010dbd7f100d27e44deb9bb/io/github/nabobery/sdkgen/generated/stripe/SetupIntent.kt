package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
public data class SetupIntentView internal constructor(
  public val application: InlineSetupIntentApplicationXbb7ee095? = null,
  @SerialName("attach_to_self")
  public val attachToSelf: Boolean? = null,
  @SerialName("automatic_payment_methods")
  public val automaticPaymentMethods: InlineSetupIntentAutomaticPaymentMethodsX4392fbfe? = null,
  @SerialName("cancellation_reason")
  public val cancellationReason: InlineSetupIntentCancellationReasonX43ba9b44? = null,
  @SerialName("client_secret")
  public val clientSecret: String? = null,
  public val created: Int,
  public val customer: InlineSetupIntentCustomerXae0c479d? = null,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  public val description: String? = null,
  @SerialName("excluded_payment_method_types")
  public val excludedPaymentMethodTypes:
      List<InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf>? = null,
  @SerialName("flow_directions")
  public val flowDirections: List<InlineSetupIntentFlowDirectionsItemX0f009201>? = null,
  public val id: String,
  @SerialName("last_setup_error")
  public val lastSetupError: InlineSetupIntentLastSetupErrorX50a0ebf5? = null,
  @SerialName("latest_attempt")
  public val latestAttempt: InlineSetupIntentLatestAttemptXa0b1ef17? = null,
  public val livemode: Boolean,
  @SerialName("managed_payments")
  public val managedPayments: InlineSetupIntentManagedPaymentsXf96d32d2? = null,
  public val mandate: InlineSetupIntentMandateX652efc7a? = null,
  public val metadata: Map<String, String>? = null,
  @SerialName("next_action")
  public val nextAction: InlineSetupIntentNextActionX00e3e8dd? = null,
  @SerialName("object")
  public val objectValue: InlineSetupIntentObjectValueX2703e05e,
  @SerialName("on_behalf_of")
  public val onBehalfOf: InlineSetupIntentOnBehalfOfX6d54b25d? = null,
  @SerialName("payment_method")
  public val paymentMethod: InlineSetupIntentPaymentMethodXb9ecb298? = null,
  @SerialName("payment_method_configuration_details")
  public val paymentMethodConfigurationDetails:
      InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90? = null,
  @SerialName("payment_method_options")
  public val paymentMethodOptions: InlineSetupIntentPaymentMethodOptionsXca95335a? = null,
  @SerialName("payment_method_types")
  public val paymentMethodTypes: List<String>,
  @SerialName("single_use_mandate")
  public val singleUseMandate: InlineSetupIntentSingleUseMandateXf2c7f2f3? = null,
  public val status: InlineSetupIntentStatusX7b2c3fb4,
  public val usage: String,
)

/**
 * A SetupIntent guides you through the process of setting up and saving a customer's payment credentials for future
 * payments.
 * For example, you can use a SetupIntent to set up and save your customer's card without immediately collecting a
 * payment.
 * Later, you can use [PaymentIntents](https://api.stripe.com#payment_intents) to drive the payment flow.
 *
 * Create a SetupIntent when you're ready to collect your customer's payment credentials.
 * Don't maintain long-lived, unconfirmed SetupIntents because they might not be valid.
 * The SetupIntent transitions through multiple [statuses](https://docs.stripe.com/payments/intents#intent-statuses) as
 * it guides
 * you through the setup process.
 *
 * Successful SetupIntents result in payment credentials that are optimized for future payments.
 * For example, cardholders in [certain regions](https://stripe.com/guides/strong-customer-authentication) might need to
 * be run through
 * [Strong Customer Authentication](https://docs.stripe.com/strong-customer-authentication) during payment method
 * collection
 * to streamline later [off-session payments](https://docs.stripe.com/payments/setup-intents).
 * If you use the SetupIntent with a [Customer](https://api.stripe.com#setup_intent_object-customer),
 * it automatically attaches the resulting payment method to that Customer after successful setup.
 * We recommend using SetupIntents or
 * [setup_future_usage](https://api.stripe.com#payment_intent_object-setup_future_usage) on
 * PaymentIntents to save payment methods to prevent saving invalid or unoptimized payment methods.
 *
 * By using SetupIntents, you can reduce friction for your customers, even as regulations change over time.
 *
 * Related guide: [Setup Intents API](https://docs.stripe.com/payments/setup-intents)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent
 */
@Serializable(with = SetupIntent.Serializer::class)
public class SetupIntent(
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
  public val objectValue: InlineSetupIntentObjectValueX2703e05e,
  paymentMethodTypes: List<String>,
  /**
   * [Status](https://docs.stripe.com/payments/intents#intent-statuses) of this SetupIntent, one of
   * `requires_payment_method`, `requires_confirmation`, `requires_action`, `processing`, `canceled`, or `succeeded`.
   */
  public val status: InlineSetupIntentStatusX7b2c3fb4,
  /**
   * Indicates how the payment method is intended to be used in the future.
   *
   * Use `on_session` if you intend to only reuse the payment method when the customer is in your checkout flow. Use
   * `off_session` if your customer may or may not be in your checkout flow. If not provided, this value defaults to
   * `off_session`.
   */
  public val usage: String,
  /**
   * ID of the Connect application that created the SetupIntent.
   */
  public val application: InlineSetupIntentApplicationXbb7ee095? = null,
  /**
   * If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
   *
   * It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and OutboundTransfers.
   * It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false when attaching a
   * PaymentMethod to a Customer.
   */
  public val attachToSelf: Boolean? = null,
  /**
   * Settings for dynamic payment methods compatible with this Setup Intent
   */
  public val automaticPaymentMethods: InlineSetupIntentAutomaticPaymentMethodsX4392fbfe? = null,
  /**
   * Reason for cancellation of this SetupIntent, one of `abandoned`, `requested_by_customer`, or `duplicate`.
   */
  public val cancellationReason: InlineSetupIntentCancellationReasonX43ba9b44? = null,
  /**
   * The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
   *
   * The client secret can be used to complete payment setup from your frontend. It should not be stored, logged, or
   * exposed to anyone other than the customer. Make sure that you have TLS enabled on any page that includes the client
   * secret.
   */
  public val clientSecret: String? = null,
  /**
   * ID of the Customer this SetupIntent belongs to, if one exists.
   *
   * If present, the SetupIntent's payment method will be attached to the Customer on successful setup. Payment methods
   * attached to other Customers cannot be used with this SetupIntent.
   */
  public val customer: InlineSetupIntentCustomerXae0c479d? = null,
  /**
   * ID of the Account this SetupIntent belongs to, if one exists.
   *
   * If present, the SetupIntent's payment method will be attached to the Account on successful setup. Payment methods
   * attached to other Accounts cannot be used with this SetupIntent.
   */
  public val customerAccount: String? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  excludedPaymentMethodTypes: List<InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf>? = null,
  flowDirections: List<InlineSetupIntentFlowDirectionsItemX0f009201>? = null,
  /**
   * The error encountered in the previous SetupIntent confirmation.
   */
  public val lastSetupError: InlineSetupIntentLastSetupErrorX50a0ebf5? = null,
  /**
   * The most recent SetupAttempt for this SetupIntent.
   */
  public val latestAttempt: InlineSetupIntentLatestAttemptXa0b1ef17? = null,
  public val managedPayments: InlineSetupIntentManagedPaymentsXf96d32d2? = null,
  /**
   * ID of the multi use Mandate generated by the SetupIntent.
   */
  public val mandate: InlineSetupIntentMandateX652efc7a? = null,
  metadata: Map<String, String>? = null,
  /**
   * If present, this property tells you what actions you need to take in order for your customer to continue payment
   * setup.
   */
  public val nextAction: InlineSetupIntentNextActionX00e3e8dd? = null,
  /**
   * The account (if any) for which the setup is intended.
   */
  public val onBehalfOf: InlineSetupIntentOnBehalfOfX6d54b25d? = null,
  /**
   * ID of the payment method used with this SetupIntent. If the payment method is `card_present` and isn't a digital
   * wallet, then the
   * [generated_card](https://docs.stripe.com/api/setup_attempts/object#setup_attempt_object-payment_method_details-card
   * _present-generated_card) associated with the `latest_attempt` is attached to the Customer instead.
   */
  public val paymentMethod: InlineSetupIntentPaymentMethodXb9ecb298? = null,
  /**
   * Information about the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations)
   * used for this Setup Intent.
   */
  public val paymentMethodConfigurationDetails:
      InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90? = null,
  /**
   * Payment method-specific configuration for this SetupIntent.
   */
  public val paymentMethodOptions: InlineSetupIntentPaymentMethodOptionsXca95335a? = null,
  /**
   * ID of the single_use Mandate generated by the SetupIntent.
   */
  public val singleUseMandate: InlineSetupIntentSingleUseMandateXf2c7f2f3? = null,
) {
  /**
   * The list of payment method types (e.g. card) that this SetupIntent is allowed to set up. A list of valid payment
   * method types can be found [here](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type).
   */
  public val paymentMethodTypes: List<String> = paymentMethodTypes.toList()

  /**
   * Payment method types that are excluded from this SetupIntent.
   */
  public val excludedPaymentMethodTypes:
      List<InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf>? =
      excludedPaymentMethodTypes?.let { collection0 -> collection0.toList() }

  /**
   * Indicates the directions of money movement for which this payment method is intended to be used.
   *
   * Include `inbound` if you intend to use the payment method as the origin to pull funds from. Include `outbound` if
   * you intend to use the payment method as the destination to send funds to. You can include both if you intend to use
   * the payment method for both purposes.
   */
  public val flowDirections: List<InlineSetupIntentFlowDirectionsItemX0f009201>? =
      flowDirections?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

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

    private var objectValueValue: InlineSetupIntentObjectValueX2703e05e? = null

    public var objectValue: InlineSetupIntentObjectValueX2703e05e
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var paymentMethodTypesValue: List<String>? = null

    public var paymentMethodTypes: List<String>
      get() = requireNotNull(paymentMethodTypesValue) { "paymentMethodTypes is required" }.toList()
      set(`value`) {
        paymentMethodTypesValue = value.toList()
      }

    private var statusValue: InlineSetupIntentStatusX7b2c3fb4? = null

    public var status: InlineSetupIntentStatusX7b2c3fb4
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
     * ID of the Connect application that created the SetupIntent.
     */
    public var application: InlineSetupIntentApplicationXbb7ee095? = null

    /**
     * If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
     *
     * It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and
     * OutboundTransfers. It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false
     * when attaching a PaymentMethod to a Customer.
     */
    public var attachToSelf: Boolean? = null

    /**
     * Settings for dynamic payment methods compatible with this Setup Intent
     */
    public var automaticPaymentMethods: InlineSetupIntentAutomaticPaymentMethodsX4392fbfe? = null

    /**
     * Reason for cancellation of this SetupIntent, one of `abandoned`, `requested_by_customer`, or `duplicate`.
     */
    public var cancellationReason: InlineSetupIntentCancellationReasonX43ba9b44? = null

    /**
     * The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
     *
     * The client secret can be used to complete payment setup from your frontend. It should not be stored, logged, or
     * exposed to anyone other than the customer. Make sure that you have TLS enabled on any page that includes the
     * client secret.
     */
    public var clientSecret: String? = null

    /**
     * ID of the Customer this SetupIntent belongs to, if one exists.
     *
     * If present, the SetupIntent's payment method will be attached to the Customer on successful setup. Payment
     * methods attached to other Customers cannot be used with this SetupIntent.
     */
    public var customer: InlineSetupIntentCustomerXae0c479d? = null

    /**
     * ID of the Account this SetupIntent belongs to, if one exists.
     *
     * If present, the SetupIntent's payment method will be attached to the Account on successful setup. Payment methods
     * attached to other Accounts cannot be used with this SetupIntent.
     */
    public var customerAccount: String? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    private var excludedPaymentMethodTypesValue:
        List<InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf>? = null

    /**
     * Payment method types that are excluded from this SetupIntent.
     */
    public var excludedPaymentMethodTypes:
        List<InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf>?
      get() = excludedPaymentMethodTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        excludedPaymentMethodTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var flowDirectionsValue: List<InlineSetupIntentFlowDirectionsItemX0f009201>? = null

    /**
     * Indicates the directions of money movement for which this payment method is intended to be used.
     *
     * Include `inbound` if you intend to use the payment method as the origin to pull funds from. Include `outbound` if
     * you intend to use the payment method as the destination to send funds to. You can include both if you intend to
     * use the payment method for both purposes.
     */
    public var flowDirections: List<InlineSetupIntentFlowDirectionsItemX0f009201>?
      get() = flowDirectionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        flowDirectionsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The error encountered in the previous SetupIntent confirmation.
     */
    public var lastSetupError: InlineSetupIntentLastSetupErrorX50a0ebf5? = null

    /**
     * The most recent SetupAttempt for this SetupIntent.
     */
    public var latestAttempt: InlineSetupIntentLatestAttemptXa0b1ef17? = null

    public var managedPayments: InlineSetupIntentManagedPaymentsXf96d32d2? = null

    /**
     * ID of the multi use Mandate generated by the SetupIntent.
     */
    public var mandate: InlineSetupIntentMandateX652efc7a? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * If present, this property tells you what actions you need to take in order for your customer to continue payment
     * setup.
     */
    public var nextAction: InlineSetupIntentNextActionX00e3e8dd? = null

    /**
     * The account (if any) for which the setup is intended.
     */
    public var onBehalfOf: InlineSetupIntentOnBehalfOfX6d54b25d? = null

    /**
     * ID of the payment method used with this SetupIntent. If the payment method is `card_present` and isn't a digital
     * wallet, then the
     * [generated_card](https://docs.stripe.com/api/setup_attempts/object#setup_attempt_object-payment_method_details-ca
     * rd_present-generated_card) associated with the `latest_attempt` is attached to the Customer instead.
     */
    public var paymentMethod: InlineSetupIntentPaymentMethodXb9ecb298? = null

    /**
     * Information about the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations)
     * used for this Setup Intent.
     */
    public var paymentMethodConfigurationDetails:
        InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90? = null

    /**
     * Payment method-specific configuration for this SetupIntent.
     */
    public var paymentMethodOptions: InlineSetupIntentPaymentMethodOptionsXca95335a? = null

    /**
     * ID of the single_use Mandate generated by the SetupIntent.
     */
    public var singleUseMandate: InlineSetupIntentSingleUseMandateXf2c7f2f3? = null

    public fun build(): SetupIntent {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(paymentMethodTypesValue != null) { "paymentMethodTypes is required" }
      check(statusValue != null) { "status is required" }
      check(usageValue != null) { "usage is required" }
      return SetupIntent(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        paymentMethodTypes = paymentMethodTypes,
        status = status,
        usage = usage,
        application = application,
        attachToSelf = attachToSelf,
        automaticPaymentMethods = automaticPaymentMethods,
        cancellationReason = cancellationReason,
        clientSecret = clientSecret,
        customer = customer,
        customerAccount = customerAccount,
        description = description,
        excludedPaymentMethodTypes = excludedPaymentMethodTypes,
        flowDirections = flowDirections,
        lastSetupError = lastSetupError,
        latestAttempt = latestAttempt,
        managedPayments = managedPayments,
        mandate = mandate,
        metadata = metadata,
        nextAction = nextAction,
        onBehalfOf = onBehalfOf,
        paymentMethod = paymentMethod,
        paymentMethodConfigurationDetails = paymentMethodConfigurationDetails,
        paymentMethodOptions = paymentMethodOptions,
        singleUseMandate = singleUseMandate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SetupIntent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntent {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntent must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineSetupIntentObjectValueX2703e05e>(rawObject, "object")
      val paymentMethodTypes = json.decodeRequired<List<String>>(rawObject, "payment_method_types")
      val status = json.decodeRequired<InlineSetupIntentStatusX7b2c3fb4>(rawObject, "status")
      val usage = json.decodeRequired<String>(rawObject, "usage")
      return SetupIntent(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        paymentMethodTypes = paymentMethodTypes,
        status = status,
        usage = usage,
        application = rawObject["application"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentApplicationXbb7ee095?>(element) },
        attachToSelf = rawObject["attach_to_self"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        automaticPaymentMethods = rawObject["automatic_payment_methods"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentAutomaticPaymentMethodsX4392fbfe?>(element) },
        cancellationReason = rawObject["cancellation_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentCancellationReasonX43ba9b44?>(element) },
        clientSecret = rawObject["client_secret"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentCustomerXae0c479d?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        excludedPaymentMethodTypes = rawObject["excluded_payment_method_types"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf>?>(element) },
        flowDirections = rawObject["flow_directions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineSetupIntentFlowDirectionsItemX0f009201>?>(element) },
        lastSetupError = rawObject["last_setup_error"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentLastSetupErrorX50a0ebf5?>(element) },
        latestAttempt = rawObject["latest_attempt"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentLatestAttemptXa0b1ef17?>(element) },
        managedPayments = rawObject["managed_payments"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentManagedPaymentsXf96d32d2?>(element) },
        mandate = rawObject["mandate"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentMandateX652efc7a?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        nextAction = rawObject["next_action"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentNextActionX00e3e8dd?>(element) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentOnBehalfOfX6d54b25d?>(element) },
        paymentMethod = rawObject["payment_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentPaymentMethodXb9ecb298?>(element) },
        paymentMethodConfigurationDetails = rawObject["payment_method_configuration_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90?>(element) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsXca95335a?>(element) },
        singleUseMandate = rawObject["single_use_mandate"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentSingleUseMandateXf2c7f2f3?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntent) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("payment_method_types", json.encodeToJsonElement(value.paymentMethodTypes))
        put("status", json.encodeToJsonElement(value.status))
        put("usage", value.usage)
        value.application?.let { put("application", json.encodeToJsonElement(it)) }
        value.attachToSelf?.let { put("attach_to_self", json.encodeToJsonElement(it)) }
        value.automaticPaymentMethods?.let { put("automatic_payment_methods", json.encodeToJsonElement(it)) }
        value.cancellationReason?.let { put("cancellation_reason", json.encodeToJsonElement(it)) }
        value.clientSecret?.let { put("client_secret", it) }
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.description?.let { put("description", it) }
        value.excludedPaymentMethodTypes?.let { put("excluded_payment_method_types", json.encodeToJsonElement(it)) }
        value.flowDirections?.let { put("flow_directions", json.encodeToJsonElement(it)) }
        value.lastSetupError?.let { put("last_setup_error", json.encodeToJsonElement(it)) }
        value.latestAttempt?.let { put("latest_attempt", json.encodeToJsonElement(it)) }
        value.managedPayments?.let { put("managed_payments", json.encodeToJsonElement(it)) }
        value.mandate?.let { put("mandate", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.nextAction?.let { put("next_action", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", json.encodeToJsonElement(it)) }
        value.paymentMethodConfigurationDetails?.let { put("payment_method_configuration_details", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.singleUseMandate?.let { put("single_use_mandate", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntent(block: SetupIntent.Builder.() -> Unit): SetupIntent = SetupIntent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SetupIntent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
