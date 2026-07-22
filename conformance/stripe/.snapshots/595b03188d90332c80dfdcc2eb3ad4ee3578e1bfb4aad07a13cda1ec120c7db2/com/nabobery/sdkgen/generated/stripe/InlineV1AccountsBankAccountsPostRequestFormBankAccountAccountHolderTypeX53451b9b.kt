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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/account_holder_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/account_holder_type
 */
@Serializable(with = InlineV1AccountsBankAccountsPostRequestFormBankAccountAccountHolderTypeX53451b9b.Serializer::class)
public sealed class InlineV1AccountsBankAccountsPostRequestFormBankAccountAccountHolderTypeX53451b9b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `company`.
     */
    public data object Company : InlineV1AccountsBankAccountsPostRequestFormBankAccountAccountHolderTypeX53451b9b() {
        public override val `value`: String = "company"
    }

    /**
     * Documented value. Wire value: `individual`.
     */
    public data object Individual : InlineV1AccountsBankAccountsPostRequestFormBankAccountAccountHolderTypeX53451b9b() {
        public override val `value`: String = "individual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsBankAccountsPostRequestFormBankAccountAccountHolderTypeX53451b9b()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1AccountsBankAccountsPostRequestFormBankAccountAccountHolderTypeX53451b9b =
            when (value) {
                Company.value -> Company
                Individual.value -> Individual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsBankAccountsPostRequestFormBankAccountAccountHolderTypeX53451b9b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsBankAccountsPostRequestFormBankAccountAccountHolderTypeX53451b9b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsBankAccountsPostRequestFormBankAccountAccountHolderTypeX53451b9b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsBankAccountsPostRequestFormBankAccountAccountHolderTypeX53451b9b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
