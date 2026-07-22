package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * ConfirmationTokens help transport client side data collected by Stripe JS over
 * to your server for confirming a PaymentIntent or SetupIntent. If the confirmation
 * is successful, values present on the ConfirmationToken are written onto the Intent.
 *
 * To learn more about how to use ConfirmationToken, visit the related guides:
 * - [Finalize payments on the server](https://docs.stripe.com/payments/finalize-payments-on-the-server)
 * - [Build two-step confirmation](https://docs.stripe.com/payments/build-a-two-step-confirmation).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/confirmation_token
 */
@Serializable(with = ConfirmationToken.Serializer::class)
public class ConfirmationToken(
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
    public val objectValue: InlineConfirmationTokenObjectValueXd062abfb,
    /**
     * Indicates whether the Stripe SDK is used to handle confirmation flow. Defaults to `true` on ConfirmationToken.
     */
    public val useStripeSdk: Boolean,
    /**
     * Time at which this ConfirmationToken expires and can no longer be used to confirm a PaymentIntent or SetupIntent.
     */
    public val expiresAt: Int? = null,
    /**
     * Data used for generating a Mandate.
     */
    public val mandateData: InlineConfirmationTokenMandateDataXfd4d495c? = null,
    /**
     * ID of the PaymentIntent that this ConfirmationToken was used to confirm, or null if this ConfirmationToken has not
     * yet been used.
     */
    public val paymentIntent: String? = null,
    /**
     * Payment-method-specific configuration for this ConfirmationToken.
     */
    public val paymentMethodOptions: InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3? = null,
    /**
     * Payment details collected by the Payment Element, used to create a PaymentMethod when a PaymentIntent or
     * SetupIntent is confirmed with this ConfirmationToken.
     */
    public val paymentMethodPreview: InlineConfirmationTokenPaymentMethodPreviewX06c42571? = null,
    /**
     * Return URL used to confirm the Intent.
     */
    public val returnUrl: String? = null,
    /**
     * Indicates that you intend to make future payments with this ConfirmationToken's payment method.
     *
     * The presence of this property will [attach the payment
     * method](https://docs.stripe.com/payments/save-during-payment) to the PaymentIntent's Customer, if present, after
     * the PaymentIntent is confirmed and any required actions from the user are complete.
     */
    public val setupFutureUsage: InlineConfirmationTokenSetupFutureUsageX759e7354? = null,
    /**
     * ID of the SetupIntent that this ConfirmationToken was used to confirm, or null if this ConfirmationToken has not
     * yet been used.
     */
    public val setupIntent: String? = null,
    /**
     * Shipping information collected on this ConfirmationToken.
     */
    public val shipping: InlineConfirmationTokenShippingX2977e808? = null,
) {
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

        private var objectValueValue: InlineConfirmationTokenObjectValueXd062abfb? = null

        public var objectValue: InlineConfirmationTokenObjectValueXd062abfb
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var useStripeSdkValue: Boolean? = null

        public var useStripeSdk: Boolean
            get() = requireNotNull(useStripeSdkValue) { "useStripeSdk is required" }
            set(`value`) {
                useStripeSdkValue = value
            }

        /**
         * Time at which this ConfirmationToken expires and can no longer be used to confirm a PaymentIntent or SetupIntent.
         */
        public var expiresAt: Int? = null

        /**
         * Data used for generating a Mandate.
         */
        public var mandateData: InlineConfirmationTokenMandateDataXfd4d495c? = null

        /**
         * ID of the PaymentIntent that this ConfirmationToken was used to confirm, or null if this ConfirmationToken has
         * not yet been used.
         */
        public var paymentIntent: String? = null

        /**
         * Payment-method-specific configuration for this ConfirmationToken.
         */
        public var paymentMethodOptions: InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3? = null

        /**
         * Payment details collected by the Payment Element, used to create a PaymentMethod when a PaymentIntent or
         * SetupIntent is confirmed with this ConfirmationToken.
         */
        public var paymentMethodPreview: InlineConfirmationTokenPaymentMethodPreviewX06c42571? = null

        /**
         * Return URL used to confirm the Intent.
         */
        public var returnUrl: String? = null

        /**
         * Indicates that you intend to make future payments with this ConfirmationToken's payment method.
         *
         * The presence of this property will [attach the payment
         * method](https://docs.stripe.com/payments/save-during-payment) to the PaymentIntent's Customer, if present, after
         * the PaymentIntent is confirmed and any required actions from the user are complete.
         */
        public var setupFutureUsage: InlineConfirmationTokenSetupFutureUsageX759e7354? = null

        /**
         * ID of the SetupIntent that this ConfirmationToken was used to confirm, or null if this ConfirmationToken has not
         * yet been used.
         */
        public var setupIntent: String? = null

        /**
         * Shipping information collected on this ConfirmationToken.
         */
        public var shipping: InlineConfirmationTokenShippingX2977e808? = null

        public fun build(): ConfirmationToken {
            check(createdValue != null) { "created is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(useStripeSdkValue != null) { "useStripeSdk is required" }
            return ConfirmationToken(
                created = created,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                useStripeSdk = useStripeSdk,
                expiresAt = expiresAt,
                mandateData = mandateData,
                paymentIntent = paymentIntent,
                paymentMethodOptions = paymentMethodOptions,
                paymentMethodPreview = paymentMethodPreview,
                returnUrl = returnUrl,
                setupFutureUsage = setupFutureUsage,
                setupIntent = setupIntent,
                shipping = shipping,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ConfirmationToken = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ConfirmationToken> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ConfirmationToken {
            val jsonDecoder = decoder.requireJsonDecoder("ConfirmationToken")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ConfirmationToken must be a JSON object")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue = json.decodeRequired<InlineConfirmationTokenObjectValueXd062abfb>(rawObject, "object")
            val useStripeSdk = json.decodeRequired<Boolean>(rawObject, "use_stripe_sdk")
            return ConfirmationToken(
                created = created,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                useStripeSdk = useStripeSdk,
                expiresAt =
                    rawObject["expires_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                mandateData =
                    rawObject["mandate_data"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineConfirmationTokenMandateDataXfd4d495c?>(element)
                        }
                    },
                paymentIntent =
                    rawObject["payment_intent"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                paymentMethodOptions =
                    rawObject["payment_method_options"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3?>(element)
                        }
                    },
                paymentMethodPreview =
                    rawObject["payment_method_preview"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineConfirmationTokenPaymentMethodPreviewX06c42571?>(element)
                        }
                    },
                returnUrl =
                    rawObject["return_url"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineConfirmationTokenSetupFutureUsageX759e7354?>(element)
                        }
                    },
                setupIntent =
                    rawObject["setup_intent"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                shipping =
                    rawObject["shipping"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineConfirmationTokenShippingX2977e808?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ConfirmationToken,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ConfirmationToken")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("created", json.encodeToJsonElement(value.created))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("use_stripe_sdk", json.encodeToJsonElement(value.useStripeSdk))
                    value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
                    value.mandateData?.let { put("mandate_data", json.encodeToJsonElement(it)) }
                    value.paymentIntent?.let { put("payment_intent", it) }
                    value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
                    value.paymentMethodPreview?.let { put("payment_method_preview", json.encodeToJsonElement(it)) }
                    value.returnUrl?.let { put("return_url", it) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                    value.setupIntent?.let { put("setup_intent", it) }
                    value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun confirmationToken(block: ConfirmationToken.Builder.() -> Unit): ConfirmationToken =
    ConfirmationToken.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("ConfirmationToken is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
