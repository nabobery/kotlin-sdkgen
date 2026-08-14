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
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards/get/responses/200/content/application~1json/sc
 * hema/properties/object
 */
@Serializable(with = InlineV1CustomersCardsGetResponse200JsonObjectValueX7b6454fa.Serializer::class)
public sealed class InlineV1CustomersCardsGetResponse200JsonObjectValueX7b6454fa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1CustomersCardsGetResponse200JsonObjectValueX7b6454fa() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersCardsGetResponse200JsonObjectValueX7b6454fa()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersCardsGetResponse200JsonObjectValueX7b6454fa = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersCardsGetResponse200JsonObjectValueX7b6454fa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersCardsGetResponse200JsonObjectValueX7b6454fa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersCardsGetResponse200JsonObjectValueX7b6454fa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersCardsGetResponse200JsonObjectValueX7b6454fa) {
      encoder.encodeString(value.value)
    }
  }
}
