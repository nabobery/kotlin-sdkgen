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
 * Indicates whether the jurisdiction was determined by the origin (merchant's address) or destination (customer's
 * address).
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_line_item_tax_breakdown/properties/sourcing
 */
@Serializable(with = InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456.Serializer::class)
public sealed class InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `destination`.
   */
  public data object Destination : InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456() {
    public override val `value`: String = "destination"
  }

  /**
   * Documented value. Wire value: `origin`.
   */
  public data object Origin : InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456() {
    public override val `value`: String = "origin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456 = when (value) {
      Destination.value -> Destination
      Origin.value -> Origin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456) {
      encoder.encodeString(value.value)
    }
  }
}
