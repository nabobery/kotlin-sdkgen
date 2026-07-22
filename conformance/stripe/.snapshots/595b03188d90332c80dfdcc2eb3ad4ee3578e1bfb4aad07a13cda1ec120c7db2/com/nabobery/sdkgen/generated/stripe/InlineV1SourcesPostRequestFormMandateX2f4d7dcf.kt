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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate
 */
@Serializable(with = InlineV1SourcesPostRequestFormMandateX2f4d7dcf.Serializer::class)
public class InlineV1SourcesPostRequestFormMandateX2f4d7dcf(
    public val acceptance: InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191? = null,
    public val amount: InlineV1SourcesPostRequestFormMandateAmountXabd4847d? = null,
    public val currency: String? = null,
    public val interval: InlineV1SourcesPostRequestFormMandateIntervalX63e53acc? = null,
    public val notificationMethod: InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70? = null,
) {
    public class Builder {
        public var acceptance: InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191? = null

        public var amount: InlineV1SourcesPostRequestFormMandateAmountXabd4847d? = null

        public var currency: String? = null

        public var interval: InlineV1SourcesPostRequestFormMandateIntervalX63e53acc? = null

        public var notificationMethod: InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70? =
            null

        public fun build(): InlineV1SourcesPostRequestFormMandateX2f4d7dcf =
            InlineV1SourcesPostRequestFormMandateX2f4d7dcf(
                acceptance = acceptance,
                amount = amount,
                currency = currency,
                interval = interval,
                notificationMethod = notificationMethod,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormMandateX2f4d7dcf =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SourcesPostRequestFormMandateX2f4d7dcf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMandateX2f4d7dcf {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormMandateX2f4d7dcf")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SourcesPostRequestFormMandateX2f4d7dcf must be a JSON object",
                    )
            return InlineV1SourcesPostRequestFormMandateX2f4d7dcf(
                acceptance =
                    rawObject["acceptance"]?.let {
                        json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191>(it)
                    },
                amount =
                    rawObject["amount"]?.let {
                        json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateAmountXabd4847d>(it)
                    },
                currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
                interval =
                    rawObject["interval"]?.let {
                        json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateIntervalX63e53acc>(it)
                    },
                notificationMethod =
                    rawObject["notification_method"]?.let {
                        json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SourcesPostRequestFormMandateX2f4d7dcf,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormMandateX2f4d7dcf")
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

public fun inlineV1SourcesPostRequestFormMandateX2f4d7dcf(
    block: InlineV1SourcesPostRequestFormMandateX2f4d7dcf.Builder.() -> Unit,
): InlineV1SourcesPostRequestFormMandateX2f4d7dcf = InlineV1SourcesPostRequestFormMandateX2f4d7dcf.build(block)
