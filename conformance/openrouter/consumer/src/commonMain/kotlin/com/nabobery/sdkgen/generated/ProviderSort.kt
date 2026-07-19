package com.nabobery.sdkgen.generated

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * The provider sorting strategy (price, throughput, latency)
 */
@Serializable(with = ProviderSort.Serializer::class)
public sealed class ProviderSort {
    public abstract val `value`: String

    /**
     * Documented provider sorting value. Wire value: `price`.
     */
    public data object Price : ProviderSort() {
        public override val `value`: String = "price"
    }

    /**
     * Documented provider sorting value. Wire value: `throughput`.
     */
    public data object Throughput : ProviderSort() {
        public override val `value`: String = "throughput"
    }

    /**
     * Documented provider sorting value. Wire value: `latency`.
     */
    public data object Latency : ProviderSort() {
        public override val `value`: String = "latency"
    }

    /**
     * Documented provider sorting value. Wire value: `exacto`.
     */
    public data object Exacto : ProviderSort() {
        public override val `value`: String = "exacto"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : ProviderSort()

    public companion object {
        public fun fromValue(`value`: String): ProviderSort =
            when (value) {
                Price.value -> Price
                Throughput.value -> Throughput
                Latency.value -> Latency
                Exacto.value -> Exacto
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<ProviderSort> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ProviderSort", PrimitiveKind.STRING)

        override fun deserialize(decoder: Decoder): ProviderSort = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: ProviderSort,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
