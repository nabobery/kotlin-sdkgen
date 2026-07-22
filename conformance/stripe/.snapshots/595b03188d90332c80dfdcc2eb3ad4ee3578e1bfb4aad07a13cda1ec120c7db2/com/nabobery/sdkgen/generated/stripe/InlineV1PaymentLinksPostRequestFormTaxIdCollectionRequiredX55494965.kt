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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/tax_id_collection/properties/required.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/tax_id_collection/properties/required
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormTaxIdCollectionRequiredX55494965.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormTaxIdCollectionRequiredX55494965 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `if_supported`.
     */
    public data object IfSupported : InlineV1PaymentLinksPostRequestFormTaxIdCollectionRequiredX55494965() {
        public override val `value`: String = "if_supported"
    }

    /**
     * Documented value. Wire value: `never`.
     */
    public data object Never : InlineV1PaymentLinksPostRequestFormTaxIdCollectionRequiredX55494965() {
        public override val `value`: String = "never"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentLinksPostRequestFormTaxIdCollectionRequiredX55494965()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormTaxIdCollectionRequiredX55494965 =
            when (value) {
                IfSupported.value -> IfSupported
                Never.value -> Never
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormTaxIdCollectionRequiredX55494965> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormTaxIdCollectionRequiredX55494965",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormTaxIdCollectionRequiredX55494965 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormTaxIdCollectionRequiredX55494965,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
