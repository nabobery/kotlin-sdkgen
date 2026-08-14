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
 * The address validation capabilities to use.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_shipping_address_validation/properties/mode
 */
@Serializable(with = InlineIssuingCardShippingAddressValidationModeXe5f152f0.Serializer::class)
public sealed class InlineIssuingCardShippingAddressValidationModeXe5f152f0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineIssuingCardShippingAddressValidationModeXe5f152f0() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `normalization_only`.
   */
  public data object NormalizationOnly : InlineIssuingCardShippingAddressValidationModeXe5f152f0() {
    public override val `value`: String = "normalization_only"
  }

  /**
   * Documented value. Wire value: `validation_and_normalization`.
   */
  public data object ValidationAndNormalization : InlineIssuingCardShippingAddressValidationModeXe5f152f0() {
    public override val `value`: String = "validation_and_normalization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardShippingAddressValidationModeXe5f152f0()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardShippingAddressValidationModeXe5f152f0 = when (value) {
      Disabled.value -> Disabled
      NormalizationOnly.value -> NormalizationOnly
      ValidationAndNormalization.value -> ValidationAndNormalization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardShippingAddressValidationModeXe5f152f0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardShippingAddressValidationModeXe5f152f0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardShippingAddressValidationModeXe5f152f0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardShippingAddressValidationModeXe5f152f0) {
      encoder.encodeString(value.value)
    }
  }
}
