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
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Instructs Stripe to make a request on your behalf using the destination URL. The destination URL
 * is activated by Stripe at the time of onboarding. Stripe verifies requests with your credentials
 * provided during onboarding, and injects card details from the payment_method into the request.
 *
 * Stripe redacts all sensitive fields and headers, including authentication credentials and card numbers,
 * before storing the request and response data in the forwarding Request object, which are subject to a
 * 30-day retention period.
 *
 * You can provide a Stripe idempotency key to make sure that requests with the same key result in only one
 * outbound request. The Stripe idempotency key provided should be unique and different from any idempotency
 * keys provided on the underlying third-party request.
 *
 * Forwarding Requests are synchronous requests that return a response or time out according to
 * Stripe’s limits.
 *
 * Related guide: [Forward card details to third-party API endpoints](https://docs.stripe.com/payments/forwarding).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/forwarding.request
 */
@Serializable(with = ForwardingRequest.Serializer::class)
public class ForwardingRequest(
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
    public val objectValue: InlineForwardingRequestObjectValueX53e09d3a,
    /**
     * The PaymentMethod to insert into the forwarded request. Forwarding previously consumed PaymentMethods is allowed.
     */
    public val paymentMethod: String,
    replacements: List<InlineForwardingRequestReplacementsItemXe1b219c9>,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * Context about the request from Stripe's servers to the destination endpoint.
     */
    public val requestContext: InlineForwardingRequestRequestContextXbafbd94f? = null,
    /**
     * The request that was sent to the destination endpoint. We redact any sensitive fields.
     */
    public val requestDetails: InlineForwardingRequestRequestDetailsX8d6ec125? = null,
    /**
     * The response that the destination endpoint returned to us. We redact any sensitive fields.
     */
    public val responseDetails: InlineForwardingRequestResponseDetailsXfec234d4? = null,
    /**
     * The destination URL for the forwarded request. Must be supported by the config.
     */
    public val url: String? = null,
) {
    /**
     * The field kinds to be replaced in the forwarded request.
     */
    public val replacements: List<InlineForwardingRequestReplacementsItemXe1b219c9> =
        replacements.toList()

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

        private var objectValueValue: InlineForwardingRequestObjectValueX53e09d3a? = null

        public var objectValue: InlineForwardingRequestObjectValueX53e09d3a
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var paymentMethodValue: String? = null

        public var paymentMethod: String
            get() = requireNotNull(paymentMethodValue) { "paymentMethod is required" }
            set(`value`) {
                paymentMethodValue = value
            }

        private var replacementsValue: List<InlineForwardingRequestReplacementsItemXe1b219c9>? = null

        public var replacements: List<InlineForwardingRequestReplacementsItemXe1b219c9>
            get() = requireNotNull(replacementsValue) { "replacements is required" }
            set(`value`) {
                replacementsValue = value
            }

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format.
         */
        public var metadata: Map<String, String>? = null

        /**
         * Context about the request from Stripe's servers to the destination endpoint.
         */
        public var requestContext: InlineForwardingRequestRequestContextXbafbd94f? = null

        /**
         * The request that was sent to the destination endpoint. We redact any sensitive fields.
         */
        public var requestDetails: InlineForwardingRequestRequestDetailsX8d6ec125? = null

        /**
         * The response that the destination endpoint returned to us. We redact any sensitive fields.
         */
        public var responseDetails: InlineForwardingRequestResponseDetailsXfec234d4? = null

        /**
         * The destination URL for the forwarded request. Must be supported by the config.
         */
        public var url: String? = null

        public fun build(): ForwardingRequest {
            check(createdValue != null) { "created is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(paymentMethodValue != null) { "paymentMethod is required" }
            check(replacementsValue != null) { "replacements is required" }
            return ForwardingRequest(
                created = created,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                paymentMethod = paymentMethod,
                replacements = replacements,
                metadata = metadata,
                requestContext = requestContext,
                requestDetails = requestDetails,
                responseDetails = responseDetails,
                url = url,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ForwardingRequest = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ForwardingRequest> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ForwardingRequest {
            val jsonDecoder = decoder.requireJsonDecoder("ForwardingRequest")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ForwardingRequest must be a JSON object")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue = json.decodeRequired<InlineForwardingRequestObjectValueX53e09d3a>(rawObject, "object")
            val paymentMethod = json.decodeRequired<String>(rawObject, "payment_method")
            val replacements =
                json.decodeRequired<List<InlineForwardingRequestReplacementsItemXe1b219c9>>(
                    rawObject,
                    "replacements",
                )
            return ForwardingRequest(
                created = created,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                paymentMethod = paymentMethod,
                replacements = replacements,
                metadata =
                    rawObject["metadata"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Map<String, String>?>(element)
                        }
                    },
                requestContext =
                    rawObject["request_context"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineForwardingRequestRequestContextXbafbd94f?>(element)
                        }
                    },
                requestDetails =
                    rawObject["request_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineForwardingRequestRequestDetailsX8d6ec125?>(element)
                        }
                    },
                responseDetails =
                    rawObject["response_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineForwardingRequestResponseDetailsXfec234d4?>(element)
                        }
                    },
                url =
                    rawObject["url"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ForwardingRequest,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ForwardingRequest")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("created", json.encodeToJsonElement(value.created))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("payment_method", value.paymentMethod)
                    put("replacements", json.encodeToJsonElement(value.replacements))
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.requestContext?.let { put("request_context", json.encodeToJsonElement(it)) }
                    value.requestDetails?.let { put("request_details", json.encodeToJsonElement(it)) }
                    value.responseDetails?.let { put("response_details", json.encodeToJsonElement(it)) }
                    value.url?.let { put("url", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun forwardingRequest(block: ForwardingRequest.Builder.() -> Unit): ForwardingRequest =
    ForwardingRequest.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("ForwardingRequest is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
