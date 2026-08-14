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
 * The card network for this settlement report. One of ["visa", "maestro", "mastercard"]
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.settlement/properties/network
 */
@Serializable(with = InlineIssuingSettlementNetworkXcdee1767.Serializer::class)
public sealed class InlineIssuingSettlementNetworkXcdee1767 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `maestro`.
   */
  public data object Maestro : InlineIssuingSettlementNetworkXcdee1767() {
    public override val `value`: String = "maestro"
  }

  /**
   * Documented value. Wire value: `mastercard`.
   */
  public data object Mastercard : InlineIssuingSettlementNetworkXcdee1767() {
    public override val `value`: String = "mastercard"
  }

  /**
   * Documented value. Wire value: `visa`.
   */
  public data object Visa : InlineIssuingSettlementNetworkXcdee1767() {
    public override val `value`: String = "visa"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingSettlementNetworkXcdee1767()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingSettlementNetworkXcdee1767 = when (value) {
      Maestro.value -> Maestro
      Mastercard.value -> Mastercard
      Visa.value -> Visa
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingSettlementNetworkXcdee1767> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingSettlementNetworkXcdee1767", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingSettlementNetworkXcdee1767 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingSettlementNetworkXcdee1767) {
      encoder.encodeString(value.value)
    }
  }
}
