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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663.Serializer::class)
public class InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663(
    /**
     * The amount to capture from the authorization. If not provided, the full amount of the authorization will be
     * captured. This amount is in the authorization currency and in the [smallest currency
     * unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public val captureAmount: Int? = null,
    /**
     * Whether to close the authorization after capture. Defaults to true. Set to false to enable multi-capture flows.
     */
    public val closeAuthorization: Boolean? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Additional purchase information that is optionally provided by the merchant.
     */
    public val purchaseDetails: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906? = null,
) {
    public class Builder {
        /**
         * The amount to capture from the authorization. If not provided, the full amount of the authorization will be
         * captured. This amount is in the authorization currency and in the [smallest currency
         * unit](https://docs.stripe.com/currencies#zero-decimal).
         */
        public var captureAmount: Int? = null

        /**
         * Whether to close the authorization after capture. Defaults to true. Set to false to enable multi-capture flows.
         */
        public var closeAuthorization: Boolean? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Additional purchase information that is optionally provided by the merchant.
         */
        public var purchaseDetails:
            InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906? = null

        public fun build(): InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663 =
            InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663(
                captureAmount = captureAmount,
                closeAuthorization = closeAuthorization,
                expand = expand,
                purchaseDetails = purchaseDetails,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663 must be a JSON object",
                    )
            return InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663(
                captureAmount = rawObject["capture_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                closeAuthorization = rawObject["close_authorization"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                purchaseDetails =
                    rawObject["purchase_details"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.captureAmount?.let { put("capture_amount", json.encodeToJsonElement(it)) }
                    value.closeAuthorization?.let { put("close_authorization", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.purchaseDetails?.let { put("purchase_details", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663(
    block: InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663.Builder.() -> Unit,
): InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663 =
    InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663.build(block)
