package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The type of device used for tokenization.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_network_token_device/properties/type
 */
@Serializable(with = InlineIssuingNetworkTokenDeviceTypeX0d97c801.Serializer::class)
public sealed class InlineIssuingNetworkTokenDeviceTypeX0d97c801 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineIssuingNetworkTokenDeviceTypeX0d97c801() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `phone`.
   */
  public data object Phone : InlineIssuingNetworkTokenDeviceTypeX0d97c801() {
    public override val `value`: String = "phone"
  }

  /**
   * Documented value. Wire value: `watch`.
   */
  public data object Watch : InlineIssuingNetworkTokenDeviceTypeX0d97c801() {
    public override val `value`: String = "watch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingNetworkTokenDeviceTypeX0d97c801()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingNetworkTokenDeviceTypeX0d97c801 = when (value) {
      Other.value -> Other
      Phone.value -> Phone
      Watch.value -> Watch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingNetworkTokenDeviceTypeX0d97c801> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingNetworkTokenDeviceTypeX0d97c801", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingNetworkTokenDeviceTypeX0d97c801 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingNetworkTokenDeviceTypeX0d97c801) {
      encoder.encodeString(value.value)
    }
  }
}
