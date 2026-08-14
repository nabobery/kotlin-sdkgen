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
 * Indicates the type of transaction being performed which customizes relevant text on the page, such as the submit
 * button.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/submit_type
 */
@Serializable(with = InlinePaymentLinkSubmitTypeXa03c3bfc.Serializer::class)
public sealed class InlinePaymentLinkSubmitTypeXa03c3bfc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlinePaymentLinkSubmitTypeXa03c3bfc() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `book`.
   */
  public data object Book : InlinePaymentLinkSubmitTypeXa03c3bfc() {
    public override val `value`: String = "book"
  }

  /**
   * Documented value. Wire value: `donate`.
   */
  public data object Donate : InlinePaymentLinkSubmitTypeXa03c3bfc() {
    public override val `value`: String = "donate"
  }

  /**
   * Documented value. Wire value: `pay`.
   */
  public data object Pay : InlinePaymentLinkSubmitTypeXa03c3bfc() {
    public override val `value`: String = "pay"
  }

  /**
   * Documented value. Wire value: `subscribe`.
   */
  public data object Subscribe : InlinePaymentLinkSubmitTypeXa03c3bfc() {
    public override val `value`: String = "subscribe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinkSubmitTypeXa03c3bfc()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinkSubmitTypeXa03c3bfc = when (value) {
      Auto.value -> Auto
      Book.value -> Book
      Donate.value -> Donate
      Pay.value -> Pay
      Subscribe.value -> Subscribe
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinkSubmitTypeXa03c3bfc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentLinkSubmitTypeXa03c3bfc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinkSubmitTypeXa03c3bfc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkSubmitTypeXa03c3bfc) {
      encoder.encodeString(value.value)
    }
  }
}
