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
 * Describes the type of transaction being performed by Checkout in order to customize
 * relevant text on the page, such as the submit button. `submit_type` can only be
 * specified on Checkout Sessions in `payment` mode. If blank or `auto`, `pay` is used.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/submit_type
 */
@Serializable(with = InlineCheckoutSessionSubmitTypeXfbbcc564.Serializer::class)
public sealed class InlineCheckoutSessionSubmitTypeXfbbcc564 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineCheckoutSessionSubmitTypeXfbbcc564() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `book`.
   */
  public data object Book : InlineCheckoutSessionSubmitTypeXfbbcc564() {
    public override val `value`: String = "book"
  }

  /**
   * Documented value. Wire value: `donate`.
   */
  public data object Donate : InlineCheckoutSessionSubmitTypeXfbbcc564() {
    public override val `value`: String = "donate"
  }

  /**
   * Documented value. Wire value: `pay`.
   */
  public data object Pay : InlineCheckoutSessionSubmitTypeXfbbcc564() {
    public override val `value`: String = "pay"
  }

  /**
   * Documented value. Wire value: `subscribe`.
   */
  public data object Subscribe : InlineCheckoutSessionSubmitTypeXfbbcc564() {
    public override val `value`: String = "subscribe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutSessionSubmitTypeXfbbcc564()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutSessionSubmitTypeXfbbcc564 = when (value) {
      Auto.value -> Auto
      Book.value -> Book
      Donate.value -> Donate
      Pay.value -> Pay
      Subscribe.value -> Subscribe
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionSubmitTypeXfbbcc564> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutSessionSubmitTypeXfbbcc564", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionSubmitTypeXfbbcc564 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionSubmitTypeXfbbcc564) {
      encoder.encodeString(value.value)
    }
  }
}
