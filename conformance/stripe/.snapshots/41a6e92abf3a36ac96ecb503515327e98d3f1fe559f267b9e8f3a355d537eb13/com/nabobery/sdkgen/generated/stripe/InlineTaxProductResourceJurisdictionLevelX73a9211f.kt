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
 * Indicates the level of the jurisdiction imposing the tax.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_jurisdiction/properties/level
 */
@Serializable(with = InlineTaxProductResourceJurisdictionLevelX73a9211f.Serializer::class)
public sealed class InlineTaxProductResourceJurisdictionLevelX73a9211f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `city`.
   */
  public data object City : InlineTaxProductResourceJurisdictionLevelX73a9211f() {
    public override val `value`: String = "city"
  }

  /**
   * Documented value. Wire value: `country`.
   */
  public data object Country : InlineTaxProductResourceJurisdictionLevelX73a9211f() {
    public override val `value`: String = "country"
  }

  /**
   * Documented value. Wire value: `county`.
   */
  public data object County : InlineTaxProductResourceJurisdictionLevelX73a9211f() {
    public override val `value`: String = "county"
  }

  /**
   * Documented value. Wire value: `district`.
   */
  public data object District : InlineTaxProductResourceJurisdictionLevelX73a9211f() {
    public override val `value`: String = "district"
  }

  /**
   * Documented value. Wire value: `state`.
   */
  public data object State : InlineTaxProductResourceJurisdictionLevelX73a9211f() {
    public override val `value`: String = "state"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductResourceJurisdictionLevelX73a9211f()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductResourceJurisdictionLevelX73a9211f = when (value) {
      City.value -> City
      Country.value -> Country
      County.value -> County
      District.value -> District
      State.value -> State
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxProductResourceJurisdictionLevelX73a9211f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxProductResourceJurisdictionLevelX73a9211f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductResourceJurisdictionLevelX73a9211f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductResourceJurisdictionLevelX73a9211f) {
      encoder.encodeString(value.value)
    }
  }
}
