package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.Int
import kotlin.String
import kotlin.Unit

@Serializable
public data class BankConnectionsResourceBalanceRefreshView(
    @SerialName("last_attempted_at")
    public val lastAttemptedAt: Int,
    @SerialName("next_refresh_available_at")
    public val nextRefreshAvailableAt: Int? = null,
    public val status: InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_balance_refresh
 */
@Serializable(with = BankConnectionsResourceBalanceRefresh.Serializer::class)
public class BankConnectionsResourceBalanceRefresh(
    /**
     * The time at which the last refresh attempt was initiated. Measured in seconds since the Unix epoch.
     */
    public val lastAttemptedAt: Int,
    /**
     * The status of the last refresh attempt.
     */
    public val status: InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746,
    /**
     * Time at which the next balance refresh can be initiated. This value will be `null` when `status` is `pending`.
     * Measured in seconds since the Unix epoch.
     */
    public val nextRefreshAvailableAt: Int? = null,
) {
    public class Builder {
        private var lastAttemptedAtValue: Int? = null

        public var lastAttemptedAt: Int
            get() = requireNotNull(lastAttemptedAtValue) { "lastAttemptedAt is required" }
            set(`value`) {
                lastAttemptedAtValue = value
            }

        private var statusValue: InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746? = null

        public var status: InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        /**
         * Time at which the next balance refresh can be initiated. This value will be `null` when `status` is `pending`.
         * Measured in seconds since the Unix epoch.
         */
        public var nextRefreshAvailableAt: Int? = null

        public fun build(): BankConnectionsResourceBalanceRefresh {
            check(lastAttemptedAtValue != null) { "lastAttemptedAt is required" }
            check(statusValue != null) { "status is required" }
            return BankConnectionsResourceBalanceRefresh(
                lastAttemptedAt = lastAttemptedAt,
                status = status,
                nextRefreshAvailableAt = nextRefreshAvailableAt,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BankConnectionsResourceBalanceRefresh =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BankConnectionsResourceBalanceRefresh> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BankConnectionsResourceBalanceRefresh {
            val jsonDecoder = decoder.requireJsonDecoder("BankConnectionsResourceBalanceRefresh")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BankConnectionsResourceBalanceRefresh must be a JSON object")
            val lastAttemptedAt = json.decodeRequired<Int>(rawObject, "last_attempted_at")
            val status =
                json.decodeRequired<InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746>(
                    rawObject,
                    "status",
                )
            return BankConnectionsResourceBalanceRefresh(
                lastAttemptedAt = lastAttemptedAt,
                status = status,
                nextRefreshAvailableAt =
                    rawObject["next_refresh_available_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BankConnectionsResourceBalanceRefresh,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BankConnectionsResourceBalanceRefresh")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("last_attempted_at", json.encodeToJsonElement(value.lastAttemptedAt))
                    put("status", json.encodeToJsonElement(value.status))
                    value.nextRefreshAvailableAt?.let { put("next_refresh_available_at", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun bankConnectionsResourceBalanceRefresh(
    block: BankConnectionsResourceBalanceRefresh.Builder.() -> Unit,
): BankConnectionsResourceBalanceRefresh = BankConnectionsResourceBalanceRefresh.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "BankConnectionsResourceBalanceRefresh is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
