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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_product/properties/object
 */
@Serializable(with = InlineDeletedProductObjectValueXb166a5a7.Serializer::class)
public sealed class InlineDeletedProductObjectValueXb166a5a7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `product`.
   */
  public data object Product : InlineDeletedProductObjectValueXb166a5a7() {
    public override val `value`: String = "product"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedProductObjectValueXb166a5a7()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedProductObjectValueXb166a5a7 = when (value) {
      Product.value -> Product
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedProductObjectValueXb166a5a7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDeletedProductObjectValueXb166a5a7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedProductObjectValueXb166a5a7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedProductObjectValueXb166a5a7) {
      encoder.encodeString(value.value)
    }
  }
}
