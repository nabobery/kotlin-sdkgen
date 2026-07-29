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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/purch
 * ase_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/purch
 * ase_type
 */
@Serializable(with = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89.Serializer::class)
public sealed class InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fuel_and_non_fuel_purchase`.
   */
  public data object FuelAndNonFuelPurchase : InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89() {
    public override val `value`: String = "fuel_and_non_fuel_purchase"
  }

  /**
   * Documented value. Wire value: `fuel_purchase`.
   */
  public data object FuelPurchase : InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89() {
    public override val `value`: String = "fuel_purchase"
  }

  /**
   * Documented value. Wire value: `non_fuel_purchase`.
   */
  public data object NonFuelPurchase : InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89() {
    public override val `value`: String = "non_fuel_purchase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89 = when (value) {
      FuelAndNonFuelPurchase.value -> FuelAndNonFuelPurchase
      FuelPurchase.value -> FuelPurchase
      NonFuelPurchase.value -> NonFuelPurchase
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89) {
      encoder.encodeString(value.value)
    }
  }
}
