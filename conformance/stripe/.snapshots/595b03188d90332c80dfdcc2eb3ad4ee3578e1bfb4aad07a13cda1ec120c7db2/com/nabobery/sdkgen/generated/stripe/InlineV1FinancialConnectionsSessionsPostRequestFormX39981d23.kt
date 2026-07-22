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
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema
 */
@Serializable(with = InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23.Serializer::class)
public class InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23(
    /**
     * The account holder to link accounts for.
     */
    public val accountHolder: InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc,
    permissions: List<InlineV1FinancialConnectionsSessionsPostRequestFormPermissionsItemX0bd19174>,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Filters to restrict the kinds of accounts to collect.
     */
    public val filters: InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f? = null,
    /**
     * List of data features that you would like to retrieve upon account creation.
     */
    public val prefetch: List<InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602>? = null,
    /**
     * For webview integrations only. Upon completing OAuth login in the native browser, the user will be redirected to
     * this URL to return to your app.
     */
    public val returnUrl: String? = null,
) {
    /**
     * List of data features that you would like to request access to.
     *
     * Possible values are `balances`, `transactions`, `ownership`, and `payment_method`.
     */
    public val permissions:
        List<InlineV1FinancialConnectionsSessionsPostRequestFormPermissionsItemX0bd19174> =
        permissions.toList()

    public class Builder {
        private var accountHolderValue:
            InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc? = null

        public var accountHolder:
            InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc
            get() = requireNotNull(accountHolderValue) { "accountHolder is required" }
            set(`value`) {
                accountHolderValue = value
            }

        private var permissionsValue:
            List<InlineV1FinancialConnectionsSessionsPostRequestFormPermissionsItemX0bd19174>? = null

        public var permissions:
            List<InlineV1FinancialConnectionsSessionsPostRequestFormPermissionsItemX0bd19174>
            get() = requireNotNull(permissionsValue) { "permissions is required" }
            set(`value`) {
                permissionsValue = value
            }

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Filters to restrict the kinds of accounts to collect.
         */
        public var filters: InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f? = null

        /**
         * List of data features that you would like to retrieve upon account creation.
         */
        public var prefetch:
            List<InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602>? = null

        /**
         * For webview integrations only. Upon completing OAuth login in the native browser, the user will be redirected to
         * this URL to return to your app.
         */
        public var returnUrl: String? = null

        public fun build(): InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23 {
            check(accountHolderValue != null) { "accountHolder is required" }
            check(permissionsValue != null) { "permissions is required" }
            return InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23(
                accountHolder = accountHolder,
                permissions = permissions,
                expand = expand,
                filters = filters,
                prefetch = prefetch,
                returnUrl = returnUrl,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23 must be a JSON object",
                    )
            val accountHolder =
                json
                    .decodeRequired<InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc>(
                        rawObject,
                        "account_holder",
                    )
            val permissions =
                json
                    .decodeRequired<List<InlineV1FinancialConnectionsSessionsPostRequestFormPermissionsItemX0bd19174>>(
                        rawObject,
                        "permissions",
                    )
            return InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23(
                accountHolder = accountHolder,
                permissions = permissions,
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                filters =
                    rawObject["filters"]?.let {
                        json.decodeFromJsonElement<InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f>(
                            it,
                        )
                    },
                prefetch =
                    rawObject["prefetch"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602>>(
                                it,
                            )
                    },
                returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("account_holder", json.encodeToJsonElement(value.accountHolder))
                    put("permissions", json.encodeToJsonElement(value.permissions))
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
                    value.prefetch?.let { put("prefetch", json.encodeToJsonElement(it)) }
                    value.returnUrl?.let { put("return_url", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1FinancialConnectionsSessionsPostRequestFormX39981d23(
    block: InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23.Builder.() -> Unit,
): InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23 =
    InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
