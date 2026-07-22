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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/description/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/description/anyOf/1
 */
@Serializable(with = InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c.Serializer::class)
public sealed class InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c()

    public companion object {
        public fun fromValue(`value`: String): InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
