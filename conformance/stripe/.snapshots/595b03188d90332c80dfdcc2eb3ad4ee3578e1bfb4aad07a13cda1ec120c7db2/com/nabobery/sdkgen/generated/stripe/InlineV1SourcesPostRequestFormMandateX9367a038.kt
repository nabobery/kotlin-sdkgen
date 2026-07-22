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
import kotlin.String
import kotlin.Unit

/**
 * Information about a mandate possibility attached to a source object (generally for bank debits) as well as its
 * acceptance status.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/mandate
 */
@Serializable(with = InlineV1SourcesPostRequestFormMandateX9367a038.Serializer::class)
public class InlineV1SourcesPostRequestFormMandateX9367a038(
    public val acceptance: InlineV1SourcesPostRequestFormMandateAcceptanceX8b67948c? = null,
    public val amount: InlineV1SourcesPostRequestFormMandateAmountX44daab51? = null,
    public val currency: String? = null,
    public val interval: InlineV1SourcesPostRequestFormMandateIntervalX24e2e3bf? = null,
    public val notificationMethod: InlineV1SourcesPostRequestFormMandateNotificationMethodXa987664a? = null,
) {
    public class Builder {
        public var acceptance: InlineV1SourcesPostRequestFormMandateAcceptanceX8b67948c? = null

        public var amount: InlineV1SourcesPostRequestFormMandateAmountX44daab51? = null

        public var currency: String? = null

        public var interval: InlineV1SourcesPostRequestFormMandateIntervalX24e2e3bf? = null

        public var notificationMethod: InlineV1SourcesPostRequestFormMandateNotificationMethodXa987664a? =
            null

        public fun build(): InlineV1SourcesPostRequestFormMandateX9367a038 =
            InlineV1SourcesPostRequestFormMandateX9367a038(
                acceptance = acceptance,
                amount = amount,
                currency = currency,
                interval = interval,
                notificationMethod = notificationMethod,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormMandateX9367a038 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SourcesPostRequestFormMandateX9367a038> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMandateX9367a038 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormMandateX9367a038")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SourcesPostRequestFormMandateX9367a038 must be a JSON object",
                    )
            return InlineV1SourcesPostRequestFormMandateX9367a038(
                acceptance =
                    rawObject["acceptance"]?.let {
                        json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateAcceptanceX8b67948c>(it)
                    },
                amount =
                    rawObject["amount"]?.let {
                        json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateAmountX44daab51>(it)
                    },
                currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
                interval =
                    rawObject["interval"]?.let {
                        json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateIntervalX24e2e3bf>(it)
                    },
                notificationMethod =
                    rawObject["notification_method"]?.let {
                        json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateNotificationMethodXa987664a>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SourcesPostRequestFormMandateX9367a038,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormMandateX9367a038")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.acceptance?.let { put("acceptance", json.encodeToJsonElement(it)) }
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.currency?.let { put("currency", it) }
                    value.interval?.let { put("interval", json.encodeToJsonElement(it)) }
                    value.notificationMethod?.let { put("notification_method", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SourcesPostRequestFormMandateX9367a038(
    block: InlineV1SourcesPostRequestFormMandateX9367a038.Builder.() -> Unit,
): InlineV1SourcesPostRequestFormMandateX9367a038 = InlineV1SourcesPostRequestFormMandateX9367a038.build(block)
