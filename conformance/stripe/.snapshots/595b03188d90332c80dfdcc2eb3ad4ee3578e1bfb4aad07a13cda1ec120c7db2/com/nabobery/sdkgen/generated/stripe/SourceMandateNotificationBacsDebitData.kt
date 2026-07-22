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
 * Source: sdkgen://source/openapi.json#/components/schemas/source_mandate_notification_bacs_debit_data
 */
@Serializable(with = SourceMandateNotificationBacsDebitData.Serializer::class)
public class SourceMandateNotificationBacsDebitData(
    /**
     * Last 4 digits of the account number associated with the debit.
     */
    public val last4: String? = null,
) {
    public class Builder {
        /**
         * Last 4 digits of the account number associated with the debit.
         */
        public var last4: String? = null

        public fun build(): SourceMandateNotificationBacsDebitData =
            SourceMandateNotificationBacsDebitData(
                last4 = last4,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SourceMandateNotificationBacsDebitData =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SourceMandateNotificationBacsDebitData> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SourceMandateNotificationBacsDebitData {
            val jsonDecoder = decoder.requireJsonDecoder("SourceMandateNotificationBacsDebitData")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SourceMandateNotificationBacsDebitData must be a JSON object")
            return SourceMandateNotificationBacsDebitData(
                last4 = rawObject["last4"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SourceMandateNotificationBacsDebitData,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SourceMandateNotificationBacsDebitData")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.last4?.let { put("last4", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun sourceMandateNotificationBacsDebitData(
    block: SourceMandateNotificationBacsDebitData.Builder.() -> Unit,
): SourceMandateNotificationBacsDebitData = SourceMandateNotificationBacsDebitData.build(block)
