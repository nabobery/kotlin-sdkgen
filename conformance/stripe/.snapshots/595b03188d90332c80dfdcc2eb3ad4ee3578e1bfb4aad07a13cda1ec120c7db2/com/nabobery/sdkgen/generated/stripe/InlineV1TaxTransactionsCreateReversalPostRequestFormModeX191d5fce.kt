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
 * If `partial`, the provided line item or shipping cost amounts are reversed. If `full`, the original transaction is
 * fully reversed.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1transactions~1create_reversal/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/mode
 */
@Serializable(with = InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce.Serializer::class)
public sealed class InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `full`.
     */
    public data object Full : InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce() {
        public override val `value`: String = "full"
    }

    /**
     * Documented value. Wire value: `partial`.
     */
    public data object Partial : InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce() {
        public override val `value`: String = "partial"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce =
            when (value) {
                Full.value -> Full
                Partial.value -> Partial
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
