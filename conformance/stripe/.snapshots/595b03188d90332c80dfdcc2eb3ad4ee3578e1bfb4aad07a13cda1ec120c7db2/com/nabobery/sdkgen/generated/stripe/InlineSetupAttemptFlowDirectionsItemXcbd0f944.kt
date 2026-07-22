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
 * sdkgen://source/openapi.json#/components/schemas/setup_attempt/properties/flow_directions/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt/properties/flow_directions/items
 */
@Serializable(with = InlineSetupAttemptFlowDirectionsItemXcbd0f944.Serializer::class)
public sealed class InlineSetupAttemptFlowDirectionsItemXcbd0f944 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `inbound`.
     */
    public data object Inbound : InlineSetupAttemptFlowDirectionsItemXcbd0f944() {
        public override val `value`: String = "inbound"
    }

    /**
     * Documented value. Wire value: `outbound`.
     */
    public data object Outbound : InlineSetupAttemptFlowDirectionsItemXcbd0f944() {
        public override val `value`: String = "outbound"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineSetupAttemptFlowDirectionsItemXcbd0f944()

    public companion object {
        public fun fromValue(`value`: String): InlineSetupAttemptFlowDirectionsItemXcbd0f944 =
            when (value) {
                Inbound.value -> Inbound
                Outbound.value -> Outbound
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineSetupAttemptFlowDirectionsItemXcbd0f944> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineSetupAttemptFlowDirectionsItemXcbd0f944",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineSetupAttemptFlowDirectionsItemXcbd0f944 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupAttemptFlowDirectionsItemXcbd0f944,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
