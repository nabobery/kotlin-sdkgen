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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/promotion_code/properties/object
 */
@Serializable(with = InlinePromotionCodeObjectValueXfaa06a5c.Serializer::class)
public sealed class InlinePromotionCodeObjectValueXfaa06a5c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `promotion_code`.
   */
  public data object PromotionCode : InlinePromotionCodeObjectValueXfaa06a5c() {
    public override val `value`: String = "promotion_code"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePromotionCodeObjectValueXfaa06a5c()

  public companion object {
    public fun fromValue(`value`: String): InlinePromotionCodeObjectValueXfaa06a5c = when (value) {
      PromotionCode.value -> PromotionCode
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePromotionCodeObjectValueXfaa06a5c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePromotionCodeObjectValueXfaa06a5c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePromotionCodeObjectValueXfaa06a5c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePromotionCodeObjectValueXfaa06a5c) {
      encoder.encodeString(value.value)
    }
  }
}
