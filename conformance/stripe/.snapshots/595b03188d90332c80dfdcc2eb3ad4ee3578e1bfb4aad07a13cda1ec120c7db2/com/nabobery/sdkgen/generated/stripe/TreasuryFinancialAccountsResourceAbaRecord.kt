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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * ABA Records contain U.S. bank account details per the ABA format.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_aba_record
 */
@Serializable(with = TreasuryFinancialAccountsResourceAbaRecord.Serializer::class)
public class TreasuryFinancialAccountsResourceAbaRecord(
    /**
     * The name of the person or business that owns the bank account.
     */
    public val accountHolderName: String,
    /**
     * The last four characters of the account number.
     */
    public val accountNumberLast4: String,
    /**
     * Name of the bank.
     */
    public val bankName: String,
    /**
     * Routing number for the account.
     */
    public val routingNumber: String,
    /**
     * The account number.
     */
    public val accountNumber: String? = null,
) {
    public class Builder {
        private var accountHolderNameValue: String? = null

        public var accountHolderName: String
            get() = requireNotNull(accountHolderNameValue) { "accountHolderName is required" }
            set(`value`) {
                accountHolderNameValue = value
            }

        private var accountNumberLast4Value: String? = null

        public var accountNumberLast4: String
            get() = requireNotNull(accountNumberLast4Value) { "accountNumberLast4 is required" }
            set(`value`) {
                accountNumberLast4Value = value
            }

        private var bankNameValue: String? = null

        public var bankName: String
            get() = requireNotNull(bankNameValue) { "bankName is required" }
            set(`value`) {
                bankNameValue = value
            }

        private var routingNumberValue: String? = null

        public var routingNumber: String
            get() = requireNotNull(routingNumberValue) { "routingNumber is required" }
            set(`value`) {
                routingNumberValue = value
            }

        /**
         * The account number.
         */
        public var accountNumber: String? = null

        public fun build(): TreasuryFinancialAccountsResourceAbaRecord {
            check(accountHolderNameValue != null) { "accountHolderName is required" }
            check(accountNumberLast4Value != null) { "accountNumberLast4 is required" }
            check(bankNameValue != null) { "bankName is required" }
            check(routingNumberValue != null) { "routingNumber is required" }
            return TreasuryFinancialAccountsResourceAbaRecord(
                accountHolderName = accountHolderName,
                accountNumberLast4 = accountNumberLast4,
                bankName = bankName,
                routingNumber = routingNumber,
                accountNumber = accountNumber,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountsResourceAbaRecord =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryFinancialAccountsResourceAbaRecord> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryFinancialAccountsResourceAbaRecord {
            val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountsResourceAbaRecord")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TreasuryFinancialAccountsResourceAbaRecord must be a JSON object")
            val accountHolderName = json.decodeRequired<String>(rawObject, "account_holder_name")
            val accountNumberLast4 = json.decodeRequired<String>(rawObject, "account_number_last4")
            val bankName = json.decodeRequired<String>(rawObject, "bank_name")
            val routingNumber = json.decodeRequired<String>(rawObject, "routing_number")
            return TreasuryFinancialAccountsResourceAbaRecord(
                accountHolderName = accountHolderName,
                accountNumberLast4 = accountNumberLast4,
                bankName = bankName,
                routingNumber = routingNumber,
                accountNumber =
                    rawObject["account_number"]?.let { element ->
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
            `value`: TreasuryFinancialAccountsResourceAbaRecord,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountsResourceAbaRecord")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("account_holder_name", value.accountHolderName)
                    put("account_number_last4", value.accountNumberLast4)
                    put("bank_name", value.bankName)
                    put("routing_number", value.routingNumber)
                    value.accountNumber?.let { put("account_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasuryFinancialAccountsResourceAbaRecord(
    block: TreasuryFinancialAccountsResourceAbaRecord.Builder.() -> Unit,
): TreasuryFinancialAccountsResourceAbaRecord = TreasuryFinancialAccountsResourceAbaRecord.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TreasuryFinancialAccountsResourceAbaRecord is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
