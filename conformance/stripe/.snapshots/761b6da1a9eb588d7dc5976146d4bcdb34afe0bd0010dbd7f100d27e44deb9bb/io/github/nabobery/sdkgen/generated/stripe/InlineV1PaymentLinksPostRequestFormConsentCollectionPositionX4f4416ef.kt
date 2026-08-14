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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/consent_collection/properties/payment_method_reuse_agreement/properties/position.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/consent_collection/properties/payment_method_reuse_agreement/properties/position
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `hidden`.
   */
  public data object Hidden : InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef() {
    public override val `value`: String = "hidden"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef = when (value) {
      Auto.value -> Auto
      Hidden.value -> Hidden
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormConsentCollectionPositionX4f4416ef) {
      encoder.encodeString(value.value)
    }
  }
}
