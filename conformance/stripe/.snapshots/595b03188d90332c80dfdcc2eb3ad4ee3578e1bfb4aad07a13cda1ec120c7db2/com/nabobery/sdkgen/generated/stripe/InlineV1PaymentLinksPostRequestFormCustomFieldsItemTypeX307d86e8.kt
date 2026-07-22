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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_fields/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_fields/items/properties/type
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `dropdown`.
     */
    public data object Dropdown : InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8() {
        public override val `value`: String = "dropdown"
    }

    /**
     * Documented value. Wire value: `numeric`.
     */
    public data object Numeric : InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8() {
        public override val `value`: String = "numeric"
    }

    /**
     * Documented value. Wire value: `text`.
     */
    public data object Text : InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8() {
        public override val `value`: String = "text"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8 =
            when (value) {
                Dropdown.value -> Dropdown
                Numeric.value -> Numeric
                Text.value -> Text
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
