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
import kotlin.Unit

/**
 * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in `payment` mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_intent_data
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d(
    public val description: InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892? = null,
    public val metadata: InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550? = null,
    public val statementDescriptor:
        InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74? = null,
    public val statementDescriptorSuffix: InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953? = null,
    public val transferGroup: InlineV1PaymentLinksPostRequestFormPaymentIntentDataTransferGroupX0d1b4ff9? = null,
) {
    public class Builder {
        public var description:
            InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892? = null

        public var metadata: InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550? =
            null

        public var statementDescriptor:
            InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74? = null

        public var statementDescriptorSuffix:
            InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953? = null

        public var transferGroup:
            InlineV1PaymentLinksPostRequestFormPaymentIntentDataTransferGroupX0d1b4ff9? = null

        public fun build(): InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d =
            InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d(
                description = description,
                metadata = metadata,
                statementDescriptor = statementDescriptor,
                statementDescriptorSuffix = statementDescriptorSuffix,
                transferGroup = transferGroup,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d must be a JSON object",
                    )
            return InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d(
                description =
                    rawObject["description"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892>(
                                it,
                            )
                    },
                metadata =
                    rawObject["metadata"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550>(
                                it,
                            )
                    },
                statementDescriptor =
                    rawObject["statement_descriptor"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74>(
                                it,
                            )
                    },
                statementDescriptorSuffix =
                    rawObject["statement_descriptor_suffix"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953>(
                                it,
                            )
                    },
                transferGroup =
                    rawObject["transfer_group"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentIntentDataTransferGroupX0d1b4ff9>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.description?.let { put("description", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.statementDescriptor?.let { put("statement_descriptor", json.encodeToJsonElement(it)) }
                    value.statementDescriptorSuffix?.let {
                        put(
                            "statement_descriptor_suffix",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.transferGroup?.let { put("transfer_group", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d(
    block: InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d =
    InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d.build(block)
