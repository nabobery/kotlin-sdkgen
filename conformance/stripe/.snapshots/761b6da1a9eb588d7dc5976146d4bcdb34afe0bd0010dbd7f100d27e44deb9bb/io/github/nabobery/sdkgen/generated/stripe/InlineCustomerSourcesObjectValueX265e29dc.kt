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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/sources/properties/object
 */
@Serializable(with = InlineCustomerSourcesObjectValueX265e29dc.Serializer::class)
public sealed class InlineCustomerSourcesObjectValueX265e29dc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineCustomerSourcesObjectValueX265e29dc() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerSourcesObjectValueX265e29dc()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerSourcesObjectValueX265e29dc = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerSourcesObjectValueX265e29dc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCustomerSourcesObjectValueX265e29dc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerSourcesObjectValueX265e29dc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSourcesObjectValueX265e29dc) {
      encoder.encodeString(value.value)
    }
  }
}
