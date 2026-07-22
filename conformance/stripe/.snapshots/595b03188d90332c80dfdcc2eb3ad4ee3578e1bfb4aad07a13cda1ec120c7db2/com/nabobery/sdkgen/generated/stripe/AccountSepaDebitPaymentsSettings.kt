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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_sepa_debit_payments_settings
 */
@Serializable(with = AccountSepaDebitPaymentsSettings.Serializer::class)
public class AccountSepaDebitPaymentsSettings(
    /**
     * SEPA creditor identifier that identifies the company making the payment.
     */
    public val creditorId: String? = null,
) {
    public class Builder {
        /**
         * SEPA creditor identifier that identifies the company making the payment.
         */
        public var creditorId: String? = null

        public fun build(): AccountSepaDebitPaymentsSettings =
            AccountSepaDebitPaymentsSettings(
                creditorId = creditorId,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): AccountSepaDebitPaymentsSettings = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<AccountSepaDebitPaymentsSettings> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): AccountSepaDebitPaymentsSettings {
            val jsonDecoder = decoder.requireJsonDecoder("AccountSepaDebitPaymentsSettings")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("AccountSepaDebitPaymentsSettings must be a JSON object")
            return AccountSepaDebitPaymentsSettings(
                creditorId = rawObject["creditor_id"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: AccountSepaDebitPaymentsSettings,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("AccountSepaDebitPaymentsSettings")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.creditorId?.let { put("creditor_id", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun accountSepaDebitPaymentsSettings(
    block: AccountSepaDebitPaymentsSettings.Builder.() -> Unit,
): AccountSepaDebitPaymentsSettings = AccountSepaDebitPaymentsSettings.build(block)
