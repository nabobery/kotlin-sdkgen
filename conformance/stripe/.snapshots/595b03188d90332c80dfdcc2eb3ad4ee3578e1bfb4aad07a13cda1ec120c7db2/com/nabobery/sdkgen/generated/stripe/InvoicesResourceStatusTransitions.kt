package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
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
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_resource_status_transitions
 */
@Serializable(with = InvoicesResourceStatusTransitions.Serializer::class)
public class InvoicesResourceStatusTransitions(
    /**
     * The time that the invoice draft was finalized.
     */
    public val finalizedAt: Int? = null,
    /**
     * The time that the invoice was marked uncollectible.
     */
    public val markedUncollectibleAt: Int? = null,
    /**
     * The time that the invoice was paid.
     */
    public val paidAt: Int? = null,
    /**
     * The time that the invoice was voided.
     */
    public val voidedAt: Int? = null,
) {
    public class Builder {
        /**
         * The time that the invoice draft was finalized.
         */
        public var finalizedAt: Int? = null

        /**
         * The time that the invoice was marked uncollectible.
         */
        public var markedUncollectibleAt: Int? = null

        /**
         * The time that the invoice was paid.
         */
        public var paidAt: Int? = null

        /**
         * The time that the invoice was voided.
         */
        public var voidedAt: Int? = null

        public fun build(): InvoicesResourceStatusTransitions =
            InvoicesResourceStatusTransitions(
                finalizedAt = finalizedAt,
                markedUncollectibleAt = markedUncollectibleAt,
                paidAt = paidAt,
                voidedAt = voidedAt,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InvoicesResourceStatusTransitions = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InvoicesResourceStatusTransitions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InvoicesResourceStatusTransitions {
            val jsonDecoder = decoder.requireJsonDecoder("InvoicesResourceStatusTransitions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InvoicesResourceStatusTransitions must be a JSON object")
            return InvoicesResourceStatusTransitions(
                finalizedAt =
                    rawObject["finalized_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                markedUncollectibleAt =
                    rawObject["marked_uncollectible_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                paidAt =
                    rawObject["paid_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                voidedAt =
                    rawObject["voided_at"]?.let { element ->
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
            `value`: InvoicesResourceStatusTransitions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InvoicesResourceStatusTransitions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.finalizedAt?.let { put("finalized_at", json.encodeToJsonElement(it)) }
                    value.markedUncollectibleAt?.let { put("marked_uncollectible_at", json.encodeToJsonElement(it)) }
                    value.paidAt?.let { put("paid_at", json.encodeToJsonElement(it)) }
                    value.voidedAt?.let { put("voided_at", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun invoicesResourceStatusTransitions(
    block: InvoicesResourceStatusTransitions.Builder.() -> Unit,
): InvoicesResourceStatusTransitions = InvoicesResourceStatusTransitions.build(block)
