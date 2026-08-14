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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/naver_pay/properties/funding.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/naver_pay/properties/funding
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataFundingX84a7815a.Serializer::class)
public sealed class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataFundingX84a7815a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataFundingX84a7815a() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `points`.
   */
  public data object Points : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataFundingX84a7815a() {
    public override val `value`: String = "points"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataFundingX84a7815a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataFundingX84a7815a = when (value) {
      Card.value -> Card
      Points.value -> Points
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataFundingX84a7815a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataFundingX84a7815a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataFundingX84a7815a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataFundingX84a7815a) {
      encoder.encodeString(value.value)
    }
  }
}
