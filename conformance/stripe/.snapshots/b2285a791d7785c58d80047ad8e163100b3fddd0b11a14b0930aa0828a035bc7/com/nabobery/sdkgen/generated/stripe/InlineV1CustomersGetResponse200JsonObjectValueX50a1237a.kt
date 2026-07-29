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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/get/responses/200/content/application~1json/schema/properties/obj
 * ect
 */
@Serializable(with = InlineV1CustomersGetResponse200JsonObjectValueX50a1237a.Serializer::class)
public sealed class InlineV1CustomersGetResponse200JsonObjectValueX50a1237a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1CustomersGetResponse200JsonObjectValueX50a1237a() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersGetResponse200JsonObjectValueX50a1237a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersGetResponse200JsonObjectValueX50a1237a = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersGetResponse200JsonObjectValueX50a1237a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersGetResponse200JsonObjectValueX50a1237a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersGetResponse200JsonObjectValueX50a1237a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersGetResponse200JsonObjectValueX50a1237a) {
      encoder.encodeString(value.value)
    }
  }
}
