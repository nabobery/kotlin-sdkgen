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
 * Describes the type of transaction being performed in order to customize relevant text on the page, such as the submit
 * button. Changing this value will also affect the hostname in the
 * [url](https://docs.stripe.com/api/payment_links/payment_links/object#url) property (example: `donate.stripe.com`).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/submit_type
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `book`.
   */
  public data object Book : InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9() {
    public override val `value`: String = "book"
  }

  /**
   * Documented value. Wire value: `donate`.
   */
  public data object Donate : InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9() {
    public override val `value`: String = "donate"
  }

  /**
   * Documented value. Wire value: `pay`.
   */
  public data object Pay : InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9() {
    public override val `value`: String = "pay"
  }

  /**
   * Documented value. Wire value: `subscribe`.
   */
  public data object Subscribe : InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9() {
    public override val `value`: String = "subscribe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9 = when (value) {
      Auto.value -> Auto
      Book.value -> Book
      Donate.value -> Donate
      Pay.value -> Pay
      Subscribe.value -> Subscribe
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9) {
      encoder.encodeString(value.value)
    }
  }
}
