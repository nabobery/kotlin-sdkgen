package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/webhook_endpoint/properties/object
 */
@Serializable(with = InlineWebhookEndpointObjectValueXc052bec3.Serializer::class)
public sealed class InlineWebhookEndpointObjectValueXc052bec3 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `webhook_endpoint`.
     */
    public data object WebhookEndpoint : InlineWebhookEndpointObjectValueXc052bec3() {
        public override val `value`: String = "webhook_endpoint"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineWebhookEndpointObjectValueXc052bec3()

    public companion object {
        public fun fromValue(`value`: String): InlineWebhookEndpointObjectValueXc052bec3 =
            when (value) {
                WebhookEndpoint.value -> WebhookEndpoint
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineWebhookEndpointObjectValueXc052bec3> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineWebhookEndpointObjectValueXc052bec3",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineWebhookEndpointObjectValueXc052bec3 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineWebhookEndpointObjectValueXc052bec3,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
