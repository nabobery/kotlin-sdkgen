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
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_payment_method_options_mandate_options_pix/properties/a
 * mount_includes_iof
 */
@Serializable(with = InlineSubscriptionPaymentM7e19AmountIncludesIofX36fe4134.Serializer::class)
public sealed class InlineSubscriptionPaymentM7e19AmountIncludesIofX36fe4134 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineSubscriptionPaymentM7e19AmountIncludesIofX36fe4134() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineSubscriptionPaymentM7e19AmountIncludesIofX36fe4134() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionPaymentM7e19AmountIncludesIofX36fe4134()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionPaymentM7e19AmountIncludesIofX36fe4134 = when (value) {
      Always.value -> Always
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionPaymentM7e19AmountIncludesIofX36fe4134> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSubscriptionPaymentM7e19AmountIncludesIofX36fe4134", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionPaymentM7e19AmountIncludesIofX36fe4134 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionPaymentM7e19AmountIncludesIofX36fe4134) {
      encoder.encodeString(value.value)
    }
  }
}
