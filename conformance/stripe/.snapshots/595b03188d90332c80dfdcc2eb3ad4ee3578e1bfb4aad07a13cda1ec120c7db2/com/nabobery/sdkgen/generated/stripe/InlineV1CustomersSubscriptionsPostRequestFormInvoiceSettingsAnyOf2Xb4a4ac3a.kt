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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields/anyOf/1
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
