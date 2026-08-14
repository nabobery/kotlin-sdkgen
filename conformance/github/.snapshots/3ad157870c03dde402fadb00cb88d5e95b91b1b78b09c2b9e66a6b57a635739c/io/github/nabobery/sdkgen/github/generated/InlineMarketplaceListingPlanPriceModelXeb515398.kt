package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/marketplace-listing-plan/properties/price_model.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/marketplace-listing-plan/properties/price_model
 */
@Serializable(with = InlineMarketplaceListingPlanPriceModelXeb515398.Serializer::class)
public sealed class InlineMarketplaceListingPlanPriceModelXeb515398 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `FREE`.
   */
  public data object Free : InlineMarketplaceListingPlanPriceModelXeb515398() {
    public override val `value`: String = "FREE"
  }

  /**
   * Documented value. Wire value: `FLAT_RATE`.
   */
  public data object FlatRate : InlineMarketplaceListingPlanPriceModelXeb515398() {
    public override val `value`: String = "FLAT_RATE"
  }

  /**
   * Documented value. Wire value: `PER_UNIT`.
   */
  public data object PerUnit : InlineMarketplaceListingPlanPriceModelXeb515398() {
    public override val `value`: String = "PER_UNIT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMarketplaceListingPlanPriceModelXeb515398()

  public companion object {
    public fun fromValue(`value`: String): InlineMarketplaceListingPlanPriceModelXeb515398 = when (value) {
      Free.value -> Free
      FlatRate.value -> FlatRate
      PerUnit.value -> PerUnit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMarketplaceListingPlanPriceModelXeb515398> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineMarketplaceListingPlanPriceModelXeb515398", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMarketplaceListingPlanPriceModelXeb515398 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMarketplaceListingPlanPriceModelXeb515398) {
      encoder.encodeString(value.value)
    }
  }
}
