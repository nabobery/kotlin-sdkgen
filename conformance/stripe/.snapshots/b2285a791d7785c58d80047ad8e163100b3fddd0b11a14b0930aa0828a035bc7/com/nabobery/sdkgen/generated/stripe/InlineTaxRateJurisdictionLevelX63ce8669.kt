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
 * The level of the jurisdiction that imposes this tax rate. Will be `null` for manually defined tax rates.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_rate/properties/jurisdiction_level
 */
@Serializable(with = InlineTaxRateJurisdictionLevelX63ce8669.Serializer::class)
public sealed class InlineTaxRateJurisdictionLevelX63ce8669 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `city`.
   */
  public data object City : InlineTaxRateJurisdictionLevelX63ce8669() {
    public override val `value`: String = "city"
  }

  /**
   * Documented value. Wire value: `country`.
   */
  public data object Country : InlineTaxRateJurisdictionLevelX63ce8669() {
    public override val `value`: String = "country"
  }

  /**
   * Documented value. Wire value: `county`.
   */
  public data object County : InlineTaxRateJurisdictionLevelX63ce8669() {
    public override val `value`: String = "county"
  }

  /**
   * Documented value. Wire value: `district`.
   */
  public data object District : InlineTaxRateJurisdictionLevelX63ce8669() {
    public override val `value`: String = "district"
  }

  /**
   * Documented value. Wire value: `multiple`.
   */
  public data object Multiple : InlineTaxRateJurisdictionLevelX63ce8669() {
    public override val `value`: String = "multiple"
  }

  /**
   * Documented value. Wire value: `state`.
   */
  public data object State : InlineTaxRateJurisdictionLevelX63ce8669() {
    public override val `value`: String = "state"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxRateJurisdictionLevelX63ce8669()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxRateJurisdictionLevelX63ce8669 = when (value) {
      City.value -> City
      Country.value -> Country
      County.value -> County
      District.value -> District
      Multiple.value -> Multiple
      State.value -> State
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxRateJurisdictionLevelX63ce8669> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxRateJurisdictionLevelX63ce8669", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxRateJurisdictionLevelX63ce8669 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxRateJurisdictionLevelX63ce8669) {
      encoder.encodeString(value.value)
    }
  }
}
