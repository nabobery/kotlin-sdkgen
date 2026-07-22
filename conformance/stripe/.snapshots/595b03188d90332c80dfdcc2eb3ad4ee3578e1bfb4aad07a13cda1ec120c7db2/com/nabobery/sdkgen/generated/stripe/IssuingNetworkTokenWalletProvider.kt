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
import kotlin.collections.List

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_network_token_wallet_provider
 */
@Serializable(with = IssuingNetworkTokenWalletProvider.Serializer::class)
public class IssuingNetworkTokenWalletProvider(
    /**
     * The wallet provider-given account ID of the digital wallet the token belongs to.
     */
    public val accountId: String? = null,
    /**
     * An evaluation on the trustworthiness of the wallet account between 1 and 5. A higher score indicates more
     * trustworthy.
     */
    public val accountTrustScore: Int? = null,
    /**
     * The method used for tokenizing a card.
     */
    public val cardNumberSource: InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c? = null,
    public val cardholderAddress: IssuingNetworkTokenAddress? = null,
    /**
     * The name of the cardholder tokenizing the card.
     */
    public val cardholderName: String? = null,
    /**
     * An evaluation on the trustworthiness of the device. A higher score indicates more trustworthy.
     */
    public val deviceTrustScore: Int? = null,
    /**
     * The hashed email address of the cardholder's account with the wallet provider.
     */
    public val hashedAccountEmailAddress: String? = null,
    /**
     * The reasons for suggested tokenization given by the card network.
     */
    public val reasonCodes: List<InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5>? = null,
    /**
     * The recommendation on responding to the tokenization request.
     */
    public val suggestedDecision: InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348? = null,
    /**
     * The version of the standard for mapping reason codes followed by the wallet provider.
     */
    public val suggestedDecisionVersion: String? = null,
) {
    public class Builder {
        /**
         * The wallet provider-given account ID of the digital wallet the token belongs to.
         */
        public var accountId: String? = null

        /**
         * An evaluation on the trustworthiness of the wallet account between 1 and 5. A higher score indicates more
         * trustworthy.
         */
        public var accountTrustScore: Int? = null

        /**
         * The method used for tokenizing a card.
         */
        public var cardNumberSource: InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c? =
            null

        public var cardholderAddress: IssuingNetworkTokenAddress? = null

        /**
         * The name of the cardholder tokenizing the card.
         */
        public var cardholderName: String? = null

        /**
         * An evaluation on the trustworthiness of the device. A higher score indicates more trustworthy.
         */
        public var deviceTrustScore: Int? = null

        /**
         * The hashed email address of the cardholder's account with the wallet provider.
         */
        public var hashedAccountEmailAddress: String? = null

        /**
         * The reasons for suggested tokenization given by the card network.
         */
        public var reasonCodes: List<InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5>? =
            null

        /**
         * The recommendation on responding to the tokenization request.
         */
        public var suggestedDecision: InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348? =
            null

        /**
         * The version of the standard for mapping reason codes followed by the wallet provider.
         */
        public var suggestedDecisionVersion: String? = null

        public fun build(): IssuingNetworkTokenWalletProvider =
            IssuingNetworkTokenWalletProvider(
                accountId = accountId,
                accountTrustScore = accountTrustScore,
                cardNumberSource = cardNumberSource,
                cardholderAddress = cardholderAddress,
                cardholderName = cardholderName,
                deviceTrustScore = deviceTrustScore,
                hashedAccountEmailAddress = hashedAccountEmailAddress,
                reasonCodes = reasonCodes,
                suggestedDecision = suggestedDecision,
                suggestedDecisionVersion = suggestedDecisionVersion,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingNetworkTokenWalletProvider = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingNetworkTokenWalletProvider> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingNetworkTokenWalletProvider {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingNetworkTokenWalletProvider")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingNetworkTokenWalletProvider must be a JSON object")
            return IssuingNetworkTokenWalletProvider(
                accountId = rawObject["account_id"]?.let { json.decodeFromJsonElement<String>(it) },
                accountTrustScore = rawObject["account_trust_score"]?.let { json.decodeFromJsonElement<Int>(it) },
                cardNumberSource =
                    rawObject["card_number_source"]?.let {
                        json.decodeFromJsonElement<InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c>(it)
                    },
                cardholderAddress =
                    rawObject["cardholder_address"]?.let {
                        json
                            .decodeFromJsonElement<IssuingNetworkTokenAddress>(
                                it,
                            )
                    },
                cardholderName = rawObject["cardholder_name"]?.let { json.decodeFromJsonElement<String>(it) },
                deviceTrustScore = rawObject["device_trust_score"]?.let { json.decodeFromJsonElement<Int>(it) },
                hashedAccountEmailAddress =
                    rawObject["hashed_account_email_address"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
                    },
                reasonCodes =
                    rawObject["reason_codes"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5>>(
                                it,
                            )
                    },
                suggestedDecision =
                    rawObject["suggested_decision"]?.let {
                        json.decodeFromJsonElement<InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348>(
                            it,
                        )
                    },
                suggestedDecisionVersion =
                    rawObject["suggested_decision_version"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingNetworkTokenWalletProvider,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingNetworkTokenWalletProvider")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.accountId?.let { put("account_id", it) }
                    value.accountTrustScore?.let { put("account_trust_score", json.encodeToJsonElement(it)) }
                    value.cardNumberSource?.let { put("card_number_source", json.encodeToJsonElement(it)) }
                    value.cardholderAddress?.let { put("cardholder_address", json.encodeToJsonElement(it)) }
                    value.cardholderName?.let { put("cardholder_name", it) }
                    value.deviceTrustScore?.let { put("device_trust_score", json.encodeToJsonElement(it)) }
                    value.hashedAccountEmailAddress?.let { put("hashed_account_email_address", it) }
                    value.reasonCodes?.let { put("reason_codes", json.encodeToJsonElement(it)) }
                    value.suggestedDecision?.let { put("suggested_decision", json.encodeToJsonElement(it)) }
                    value.suggestedDecisionVersion?.let { put("suggested_decision_version", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingNetworkTokenWalletProvider(
    block: IssuingNetworkTokenWalletProvider.Builder.() -> Unit,
): IssuingNetworkTokenWalletProvider = IssuingNetworkTokenWalletProvider.build(block)
