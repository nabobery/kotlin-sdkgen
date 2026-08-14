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
 * sdkgen://source/openapi.json#/components/schemas/mandate_acss_debit/properties/default_for/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_acss_debit/properties/default_for/items
 */
@Serializable(with = InlineMandateAcssDebitDefaultForItemX1a0cdd90.Serializer::class)
public sealed class InlineMandateAcssDebitDefaultForItemX1a0cdd90 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invoice`.
   */
  public data object Invoice : InlineMandateAcssDebitDefaultForItemX1a0cdd90() {
    public override val `value`: String = "invoice"
  }

  /**
   * Documented value. Wire value: `subscription`.
   */
  public data object Subscription : InlineMandateAcssDebitDefaultForItemX1a0cdd90() {
    public override val `value`: String = "subscription"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandateAcssDebitDefaultForItemX1a0cdd90()

  public companion object {
    public fun fromValue(`value`: String): InlineMandateAcssDebitDefaultForItemX1a0cdd90 = when (value) {
      Invoice.value -> Invoice
      Subscription.value -> Subscription
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMandateAcssDebitDefaultForItemX1a0cdd90> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineMandateAcssDebitDefaultForItemX1a0cdd90", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandateAcssDebitDefaultForItemX1a0cdd90 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandateAcssDebitDefaultForItemX1a0cdd90) {
      encoder.encodeString(value.value)
    }
  }
}
