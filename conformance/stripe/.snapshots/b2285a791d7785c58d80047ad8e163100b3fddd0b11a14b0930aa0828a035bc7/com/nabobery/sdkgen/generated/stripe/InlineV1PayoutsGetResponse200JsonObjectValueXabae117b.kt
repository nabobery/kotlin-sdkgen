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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payouts/get/responses/200/content/application~1json/schema/properties/objec
 * t
 */
@Serializable(with = InlineV1PayoutsGetResponse200JsonObjectValueXabae117b.Serializer::class)
public sealed class InlineV1PayoutsGetResponse200JsonObjectValueXabae117b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1PayoutsGetResponse200JsonObjectValueXabae117b() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PayoutsGetResponse200JsonObjectValueXabae117b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PayoutsGetResponse200JsonObjectValueXabae117b = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PayoutsGetResponse200JsonObjectValueXabae117b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PayoutsGetResponse200JsonObjectValueXabae117b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PayoutsGetResponse200JsonObjectValueXabae117b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PayoutsGetResponse200JsonObjectValueXabae117b) {
      encoder.encodeString(value.value)
    }
  }
}
