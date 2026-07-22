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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.transaction/properties/line_items/properties/object
 */
@Serializable(with = InlineTaxTransactionLineItemsObjectValueXc5879958.Serializer::class)
public sealed class InlineTaxTransactionLineItemsObjectValueXc5879958 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlineTaxTransactionLineItemsObjectValueXc5879958() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxTransactionLineItemsObjectValueXc5879958()

    public companion object {
        public fun fromValue(`value`: String): InlineTaxTransactionLineItemsObjectValueXc5879958 =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxTransactionLineItemsObjectValueXc5879958> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxTransactionLineItemsObjectValueXc5879958",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTaxTransactionLineItemsObjectValueXc5879958 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxTransactionLineItemsObjectValueXc5879958,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
