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
import kotlin.Unit

@Serializable
public data class SepaDebitGeneratedFromView(
    public val charge: InlineSepaDebitGeneratedFromChargeX65c261e2? = null,
    @SerialName("setup_attempt")
    public val setupAttempt: InlineSepaDebitGeneratedFromSetupAttemptX62691f64? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/sepa_debit_generated_from
 */
@Serializable(with = SepaDebitGeneratedFrom.Serializer::class)
public class SepaDebitGeneratedFrom(
    /**
     * The ID of the Charge that generated this PaymentMethod, if any.
     */
    public val charge: InlineSepaDebitGeneratedFromChargeX65c261e2? = null,
    /**
     * The ID of the SetupAttempt that generated this PaymentMethod, if any.
     */
    public val setupAttempt: InlineSepaDebitGeneratedFromSetupAttemptX62691f64? = null,
) {
    public class Builder {
        /**
         * The ID of the Charge that generated this PaymentMethod, if any.
         */
        public var charge: InlineSepaDebitGeneratedFromChargeX65c261e2? = null

        /**
         * The ID of the SetupAttempt that generated this PaymentMethod, if any.
         */
        public var setupAttempt: InlineSepaDebitGeneratedFromSetupAttemptX62691f64? = null

        public fun build(): SepaDebitGeneratedFrom =
            SepaDebitGeneratedFrom(
                charge = charge,
                setupAttempt = setupAttempt,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SepaDebitGeneratedFrom = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SepaDebitGeneratedFrom> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SepaDebitGeneratedFrom {
            val jsonDecoder = decoder.requireJsonDecoder("SepaDebitGeneratedFrom")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SepaDebitGeneratedFrom must be a JSON object")
            return SepaDebitGeneratedFrom(
                charge =
                    rawObject["charge"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineSepaDebitGeneratedFromChargeX65c261e2?>(element)
                        }
                    },
                setupAttempt =
                    rawObject["setup_attempt"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineSepaDebitGeneratedFromSetupAttemptX62691f64?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SepaDebitGeneratedFrom,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SepaDebitGeneratedFrom")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.charge?.let { put("charge", json.encodeToJsonElement(it)) }
                    value.setupAttempt?.let { put("setup_attempt", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun sepaDebitGeneratedFrom(block: SepaDebitGeneratedFrom.Builder.() -> Unit): SepaDebitGeneratedFrom =
    SepaDebitGeneratedFrom.build(block)
