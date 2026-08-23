package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/shipping/properties/address_validation/properties/mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/shipping/properties/address_validation/properties/mode
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `normalization_only`.
   */
  public data object NormalizationOnly : InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38() {
    public override val `value`: String = "normalization_only"
  }

  /**
   * Documented value. Wire value: `validation_and_normalization`.
   */
  public data object ValidationAndNormalization : InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38() {
    public override val `value`: String = "validation_and_normalization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38 = when (value) {
      Disabled.value -> Disabled
      NormalizationOnly.value -> NormalizationOnly
      ValidationAndNormalization.value -> ValidationAndNormalization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38) {
      encoder.encodeString(value.value)
    }
  }
}
