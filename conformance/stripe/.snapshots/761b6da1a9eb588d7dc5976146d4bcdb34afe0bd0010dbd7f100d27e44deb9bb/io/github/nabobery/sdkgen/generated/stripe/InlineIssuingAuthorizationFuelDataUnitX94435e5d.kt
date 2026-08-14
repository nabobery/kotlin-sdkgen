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
 * The units for `quantity_decimal`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fuel_data/properties/unit
 */
@Serializable(with = InlineIssuingAuthorizationFuelDataUnitX94435e5d.Serializer::class)
public sealed class InlineIssuingAuthorizationFuelDataUnitX94435e5d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charging_minute`.
   */
  public data object ChargingMinute : InlineIssuingAuthorizationFuelDataUnitX94435e5d() {
    public override val `value`: String = "charging_minute"
  }

  /**
   * Documented value. Wire value: `imperial_gallon`.
   */
  public data object ImperialGallon : InlineIssuingAuthorizationFuelDataUnitX94435e5d() {
    public override val `value`: String = "imperial_gallon"
  }

  /**
   * Documented value. Wire value: `kilogram`.
   */
  public data object Kilogram : InlineIssuingAuthorizationFuelDataUnitX94435e5d() {
    public override val `value`: String = "kilogram"
  }

  /**
   * Documented value. Wire value: `kilowatt_hour`.
   */
  public data object KilowattHour : InlineIssuingAuthorizationFuelDataUnitX94435e5d() {
    public override val `value`: String = "kilowatt_hour"
  }

  /**
   * Documented value. Wire value: `liter`.
   */
  public data object Liter : InlineIssuingAuthorizationFuelDataUnitX94435e5d() {
    public override val `value`: String = "liter"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineIssuingAuthorizationFuelDataUnitX94435e5d() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `pound`.
   */
  public data object Pound : InlineIssuingAuthorizationFuelDataUnitX94435e5d() {
    public override val `value`: String = "pound"
  }

  /**
   * Documented value. Wire value: `us_gallon`.
   */
  public data object UsGallon : InlineIssuingAuthorizationFuelDataUnitX94435e5d() {
    public override val `value`: String = "us_gallon"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationFuelDataUnitX94435e5d()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationFuelDataUnitX94435e5d = when (value) {
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

  internal object Serializer : KSerializer<InlineIssuingAuthorizationFuelDataUnitX94435e5d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationFuelDataUnitX94435e5d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFuelDataUnitX94435e5d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationFuelDataUnitX94435e5d) {
      encoder.encodeString(value.value)
    }
  }
}
