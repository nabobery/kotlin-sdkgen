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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@Serializable
public data class TerminalReaderView(
    public val action: InlineTerminalReaderActionXc2e18526? = null,
    @SerialName("device_sw_version")
    public val deviceSwVersion: String? = null,
    @SerialName("device_type")
    public val deviceType: InlineTerminalReaderDeviceTypeXfd438214,
    public val id: String,
    @SerialName("ip_address")
    public val ipAddress: String? = null,
    public val label: String,
    @SerialName("last_seen_at")
    public val lastSeenAt: Int? = null,
    public val livemode: Boolean,
    public val location: InlineTerminalReaderLocationX47458740? = null,
    public val metadata: Map<String, String>,
    @SerialName("object")
    public val objectValue: InlineTerminalReaderObjectValueXb607110d,
    @SerialName("serial_number")
    public val serialNumber: String,
    public val status: InlineTerminalReaderStatusX06729bfe? = null,
)

/**
 * A Reader represents a physical device for accepting payment details.
 *
 * Related guide: [Connecting to a reader](https://docs.stripe.com/terminal/payments/connect-reader)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.reader
 */
@Serializable(with = TerminalReader.Serializer::class)
public class TerminalReader(
    /**
     * Device type of the reader.
     */
    public val deviceType: InlineTerminalReaderDeviceTypeXfd438214,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * Custom label given to the reader for easier identification.
     */
    public val label: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineTerminalReaderObjectValueXb607110d,
    /**
     * Serial number of the reader.
     */
    public val serialNumber: String,
    /**
     * The most recent action performed by the reader.
     */
    public val action: InlineTerminalReaderActionXc2e18526? = null,
    /**
     * The current software version of the reader.
     */
    public val deviceSwVersion: String? = null,
    /**
     * The local IP address of the reader.
     */
    public val ipAddress: String? = null,
    /**
     * The last time this reader reported to Stripe backend. Timestamp is measured in milliseconds since the Unix epoch.
     * Unlike most other Stripe timestamp fields which use seconds, this field uses milliseconds.
     */
    public val lastSeenAt: Int? = null,
    /**
     * The location identifier of the reader.
     */
    public val location: InlineTerminalReaderLocationX47458740? = null,
    /**
     * The networking status of the reader. We do not recommend using this field in flows that may block taking payments.
     */
    public val status: InlineTerminalReaderStatusX06729bfe? = null,
) {
    public class Builder {
        private var deviceTypeValue: InlineTerminalReaderDeviceTypeXfd438214? = null

        public var deviceType: InlineTerminalReaderDeviceTypeXfd438214
            get() = requireNotNull(deviceTypeValue) { "deviceType is required" }
            set(`value`) {
                deviceTypeValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var labelValue: String? = null

        public var label: String
            get() = requireNotNull(labelValue) { "label is required" }
            set(`value`) {
                labelValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var metadataValue: Map<String, String>? = null

        public var metadata: Map<String, String>
            get() = requireNotNull(metadataValue) { "metadata is required" }
            set(`value`) {
                metadataValue = value
            }

        private var objectValueValue: InlineTerminalReaderObjectValueXb607110d? = null

        public var objectValue: InlineTerminalReaderObjectValueXb607110d
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var serialNumberValue: String? = null

        public var serialNumber: String
            get() = requireNotNull(serialNumberValue) { "serialNumber is required" }
            set(`value`) {
                serialNumberValue = value
            }

        /**
         * The most recent action performed by the reader.
         */
        public var action: InlineTerminalReaderActionXc2e18526? = null

        /**
         * The current software version of the reader.
         */
        public var deviceSwVersion: String? = null

        /**
         * The local IP address of the reader.
         */
        public var ipAddress: String? = null

        /**
         * The last time this reader reported to Stripe backend. Timestamp is measured in milliseconds since the Unix epoch.
         * Unlike most other Stripe timestamp fields which use seconds, this field uses milliseconds.
         */
        public var lastSeenAt: Int? = null

        /**
         * The location identifier of the reader.
         */
        public var location: InlineTerminalReaderLocationX47458740? = null

        /**
         * The networking status of the reader. We do not recommend using this field in flows that may block taking
         * payments.
         */
        public var status: InlineTerminalReaderStatusX06729bfe? = null

        public fun build(): TerminalReader {
            check(deviceTypeValue != null) { "deviceType is required" }
            check(idValue != null) { "id is required" }
            check(labelValue != null) { "label is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(metadataValue != null) { "metadata is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(serialNumberValue != null) { "serialNumber is required" }
            return TerminalReader(
                deviceType = deviceType,
                id = id,
                label = label,
                livemode = livemode,
                metadata = metadata,
                objectValue = objectValue,
                serialNumber = serialNumber,
                action = action,
                deviceSwVersion = deviceSwVersion,
                ipAddress = ipAddress,
                lastSeenAt = lastSeenAt,
                location = location,
                status = status,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TerminalReader = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TerminalReader> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TerminalReader {
            val jsonDecoder = decoder.requireJsonDecoder("TerminalReader")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TerminalReader must be a JSON object")
            val deviceType = json.decodeRequired<InlineTerminalReaderDeviceTypeXfd438214>(rawObject, "device_type")
            val id = json.decodeRequired<String>(rawObject, "id")
            val label = json.decodeRequired<String>(rawObject, "label")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
            val objectValue = json.decodeRequired<InlineTerminalReaderObjectValueXb607110d>(rawObject, "object")
            val serialNumber = json.decodeRequired<String>(rawObject, "serial_number")
            return TerminalReader(
                deviceType = deviceType,
                id = id,
                label = label,
                livemode = livemode,
                metadata = metadata,
                objectValue = objectValue,
                serialNumber = serialNumber,
                action =
                    rawObject["action"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTerminalReaderActionXc2e18526?>(element)
                        }
                    },
                deviceSwVersion =
                    rawObject["device_sw_version"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                ipAddress =
                    rawObject["ip_address"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                lastSeenAt =
                    rawObject["last_seen_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                location =
                    rawObject["location"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTerminalReaderLocationX47458740?>(element)
                        }
                    },
                status =
                    rawObject["status"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTerminalReaderStatusX06729bfe?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TerminalReader,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TerminalReader")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("device_type", json.encodeToJsonElement(value.deviceType))
                    put("id", value.id)
                    put("label", value.label)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("metadata", json.encodeToJsonElement(value.metadata))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("serial_number", value.serialNumber)
                    value.action?.let { put("action", json.encodeToJsonElement(it)) }
                    value.deviceSwVersion?.let { put("device_sw_version", it) }
                    value.ipAddress?.let { put("ip_address", it) }
                    value.lastSeenAt?.let { put("last_seen_at", json.encodeToJsonElement(it)) }
                    value.location?.let { put("location", json.encodeToJsonElement(it)) }
                    value.status?.let { put("status", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun terminalReader(block: TerminalReader.Builder.() -> Unit): TerminalReader = TerminalReader.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("TerminalReader is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
