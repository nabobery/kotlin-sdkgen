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
 * The scientific pathway used for carbon removal.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/climate.supplier/properties/removal_pathway
 */
@Serializable(with = InlineClimateSupplierRemovalPathwayXc4cf9412.Serializer::class)
public sealed class InlineClimateSupplierRemovalPathwayXc4cf9412 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `biomass_carbon_removal_and_storage`.
   */
  public data object BiomassCarbonRemovalAndStorage : InlineClimateSupplierRemovalPathwayXc4cf9412() {
    public override val `value`: String = "biomass_carbon_removal_and_storage"
  }

  /**
   * Documented value. Wire value: `direct_air_capture`.
   */
  public data object DirectAirCapture : InlineClimateSupplierRemovalPathwayXc4cf9412() {
    public override val `value`: String = "direct_air_capture"
  }

  /**
   * Documented value. Wire value: `enhanced_weathering`.
   */
  public data object EnhancedWeathering : InlineClimateSupplierRemovalPathwayXc4cf9412() {
    public override val `value`: String = "enhanced_weathering"
  }

  /**
   * Documented value. Wire value: `marine_carbon_removal`.
   */
  public data object MarineCarbonRemoval : InlineClimateSupplierRemovalPathwayXc4cf9412() {
    public override val `value`: String = "marine_carbon_removal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineClimateSupplierRemovalPathwayXc4cf9412()

  public companion object {
    public fun fromValue(`value`: String): InlineClimateSupplierRemovalPathwayXc4cf9412 = when (value) {
      BiomassCarbonRemovalAndStorage.value -> BiomassCarbonRemovalAndStorage
      DirectAirCapture.value -> DirectAirCapture
      EnhancedWeathering.value -> EnhancedWeathering
      MarineCarbonRemoval.value -> MarineCarbonRemoval
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineClimateSupplierRemovalPathwayXc4cf9412> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineClimateSupplierRemovalPathwayXc4cf9412", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineClimateSupplierRemovalPathwayXc4cf9412 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineClimateSupplierRemovalPathwayXc4cf9412) {
      encoder.encodeString(value.value)
    }
  }
}
