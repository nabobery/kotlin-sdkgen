package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in `payment` mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_intent_data
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b(
    public val applicationFeeAmount: Int? = null,
    public val captureMethod: InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataCaptureMethodX53ead7fd? = null,
    public val description: String? = null,
    public val metadata: Map<String, String>? = null,
    public val onBehalfOf: String? = null,
    public val receiptEmail: String? = null,
    public val setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX5efc728f? = null,
    public val shipping: InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataShippingX34bb8989? = null,
    public val statementDescriptor: String? = null,
    public val statementDescriptorSuffix: String? = null,
    public val transferData: InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a? = null,
    public val transferGroup: String? = null,
) {
    public class Builder {
        public var applicationFeeAmount: Int? = null

        public var captureMethod:
            InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataCaptureMethodX53ead7fd? = null

        public var description: String? = null

        public var metadata: Map<String, String>? = null

        public var onBehalfOf: String? = null

        public var receiptEmail: String? = null

        public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX5efc728f? =
            null

        public var shipping: InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataShippingX34bb8989? =
            null

        public var statementDescriptor: String? = null

        public var statementDescriptorSuffix: String? = null

        public var transferData:
            InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a? = null

        public var transferGroup: String? = null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b =
            InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b(
                applicationFeeAmount = applicationFeeAmount,
                captureMethod = captureMethod,
                description = description,
                metadata = metadata,
                onBehalfOf = onBehalfOf,
                receiptEmail = receiptEmail,
                setupFutureUsage = setupFutureUsage,
                shipping = shipping,
                statementDescriptor = statementDescriptor,
                statementDescriptorSuffix = statementDescriptorSuffix,
                transferData = transferData,
                transferGroup = transferGroup,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b(
                applicationFeeAmount = rawObject["application_fee_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataCaptureMethodX53ead7fd>(
                                it,
                            )
                    },
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
                receiptEmail = rawObject["receipt_email"]?.let { json.decodeFromJsonElement<String>(it) },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX5efc728f>(it)
                    },
                shipping =
                    rawObject["shipping"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataShippingX34bb8989>(
                                it,
                            )
                    },
                statementDescriptor =
                    rawObject["statement_descriptor"]?.let {
                        json
                            .decodeFromJsonElement<String>(
                                it,
                            )
                    },
                statementDescriptorSuffix =
                    rawObject["statement_descriptor_suffix"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
                    },
                transferData =
                    rawObject["transfer_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a>(
                                it,
                            )
                    },
                transferGroup = rawObject["transfer_group"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", it) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.onBehalfOf?.let { put("on_behalf_of", it) }
                    value.receiptEmail?.let { put("receipt_email", it) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                    value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
                    value.statementDescriptor?.let { put("statement_descriptor", it) }
                    value.statementDescriptorSuffix?.let { put("statement_descriptor_suffix", it) }
                    value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
                    value.transferGroup?.let { put("transfer_group", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b(
    block: InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b =
    InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b.build(block)
