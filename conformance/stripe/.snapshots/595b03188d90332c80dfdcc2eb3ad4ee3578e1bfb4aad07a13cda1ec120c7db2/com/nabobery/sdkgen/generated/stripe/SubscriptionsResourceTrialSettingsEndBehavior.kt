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
 * Defines how a subscription behaves when a trial ends.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_trial_settings_end_behavior
 */
@Serializable(with = SubscriptionsResourceTrialSettingsEndBehavior.Serializer::class)
public class SubscriptionsResourceTrialSettingsEndBehavior(
    /**
     * Indicates how the subscription should change when the trial ends if the user did not provide a payment method.
     */
    public val missingPaymentMethod: InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764,
) {
    public class Builder {
        private var missingPaymentMethodValue:
            InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764? = null

        public var missingPaymentMethod:
            InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764
            get() = requireNotNull(missingPaymentMethodValue) { "missingPaymentMethod is required" }
            set(`value`) {
                missingPaymentMethodValue = value
            }

        public fun build(): SubscriptionsResourceTrialSettingsEndBehavior {
            check(missingPaymentMethodValue != null) { "missingPaymentMethod is required" }
            return SubscriptionsResourceTrialSettingsEndBehavior(
                missingPaymentMethod = missingPaymentMethod,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SubscriptionsResourceTrialSettingsEndBehavior =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SubscriptionsResourceTrialSettingsEndBehavior> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SubscriptionsResourceTrialSettingsEndBehavior {
            val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsResourceTrialSettingsEndBehavior")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "SubscriptionsResourceTrialSettingsEndBehavior must be a JSON object",
                    )
            val missingPaymentMethod =
                json
                    .decodeRequired<InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764>(
                        rawObject,
                        "missing_payment_method",
                    )
            return SubscriptionsResourceTrialSettingsEndBehavior(
                missingPaymentMethod = missingPaymentMethod,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SubscriptionsResourceTrialSettingsEndBehavior,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsResourceTrialSettingsEndBehavior")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("missing_payment_method", json.encodeToJsonElement(value.missingPaymentMethod))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun subscriptionsResourceTrialSettingsEndBehavior(
    block: SubscriptionsResourceTrialSettingsEndBehavior.Builder.() -> Unit,
): SubscriptionsResourceTrialSettingsEndBehavior = SubscriptionsResourceTrialSettingsEndBehavior.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "SubscriptionsResourceTrialSettingsEndBehavior is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
