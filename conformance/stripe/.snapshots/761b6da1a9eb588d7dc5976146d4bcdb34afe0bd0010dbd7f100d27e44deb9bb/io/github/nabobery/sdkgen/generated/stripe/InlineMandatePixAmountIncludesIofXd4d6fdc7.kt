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
 * Determines if the amount includes the IOF tax.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_pix/properties/amount_includes_iof
 */
@Serializable(with = InlineMandatePixAmountIncludesIofXd4d6fdc7.Serializer::class)
public sealed class InlineMandatePixAmountIncludesIofXd4d6fdc7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineMandatePixAmountIncludesIofXd4d6fdc7() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineMandatePixAmountIncludesIofXd4d6fdc7() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandatePixAmountIncludesIofXd4d6fdc7()

  public companion object {
    public fun fromValue(`value`: String): InlineMandatePixAmountIncludesIofXd4d6fdc7 = when (value) {
      Always.value -> Always
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMandatePixAmountIncludesIofXd4d6fdc7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineMandatePixAmountIncludesIofXd4d6fdc7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandatePixAmountIncludesIofXd4d6fdc7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandatePixAmountIncludesIofXd4d6fdc7) {
      encoder.encodeString(value.value)
    }
  }
}
