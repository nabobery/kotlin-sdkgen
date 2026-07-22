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
 * The type of entity that holds the account. This can be either `individual` or `company`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts~1{id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/account_holder_type
 */
@Serializable(with = InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeX940a31c8.Serializer::class)
public sealed class InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeX940a31c8 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `company`.
     */
    public data object Company : InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeX940a31c8() {
        public override val `value`: String = "company"
    }

    /**
     * Documented value. Wire value: `individual`.
     */
    public data object Individual : InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeX940a31c8() {
        public override val `value`: String = "individual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeX940a31c8()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeX940a31c8 =
            when (value) {
                Company.value -> Company
                Individual.value -> Individual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeX940a31c8> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeX940a31c8",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeX940a31c8 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeX940a31c8,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
