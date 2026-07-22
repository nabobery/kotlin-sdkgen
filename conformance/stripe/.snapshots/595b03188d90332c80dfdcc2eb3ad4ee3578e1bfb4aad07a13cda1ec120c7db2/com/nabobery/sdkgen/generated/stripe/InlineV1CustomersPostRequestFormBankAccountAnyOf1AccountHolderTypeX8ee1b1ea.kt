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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/bank_account/anyOf/0/properties/account_holder_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/bank_account/anyOf/0/properties/account_holder_type
 */
@Serializable(with = InlineV1CustomersPostRequestFormBankAccountAnyOf1AccountHolderTypeX8ee1b1ea.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormBankAccountAnyOf1AccountHolderTypeX8ee1b1ea {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `company`.
     */
    public data object Company : InlineV1CustomersPostRequestFormBankAccountAnyOf1AccountHolderTypeX8ee1b1ea() {
        public override val `value`: String = "company"
    }

    /**
     * Documented value. Wire value: `individual`.
     */
    public data object Individual : InlineV1CustomersPostRequestFormBankAccountAnyOf1AccountHolderTypeX8ee1b1ea() {
        public override val `value`: String = "individual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersPostRequestFormBankAccountAnyOf1AccountHolderTypeX8ee1b1ea()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersPostRequestFormBankAccountAnyOf1AccountHolderTypeX8ee1b1ea =
            when (value) {
                Company.value -> Company
                Individual.value -> Individual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersPostRequestFormBankAccountAnyOf1AccountHolderTypeX8ee1b1ea> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormBankAccountAnyOf1AccountHolderTypeX8ee1b1ea",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersPostRequestFormBankAccountAnyOf1AccountHolderTypeX8ee1b1ea =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersPostRequestFormBankAccountAnyOf1AccountHolderTypeX8ee1b1ea,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
