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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_product_feature/properties/object
 */
@Serializable(with = InlineDeletedProductFeatureObjectValueX7a6b85f6.Serializer::class)
public sealed class InlineDeletedProductFeatureObjectValueX7a6b85f6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `product_feature`.
   */
  public data object ProductFeature : InlineDeletedProductFeatureObjectValueX7a6b85f6() {
    public override val `value`: String = "product_feature"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedProductFeatureObjectValueX7a6b85f6()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedProductFeatureObjectValueX7a6b85f6 = when (value) {
      ProductFeature.value -> ProductFeature
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedProductFeatureObjectValueX7a6b85f6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDeletedProductFeatureObjectValueX7a6b85f6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedProductFeatureObjectValueX7a6b85f6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedProductFeatureObjectValueX7a6b85f6) {
      encoder.encodeString(value.value)
    }
  }
}
