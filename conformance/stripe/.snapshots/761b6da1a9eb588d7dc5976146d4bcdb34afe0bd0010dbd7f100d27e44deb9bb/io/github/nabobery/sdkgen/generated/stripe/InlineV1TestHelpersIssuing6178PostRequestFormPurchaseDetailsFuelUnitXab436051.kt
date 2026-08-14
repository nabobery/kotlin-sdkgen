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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fuel/properties/unit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fuel/properties/unit
 */
@Serializable(with = InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051.Serializer::class)
public sealed class InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charging_minute`.
   */
  public data object ChargingMinute : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051() {
    public override val `value`: String = "charging_minute"
  }

  /**
   * Documented value. Wire value: `imperial_gallon`.
   */
  public data object ImperialGallon : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051() {
    public override val `value`: String = "imperial_gallon"
  }

  /**
   * Documented value. Wire value: `kilogram`.
   */
  public data object Kilogram : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051() {
    public override val `value`: String = "kilogram"
  }

  /**
   * Documented value. Wire value: `kilowatt_hour`.
   */
  public data object KilowattHour : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051() {
    public override val `value`: String = "kilowatt_hour"
  }

  /**
   * Documented value. Wire value: `liter`.
   */
  public data object Liter : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051() {
    public override val `value`: String = "liter"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `pound`.
   */
  public data object Pound : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051() {
    public override val `value`: String = "pound"
  }

  /**
   * Documented value. Wire value: `us_gallon`.
   */
  public data object UsGallon : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051() {
    public override val `value`: String = "us_gallon"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051 = when (value) {
      ChargingMinute.value -> ChargingMinute
      ImperialGallon.value -> ImperialGallon
      Kilogram.value -> Kilogram
      KilowattHour.value -> KilowattHour
      Liter.value -> Liter
      Other.value -> Other
      Pound.value -> Pound
      UsGallon.value -> UsGallon
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051) {
      encoder.encodeString(value.value)
    }
  }
}
