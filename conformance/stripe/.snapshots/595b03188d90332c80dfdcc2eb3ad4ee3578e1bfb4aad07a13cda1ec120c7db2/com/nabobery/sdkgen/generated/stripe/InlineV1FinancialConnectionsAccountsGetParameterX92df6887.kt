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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1accounts/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1accounts/get/parameters/0/schema
 */
@Serializable(with = InlineV1FinancialConnectionsAccountsGetParameterX92df6887.Serializer::class)
public class InlineV1FinancialConnectionsAccountsGetParameterX92df6887(
    public val account: String? = null,
    public val customer: String? = null,
    public val customerAccount: String? = null,
) {
    public class Builder {
        public var account: String? = null

        public var customer: String? = null

        public var customerAccount: String? = null

        public fun build(): InlineV1FinancialConnectionsAccountsGetParameterX92df6887 =
            InlineV1FinancialConnectionsAccountsGetParameterX92df6887(
                account = account,
                customer = customer,
                customerAccount = customerAccount,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1FinancialConnectionsAccountsGetParameterX92df6887 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1FinancialConnectionsAccountsGetParameterX92df6887> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1FinancialConnectionsAccountsGetParameterX92df6887 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1FinancialConnectionsAccountsGetParameterX92df6887")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1FinancialConnectionsAccountsGetParameterX92df6887 must be a JSON object",
                    )
            return InlineV1FinancialConnectionsAccountsGetParameterX92df6887(
                account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
                customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
                customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1FinancialConnectionsAccountsGetParameterX92df6887,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1FinancialConnectionsAccountsGetParameterX92df6887")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.account?.let { put("account", it) }
                    value.customer?.let { put("customer", it) }
                    value.customerAccount?.let { put("customer_account", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1FinancialConnectionsAccountsGetParameterX92df6887(
    block: InlineV1FinancialConnectionsAccountsGetParameterX92df6887.Builder.() -> Unit,
): InlineV1FinancialConnectionsAccountsGetParameterX92df6887 =
    InlineV1FinancialConnectionsAccountsGetParameterX92df6887.build(block)
