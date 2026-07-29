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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/purchase_ty
 * pe.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/purchase_ty
 * pe
 */
@Serializable(with = InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc.Serializer::class)
public sealed class InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fuel_and_non_fuel_purchase`.
   */
  public data object FuelAndNonFuelPurchase : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc() {
    public override val `value`: String = "fuel_and_non_fuel_purchase"
  }

  /**
   * Documented value. Wire value: `fuel_purchase`.
   */
  public data object FuelPurchase : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc() {
    public override val `value`: String = "fuel_purchase"
  }

  /**
   * Documented value. Wire value: `non_fuel_purchase`.
   */
  public data object NonFuelPurchase : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc() {
    public override val `value`: String = "non_fuel_purchase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc = when (value) {
      FuelAndNonFuelPurchase.value -> FuelAndNonFuelPurchase
      FuelPurchase.value -> FuelPurchase
      NonFuelPurchase.value -> NonFuelPurchase
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc) {
      encoder.encodeString(value.value)
    }
  }
}
