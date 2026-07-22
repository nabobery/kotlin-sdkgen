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

/**
 * The account holder to link accounts for.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/account_holder
 */
@Serializable(with = InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc.Serializer::class)
public class InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc(
    public val type: InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2,
    public val account: String? = null,
    public val customer: String? = null,
    public val customerAccount: String? = null,
) {
    public class Builder {
        private var typeValue:
            InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2? = null

        public var type: InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var account: String? = null

        public var customer: String? = null

        public var customerAccount: String? = null

        public fun build(): InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc {
            check(typeValue != null) { "type is required" }
            return InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc(
                type = type,
                account = account,
                customer = customer,
                customerAccount = customerAccount,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2>(
                    rawObject,
                    "type",
                )
            return InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc(
                type = type,
                account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
                customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
                customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.account?.let { put("account", it) }
                    value.customer?.let { put("customer", it) }
                    value.customerAccount?.let { put("customer_account", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc(
    block: InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc.Builder.() -> Unit,
): InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc =
    InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderX985337bc is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
