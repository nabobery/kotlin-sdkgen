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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

@Serializable
public data class ConnectCollectionTransferView(
    public val amount: Int,
    public val currency: String,
    public val destination: InlineConnectCollectionTransferDestinationX80ef6bc4,
    public val id: String,
    public val livemode: Boolean,
    @SerialName("object")
    public val objectValue: InlineConnectCollectionTransferObjectValueXbcc36ecd,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_collection_transfer
 */
@Serializable(with = ConnectCollectionTransfer.Serializer::class)
public class ConnectCollectionTransfer(
    /**
     * Amount transferred, in cents (or local equivalent).
     */
    public val amount: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * ID of the account that funds are being collected for.
     */
    public val destination: InlineConnectCollectionTransferDestinationX80ef6bc4,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineConnectCollectionTransferObjectValueXbcc36ecd,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        private var destinationValue: InlineConnectCollectionTransferDestinationX80ef6bc4? = null

        public var destination: InlineConnectCollectionTransferDestinationX80ef6bc4
            get() = requireNotNull(destinationValue) { "destination is required" }
            set(`value`) {
                destinationValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var objectValueValue: InlineConnectCollectionTransferObjectValueXbcc36ecd? = null

        public var objectValue: InlineConnectCollectionTransferObjectValueXbcc36ecd
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        public fun build(): ConnectCollectionTransfer {
            check(amountValue != null) { "amount is required" }
            check(currencyValue != null) { "currency is required" }
            check(destinationValue != null) { "destination is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            return ConnectCollectionTransfer(
                amount = amount,
                currency = currency,
                destination = destination,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ConnectCollectionTransfer = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ConnectCollectionTransfer> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ConnectCollectionTransfer {
            val jsonDecoder = decoder.requireJsonDecoder("ConnectCollectionTransfer")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ConnectCollectionTransfer must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val destination =
                json.decodeRequired<InlineConnectCollectionTransferDestinationX80ef6bc4>(
                    rawObject,
                    "destination",
                )
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue =
                json.decodeRequired<InlineConnectCollectionTransferObjectValueXbcc36ecd>(
                    rawObject,
                    "object",
                )
            return ConnectCollectionTransfer(
                amount = amount,
                currency = currency,
                destination = destination,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ConnectCollectionTransfer,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ConnectCollectionTransfer")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("currency", value.currency)
                    put("destination", json.encodeToJsonElement(value.destination))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun connectCollectionTransfer(block: ConnectCollectionTransfer.Builder.() -> Unit): ConnectCollectionTransfer =
    ConnectCollectionTransfer.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("ConnectCollectionTransfer is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
