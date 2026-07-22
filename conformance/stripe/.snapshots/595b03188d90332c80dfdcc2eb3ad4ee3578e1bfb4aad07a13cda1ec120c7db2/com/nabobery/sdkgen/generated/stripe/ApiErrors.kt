package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.String
import kotlin.Unit

@Serializable
public data class ApiErrorsView(
    @SerialName("advice_code")
    public val adviceCode: String? = null,
    public val charge: String? = null,
    public val code: String? = null,
    @SerialName("decline_code")
    public val declineCode: String? = null,
    @SerialName("doc_url")
    public val docUrl: String? = null,
    public val message: String? = null,
    @SerialName("network_advice_code")
    public val networkAdviceCode: String? = null,
    @SerialName("network_decline_code")
    public val networkDeclineCode: String? = null,
    public val `param`: String? = null,
    @SerialName("payment_intent")
    public val paymentIntent: PaymentIntent? = null,
    @SerialName("payment_method")
    public val paymentMethod: PaymentMethod? = null,
    @SerialName("payment_method_type")
    public val paymentMethodType: String? = null,
    @SerialName("request_log_url")
    public val requestLogUrl: String? = null,
    @SerialName("setup_intent")
    public val setupIntent: SetupIntent? = null,
    public val source: InlineApiErrorsSourceXc1356764? = null,
    public val type: InlineApiErrorsTypeX8f5e1aa3,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/api_errors
 */
@Serializable(with = ApiErrors.Serializer::class)
public class ApiErrors(
    /**
     * The type of error returned. One of `api_error`, `card_error`, `idempotency_error`, or `invalid_request_error`
     */
    public val type: InlineApiErrorsTypeX8f5e1aa3,
    /**
     * For card errors resulting from a card issuer decline, a short string indicating [how to proceed with an
     * error](https://docs.stripe.com/declines#retrying-issuer-declines) if they provide one.
     */
    public val adviceCode: String? = null,
    /**
     * For card errors, the ID of the failed charge.
     */
    public val charge: String? = null,
    /**
     * For some errors that could be handled programmatically, a short string indicating the [error
     * code](https://docs.stripe.com/error-codes) reported.
     */
    public val code: String? = null,
    /**
     * For card errors resulting from a card issuer decline, a short string indicating the [card issuer's reason for the
     * decline](https://docs.stripe.com/declines#issuer-declines) if they provide one.
     */
    public val declineCode: String? = null,
    /**
     * A URL to more information about the [error code](https://docs.stripe.com/error-codes) reported.
     */
    public val docUrl: String? = null,
    /**
     * A human-readable message providing more details about the error. For card errors, these messages can be shown to
     * your users.
     */
    public val message: String? = null,
    /**
     * For card errors resulting from a card issuer decline, a 2 digit code which indicates the advice given to merchant
     * by the card network on how to proceed with an error.
     */
    public val networkAdviceCode: String? = null,
    /**
     * For payments declined by the network, an alphanumeric code which indicates the reason the payment failed.
     */
    public val networkDeclineCode: String? = null,
    /**
     * If the error is parameter-specific, the parameter related to the error. For example, you can use this to display a
     * message near the correct form field.
     */
    public val `param`: String? = null,
    public val paymentIntent: PaymentIntent? = null,
    public val paymentMethod: PaymentMethod? = null,
    /**
     * If the error is specific to the type of payment method, the payment method type that had a problem. This field is
     * only populated for invoice-related errors.
     */
    public val paymentMethodType: String? = null,
    /**
     * A URL to the request log entry in your dashboard.
     */
    public val requestLogUrl: String? = null,
    public val setupIntent: SetupIntent? = null,
    /**
     * The [source object](https://docs.stripe.com/api/sources/object) for errors returned on a request involving a
     * source.
     */
    public val source: InlineApiErrorsSourceXc1356764? = null,
) {
    public class Builder {
        private var typeValue: InlineApiErrorsTypeX8f5e1aa3? = null

        public var type: InlineApiErrorsTypeX8f5e1aa3
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * For card errors resulting from a card issuer decline, a short string indicating [how to proceed with an
         * error](https://docs.stripe.com/declines#retrying-issuer-declines) if they provide one.
         */
        public var adviceCode: String? = null

        /**
         * For card errors, the ID of the failed charge.
         */
        public var charge: String? = null

        /**
         * For some errors that could be handled programmatically, a short string indicating the [error
         * code](https://docs.stripe.com/error-codes) reported.
         */
        public var code: String? = null

        /**
         * For card errors resulting from a card issuer decline, a short string indicating the [card issuer's reason for the
         * decline](https://docs.stripe.com/declines#issuer-declines) if they provide one.
         */
        public var declineCode: String? = null

        /**
         * A URL to more information about the [error code](https://docs.stripe.com/error-codes) reported.
         */
        public var docUrl: String? = null

        /**
         * A human-readable message providing more details about the error. For card errors, these messages can be shown to
         * your users.
         */
        public var message: String? = null

        /**
         * For card errors resulting from a card issuer decline, a 2 digit code which indicates the advice given to merchant
         * by the card network on how to proceed with an error.
         */
        public var networkAdviceCode: String? = null

        /**
         * For payments declined by the network, an alphanumeric code which indicates the reason the payment failed.
         */
        public var networkDeclineCode: String? = null

        /**
         * If the error is parameter-specific, the parameter related to the error. For example, you can use this to display
         * a message near the correct form field.
         */
        public var `param`: String? = null

        public var paymentIntent: PaymentIntent? = null

        public var paymentMethod: PaymentMethod? = null

        /**
         * If the error is specific to the type of payment method, the payment method type that had a problem. This field is
         * only populated for invoice-related errors.
         */
        public var paymentMethodType: String? = null

        /**
         * A URL to the request log entry in your dashboard.
         */
        public var requestLogUrl: String? = null

        public var setupIntent: SetupIntent? = null

        /**
         * The [source object](https://docs.stripe.com/api/sources/object) for errors returned on a request involving a
         * source.
         */
        public var source: InlineApiErrorsSourceXc1356764? = null

        public fun build(): ApiErrors {
            check(typeValue != null) { "type is required" }
            return ApiErrors(
                type = type,
                adviceCode = adviceCode,
                charge = charge,
                code = code,
                declineCode = declineCode,
                docUrl = docUrl,
                message = message,
                networkAdviceCode = networkAdviceCode,
                networkDeclineCode = networkDeclineCode,
                param = param,
                paymentIntent = paymentIntent,
                paymentMethod = paymentMethod,
                paymentMethodType = paymentMethodType,
                requestLogUrl = requestLogUrl,
                setupIntent = setupIntent,
                source = source,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ApiErrors = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ApiErrors> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ApiErrors {
            val jsonDecoder = decoder.requireJsonDecoder("ApiErrors")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ApiErrors must be a JSON object")
            val type = json.decodeRequired<InlineApiErrorsTypeX8f5e1aa3>(rawObject, "type")
            return ApiErrors(
                type = type,
                adviceCode = rawObject["advice_code"]?.let { json.decodeFromJsonElement<String>(it) },
                charge = rawObject["charge"]?.let { json.decodeFromJsonElement<String>(it) },
                code = rawObject["code"]?.let { json.decodeFromJsonElement<String>(it) },
                declineCode = rawObject["decline_code"]?.let { json.decodeFromJsonElement<String>(it) },
                docUrl = rawObject["doc_url"]?.let { json.decodeFromJsonElement<String>(it) },
                message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
                networkAdviceCode = rawObject["network_advice_code"]?.let { json.decodeFromJsonElement<String>(it) },
                networkDeclineCode = rawObject["network_decline_code"]?.let { json.decodeFromJsonElement<String>(it) },
                param = rawObject["param"]?.let { json.decodeFromJsonElement<String>(it) },
                paymentIntent = rawObject["payment_intent"]?.let { json.decodeFromJsonElement<PaymentIntent>(it) },
                paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<PaymentMethod>(it) },
                paymentMethodType = rawObject["payment_method_type"]?.let { json.decodeFromJsonElement<String>(it) },
                requestLogUrl = rawObject["request_log_url"]?.let { json.decodeFromJsonElement<String>(it) },
                setupIntent = rawObject["setup_intent"]?.let { json.decodeFromJsonElement<SetupIntent>(it) },
                source = rawObject["source"]?.let { json.decodeFromJsonElement<InlineApiErrorsSourceXc1356764>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ApiErrors,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ApiErrors")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.adviceCode?.let { put("advice_code", it) }
                    value.charge?.let { put("charge", it) }
                    value.code?.let { put("code", it) }
                    value.declineCode?.let { put("decline_code", it) }
                    value.docUrl?.let { put("doc_url", it) }
                    value.message?.let { put("message", it) }
                    value.networkAdviceCode?.let { put("network_advice_code", it) }
                    value.networkDeclineCode?.let { put("network_decline_code", it) }
                    value.param?.let { put("param", it) }
                    value.paymentIntent?.let { put("payment_intent", json.encodeToJsonElement(it)) }
                    value.paymentMethod?.let { put("payment_method", json.encodeToJsonElement(it)) }
                    value.paymentMethodType?.let { put("payment_method_type", it) }
                    value.requestLogUrl?.let { put("request_log_url", it) }
                    value.setupIntent?.let { put("setup_intent", json.encodeToJsonElement(it)) }
                    value.source?.let { put("source", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun apiErrors(block: ApiErrors.Builder.() -> Unit): ApiErrors = ApiErrors.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("ApiErrors is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
