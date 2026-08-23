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
 * Describes the type of transaction being performed in order to customize relevant text on the page, such as the submit
 * button. Changing this value will also affect the hostname in the
 * [url](https://docs.stripe.com/api/payment_links/payment_links/object#url) property (example: `donate.stripe.com`).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/submit_type
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `book`.
   */
  public data object Book : InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8() {
    public override val `value`: String = "book"
  }

  /**
   * Documented value. Wire value: `donate`.
   */
  public data object Donate : InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8() {
    public override val `value`: String = "donate"
  }

  /**
   * Documented value. Wire value: `pay`.
   */
  public data object Pay : InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8() {
    public override val `value`: String = "pay"
  }

  /**
   * Documented value. Wire value: `subscribe`.
   */
  public data object Subscribe : InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8() {
    public override val `value`: String = "subscribe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8 = when (value) {
      Auto.value -> Auto
      Book.value -> Book
      Donate.value -> Donate
      Pay.value -> Pay
      Subscribe.value -> Subscribe
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8) {
      encoder.encodeString(value.value)
    }
  }
}
