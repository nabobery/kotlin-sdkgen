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
 * The method used for tokenizing a card.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_network_token_wallet_provider/properties/card_number_source
 */
@Serializable(with = InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c.Serializer::class)
public sealed class InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `app`.
     */
    public data object App : InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c() {
        public override val `value`: String = "app"
    }

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c() {
        public override val `value`: String = "manual"
    }

    /**
     * Documented value. Wire value: `on_file`.
     */
    public data object OnFile : InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c() {
        public override val `value`: String = "on_file"
    }

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c() {
        public override val `value`: String = "other"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c =
            when (value) {
                App.value -> App
                Manual.value -> Manual
                OnFile.value -> OnFile
                Other.value -> Other
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingNetworkTokenWalletProviderCardNumberSourceX7ad5bf1c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
