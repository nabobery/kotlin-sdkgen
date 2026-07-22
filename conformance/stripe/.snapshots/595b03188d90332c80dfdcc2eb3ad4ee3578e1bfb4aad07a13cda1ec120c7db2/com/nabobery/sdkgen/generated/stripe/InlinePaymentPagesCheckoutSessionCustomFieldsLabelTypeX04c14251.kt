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
 * The type of the label.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_fields_label/properties/type
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionCustomFieldsLabelTypeX04c14251.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionCustomFieldsLabelTypeX04c14251 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `custom`.
     */
    public data object Custom : InlinePaymentPagesCheckoutSessionCustomFieldsLabelTypeX04c14251() {
        public override val `value`: String = "custom"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentPagesCheckoutSessionCustomFieldsLabelTypeX04c14251()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentPagesCheckoutSessionCustomFieldsLabelTypeX04c14251 =
            when (value) {
                Custom.value -> Custom
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionCustomFieldsLabelTypeX04c14251> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionCustomFieldsLabelTypeX04c14251",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionCustomFieldsLabelTypeX04c14251 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentPagesCheckoutSessionCustomFieldsLabelTypeX04c14251,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
