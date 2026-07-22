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
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1accounts~1{account}~1refresh/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1accounts~1{account}~1refresh/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e.Serializer::class)
public class InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e(
    features: List<InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c>,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
) {
    /**
     * The list of account features that you would like to refresh.
     */
    public val features:
        List<InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c> =
        features.toList()

    public class Builder {
        private var featuresValue:
            List<InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c>? =
            null

        public var features:
            List<InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c>
            get() = requireNotNull(featuresValue) { "features is required" }
            set(`value`) {
                featuresValue = value
            }

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        public fun build(): InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e {
            check(featuresValue != null) { "features is required" }
            return InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e(
                features = features,
                expand = expand,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e must be a JSON object",
                    )
            val features =
                json
                    .decodeRequired<List<InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c>>(
                        rawObject,
                        "features",
                    )
            return InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e(
                features = features,
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e",
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

public fun inlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e(
    block: InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e.Builder.() -> Unit,
): InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e =
    InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
