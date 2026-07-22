package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
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
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/trial_settings/properties/end_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/trial_settings/properties/end_behavior
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412(
    public val missingPaymentMethod: InlineV1SubscriptionsPostRequestFormTrialSettingsMissingPaymentMethodXdfb3d687,
) {
    public class Builder {
        private var missingPaymentMethodValue:
            InlineV1SubscriptionsPostRequestFormTrialSettingsMissingPaymentMethodXdfb3d687? = null

        public var missingPaymentMethod:
            InlineV1SubscriptionsPostRequestFormTrialSettingsMissingPaymentMethodXdfb3d687
            get() = requireNotNull(missingPaymentMethodValue) { "missingPaymentMethod is required" }
            set(`value`) {
                missingPaymentMethodValue = value
            }

        public fun build(): InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412 {
            check(missingPaymentMethodValue != null) { "missingPaymentMethod is required" }
            return InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412(
                missingPaymentMethod = missingPaymentMethod,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412 must be a JSON object",
                    )
            val missingPaymentMethod =
                json
                    .decodeRequired<InlineV1SubscriptionsPostRequestFormTrialSettingsMissingPaymentMethodXdfb3d687>(
                        rawObject,
                        "missing_payment_method",
                    )
            return InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412(
                missingPaymentMethod = missingPaymentMethod,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("missing_payment_method", json.encodeToJsonElement(value.missingPaymentMethod))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412(
    block: InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412 =
    InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
