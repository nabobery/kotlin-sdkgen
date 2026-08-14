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
 * Surfaces if automatic tax computation is possible given the current customer location information.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_tax/properties/automatic_tax
 */
@Serializable(with = InlineCustomerTaxAutomaticTaxXf3aec264.Serializer::class)
public sealed class InlineCustomerTaxAutomaticTaxXf3aec264 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineCustomerTaxAutomaticTaxXf3aec264() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `not_collecting`.
   */
  public data object NotCollecting : InlineCustomerTaxAutomaticTaxXf3aec264() {
    public override val `value`: String = "not_collecting"
  }

  /**
   * Documented value. Wire value: `supported`.
   */
  public data object Supported : InlineCustomerTaxAutomaticTaxXf3aec264() {
    public override val `value`: String = "supported"
  }

  /**
   * Documented value. Wire value: `unrecognized_location`.
   */
  public data object UnrecognizedLocation : InlineCustomerTaxAutomaticTaxXf3aec264() {
    public override val `value`: String = "unrecognized_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerTaxAutomaticTaxXf3aec264()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerTaxAutomaticTaxXf3aec264 = when (value) {
      Failed.value -> Failed
      NotCollecting.value -> NotCollecting
      Supported.value -> Supported
      UnrecognizedLocation.value -> UnrecognizedLocation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerTaxAutomaticTaxXf3aec264> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCustomerTaxAutomaticTaxXf3aec264", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerTaxAutomaticTaxXf3aec264 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerTaxAutomaticTaxXf3aec264) {
      encoder.encodeString(value.value)
    }
  }
}
