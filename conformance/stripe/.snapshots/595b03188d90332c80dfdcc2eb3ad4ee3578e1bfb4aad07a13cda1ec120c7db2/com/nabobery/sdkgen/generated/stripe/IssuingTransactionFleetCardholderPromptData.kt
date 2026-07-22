package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
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
public data class IssuingTransactionFleetCardholderPromptDataView(
    @SerialName("driver_id")
    public val driverId: String? = null,
    public val odometer: Int? = null,
    @SerialName("unspecified_id")
    public val unspecifiedId: String? = null,
    @SerialName("user_id")
    public val userId: String? = null,
    @SerialName("vehicle_number")
    public val vehicleNumber: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_fleet_cardholder_prompt_data
 */
@Serializable(with = IssuingTransactionFleetCardholderPromptData.Serializer::class)
public class IssuingTransactionFleetCardholderPromptData(
    /**
     * Driver ID.
     */
    public val driverId: String? = null,
    /**
     * Odometer reading.
     */
    public val odometer: Int? = null,
    /**
     * An alphanumeric ID. This field is used when a vehicle ID, driver ID, or generic ID is entered by the cardholder,
     * but the merchant or card network did not specify the prompt type.
     */
    public val unspecifiedId: String? = null,
    /**
     * User ID.
     */
    public val userId: String? = null,
    /**
     * Vehicle number.
     */
    public val vehicleNumber: String? = null,
) {
    public class Builder {
        /**
         * Driver ID.
         */
        public var driverId: String? = null

        /**
         * Odometer reading.
         */
        public var odometer: Int? = null

        /**
         * An alphanumeric ID. This field is used when a vehicle ID, driver ID, or generic ID is entered by the cardholder,
         * but the merchant or card network did not specify the prompt type.
         */
        public var unspecifiedId: String? = null

        /**
         * User ID.
         */
        public var userId: String? = null

        /**
         * Vehicle number.
         */
        public var vehicleNumber: String? = null

        public fun build(): IssuingTransactionFleetCardholderPromptData =
            IssuingTransactionFleetCardholderPromptData(
                driverId = driverId,
                odometer = odometer,
                unspecifiedId = unspecifiedId,
                userId = userId,
                vehicleNumber = vehicleNumber,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingTransactionFleetCardholderPromptData =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingTransactionFleetCardholderPromptData> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingTransactionFleetCardholderPromptData {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingTransactionFleetCardholderPromptData")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingTransactionFleetCardholderPromptData must be a JSON object")
            return IssuingTransactionFleetCardholderPromptData(
                driverId =
                    rawObject["driver_id"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                odometer =
                    rawObject["odometer"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                unspecifiedId =
                    rawObject["unspecified_id"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                userId =
                    rawObject["user_id"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                vehicleNumber =
                    rawObject["vehicle_number"]?.let { element ->
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
            `value`: IssuingTransactionFleetCardholderPromptData,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingTransactionFleetCardholderPromptData")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.driverId?.let { put("driver_id", it) }
                    value.odometer?.let { put("odometer", json.encodeToJsonElement(it)) }
                    value.unspecifiedId?.let { put("unspecified_id", it) }
                    value.userId?.let { put("user_id", it) }
                    value.vehicleNumber?.let { put("vehicle_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingTransactionFleetCardholderPromptData(
    block: IssuingTransactionFleetCardholderPromptData.Builder.() -> Unit,
): IssuingTransactionFleetCardholderPromptData = IssuingTransactionFleetCardholderPromptData.build(block)
