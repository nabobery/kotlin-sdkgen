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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/bank_account/anyOf/0/properties/account_holder_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/bank_account/anyOf/0/properties/account_holder_type
 */
@Serializable(with = InlineV1CustomersSourcesPostRequestFormBankAccountAccountHolderTypeXc8ed238d.Serializer::class)
public sealed class InlineV1CustomersSourcesPostRequestFormBankAccountAccountHolderTypeXc8ed238d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `company`.
     */
    public data object Company : InlineV1CustomersSourcesPostRequestFormBankAccountAccountHolderTypeXc8ed238d() {
        public override val `value`: String = "company"
    }

    /**
     * Documented value. Wire value: `individual`.
     */
    public data object Individual : InlineV1CustomersSourcesPostRequestFormBankAccountAccountHolderTypeXc8ed238d() {
        public override val `value`: String = "individual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSourcesPostRequestFormBankAccountAccountHolderTypeXc8ed238d()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersSourcesPostRequestFormBankAccountAccountHolderTypeXc8ed238d =
            when (value) {
                Company.value -> Company
                Individual.value -> Individual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersSourcesPostRequestFormBankAccountAccountHolderTypeXc8ed238d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSourcesPostRequestFormBankAccountAccountHolderTypeXc8ed238d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSourcesPostRequestFormBankAccountAccountHolderTypeXc8ed238d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSourcesPostRequestFormBankAccountAccountHolderTypeXc8ed238d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
