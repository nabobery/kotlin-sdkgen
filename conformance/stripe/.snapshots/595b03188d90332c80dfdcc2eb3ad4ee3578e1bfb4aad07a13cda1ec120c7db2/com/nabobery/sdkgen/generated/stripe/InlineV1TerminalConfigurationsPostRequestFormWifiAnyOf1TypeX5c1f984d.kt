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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/wifi/anyOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/wifi/anyOf/0/properties/type
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d.Serializer::class)
public sealed class InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `enterprise_eap_peap`.
     */
    public data object EnterpriseEapPeap : InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d() {
        public override val `value`: String = "enterprise_eap_peap"
    }

    /**
     * Documented value. Wire value: `enterprise_eap_tls`.
     */
    public data object EnterpriseEapTls : InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d() {
        public override val `value`: String = "enterprise_eap_tls"
    }

    /**
     * Documented value. Wire value: `personal_psk`.
     */
    public data object PersonalPsk : InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d() {
        public override val `value`: String = "personal_psk"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d =
            when (value) {
                EnterpriseEapPeap.value -> EnterpriseEapPeap
                EnterpriseEapTls.value -> EnterpriseEapTls
                PersonalPsk.value -> PersonalPsk
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
