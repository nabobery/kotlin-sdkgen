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
 * The status of the most recent automated tax calculation for this quote.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_automatic_tax/properties/status
 */
@Serializable(with = InlineQuotesResourceAutomaticTaxStatusX5a0812d5.Serializer::class)
public sealed class InlineQuotesResourceAutomaticTaxStatusX5a0812d5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `complete`.
   */
  public data object Complete : InlineQuotesResourceAutomaticTaxStatusX5a0812d5() {
    public override val `value`: String = "complete"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineQuotesResourceAutomaticTaxStatusX5a0812d5() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `requires_location_inputs`.
   */
  public data object RequiresLocationInputs : InlineQuotesResourceAutomaticTaxStatusX5a0812d5() {
    public override val `value`: String = "requires_location_inputs"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineQuotesResourceAutomaticTaxStatusX5a0812d5()

  public companion object {
    public fun fromValue(`value`: String): InlineQuotesResourceAutomaticTaxStatusX5a0812d5 = when (value) {
      Complete.value -> Complete
      Failed.value -> Failed
      RequiresLocationInputs.value -> RequiresLocationInputs
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineQuotesResourceAutomaticTaxStatusX5a0812d5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineQuotesResourceAutomaticTaxStatusX5a0812d5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineQuotesResourceAutomaticTaxStatusX5a0812d5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineQuotesResourceAutomaticTaxStatusX5a0812d5) {
      encoder.encodeString(value.value)
    }
  }
}
