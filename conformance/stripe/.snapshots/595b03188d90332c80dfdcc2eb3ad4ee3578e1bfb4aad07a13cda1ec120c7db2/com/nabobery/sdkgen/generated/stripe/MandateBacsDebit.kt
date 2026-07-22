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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_bacs_debit
 */
@Serializable(with = MandateBacsDebit.Serializer::class)
public class MandateBacsDebit(
    /**
     * The status of the mandate on the Bacs network. Can be one of `pending`, `revoked`, `refused`, or `accepted`.
     */
    public val networkStatus: InlineMandateBacsDebitNetworkStatusX024d6c22,
    /**
     * The unique reference identifying the mandate on the Bacs network.
     */
    public val reference: String,
    /**
     * The URL that will contain the mandate that the customer has signed.
     */
    public val url: String,
    /**
     * The display name for the account on this mandate.
     */
    public val displayName: String? = null,
    /**
     * When the mandate is revoked on the Bacs network this field displays the reason for the revocation.
     */
    public val revocationReason: InlineMandateBacsDebitRevocationReasonX9e329b29? = null,
    /**
     * The service user number for the account on this mandate.
     */
    public val serviceUserNumber: String? = null,
) {
    public class Builder {
        private var networkStatusValue: InlineMandateBacsDebitNetworkStatusX024d6c22? = null

        public var networkStatus: InlineMandateBacsDebitNetworkStatusX024d6c22
            get() = requireNotNull(networkStatusValue) { "networkStatus is required" }
            set(`value`) {
                networkStatusValue = value
            }

        private var referenceValue: String? = null

        public var reference: String
            get() = requireNotNull(referenceValue) { "reference is required" }
            set(`value`) {
                referenceValue = value
            }

        private var urlValue: String? = null

        public var url: String
            get() = requireNotNull(urlValue) { "url is required" }
            set(`value`) {
                urlValue = value
            }

        /**
         * The display name for the account on this mandate.
         */
        public var displayName: String? = null

        /**
         * When the mandate is revoked on the Bacs network this field displays the reason for the revocation.
         */
        public var revocationReason: InlineMandateBacsDebitRevocationReasonX9e329b29? = null

        /**
         * The service user number for the account on this mandate.
         */
        public var serviceUserNumber: String? = null

        public fun build(): MandateBacsDebit {
            check(networkStatusValue != null) { "networkStatus is required" }
            check(referenceValue != null) { "reference is required" }
            check(urlValue != null) { "url is required" }
            return MandateBacsDebit(
                networkStatus = networkStatus,
                reference = reference,
                url = url,
                displayName = displayName,
                revocationReason = revocationReason,
                serviceUserNumber = serviceUserNumber,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): MandateBacsDebit = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<MandateBacsDebit> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): MandateBacsDebit {
            val jsonDecoder = decoder.requireJsonDecoder("MandateBacsDebit")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("MandateBacsDebit must be a JSON object")
            val networkStatus =
                json.decodeRequired<InlineMandateBacsDebitNetworkStatusX024d6c22>(
                    rawObject,
                    "network_status",
                )
            val reference = json.decodeRequired<String>(rawObject, "reference")
            val url = json.decodeRequired<String>(rawObject, "url")
            return MandateBacsDebit(
                networkStatus = networkStatus,
                reference = reference,
                url = url,
                displayName =
                    rawObject["display_name"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                revocationReason =
                    rawObject["revocation_reason"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineMandateBacsDebitRevocationReasonX9e329b29?>(element)
                        }
                    },
                serviceUserNumber =
                    rawObject["service_user_number"]?.let { element ->
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
            `value`: MandateBacsDebit,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("MandateBacsDebit")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("network_status", json.encodeToJsonElement(value.networkStatus))
                    put("reference", value.reference)
                    put("url", value.url)
                    value.displayName?.let { put("display_name", it) }
                    value.revocationReason?.let { put("revocation_reason", json.encodeToJsonElement(it)) }
                    value.serviceUserNumber?.let { put("service_user_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun mandateBacsDebit(block: MandateBacsDebit.Builder.() -> Unit): MandateBacsDebit =
    MandateBacsDebit.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("MandateBacsDebit is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
