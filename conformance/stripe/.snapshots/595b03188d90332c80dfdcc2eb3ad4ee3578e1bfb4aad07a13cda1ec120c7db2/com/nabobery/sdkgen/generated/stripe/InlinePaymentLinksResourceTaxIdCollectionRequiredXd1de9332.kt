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
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_tax_id_collection/properties/required.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_tax_id_collection/properties/required
 */
@Serializable(with = InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332.Serializer::class)
public sealed class InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `if_supported`.
     */
    public data object IfSupported : InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332() {
        public override val `value`: String = "if_supported"
    }

    /**
     * Documented value. Wire value: `never`.
     */
    public data object Never : InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332() {
        public override val `value`: String = "never"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332 =
            when (value) {
                IfSupported.value -> IfSupported
                Never.value -> Never
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
