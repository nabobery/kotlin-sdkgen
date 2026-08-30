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
 * Simulated payment type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1terminal~1readers~1{reader}~1present_payment_method/post/requ
 * estBody/content/application~1x-www-form-urlencoded/schema/properties/type
 */
@Serializable(with = InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0.Serializer::class)
public sealed class InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `card_present`.
   */
  public data object CardPresent : InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0() {
    public override val `value`: String = "card_present"
  }

  /**
   * Documented value. Wire value: `interac_present`.
   */
  public data object InteracPresent : InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0() {
    public override val `value`: String = "interac_present"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0 = when (value) {
      Card.value -> Card
      CardPresent.value -> CardPresent
      InteracPresent.value -> InteracPresent
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0) {
      encoder.encodeString(value.value)
    }
  }
}
