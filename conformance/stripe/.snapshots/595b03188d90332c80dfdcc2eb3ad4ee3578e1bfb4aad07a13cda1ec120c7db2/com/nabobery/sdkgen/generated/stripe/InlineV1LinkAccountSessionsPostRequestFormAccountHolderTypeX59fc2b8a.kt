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
 * sdkgen://source/openapi.json#/paths/~1v1~1link_account_sessions/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/account_holder/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1link_account_sessions/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/account_holder/properties/type
 */
@Serializable(with = InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a.Serializer::class)
public sealed class InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account`.
     */
    public data object Account : InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a() {
        public override val `value`: String = "account"
    }

    /**
     * Documented value. Wire value: `customer`.
     */
    public data object Customer : InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a() {
        public override val `value`: String = "customer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a =
            when (value) {
                Account.value -> Account
                Customer.value -> Customer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
