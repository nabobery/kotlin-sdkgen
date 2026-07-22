package com.nabobery.sdkgen.generated.stripe

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1accounts~1{account}~1unsubscribe/post/requestBody/co
 * ntent/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1accounts~1{account}~1unsubscribe/post/requestBody/co
 * ntent/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83.Serializer::class)
public class InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83(
    features: List<InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a>,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
) {
    /**
     * The list of account features from which you would like to unsubscribe.
     */
    public val features: List<InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a> =
        features.toList()

    public class Builder {
        private var featuresValue:
            List<InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a>? = null

        public var features: List<InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a>
            get() = requireNotNull(featuresValue) { "features is required" }
            set(`value`) {
                featuresValue = value
            }

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        public fun build(): InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83 {
            check(featuresValue != null) { "features is required" }
            return InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83(
                features = features,
                expand = expand,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83 must be a JSON object",
                    )
            val features =
                json.decodeRequired<List<InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a>>(
                    rawObject,
                    "features",
                )
            return InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83(
                features = features,
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("features", json.encodeToJsonElement(value.features))
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83(
    block: InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83.Builder.() -> Unit,
): InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83 =
    InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
