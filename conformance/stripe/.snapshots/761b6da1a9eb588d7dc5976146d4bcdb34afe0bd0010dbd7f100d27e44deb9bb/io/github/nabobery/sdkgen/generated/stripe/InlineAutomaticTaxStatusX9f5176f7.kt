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
 * The status of the most recent automated tax calculation for this invoice.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/automatic_tax/properties/status
 */
@Serializable(with = InlineAutomaticTaxStatusX9f5176f7.Serializer::class)
public sealed class InlineAutomaticTaxStatusX9f5176f7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `complete`.
   */
  public data object Complete : InlineAutomaticTaxStatusX9f5176f7() {
    public override val `value`: String = "complete"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineAutomaticTaxStatusX9f5176f7() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `requires_location_inputs`.
   */
  public data object RequiresLocationInputs : InlineAutomaticTaxStatusX9f5176f7() {
    public override val `value`: String = "requires_location_inputs"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAutomaticTaxStatusX9f5176f7()

  public companion object {
    public fun fromValue(`value`: String): InlineAutomaticTaxStatusX9f5176f7 = when (value) {
      Complete.value -> Complete
      Failed.value -> Failed
      RequiresLocationInputs.value -> RequiresLocationInputs
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAutomaticTaxStatusX9f5176f7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAutomaticTaxStatusX9f5176f7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAutomaticTaxStatusX9f5176f7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAutomaticTaxStatusX9f5176f7) {
      encoder.encodeString(value.value)
    }
  }
}
